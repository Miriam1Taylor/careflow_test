package com.careflow.moudle.impl;

import com.careflow.dao.UserDAO;
import com.careflow.moudle.UserMoudle;
import com.careflow.pojo.User;

import java.util.List;

// UserMoudleIMpl 类实现了 UserMoudle 接口
public class UserMoudleIMpl implements UserMoudle {

  // 用户数据访问对象
  private UserDAO userDAO;

  // 设置用户数据访问对象
  public void setUserDAO(UserDAO userDAO) {
    this.userDAO = userDAO;
  }

  // 添加用户
  public void add(User user) {
    this.userDAO.add(user);
  }

  // 根据用户ID获取用户信息
  public User getUserByid(String id) {
    return this.userDAO.getUserByid(id);
  }

  // 根据用户名获取用户信息
  public User getUserByName(String name) {
    return this.userDAO.getUserByName(name);
  }

  // 更新用户信息
  public void updateUser(User user) {
    this.userDAO.updateUser(user);
  }

  // 根据用户ID删除用户
  public void deleteUser(String id) {
    this.userDAO.deleteUser(id);
  }

  // 根据用户类型获取用户列表
  public List getUser(String type) {
    return this.userDAO.getUser(type);
  }
}
