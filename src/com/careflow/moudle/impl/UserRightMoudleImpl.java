package com.careflow.moudle.impl;

import com.careflow.dao.UserRightDAO;
import com.careflow.moudle.UserRightMoudle;
import com.careflow.pojo.UserRight;

// UserRightMoudleImpl 类实现了 UserRightMoudle 接口
public class UserRightMoudleImpl implements UserRightMoudle {

  // 用户权限数据访问对象
  private UserRightDAO userRightDAO;

  // 设置用户权限数据访问对象
  public void setUserRightDAO(UserRightDAO userRightDAO) {
    this.userRightDAO = userRightDAO;
  }

  // 添加用户权限
  public void add(UserRight userRight) {
    this.userRightDAO.add(userRight);
  }

  // 根据用户名获取用户权限信息
  public UserRight get(String username) {
    return this.userRightDAO.get(username);
  }

  // 更新用户权限信息
  public void update(UserRight userRight) {
    this.userRightDAO.update(userRight);
  }

  // 根据用户名删除用户权限
  public void delete(String username) {
    this.userRightDAO.deleteById(username);
  }
}
