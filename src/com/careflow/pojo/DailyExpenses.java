package com.careflow.pojo;

import java.math.BigDecimal;

// DailyExpenses ���ʾ�ճ�֧����ʵ����
public class DailyExpenses {

  // ֧����¼ID
  private String id;

  // ֧������
  private String type;

  // ֧������
  private String date;

  // ��¼����
  private String recorddate;

  // ֧�����
  private BigDecimal pay;

  // ֧����ʽ
  private String mode;

  // ��ȡ֧�����
  public BigDecimal getPay() {
    return this.pay;
  }

  // ����֧�����
  public void setPay(BigDecimal pay) {
    this.pay = pay;
  }

  // ��ȡ��¼����
  public String getRecorddate() {
    return this.recorddate;
  }

  // ���ü�¼����
  public void setRecorddate(String recorddate) {
    this.recorddate = recorddate;
  }

  // ��ȡ֧������
  public String getDate() {
    return this.date;
  }

  // ����֧������
  public void setDate(String date) {
    this.date = date;
  }

  // ��ȡ֧����¼ID
  public String getId() {
    return this.id;
  }

  // ����֧����¼ID
  public void setId(String id) {
    this.id = id;
  }

  // ��ȡ֧������
  public String getType() {
    return this.type;
  }

  // ����֧������
  public void setType(String type) {
    this.type = type;
  }

  // ��ȡ֧����ʽ
  public String getMode() {
    return this.mode;
  }

  // ����֧����ʽ
  public void setMode(String mode) {
    this.mode = mode;
  }
}
