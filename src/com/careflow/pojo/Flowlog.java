package com.careflow.pojo;

import java.math.BigDecimal;

// Flowlog ���ʾ������ˮ��ʵ����
public class Flowlog {

  // ��ˮ��
  private String flowno;

  // ��Ʒ���
  private String catno;

  // ���ۼ۸�
  private BigDecimal sellprice;

  // ����
  private double amount;

  // �ɱ���
  private BigDecimal costprice = new BigDecimal(0);

  // ����
  private BigDecimal lrprice = new BigDecimal(0);

  // ����
  private String type;

  // ����
  private String date;

  // ��Ʒ����
  private String stockname;

  // ��ˮ��־
  private String flowflag;

  // ��¼����
  private String recorddate;

  // �ͻ�����
  private String customName = "";

  // �ͻ����
  private String customNo = "";

  // ��ȡ��ˮ��
  public String getFlowno() {
    return this.flowno;
  }

  // ������ˮ��
  public void setFlowno(String flowno) {
    this.flowno = flowno;
  }

  // ��ȡ��Ʒ���
  public String getCatno() {
    return this.catno;
  }

  // ������Ʒ���
  public void setCatno(String catno) {
    this.catno = catno;
  }

  // ��ȡ���ۼ۸�
  public BigDecimal getSellprice() {
    return this.sellprice;
  }

  // �������ۼ۸�
  public void setSellprice(BigDecimal sellprice) {
    this.sellprice = sellprice;
  }

  // ��ȡ����
  public BigDecimal getLrprice() {
    return this.lrprice;
  }

  // �������󣬱�����λС��
  public void setLrprice(BigDecimal lrprice) {
    this.lrprice = lrprice.setScale(2, 4);
  }

  // ��ȡ����
  public String getType() {
    return this.type;
  }

  // ��������
  public void setType(String type) {
    this.type = type;
  }

  // ��ȡ����
  public String getDate() {
    return this.date;
  }

  // ��������
  public void setDate(String date) {
    this.date = date;
  }

  // ��ȡ����
  public double getAmount() {
    return this.amount;
  }

  // ��������
  public void setAmount(double amount) {
    this.amount = amount;
  }

  // ��ȡ�ɱ���
  public BigDecimal getCostprice() {
    return this.costprice;
  }

  // ���óɱ��ۣ�������λС��
  public void setCostprice(BigDecimal costprice) {
    this.costprice = costprice.setScale(2, 4);
  }

  // ��ȡ��Ʒ����
  public String getStockname() {
    return this.stockname;
  }

  // ������Ʒ����
  public void setStockname(String stockname) {
    if ("null".equals(stockname))
      this.stockname = "";
    else
      this.stockname = stockname;
  }

  // ��ȡ��ˮ��־
  public String getFlowflag() {
    return this.flowflag;
  }

  // ������ˮ��־
  public void setFlowflag(String flowflag) {
    this.flowflag = flowflag;
  }

  // ��ȡ��¼����
  public String getRecorddate() {
    return this.recorddate;
  }

  // ���ü�¼����
  public void setRecorddate(String recorddate) {
    this.recorddate = recorddate;
  }

  // ��ȡ�ͻ����
  public String getCustomNo() {
    return this.customNo;
  }

  // ���ÿͻ���ţ����Ϊ "null"��������Ϊ���ַ���
  public void setCustomNo(String customNo) {
    if ("null".equals(this.stockname))
      this.customNo = "";
    else
      this.customNo = customNo;
  }

  // ��ȡ�ͻ�����
  public String getCustomName() {
    return this.customName;
  }

  // ���ÿͻ����ƣ����Ϊ "null"��������Ϊ���ַ���
  public void setCustomName(String customName) {
    if ("null".equals(customName))
      this.customName = "";
    else
      this.customName = customName;
  }
}
