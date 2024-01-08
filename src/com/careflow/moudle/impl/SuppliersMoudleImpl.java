package com.careflow.moudle.impl;

import com.careflow.dao.SuppliersDAO;
import com.careflow.moudle.SuppliersMoudle;
import com.careflow.pojo.Suppliers;

import java.util.List;

// SuppliersMoudleImpl ��ʵ���� SuppliersMoudle �ӿ�
public class SuppliersMoudleImpl implements SuppliersMoudle {

  // ��Ӧ�����ݷ��ʶ���
  private SuppliersDAO suppliersDAO = null;

  // ���ù�Ӧ�����ݷ��ʶ���
  public void setSuppliersDAO(SuppliersDAO suppliersDAO) {
    this.suppliersDAO = suppliersDAO;
  }

  // ���빩Ӧ����Ϣ
  public void insertSuppliers(Suppliers suppliers) {
    this.suppliersDAO.insertSuppliers(suppliers);
  }

  // ���ݹ�Ӧ�̱��ɾ����Ӧ����Ϣ
  public void deleteSuppliers(String suppliersno) {
    this.suppliersDAO.deleteSuppliers(suppliersno);
  }

  // ���¹�Ӧ����Ϣ
  public void updateSuppliers(Suppliers suppliers) {
    this.suppliersDAO.updateSuppliers(suppliers);
  }

  // ���ݹ�Ӧ�����ƻ�ȡ��Ӧ���б�
  public List<String> getSuppliersByName(String name, int max) {
    return this.suppliersDAO.getSuppliersByName(name, max);
  }

  // ��ȡ���й�Ӧ���б�
  public List getSuppliers() {
    return this.suppliersDAO.getSuppliers();
  }

  // ��ȡ��ҳ��Ĺ�Ӧ���б�
  public List getSuppliers(int start, int max) {
    return this.suppliersDAO.getSuppliers(start, max);
  }

  // ��ȡ��Ӧ������
  public int getSuppliersSize() {
    return this.suppliersDAO.getSuppliersSize();
  }

  // ���ݹ�Ӧ�̱�Ż�ȡ��Ӧ����Ϣ
  public Suppliers getSuppliersByNo(String no) {
    return this.suppliersDAO.getSuppliersByNo(no);
  }

  // ����������ȡ��Ӧ���б�
  public List getSuppliers(String name, String concat, String phone, int start, int max) {
    return this.suppliersDAO.getSuppliers(name, concat, phone, start, max);
  }

  // ����������ȡ��Ӧ������
  public int getSuppliersSize(String name, String concat, String phone) {
    return this.suppliersDAO.getSuppliersSize(name, concat, phone);
  }
}
