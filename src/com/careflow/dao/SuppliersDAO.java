package com.careflow.dao;

import com.careflow.pojo.Suppliers;

import java.util.List;

// SuppliersDAO接口定义了与供应商（Suppliers）相关的数据库操作方法
public interface SuppliersDAO {

  // 插入供应商记录
  void insertSuppliers(Suppliers suppliers);

  // 根据供应商编号删除供应商记录
  void deleteSuppliers(String suppliersNo);

  // 更新供应商信息
  void updateSuppliers(Suppliers suppliers);

  // 根据供应商编号获取供应商信息
  Suppliers getSuppliersByNo(String suppliersNo);

  // 根据供应商名称获取供应商建议
  List<String> getSuppliersByName(String name, int limit);

  // 获取供应商信息列表（分页）
  List getSuppliers(int offset, int limit);

  // 获取所有供应商信息列表
  List getSuppliers();

  // 获取供应商信息列表的总记录数
  int getSuppliersSize();

  // 根据参数获取供应商信息列表（分页）
  List getSuppliers(String name, String contact, String phone, int offset, int limit);

  // 根据参数获取供应商信息列表的总记录数
  int getSuppliersSize(String name, String contact, String phone);
}
