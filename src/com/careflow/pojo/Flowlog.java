package com.careflow.pojo;

import java.math.BigDecimal;

// Flowlog 类表示交易流水的实体类
public class Flowlog {

  // 流水号
  private String flowno;

  // 商品编号
  private String catno;

  // 销售价格
  private BigDecimal sellprice;

  // 数量
  private double amount;

  // 成本价
  private BigDecimal costprice = new BigDecimal(0);

  // 利润
  private BigDecimal lrprice = new BigDecimal(0);

  // 类型
  private String type;

  // 日期
  private String date;

  // 商品名称
  private String stockname;

  // 流水标志
  private String flowflag;

  // 记录日期
  private String recorddate;

  // 客户名称
  private String customName = "";

  // 客户编号
  private String customNo = "";

  // 获取流水号
  public String getFlowno() {
    return this.flowno;
  }

  // 设置流水号
  public void setFlowno(String flowno) {
    this.flowno = flowno;
  }

  // 获取商品编号
  public String getCatno() {
    return this.catno;
  }

  // 设置商品编号
  public void setCatno(String catno) {
    this.catno = catno;
  }

  // 获取销售价格
  public BigDecimal getSellprice() {
    return this.sellprice;
  }

  // 设置销售价格
  public void setSellprice(BigDecimal sellprice) {
    this.sellprice = sellprice;
  }

  // 获取利润
  public BigDecimal getLrprice() {
    return this.lrprice;
  }

  // 设置利润，保留两位小数
  public void setLrprice(BigDecimal lrprice) {
    this.lrprice = lrprice.setScale(2, 4);
  }

  // 获取类型
  public String getType() {
    return this.type;
  }

  // 设置类型
  public void setType(String type) {
    this.type = type;
  }

  // 获取日期
  public String getDate() {
    return this.date;
  }

  // 设置日期
  public void setDate(String date) {
    this.date = date;
  }

  // 获取数量
  public double getAmount() {
    return this.amount;
  }

  // 设置数量
  public void setAmount(double amount) {
    this.amount = amount;
  }

  // 获取成本价
  public BigDecimal getCostprice() {
    return this.costprice;
  }

  // 设置成本价，保留两位小数
  public void setCostprice(BigDecimal costprice) {
    this.costprice = costprice.setScale(2, 4);
  }

  // 获取商品名称
  public String getStockname() {
    return this.stockname;
  }

  // 设置商品名称
  public void setStockname(String stockname) {
    if ("null".equals(stockname))
      this.stockname = "";
    else
      this.stockname = stockname;
  }

  // 获取流水标志
  public String getFlowflag() {
    return this.flowflag;
  }

  // 设置流水标志
  public void setFlowflag(String flowflag) {
    this.flowflag = flowflag;
  }

  // 获取记录日期
  public String getRecorddate() {
    return this.recorddate;
  }

  // 设置记录日期
  public void setRecorddate(String recorddate) {
    this.recorddate = recorddate;
  }

  // 获取客户编号
  public String getCustomNo() {
    return this.customNo;
  }

  // 设置客户编号，如果为 "null"，则设置为空字符串
  public void setCustomNo(String customNo) {
    if ("null".equals(this.stockname))
      this.customNo = "";
    else
      this.customNo = customNo;
  }

  // 获取客户名称
  public String getCustomName() {
    return this.customName;
  }

  // 设置客户名称，如果为 "null"，则设置为空字符串
  public void setCustomName(String customName) {
    if ("null".equals(customName))
      this.customName = "";
    else
      this.customName = customName;
  }
}
