package com.careflow.moudle;

import com.careflow.dao.SuppliersDAO;
import com.careflow.pojo.Suppliers;

import java.util.List;

// SuppliersMoudle 接口定义了与供应商管理相关的方法
public abstract interface SuppliersMoudle {

  // 设置 SuppliersDAO 对象
  public abstract void setSuppliersDAO(SuppliersDAO paramSuppliersDAO);

  // 插入供应商记录
  public abstract void insertSuppliers(Suppliers paramSuppliers);

  // 根据供应商编号删除供应商记录
  public abstract void deleteSuppliers(String paramString);

  // 更新供应商记录
  public abstract void updateSuppliers(Suppliers paramSuppliers);

  // 根据供应商名称获取供应商编号列表，max 参数表示最大建议数量
  public abstract List<String> getSuppliersByName(String paramString, int paramInt);

  // 获取所有供应商记录列表
  public abstract List getSuppliers();

  // 分页获取供应商记录列表
  public abstract List getSuppliers(int paramInt1, int paramInt2);

  // 获取供应商记录总数
  public abstract int getSuppliersSize();

  // 根据供应商编号获取供应商记录
  public abstract Suppliers getSuppliersByNo(String paramString);

  // 根据条件获取供应商记录列表
  public abstract List getSuppliers(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2);

  // 根据条件获取供应商记录总数
  public abstract int getSuppliersSize(String paramString1, String paramString2, String paramString3);
}
