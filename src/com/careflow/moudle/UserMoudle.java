package com.careflow.moudle;

import com.careflow.dao.UserDAO;
import com.careflow.pojo.User;

import java.util.List;

// UserMoudle �ӿڶ��������û�������صķ���
public abstract interface UserMoudle {

  // ���� UserDAO ����
  public abstract void setUserDAO(UserDAO paramUserDAO);

  // ����û�
  public abstract void add(User paramUser);

  // �����û�ID��ȡ�û�����
  public abstract User getUserByid(String paramString);

  // �����û�����ȡ�û�����
  public abstract User getUserByName(String paramString);

  // �����û���Ϣ
  public abstract void updateUser(User paramUser);

  // ��������ɾ���û�
  public abstract void deleteUser(String paramString);

  // ��ȡ�û��б�
  public abstract List getUser(String paramString);
}
