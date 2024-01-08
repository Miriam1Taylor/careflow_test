package com.careflow.moudle;

import com.careflow.dao.CustomtTypeDAO;
import com.careflow.pojo.CustomType;

import java.util.List;

// CustomtTypeMoudle �ӿڶ����˶Կͻ�������Ϣ���в����ķ���
public abstract interface CustomtTypeMoudle {

  // ���ÿͻ��������ݷ��ʶ���
  public abstract void setCustomtTypeDAO(CustomtTypeDAO customtTypeDAO);

  // ��ӿͻ�������Ϣ
  public abstract void add(CustomType customType);

  // ���¿ͻ�������Ϣ
  public abstract void update(CustomType customType);

  // �������¿ͻ�������Ϣ
  public abstract void saveorupdate(CustomType customType);

  // ������ӿͻ�������Ϣ
  public abstract void addCustomTypes(CustomType[] customTypes);

  // �������¿ͻ�������Ϣ
  public abstract void updateCustomTypes(CustomType[] customTypes);

  // ɾ���ͻ�������Ϣ
  public abstract void delete(String name);

  // �����������ƻ�ȡ�ͻ�������Ϣ
  public abstract CustomType get(String name);

  // ��ȡ���пͻ�������Ϣ�б�
  public abstract List getCustomtTypes();
}
