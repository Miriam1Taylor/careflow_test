package com.careflow.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

// RowMapper接口定义了将ResultSet中的数据映射到对象的方法
public interface RowMapper<T> {

  // 将ResultSet中的数据映射到对象，并返回该对象
  T mapRow(ResultSet resultSet, int rowNum) throws SQLException;
}
