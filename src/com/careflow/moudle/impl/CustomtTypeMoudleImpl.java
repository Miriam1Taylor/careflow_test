package com.careflow.moudle.impl;

import com.careflow.dao.CustomtTypeDAO;
import com.careflow.moudle.CustomtTypeMoudle;
import com.careflow.pojo.CustomType;

import java.util.List;

// CustomtTypeMoudleImpl ��ʵ���� CustomtTypeMoudle �ӿ�
public class CustomtTypeMoudleImpl implements CustomtTypeMoudle {

  // �ͻ��������ݷ��ʶ���
  private CustomtTypeDAO customtTypeDAO;

  // ���ÿͻ��������ݷ��ʶ���
  public void setCustomtTypeDAO(CustomtTypeDAO customtTypeDAO) {
    this.customtTypeDAO = customtTypeDAO;
  }

  // ��ӿͻ�����
  public void add(CustomType customType) {
    this.customtTypeDAO.add(customType);
  }

  // ���¿ͻ�����
  public void update(CustomType customType) {
    this.customtTypeDAO.update(customType);
  }

  // �������¿ͻ�����
  public void saveorupdate(CustomType customType) {
    this.customtTypeDAO.update(customType);
  }

  // ������ӿͻ�����
  public void addCustomTypes(CustomType[] customType) {
    this.customtTypeDAO.addCustomTypes(customType);
  }

  // �������¿ͻ�����
  public void updateCustomTypes(CustomType[] customType) {
    this.customtTypeDAO.updateCustomTypes(customType);
  }

  // ɾ���ͻ�����
  public void delete(String name) {
    this.customtTypeDAO.deleteByName(name);
  }

  // �������ƻ�ȡ�ͻ�����
  public CustomType get(String name) {
    return this.customtTypeDAO.get(name);
  }

  // ��ȡ���пͻ������б�
  public List getCustomtTypes() {
    return this.customtTypeDAO.getCustomtTypes();
  }
}
