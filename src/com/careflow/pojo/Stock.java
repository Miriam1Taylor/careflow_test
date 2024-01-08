package com.careflow.pojo;

import java.math.BigDecimal;
import java.text.DecimalFormat;

// Stock ���ʾ����ʵ����
public class Stock {

  // ���ڸ�ʽ�����ֵľ�̬ DecimalFormat ����
  private static DecimalFormat format = new DecimalFormat("###,####.00");

  // �����
  private String id;

  // ��Ʒ���
  private String catno;

  // ��Ʒ����
  private String stockname;

  // �������
  private double amount;

  // ʣ������
  private double syamount;

  // �ɱ���
  private BigDecimal costprice = new BigDecimal(0);

  // ���ۼ�
  private BigDecimal sellprice = new BigDecimal(0);

  // ��Ʒ����
  private String type;

  // �������
  private String date;

  // �ܼ�ֵ
  private BigDecimal total = new BigDecimal(0);

  // ����־
  private String stockFlag;

  // ��¼����
  private String recorddate;

  // ��Ʒ��ɫ
  private String color = "";

  // ��Ʒ���
  private String specif = "";

  // ��Ӧ��
  private String suppliers = null;

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

  // ��ȡ�����
  public String getId() {
    return this.id;
  }

  // ���ÿ����
  public void setId(String id) {
    this.id = id;
  }

  // ��ȡ��Ʒ���
  public String getCatno() {
    return this.catno;
  }

  // ������Ʒ���
  public void setCatno(String catno) {
    this.catno = catno;
  }

  // ��ȡ�ܼ�ֵ
  public BigDecimal getTotal() {
    return this.total;
  }

  // �����ܼ�ֵ
  public void setTotal(BigDecimal total) {
    this.total = total.setScale(2, 4);
  }

  // ��ȡ�������
  public String getDate() {
    return this.date;
  }

  // �����������
  public void setDate(String date) {
    this.date = date;
  }

  // ��ȡ��Ʒ����
  public String getType() {
    return this.type;
  }

  // ������Ʒ����
  public void setType(String type) {
    this.type = type;
  }

  // ��ȡ���ۼ�
  public BigDecimal getSellprice() {
    return this.sellprice;
  }

  // �������ۼ�
  public void setSellprice(BigDecimal sellprice) {
    this.sellprice = sellprice.setScale(2, 4);
  }

  // ��ȡ�ɱ���
  public BigDecimal getCostprice() {
    return this.costprice;
  }

  // ���óɱ���
  public void setCostprice(BigDecimal costprice) {
    this.costprice = costprice.setScale(2, 4);
  }

  // ��ȡ�������
  public double getAmount() {
    return this.amount;
  }

  // ���ÿ������
  public void setAmount(double amount) {
    this.amount = amount;
  }

  // ��ȡʣ������
  public double getSyamount() {
    return this.syamount;
  }

  // ����ʣ������
  public void setSyamount(double syamount) {
    this.syamount = syamount;
  }

  // ��ȡ����־
  public String getStockFlag() {
    return this.stockFlag;
  }

  // ���ÿ���־
  public void setStockFlag(String stockFlag) {
    this.stockFlag = stockFlag;
  }

  // ��ȡ��¼����
  public String getRecorddate() {
    return this.recorddate;
  }

  // ���ü�¼����
  public void setRecorddate(String recorddate) {
    this.recorddate = recorddate;
  }

  // ��ȡ��Ʒ��ɫ
  public String getColor() {
    return this.color;
  }

  // ������Ʒ��ɫ
  public void setColor(String color) {
    if ("null".equals(color))
      this.color = "";
    else
      this.color = color;
  }

  // ��ȡ��Ʒ���
  public String getSpecif() {
    return this.specif;
  }

  // ��ȡ��Ӧ��
  public String getSuppliers() {
    return this.suppliers;
  }

  // ���ù�Ӧ��
  public void setSuppliers(String suppliers) {
    if ("null".equals(suppliers))
      this.suppliers = "";
    else
      this.suppliers = suppliers;
  }

  // ������Ʒ���
  public void setSpecif(String specif) {
    if ("null".equals(specif))
      this.specif = "";
    else
      this.specif = specif;
  }

  // ���������ڲ���
  public static void main(String[] dd) {
    String ddd = "2607.39";
    double dddd = 2607.3899999999999D;
    DecimalFormat df = new DecimalFormat("##.00");
    System.out.println(df.format(dddd));
    BigDecimal ff = new BigDecimal(ddd);
    BigDecimal ffddd = ff.setScale(2, 4);
    System.out.println(ffddd);
    DecimalFormat format = new DecimalFormat("###,####.00");

    System.out.println(format.format(111111123456.12672D));
  }
}
