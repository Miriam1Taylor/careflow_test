package com.careflow.dao;

import java.sql.SQLException;
import java.sql.Statement;

// StatementCallback接口定义了在Statement上执行操作的方法
public interface StatementCallback<T> {

  // 在Statement上执行操作，并返回操作的结果
  T doInStatement(Statement statement) throws SQLException;
}
