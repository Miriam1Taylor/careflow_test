package com.careflow.pojo;

// User ���ʾ�û���ʵ����
public class User {

  // �û����
  private String id;

  // �û���
  private String usernmae;

  // ����
  private String password;

  // �û�����
  private String type;

  // ��ȡ�û����
  public String getId() {
    return this.id;
  }

  // �����û����
  public void setId(String id) {
    this.id = id;
  }

  // ��ȡ�û���
  public String getUsernmae() {
    return this.usernmae;
  }

  // �����û���
  public void setUsernmae(String usernmae) {
    this.usernmae = usernmae;
  }

  // ��ȡ����
  public String getPassword() {
    return this.password;
  }

  // ��������
  public void setPassword(String password) {
    this.password = password;
  }

  // ��ȡ�û�����
  public String getType() {
    return this.type;
  }

  // �����û�����
  public void setType(String type) {
    this.type = type;
  }

  // ���� toString �����������û���
  public String toString() {
    return this.usernmae;
  }
}
