package com.careflow.pojo;

import java.math.BigDecimal;

// DailyExpenses 类表示日常支出的实体类
public class DailyExpenses {

  // 支出记录ID
  private String id;

  // 支出类型
  private String type;

  // 支出日期
  private String date;

  // 记录日期
  private String recorddate;

  // 支付金额
  private BigDecimal pay;

  // 支付方式
  private String mode;

  // 获取支付金额
  public BigDecimal getPay() {
    return this.pay;
  }

  // 设置支付金额
  public void setPay(BigDecimal pay) {
    this.pay = pay;
  }

  // 获取记录日期
  public String getRecorddate() {
    return this.recorddate;
  }

  // 设置记录日期
  public void setRecorddate(String recorddate) {
    this.recorddate = recorddate;
  }

  // 获取支出日期
  public String getDate() {
    return this.date;
  }

  // 设置支出日期
  public void setDate(String date) {
    this.date = date;
  }

  // 获取支出记录ID
  public String getId() {
    return this.id;
  }

  // 设置支出记录ID
  public void setId(String id) {
    this.id = id;
  }

  // 获取支出类型
  public String getType() {
    return this.type;
  }

  // 设置支出类型
  public void setType(String type) {
    this.type = type;
  }

  // 获取支付方式
  public String getMode() {
    return this.mode;
  }

  // 设置支付方式
  public void setMode(String mode) {
    this.mode = mode;
  }
}
