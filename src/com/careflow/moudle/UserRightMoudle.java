package com.careflow.moudle;

import com.careflow.dao.UserRightDAO;
import com.careflow.pojo.UserRight;

// UserRightMoudle 接口定义了与用户权限管理相关的方法
public abstract interface UserRightMoudle {

  // 设置 UserRightDAO 对象
  public abstract void setUserRightDAO(UserRightDAO paramUserRightDAO);

  // 添加用户权限
  public abstract void add(UserRight paramUserRight);

  // 根据用户名获取用户权限对象
  public abstract UserRight get(String paramString);

  // 更新用户权限信息
  public abstract void update(UserRight paramUserRight);

  // 根据用户名删除用户权限
  public abstract void delete(String paramString);
}
