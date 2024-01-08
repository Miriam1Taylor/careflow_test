package com.careflow.dao;

import com.careflow.pojo.CustomType;

import java.util.List;

// �ͻ��������ݷ��ʶ���ӿ�
public interface CustomtTypeDAO {

  // ��ӿͻ�����
  void add(CustomType paramCustomType);

  // ���¿ͻ�����
  void update(CustomType paramCustomType);

  // �������¿ͻ�����
  void saveorupdate(CustomType paramCustomType);

  // ������ӿͻ�����
  void addCustomTypes(CustomType[] paramArrayOfCustomType);

  // �������¿ͻ�����
  void updateCustomTypes(CustomType[] paramArrayOfCustomType);

  // ��������ɾ���ͻ�����
  void deleteByName(String paramString);

  // �������ƻ�ȡ�ͻ�����
  CustomType get(String paramString);

  // ��ȡ���пͻ������б�
  List getCustomtTypes();
}
