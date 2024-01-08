package com.careflow.moudle;

import com.careflow.dao.CustomDAO;
import com.careflow.pojo.Custom;

import java.util.List;

// CustomMoudle 接口定义了对客户信息进行操作的方法
public abstract interface CustomMoudle {

  // 设置客户数据访问对象
  public abstract void setCustomDAO(CustomDAO customDAO);

  // 根据客户ID获取客户信息
  public abstract Custom getCustomById(String id);

  // 添加客户信息
  public abstract Custom add(Custom custom);

  // 更新客户信息
  public abstract Custom update(Custom custom);

  // 删除客户信息
  public abstract boolean delete(String id);

  // 获取客户信息
  public abstract List getCustom(String id, String name, String telephone);

  // 获取所有客户信息
  public abstract List getCustoms();

  // 获取指定范围内的客户信息
  public abstract List getCustoms(int start, int max);

  // 获取指定数量的客户信息
  public abstract List getCustoms(String value, int max);

  // 获取所有客户信息的数量
  public abstract int getCustomsSize();
}
