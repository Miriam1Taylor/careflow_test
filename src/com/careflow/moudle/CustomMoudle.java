package com.careflow.moudle;

import com.careflow.dao.CustomDAO;
import com.careflow.pojo.Custom;

import java.util.List;

// CustomMoudle �ӿڶ����˶Կͻ���Ϣ���в����ķ���
public abstract interface CustomMoudle {

  // ���ÿͻ����ݷ��ʶ���
  public abstract void setCustomDAO(CustomDAO customDAO);

  // ���ݿͻ�ID��ȡ�ͻ���Ϣ
  public abstract Custom getCustomById(String id);

  // ��ӿͻ���Ϣ
  public abstract Custom add(Custom custom);

  // ���¿ͻ���Ϣ
  public abstract Custom update(Custom custom);

  // ɾ���ͻ���Ϣ
  public abstract boolean delete(String id);

  // ��ȡ�ͻ���Ϣ
  public abstract List getCustom(String id, String name, String telephone);

  // ��ȡ���пͻ���Ϣ
  public abstract List getCustoms();

  // ��ȡָ����Χ�ڵĿͻ���Ϣ
  public abstract List getCustoms(int start, int max);

  // ��ȡָ�������Ŀͻ���Ϣ
  public abstract List getCustoms(String value, int max);

  // ��ȡ���пͻ���Ϣ������
  public abstract int getCustomsSize();
}
