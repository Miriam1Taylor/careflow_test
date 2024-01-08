package com.careflow.pojo;

// UserRight 类表示用户权限的实体类
public class UserRight {

  // 用户名
  private String userName;

  // 用户权限
  private String right;

  // 获取用户名
  public String getUserName() {
    return this.userName;
  }

  // 设置用户名
  public void setUserName(String userName) {
    this.userName = userName;
  }

  // 获取用户权限
  public String getRight() {
    return this.right;
  }

  // 设置用户权限
  public void setRight(String right) {
    this.right = right;
  }
}
