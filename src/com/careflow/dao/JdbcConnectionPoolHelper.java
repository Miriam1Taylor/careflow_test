package com.careflow.dao;

import java.sql.Connection;

// JDBC���ӳ�������
public class JdbcConnectionPoolHelper {

  // ����ʵ��
  private static JdbcConnectionPoolHelper jdbcConnectionPool = new JdbcConnectionPoolHelper();

  // ���ݿ����Ӷ���
  private Connection conn = null;

  // ��ȡ����ʵ��
  public static JdbcConnectionPoolHelper getInstance() {
    return jdbcConnectionPool;
  }

  // ��ȡ���ݿ����Ӷ���
  public Connection getConnection() {
    return this.conn;
  }

  // �������ݿ����Ӷ���
  public void setConnection(Connection connection) {
    this.conn = connection;
  }
}
