package com.careflow.pojo;

// CustomType ���ʾ�ͻ����͵�ʵ����
public class CustomType {

  // �ͻ���������
  private String typename;

  // �ͻ����ͻ���
  private double integration = 0.0D;

  // �ͻ������ۿ�
  private double discount = 0.0D;

  // ��ȡ�ͻ���������
  public String getTypename() {
    return this.typename;
  }

  // ���ÿͻ���������
  public void setTypename(String typename) {
    if ("null".equals(typename))
      this.typename = "";
    else
      this.typename = typename;
  }

  // ��ȡ�ͻ����ͻ���
  public double getIntegration() {
    return this.integration;
  }

  // ���ÿͻ����ͻ���
  public void setIntegration(double integration) {
    this.integration = integration;
  }

  // ��ȡ�ͻ������ۿ�
  public double getDiscount() {
    return this.discount;
  }

  // ���ÿͻ������ۿ�
  public void setDiscount(double discount) {
    this.discount = discount;
  }
}
