package com.careflow.pojo;

import java.math.BigDecimal;

// Custom 类表示客户信息的实体类
public class Custom {

  // 客户ID
  private String id;

  // 客户姓名
  private String name;

  // 客户类型
  private String type;

  // 客户性别
  private String sex;

  // 客户生日
  private String birthday = "0000-01-01";

  // 客户购物总金额
  private BigDecimal amount = new BigDecimal(0);

  // 客户购物频率
  private int frequency;

  // 客户电话号码
  private String telephone;

  // 客户地址
  private String address;

  // 客户备注
  private String note;

  // 客户注册日期
  private String regDate;

  // 客户积分
  private double integration = 0.0D;

  // 获取客户ID
  public String getId() {
    return this.id;
  }

  // 设置客户ID
  public void setId(String id) {
    this.id = id;
  }

  // 获取客户姓名
  public String getName() {
    return this.name;
  }

  // 设置客户姓名
  public void setName(String name) {
    this.name = name;
  }

  // 获取客户类型
  public String getType() {
    return this.type;
  }

  // 设置客户类型
  public void setType(String type) {
    this.type = type;
  }

  // 获取客户性别
  public String getSex() {
    return this.sex;
  }

  // 设置客户性别
  public void setSex(String sex) {
    this.sex = sex;
  }

  // 获取客户生日
  public String getBirthday() {
    return this.birthday;
  }

  // 设置客户生日
  public void setBirthday(String birthday) {
    if ("null".equals(birthday))
      this.birthday = "";
    else
      this.birthday = birthday;
  }

  // 获取客户购物总金额
  public BigDecimal getAmount() {
    return this.amount;
  }

  // 设置客户购物总金额
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  // 获取客户购物频率
  public int getFrequency() {
    return this.frequency;
  }

  // 设置客户购物频率
  public void setFrequency(int frequency) {
    this.frequency = frequency;
  }

  // 获取客户电话号码
  public String getTelephone() {
    return this.telephone;
  }

  // 设置客户电话号码
  public void setTelephone(String telephone) {
    if ("null".equals(telephone))
      this.telephone = "";
    else
      this.telephone = telephone;
  }

  // 获取客户地址
  public String getAddress() {
    return this.address;
  }

  // 设置客户地址
  public void setAddress(String address) {
    if ("null".equals(address))
      this.address = "";
    else
      this.address = address;
  }

  // 获取客户备注
  public String getNote() {
    return this.note;
  }

  // 设置客户备注
  public void setNote(String note) {
    if ("null".equals(note))
      this.note = "";
    else
      this.note = note;
  }

  // 获取客户注册日期
  public String getRegDate() {
    return this.regDate;
  }

  // 设置客户注册日期
  public void setRegDate(String regDate) {
    this.regDate = regDate;
    if ("null".equals(regDate))
      this.regDate = "";
    else
      this.regDate = regDate;
  }

  // 获取客户积分
  public double getIntegration() {
    return this.integration;
  }

  // 设置客户积分
  public void setIntegration(double integration) {
    this.integration = integration;
  }

  // 将客户信息转换为字符串
  @Override
  public String toString() {
    return getId() + "," + getName() + "," + getTelephone() + "," + getType() + "," + getIntegration();
  }
}
