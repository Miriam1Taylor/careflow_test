package com.careflow.pojo;

// Option ���ʾѡ���ʵ����
public class Option {

  // ѡ����
  private String id;

  // ѡ���ı�
  private String text;

  // ѡ������
  private String type;

  // ��ȡѡ����
  public String getId() {
    return this.id;
  }

  // ����ѡ����
  public void setId(String id) {
    this.id = id;
  }

  // ��ȡѡ���ı�
  public String getText() {
    return this.text;
  }

  // ����ѡ���ı�
  public void setText(String text) {
    this.text = text;
  }

  // ��ȡѡ������
  public String getType() {
    return this.type;
  }

  // ����ѡ������
  public void setType(String type) {
    this.type = type;
  }
}
