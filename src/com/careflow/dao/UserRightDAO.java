package com.careflow.dao;

import com.careflow.pojo.UserRight;

// UserRightDAO接口定义了与用户权限（UserRight）相关的数据库操作方法
public interface UserRightDAO {

  // 添加用户权限
  void add(UserRight userRight);

  // 根据用户ID获取用户权限信息
  UserRight get(String userId);

  // 更新用户权限信息
  void update(UserRight userRight);

  // 根据用户ID删除用户权限
  void deleteById(String userId);
}
