package com.careflow.dao;

import com.careflow.pojo.UserRight;

// UserRightDAO�ӿڶ��������û�Ȩ�ޣ�UserRight����ص����ݿ��������
public interface UserRightDAO {

  // ����û�Ȩ��
  void add(UserRight userRight);

  // �����û�ID��ȡ�û�Ȩ����Ϣ
  UserRight get(String userId);

  // �����û�Ȩ����Ϣ
  void update(UserRight userRight);

  // �����û�IDɾ���û�Ȩ��
  void deleteById(String userId);
}
