package com.careflow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// JdbcTemplate类用于执行JDBC操作，提供了常用的数据库操作方法，如增、删、改、查等
public class JdbcTemplate {

  // 获取数据库连接对象
  public Connection getConnection() {
    return JdbcConnectionPoolHelper.getInstance().getConnection();
  }

  // 批量更新操作
  public int[] batchUpdate(final String[] sql) throws SQLException {
    return (int[]) execute(new StatementCallback() {
      private String currSql;

      public int[] doInStatement(Statement stmt) throws SQLException {
        int[] rowsAffected = new int[sql.length];
        for (int i = 0; i < sql.length; i++) {
          this.currSql = sql[i];
          if (!stmt.execute(sql[i]))
            rowsAffected[i] = stmt.getUpdateCount();
          else {
            throw new SQLException("Invalid batch SQL statement: " + sql[i]);
          }
        }
        return rowsAffected;
      }
    });
  }

  // 执行单一的更新操作
  public int execute(final String sql) throws SQLException {
    return ((Integer) execute(new StatementCallback() {
      public Integer doInStatement(Statement stmt) throws SQLException {
        return Integer.valueOf(stmt.executeUpdate(sql));
      }
    })).intValue();
  }

  // 执行数据库操作，支持事务
  public <T> Object execute(StatementCallback<T> action) throws SQLException {
    Object result = null;
    Statement stmt = null;
    Connection conn = null;
    try {
      conn = getConnection();
      conn.setAutoCommit(false);
      stmt = conn.createStatement();
      result = action.doInStatement(stmt);
      conn.commit();
      return result;
    } catch (SQLException ex) {
      if (conn != null) {
        conn.rollback();
      }
      ex.printStackTrace();
      throw new SQLException(ex.getMessage());
    } finally {
      close(stmt, null, conn);
    }
  }

  // 更新操作
  public int update(final String sql) throws SQLException {
    return ((Integer) execute(new StatementCallback() {
      public Integer doInStatement(Statement stmt) throws SQLException {
        return Integer.valueOf(stmt.executeUpdate(sql));
      }
    })).intValue();
  }

  // 插入操作
  public int insert(final String sql) throws SQLException {
    return ((Integer) execute(new StatementCallback() {
      public Integer doInStatement(Statement stmt) throws SQLException {
        return Integer.valueOf(stmt.executeUpdate(sql));
      }
    })).intValue();
  }

  // 删除操作
  public int delete(final String sql) throws SQLException {
    return ((Integer) execute(new StatementCallback() {
      public Integer doInStatement(Statement stmt) throws SQLException {
        return Integer.valueOf(stmt.executeUpdate(sql));
      }
    })).intValue();
  }

  // 查询单个对象
  public <T> Object queryForObject(final String sql, final RowMapper<T> rowMapper) throws SQLException {
    return execute(new StatementCallback() {
      public T doInStatement(Statement stmt) throws SQLException {
        ResultSet rs = null;
        try {
          rs = stmt.executeQuery(sql);
          int rowNum = 0;
          if (rs.next()) {
            return rowMapper.mapRow(rs, rowNum);
          }
          return null;
        } finally {
          JdbcTemplate.this.close(rs);
        }
      }
    });
  }

  // 查询操作，返回布尔值
  public boolean query(final String sql) throws SQLException {
    Boolean aBoolean = (Boolean) execute(new StatementCallback() {
      public Boolean doInStatement(Statement stmt) throws SQLException {
        ResultSet rs = stmt.executeQuery(sql);
        return Boolean.valueOf(rs.next());
      }
    });
    return aBoolean.booleanValue();
  }

  // 获取查询结果总行数
  public int getTotalRow(String sql) throws SQLException {
    RowMapper totalRow = new RowMapper() {
      public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Integer.valueOf(rs.getInt(1));
      }
    };
    Object number = queryForObject(sql, totalRow);

    return number != null ? ((Integer) number).intValue() : 0;
  }

  // 查询结果列表
  public List queryForList(final String sql, final RowMapper rowMapper) throws SQLException {
    return (List) execute(new StatementCallback() {
      public List doInStatement(Statement stmt) throws SQLException {
        List results = new ArrayList();
        ResultSet rs = stmt.executeQuery(sql);
        int rowNum = 0;
        while (rs.next()) {
          results.add(rowMapper.mapRow(rs, rowNum++));
        }
        return results;
      }
    });
  }

  // 关闭数据库连接，释放资源
  public void close(PreparedStatement ps, ResultSet rs, Connection conn) {
    if (ps != null) {
      try {
        ps.close();
      } catch (SQLException e) {
        System.out.println("preparedStatement 关闭失败");
        e.printStackTrace();
      }
    }
    close(rs, conn);
  }

  // 关闭数据库连接，释放资源
  public void close(Statement ps, ResultSet rs, Connection conn) {
    if (ps != null) {
      try {
        ps.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    close(rs, conn);
  }

  // 关闭数据库连接，释放资源
  public void close(ResultSet rs, Connection conn) {
    close(rs);
    if (conn != null)
      try {
        conn.close();
      } catch (SQLException e) {
        System.out.println("Connection 关闭失败！");
        e.printStackTrace();
      }
  }

  // 关闭数据库连接，释放资源
  public void close(ResultSet rs) {
    if (rs != null)
      try {
        rs.close();
      } catch (SQLException e) {
        System.out.println("ResultSet 鍏抽棴澶辫触");
        e.printStackTrace();
      }
  }
}
