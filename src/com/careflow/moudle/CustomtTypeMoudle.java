package com.careflow.moudle;

import com.careflow.dao.CustomtTypeDAO;
import com.careflow.pojo.CustomType;

import java.util.List;

// CustomtTypeMoudle 接口定义了对客户类型信息进行操作的方法
public abstract interface CustomtTypeMoudle {

  // 设置客户类型数据访问对象
  public abstract void setCustomtTypeDAO(CustomtTypeDAO customtTypeDAO);

  // 添加客户类型信息
  public abstract void add(CustomType customType);

  // 更新客户类型信息
  public abstract void update(CustomType customType);

  // 保存或更新客户类型信息
  public abstract void saveorupdate(CustomType customType);

  // 批量添加客户类型信息
  public abstract void addCustomTypes(CustomType[] customTypes);

  // 批量更新客户类型信息
  public abstract void updateCustomTypes(CustomType[] customTypes);

  // 删除客户类型信息
  public abstract void delete(String name);

  // 根据类型名称获取客户类型信息
  public abstract CustomType get(String name);

  // 获取所有客户类型信息列表
  public abstract List getCustomtTypes();
}
