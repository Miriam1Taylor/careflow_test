package com.careflow.dao;

import com.careflow.pojo.User;

import java.util.List;

// UserDAO接口定义了与用户（User）相关的数据库操作方法
public interface UserDAO {

  // 添加用户
  void add(User user);

  // 根据用户ID获取用户信息
  User getUserByid(String userId);

  // 根据用户名获取用户信息
  User getUserByName(String username);

  // 更新用户信息
  void updateUser(User user);

  // 删除用户
  void deleteUser(String userId);

  // 根据参数获取用户信息列表
  List getUser(String param);
}
