package com.careflow.pojo;

// User 类表示用户的实体类
public class User {

  // 用户编号
  private String id;

  // 用户名
  private String usernmae;

  // 密码
  private String password;

  // 用户类型
  private String type;

  // 获取用户编号
  public String getId() {
    return this.id;
  }

  // 设置用户编号
  public void setId(String id) {
    this.id = id;
  }

  // 获取用户名
  public String getUsernmae() {
    return this.usernmae;
  }

  // 设置用户名
  public void setUsernmae(String usernmae) {
    this.usernmae = usernmae;
  }

  // 获取密码
  public String getPassword() {
    return this.password;
  }

  // 设置密码
  public void setPassword(String password) {
    this.password = password;
  }

  // 获取用户类型
  public String getType() {
    return this.type;
  }

  // 设置用户类型
  public void setType(String type) {
    this.type = type;
  }

  // 覆盖 toString 方法，返回用户名
  public String toString() {
    return this.usernmae;
  }
}
