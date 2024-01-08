package com.careflow.pojo;

// CustomType 类表示客户类型的实体类
public class CustomType {

  // 客户类型名称
  private String typename;

  // 客户类型积分
  private double integration = 0.0D;

  // 客户类型折扣
  private double discount = 0.0D;

  // 获取客户类型名称
  public String getTypename() {
    return this.typename;
  }

  // 设置客户类型名称
  public void setTypename(String typename) {
    if ("null".equals(typename))
      this.typename = "";
    else
      this.typename = typename;
  }

  // 获取客户类型积分
  public double getIntegration() {
    return this.integration;
  }

  // 设置客户类型积分
  public void setIntegration(double integration) {
    this.integration = integration;
  }

  // 获取客户类型折扣
  public double getDiscount() {
    return this.discount;
  }

  // 设置客户类型折扣
  public void setDiscount(double discount) {
    this.discount = discount;
  }
}
