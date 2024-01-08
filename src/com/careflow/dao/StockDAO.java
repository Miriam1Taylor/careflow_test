package com.careflow.dao;

import com.careflow.pojo.Stock;

import java.math.BigDecimal;
import java.util.List;

// StockDAO接口定义了与Stock（库存）相关的数据库操作方法
public interface StockDAO {

  // 添加库存记录
  boolean add(Stock stock);

  // 根据库存ID删除库存记录
  boolean deleteById(String stockId);

  // 更新库存剩余数量
  boolean updateSyAmount(String stockId, double syAmount, String operator);

  // 更新库存信息
  boolean updateStock(Stock stock);

  // 根据库存编号获取库存信息
  Stock getStockByNo(String stockNo);

  // 根据库存ID获取库存信息
  Stock getStockByID(String stockId);

  // 根据库存编号获取最近的库存记录
  Stock getLastStockByNo(String stockNo);

  // 根据商品分类编号获取库存建议
  List<String> getStockSuggestByCatNo(String catNo, int limit);

  // 根据商品分类编号获取库存信息列表（分页）
  List getStockByCatNo(String catNo, int offset, int limit);

  // 根据商品分类编号获取库存信息列表的总记录数
  int getStockByCatNoSize(String catNo);

  // 根据商品分类编号获取库存成本信息列表（分页）
  List getStockByCatCost(String catNo, int offset, int limit);

  // 根据商品分类编号获取库存成本信息列表的总记录数
  int getStockByCatCostSize(String catNo);

  // 根据排序字段和排序方式获取库存信息列表（分页）
  List getStockOrderBy(String orderBy, String order);

  // 根据排序字段和排序方式获取库存信息列表的总记录数
  int getStockOrderSize(String orderBy, String order);

  // 根据排序字段和排序方式获取库存信息列表（分页）
  List getStockOrderBy(String orderBy, String order, int offset, int limit);

  // 根据参数获取库存信息列表的总记录数
  int getStockByParmSize(String catNo, String stockNo, String name, String spec, String brand);

  // 根据参数获取库存信息列表（分页）
  List getStockByParm(String catNo, String stockNo, String name, String spec, String brand, int offset, int limit);

  // 获取所有库存信息列表
  List getStock();

  // 获取库存信息列表（分页）
  List getStock(int offset, int limit);

  // 获取库存信息列表的总记录数
  int getStockSize();

  // 计算指定条件下的库存剩余数量总和
  int sumStockSyAmount(String catNo, String stockNo, String name, String spec, String brand);

  // 计算指定条件下的库存成本总金额
  BigDecimal sumStockCostAmount(String catNo, String stockNo, String name, String spec, String brand);

  // 计算指定条件下的库存剩余成本总金额
  BigDecimal sumSyStockCostAmount(String catNo, String stockNo, String name, String spec, String brand);

  // 计算指定商品的总数量
  double sumStockAmount(String stockNo);

  // 计算指定商品的总剩余数量
  double sumStockSyAmount(String stockNo);

  // 获取当天入库的库存信息列表
  List getStockByTaday();

  // 获取库存报警的记录数
  int getStockAlarmSize(String catNo, double threshold);

  // 获取库存报警的列表（分页）
  List getStockAlarm(String catNo, double threshold, int offset, int limit);
}
