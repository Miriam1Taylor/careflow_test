package com.careflow.pojo;

import java.math.BigDecimal;

// Custom ���ʾ�ͻ���Ϣ��ʵ����
public class Custom {

  // �ͻ�ID
  private String id;

  // �ͻ�����
  private String name;

  // �ͻ�����
  private String type;

  // �ͻ��Ա�
  private String sex;

  // �ͻ�����
  private String birthday = "0000-01-01";

  // �ͻ������ܽ��
  private BigDecimal amount = new BigDecimal(0);

  // �ͻ�����Ƶ��
  private int frequency;

  // �ͻ��绰����
  private String telephone;

  // �ͻ���ַ
  private String address;

  // �ͻ���ע
  private String note;

  // �ͻ�ע������
  private String regDate;

  // �ͻ�����
  private double integration = 0.0D;

  // ��ȡ�ͻ�ID
  public String getId() {
    return this.id;
  }

  // ���ÿͻ�ID
  public void setId(String id) {
    this.id = id;
  }

  // ��ȡ�ͻ�����
  public String getName() {
    return this.name;
  }

  // ���ÿͻ�����
  public void setName(String name) {
    this.name = name;
  }

  // ��ȡ�ͻ�����
  public String getType() {
    return this.type;
  }

  // ���ÿͻ�����
  public void setType(String type) {
    this.type = type;
  }

  // ��ȡ�ͻ��Ա�
  public String getSex() {
    return this.sex;
  }

  // ���ÿͻ��Ա�
  public void setSex(String sex) {
    this.sex = sex;
  }

  // ��ȡ�ͻ�����
  public String getBirthday() {
    return this.birthday;
  }

  // ���ÿͻ�����
  public void setBirthday(String birthday) {
    if ("null".equals(birthday))
      this.birthday = "";
    else
      this.birthday = birthday;
  }

  // ��ȡ�ͻ������ܽ��
  public BigDecimal getAmount() {
    return this.amount;
  }

  // ���ÿͻ������ܽ��
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  // ��ȡ�ͻ�����Ƶ��
  public int getFrequency() {
    return this.frequency;
  }

  // ���ÿͻ�����Ƶ��
  public void setFrequency(int frequency) {
    this.frequency = frequency;
  }

  // ��ȡ�ͻ��绰����
  public String getTelephone() {
    return this.telephone;
  }

  // ���ÿͻ��绰����
  public void setTelephone(String telephone) {
    if ("null".equals(telephone))
      this.telephone = "";
    else
      this.telephone = telephone;
  }

  // ��ȡ�ͻ���ַ
  public String getAddress() {
    return this.address;
  }

  // ���ÿͻ���ַ
  public void setAddress(String address) {
    if ("null".equals(address))
      this.address = "";
    else
      this.address = address;
  }

  // ��ȡ�ͻ���ע
  public String getNote() {
    return this.note;
  }

  // ���ÿͻ���ע
  public void setNote(String note) {
    if ("null".equals(note))
      this.note = "";
    else
      this.note = note;
  }

  // ��ȡ�ͻ�ע������
  public String getRegDate() {
    return this.regDate;
  }

  // ���ÿͻ�ע������
  public void setRegDate(String regDate) {
    this.regDate = regDate;
    if ("null".equals(regDate))
      this.regDate = "";
    else
      this.regDate = regDate;
  }

  // ��ȡ�ͻ�����
  public double getIntegration() {
    return this.integration;
  }

  // ���ÿͻ�����
  public void setIntegration(double integration) {
    this.integration = integration;
  }

  // ���ͻ���Ϣת��Ϊ�ַ���
  @Override
  public String toString() {
    return getId() + "," + getName() + "," + getTelephone() + "," + getType() + "," + getIntegration();
  }
}
