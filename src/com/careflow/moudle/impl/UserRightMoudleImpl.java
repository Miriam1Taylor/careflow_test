package com.careflow.moudle.impl;

import com.careflow.dao.UserRightDAO;
import com.careflow.moudle.UserRightMoudle;
import com.careflow.pojo.UserRight;

// UserRightMoudleImpl ��ʵ���� UserRightMoudle �ӿ�
public class UserRightMoudleImpl implements UserRightMoudle {

  // �û�Ȩ�����ݷ��ʶ���
  private UserRightDAO userRightDAO;

  // �����û�Ȩ�����ݷ��ʶ���
  public void setUserRightDAO(UserRightDAO userRightDAO) {
    this.userRightDAO = userRightDAO;
  }

  // ����û�Ȩ��
  public void add(UserRight userRight) {
    this.userRightDAO.add(userRight);
  }

  // �����û�����ȡ�û�Ȩ����Ϣ
  public UserRight get(String username) {
    return this.userRightDAO.get(username);
  }

  // �����û�Ȩ����Ϣ
  public void update(UserRight userRight) {
    this.userRightDAO.update(userRight);
  }

  // �����û���ɾ���û�Ȩ��
  public void delete(String username) {
    this.userRightDAO.deleteById(username);
  }
}
