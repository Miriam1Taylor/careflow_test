package com.careflow.moudle.impl;

import com.careflow.dao.SuppliersDAO;
import com.careflow.moudle.SuppliersMoudle;
import com.careflow.pojo.Suppliers;

import java.util.List;

// SuppliersMoudleImpl 类实现了 SuppliersMoudle 接口
public class SuppliersMoudleImpl implements SuppliersMoudle {

  // 供应商数据访问对象
  private SuppliersDAO suppliersDAO = null;

  // 设置供应商数据访问对象
  public void setSuppliersDAO(SuppliersDAO suppliersDAO) {
    this.suppliersDAO = suppliersDAO;
  }

  // 插入供应商信息
  public void insertSuppliers(Suppliers suppliers) {
    this.suppliersDAO.insertSuppliers(suppliers);
  }

  // 根据供应商编号删除供应商信息
  public void deleteSuppliers(String suppliersno) {
    this.suppliersDAO.deleteSuppliers(suppliersno);
  }

  // 更新供应商信息
  public void updateSuppliers(Suppliers suppliers) {
    this.suppliersDAO.updateSuppliers(suppliers);
  }

  // 根据供应商名称获取供应商列表
  public List<String> getSuppliersByName(String name, int max) {
    return this.suppliersDAO.getSuppliersByName(name, max);
  }

  // 获取所有供应商列表
  public List getSuppliers() {
    return this.suppliersDAO.getSuppliers();
  }

  // 获取分页后的供应商列表
  public List getSuppliers(int start, int max) {
    return this.suppliersDAO.getSuppliers(start, max);
  }

  // 获取供应商总数
  public int getSuppliersSize() {
    return this.suppliersDAO.getSuppliersSize();
  }

  // 根据供应商编号获取供应商信息
  public Suppliers getSuppliersByNo(String no) {
    return this.suppliersDAO.getSuppliersByNo(no);
  }

  // 根据条件获取供应商列表
  public List getSuppliers(String name, String concat, String phone, int start, int max) {
    return this.suppliersDAO.getSuppliers(name, concat, phone, start, max);
  }

  // 根据条件获取供应商总数
  public int getSuppliersSize(String name, String concat, String phone) {
    return this.suppliersDAO.getSuppliersSize(name, concat, phone);
  }
}
