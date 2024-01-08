package com.careflow.moudle.impl;

import com.careflow.dao.CustomtTypeDAO;
import com.careflow.moudle.CustomtTypeMoudle;
import com.careflow.pojo.CustomType;

import java.util.List;

// CustomtTypeMoudleImpl 类实现了 CustomtTypeMoudle 接口
public class CustomtTypeMoudleImpl implements CustomtTypeMoudle {

  // 客户类型数据访问对象
  private CustomtTypeDAO customtTypeDAO;

  // 设置客户类型数据访问对象
  public void setCustomtTypeDAO(CustomtTypeDAO customtTypeDAO) {
    this.customtTypeDAO = customtTypeDAO;
  }

  // 添加客户类型
  public void add(CustomType customType) {
    this.customtTypeDAO.add(customType);
  }

  // 更新客户类型
  public void update(CustomType customType) {
    this.customtTypeDAO.update(customType);
  }

  // 保存或更新客户类型
  public void saveorupdate(CustomType customType) {
    this.customtTypeDAO.update(customType);
  }

  // 批量添加客户类型
  public void addCustomTypes(CustomType[] customType) {
    this.customtTypeDAO.addCustomTypes(customType);
  }

  // 批量更新客户类型
  public void updateCustomTypes(CustomType[] customType) {
    this.customtTypeDAO.updateCustomTypes(customType);
  }

  // 删除客户类型
  public void delete(String name) {
    this.customtTypeDAO.deleteByName(name);
  }

  // 根据名称获取客户类型
  public CustomType get(String name) {
    return this.customtTypeDAO.get(name);
  }

  // 获取所有客户类型列表
  public List getCustomtTypes() {
    return this.customtTypeDAO.getCustomtTypes();
  }
}
