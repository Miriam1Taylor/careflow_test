package com.careflow.pojo;

// UserRight ���ʾ�û�Ȩ�޵�ʵ����
public class UserRight {

  // �û���
  private String userName;

  // �û�Ȩ��
  private String right;

  // ��ȡ�û���
  public String getUserName() {
    return this.userName;
  }

  // �����û���
  public void setUserName(String userName) {
    this.userName = userName;
  }

  // ��ȡ�û�Ȩ��
  public String getRight() {
    return this.right;
  }

  // �����û�Ȩ��
  public void setRight(String right) {
    this.right = right;
  }
}
