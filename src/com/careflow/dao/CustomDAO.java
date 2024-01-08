package com.careflow.dao;

import com.careflow.pojo.Custom;

import java.util.List;

// �ͻ����ݷ��ʶ���ӿ�
public interface CustomDAO {

  // ���ݿͻ�ID��ȡ�ͻ���Ϣ
  Custom getCustomById(String paramString);

  // ��ӿͻ���Ϣ
  Custom add(Custom paramCustom);

  // ���¿ͻ���Ϣ
  Custom update(Custom paramCustom);

  // ���ݿͻ�IDɾ���ͻ���Ϣ
  boolean deleteById(String paramString);

  // ����������ȡ�ͻ��б�
  List getCustom(String paramString1, String paramString2, String paramString3);

  // ��ȡ�ͻ�����
  int getCustomsSize();

  // ��ҳ��ȡ�ͻ��б�
  List getCustoms(int paramInt1, int paramInt2);

  // ����������ҳ���ȡ�ͻ��б�
  List getCustoms(String paramString, int paramInt);

  // ��ȡ���пͻ��б�
  List getCustoms();
}
