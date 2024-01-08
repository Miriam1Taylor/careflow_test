package com.careflow.moudle.impl;

import com.careflow.dao.CustomDAO;
import com.careflow.moudle.CustomMoudle;
import com.careflow.pojo.Custom;

import java.util.List;

// CustomMoudleImpl ��ʵ���� CustomMoudle �ӿ�
public class CustomMoudleImpl implements CustomMoudle {

  // �ͻ����ݷ��ʶ���
  private CustomDAO customDAO;

  // ���ÿͻ����ݷ��ʶ���
  public void setCustomDAO(CustomDAO customDAO) {
    this.customDAO = customDAO;
  }

  // ���ݿͻ�ID��ȡ�ͻ���Ϣ
  public Custom getCustomById(String id) {
    return this.customDAO.getCustomById(id);
  }

  // ��ӿͻ���Ϣ
  public Custom add(Custom custom) {
    return this.customDAO.add(custom);
  }

  // ���¿ͻ���Ϣ
  public Custom update(Custom custom) {
    return this.customDAO.update(custom);
  }

  // ɾ���ͻ���Ϣ
  public boolean delete(String id) {
    return this.customDAO.deleteById(id);
  }

  // ����������ȡ�ͻ��б�
  public List getCustom(String id, String name, String telephone) {
    return this.customDAO.getCustom(id, name, telephone);
  }

  // ��ȡ�ͻ�����
  public int getCustomsSize() {
    return this.customDAO.getCustomsSize();
  }

  // ��ҳ��ȡ�ͻ��б�
  public List getCustoms(int start, int max) {
    return this.customDAO.getCustoms(start, max);
  }

  // ����������ȡһ�������Ŀͻ��б�
  public List getCustoms(String value, int max) {
    return this.customDAO.getCustoms(value, max);
  }

  // ��ȡ���пͻ��б�
  public List getCustoms() {
    return this.customDAO.getCustoms();
  }
}
