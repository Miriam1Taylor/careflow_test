package com.careflow.moudle;

import com.careflow.dao.UserDAO;
import com.careflow.pojo.User;

import java.util.List;

// UserMoudle 接口定义了与用户管理相关的方法
public abstract interface UserMoudle {

  // 设置 UserDAO 对象
  public abstract void setUserDAO(UserDAO paramUserDAO);

  // 添加用户
  public abstract void add(User paramUser);

  // 根据用户ID获取用户对象
  public abstract User getUserByid(String paramString);

  // 根据用户名获取用户对象
  public abstract User getUserByName(String paramString);

  // 更新用户信息
  public abstract void updateUser(User paramUser);

  // 根据条件删除用户
  public abstract void deleteUser(String paramString);

  // 获取用户列表
  public abstract List getUser(String paramString);
}
