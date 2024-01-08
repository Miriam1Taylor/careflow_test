package com.careflow.dao;

import com.careflow.pojo.User;

import java.util.List;

// UserDAO�ӿڶ��������û���User����ص����ݿ��������
public interface UserDAO {

  // ����û�
  void add(User user);

  // �����û�ID��ȡ�û���Ϣ
  User getUserByid(String userId);

  // �����û�����ȡ�û���Ϣ
  User getUserByName(String username);

  // �����û���Ϣ
  void updateUser(User user);

  // ɾ���û�
  void deleteUser(String userId);

  // ���ݲ�����ȡ�û���Ϣ�б�
  List getUser(String param);
}
