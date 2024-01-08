package com.careflow.dao;

import com.careflow.pojo.Suppliers;

import java.util.List;

// SuppliersDAO�ӿڶ������빩Ӧ�̣�Suppliers����ص����ݿ��������
public interface SuppliersDAO {

  // ���빩Ӧ�̼�¼
  void insertSuppliers(Suppliers suppliers);

  // ���ݹ�Ӧ�̱��ɾ����Ӧ�̼�¼
  void deleteSuppliers(String suppliersNo);

  // ���¹�Ӧ����Ϣ
  void updateSuppliers(Suppliers suppliers);

  // ���ݹ�Ӧ�̱�Ż�ȡ��Ӧ����Ϣ
  Suppliers getSuppliersByNo(String suppliersNo);

  // ���ݹ�Ӧ�����ƻ�ȡ��Ӧ�̽���
  List<String> getSuppliersByName(String name, int limit);

  // ��ȡ��Ӧ����Ϣ�б���ҳ��
  List getSuppliers(int offset, int limit);

  // ��ȡ���й�Ӧ����Ϣ�б�
  List getSuppliers();

  // ��ȡ��Ӧ����Ϣ�б���ܼ�¼��
  int getSuppliersSize();

  // ���ݲ�����ȡ��Ӧ����Ϣ�б���ҳ��
  List getSuppliers(String name, String contact, String phone, int offset, int limit);

  // ���ݲ�����ȡ��Ӧ����Ϣ�б���ܼ�¼��
  int getSuppliersSize(String name, String contact, String phone);
}
