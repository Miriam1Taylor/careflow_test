package com.careflow.moudle;

import com.careflow.dao.UserRightDAO;
import com.careflow.pojo.UserRight;

// UserRightMoudle �ӿڶ��������û�Ȩ�޹�����صķ���
public abstract interface UserRightMoudle {

  // ���� UserRightDAO ����
  public abstract void setUserRightDAO(UserRightDAO paramUserRightDAO);

  // ����û�Ȩ��
  public abstract void add(UserRight paramUserRight);

  // �����û�����ȡ�û�Ȩ�޶���
  public abstract UserRight get(String paramString);

  // �����û�Ȩ����Ϣ
  public abstract void update(UserRight paramUserRight);

  // �����û���ɾ���û�Ȩ��
  public abstract void delete(String paramString);
}
