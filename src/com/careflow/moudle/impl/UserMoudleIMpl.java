package com.careflow.moudle.impl;

import com.careflow.dao.UserDAO;
import com.careflow.moudle.UserMoudle;
import com.careflow.pojo.User;

import java.util.List;

// UserMoudleIMpl ��ʵ���� UserMoudle �ӿ�
public class UserMoudleIMpl implements UserMoudle {

  // �û����ݷ��ʶ���
  private UserDAO userDAO;

  // �����û����ݷ��ʶ���
  public void setUserDAO(UserDAO userDAO) {
    this.userDAO = userDAO;
  }

  // ����û�
  public void add(User user) {
    this.userDAO.add(user);
  }

  // �����û�ID��ȡ�û���Ϣ
  public User getUserByid(String id) {
    return this.userDAO.getUserByid(id);
  }

  // �����û�����ȡ�û���Ϣ
  public User getUserByName(String name) {
    return this.userDAO.getUserByName(name);
  }

  // �����û���Ϣ
  public void updateUser(User user) {
    this.userDAO.updateUser(user);
  }

  // �����û�IDɾ���û�
  public void deleteUser(String id) {
    this.userDAO.deleteUser(id);
  }

  // �����û����ͻ�ȡ�û��б�
  public List getUser(String type) {
    return this.userDAO.getUser(type);
  }
}
