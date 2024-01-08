package com.careflow.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

// RowMapper�ӿڶ����˽�ResultSet�е�����ӳ�䵽����ķ���
public interface RowMapper<T> {

  // ��ResultSet�е�����ӳ�䵽���󣬲����ظö���
  T mapRow(ResultSet resultSet, int rowNum) throws SQLException;
}
