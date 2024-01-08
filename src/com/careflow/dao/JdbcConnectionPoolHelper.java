package com.careflow.dao;

import java.sql.Connection;

// JDBC连接池助手类
public class JdbcConnectionPoolHelper {

  // 单例实例
  private static JdbcConnectionPoolHelper jdbcConnectionPool = new JdbcConnectionPoolHelper();

  // 数据库连接对象
  private Connection conn = null;

  // 获取单例实例
  public static JdbcConnectionPoolHelper getInstance() {
    return jdbcConnectionPool;
  }

  // 获取数据库连接对象
  public Connection getConnection() {
    return this.conn;
  }

  // 设置数据库连接对象
  public void setConnection(Connection connection) {
    this.conn = connection;
  }
}
