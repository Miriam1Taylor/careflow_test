package com.careflow.dao;

import java.sql.SQLException;
import java.sql.Statement;

// StatementCallback�ӿڶ�������Statement��ִ�в����ķ���
public interface StatementCallback<T> {

  // ��Statement��ִ�в����������ز����Ľ��
  T doInStatement(Statement statement) throws SQLException;
}
