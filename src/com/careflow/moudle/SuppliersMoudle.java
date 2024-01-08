package com.careflow.moudle;

import com.careflow.dao.SuppliersDAO;
import com.careflow.pojo.Suppliers;

import java.util.List;

// SuppliersMoudle �ӿڶ������빩Ӧ�̹�����صķ���
public abstract interface SuppliersMoudle {

  // ���� SuppliersDAO ����
  public abstract void setSuppliersDAO(SuppliersDAO paramSuppliersDAO);

  // ���빩Ӧ�̼�¼
  public abstract void insertSuppliers(Suppliers paramSuppliers);

  // ���ݹ�Ӧ�̱��ɾ����Ӧ�̼�¼
  public abstract void deleteSuppliers(String paramString);

  // ���¹�Ӧ�̼�¼
  public abstract void updateSuppliers(Suppliers paramSuppliers);

  // ���ݹ�Ӧ�����ƻ�ȡ��Ӧ�̱���б�max ������ʾ���������
  public abstract List<String> getSuppliersByName(String paramString, int paramInt);

  // ��ȡ���й�Ӧ�̼�¼�б�
  public abstract List getSuppliers();

  // ��ҳ��ȡ��Ӧ�̼�¼�б�
  public abstract List getSuppliers(int paramInt1, int paramInt2);

  // ��ȡ��Ӧ�̼�¼����
  public abstract int getSuppliersSize();

  // ���ݹ�Ӧ�̱�Ż�ȡ��Ӧ�̼�¼
  public abstract Suppliers getSuppliersByNo(String paramString);

  // ����������ȡ��Ӧ�̼�¼�б�
  public abstract List getSuppliers(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2);

  // ����������ȡ��Ӧ�̼�¼����
  public abstract int getSuppliersSize(String paramString1, String paramString2, String paramString3);
}
