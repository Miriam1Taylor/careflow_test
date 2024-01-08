package com.careflow.dao;

import com.careflow.pojo.CustomType;

import java.util.List;

// 客户类型数据访问对象接口
public interface CustomtTypeDAO {

  // 添加客户类型
  void add(CustomType paramCustomType);

  // 更新客户类型
  void update(CustomType paramCustomType);

  // 保存或更新客户类型
  void saveorupdate(CustomType paramCustomType);

  // 批量添加客户类型
  void addCustomTypes(CustomType[] paramArrayOfCustomType);

  // 批量更新客户类型
  void updateCustomTypes(CustomType[] paramArrayOfCustomType);

  // 根据名称删除客户类型
  void deleteByName(String paramString);

  // 根据名称获取客户类型
  CustomType get(String paramString);

  // 获取所有客户类型列表
  List getCustomtTypes();
}
