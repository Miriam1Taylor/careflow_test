package com.careflow.pojo;

import java.math.BigDecimal;
import java.text.DecimalFormat;

// Stock 类表示库存的实体类
public class Stock {

  // 用于格式化数字的静态 DecimalFormat 对象
  private static DecimalFormat format = new DecimalFormat("###,####.00");

  // 库存编号
  private String id;

  // 商品编号
  private String catno;

  // 商品名称
  private String stockname;

  // 库存数量
  private double amount;

  // 剩余数量
  private double syamount;

  // 成本价
  private BigDecimal costprice = new BigDecimal(0);

  // 销售价
  private BigDecimal sellprice = new BigDecimal(0);

  // 商品类型
  private String type;

  // 入库日期
  private String date;

  // 总价值
  private BigDecimal total = new BigDecimal(0);

  // 库存标志
  private String stockFlag;

  // 记录日期
  private String recorddate;

  // 商品颜色
  private String color = "";

  // 商品规格
  private String specif = "";

  // 供应商
  private String suppliers = null;

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

  // 获取库存编号
  public String getId() {
    return this.id;
  }

  // 设置库存编号
  public void setId(String id) {
    this.id = id;
  }

  // 获取商品编号
  public String getCatno() {
    return this.catno;
  }

  // 设置商品编号
  public void setCatno(String catno) {
    this.catno = catno;
  }

  // 获取总价值
  public BigDecimal getTotal() {
    return this.total;
  }

  // 设置总价值
  public void setTotal(BigDecimal total) {
    this.total = total.setScale(2, 4);
  }

  // 获取入库日期
  public String getDate() {
    return this.date;
  }

  // 设置入库日期
  public void setDate(String date) {
    this.date = date;
  }

  // 获取商品类型
  public String getType() {
    return this.type;
  }

  // 设置商品类型
  public void setType(String type) {
    this.type = type;
  }

  // 获取销售价
  public BigDecimal getSellprice() {
    return this.sellprice;
  }

  // 设置销售价
  public void setSellprice(BigDecimal sellprice) {
    this.sellprice = sellprice.setScale(2, 4);
  }

  // 获取成本价
  public BigDecimal getCostprice() {
    return this.costprice;
  }

  // 设置成本价
  public void setCostprice(BigDecimal costprice) {
    this.costprice = costprice.setScale(2, 4);
  }

  // 获取库存数量
  public double getAmount() {
    return this.amount;
  }

  // 设置库存数量
  public void setAmount(double amount) {
    this.amount = amount;
  }

  // 获取剩余数量
  public double getSyamount() {
    return this.syamount;
  }

  // 设置剩余数量
  public void setSyamount(double syamount) {
    this.syamount = syamount;
  }

  // 获取库存标志
  public String getStockFlag() {
    return this.stockFlag;
  }

  // 设置库存标志
  public void setStockFlag(String stockFlag) {
    this.stockFlag = stockFlag;
  }

  // 获取记录日期
  public String getRecorddate() {
    return this.recorddate;
  }

  // 设置记录日期
  public void setRecorddate(String recorddate) {
    this.recorddate = recorddate;
  }

  // 获取商品颜色
  public String getColor() {
    return this.color;
  }

  // 设置商品颜色
  public void setColor(String color) {
    if ("null".equals(color))
      this.color = "";
    else
      this.color = color;
  }

  // 获取商品规格
  public String getSpecif() {
    return this.specif;
  }

  // 获取供应商
  public String getSuppliers() {
    return this.suppliers;
  }

  // 设置供应商
  public void setSuppliers(String suppliers) {
    if ("null".equals(suppliers))
      this.suppliers = "";
    else
      this.suppliers = suppliers;
  }

  // 设置商品规格
  public void setSpecif(String specif) {
    if ("null".equals(specif))
      this.specif = "";
    else
      this.specif = specif;
  }

  // 主方法用于测试
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
