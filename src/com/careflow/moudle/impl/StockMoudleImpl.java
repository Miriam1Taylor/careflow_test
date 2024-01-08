package com.careflow.moudle.impl;

import com.careflow.dao.StockDAO;
import com.careflow.moudle.StockMoudle;
import com.careflow.pojo.Stock;

import java.math.BigDecimal;
import java.util.List;

// StockMoudleImpl 类实现了 StockMoudle 接口
public class StockMoudleImpl implements StockMoudle {

  // 股票数据访问对象
  private StockDAO stockDAO;

  // 设置股票数据访问对象
  public void setStockDAO(StockDAO stockDAO) {
    this.stockDAO = stockDAO;
  }

  // 添加股票
  public boolean add(Stock stock) {
    return this.stockDAO.add(stock);
  }

  // 根据股票ID删除股票
  public boolean delete(String stockid) {
    return this.stockDAO.deleteById(stockid);
  }

  // 获取股票建议列表
  public List<String> getStockSuggestByCatNo(String catno, int max) {
    return this.stockDAO.getStockSuggestByCatNo(catno, max);
  }

  // 获取今日股票列表
  public List getStockByTaday() {
    return this.stockDAO.getStockByTaday();
  }

  // 更新股票剩余数量
  public boolean updateSyAmount(String catno, double ssAmount, String type) {
    return this.stockDAO.updateSyAmount(catno, ssAmount, type);
  }

  // 获取最新的股票信息
  public Stock getLastStockByNo(String catno) {
    return this.stockDAO.getLastStockByNo(catno);
  }

  // 根据股票编号获取股票信息
  public Stock getStockByNo(String catno) {
    return this.stockDAO.getStockByNo(catno);
  }

  // 更新股票信息
  public boolean updateStock(Stock stock) {
    return this.stockDAO.updateStock(stock);
  }

  // 计算股票总价值
  public double sumStockAmount(String catno) {
    return this.stockDAO.sumStockAmount(catno);
  }

  // 计算股票剩余总价值
  public double sumStockSyAmount(String catno) {
    return this.stockDAO.sumStockSyAmount(catno);
  }

  // 根据股票ID获取股票信息
  public Stock getStockByID(String id) {
    return this.stockDAO.getStockByID(id);
  }

  // 获取按时间范围排序的股票列表
  public List getStockOrderBy(String starttime, String endtime) {
    return this.stockDAO.getStockOrderBy(starttime, endtime);
  }

  // 获取分页后的股票列表
  public List getStock(int start, int max) {
    return this.stockDAO.getStock(start, max);
  }

  // 获取全部股票列表
  public List getStock() {
    return this.stockDAO.getStock();
  }

  // 获取股票总数
  public int getStockSize() {
    return this.stockDAO.getStockSize();
  }

  // 根据股票类别和分页信息获取股票列表
  public List getStockByCatNo(String catno, int start, int max) {
    return this.stockDAO.getStockByCatNo(catno, start, max);
  }

  // 获取指定股票类别的股票总数
  public int getStockByCatNoSize(String catno) {
    return this.stockDAO.getStockByCatNoSize(catno);
  }

  // 根据成本信息和分页信息获取股票列表
  public List getStockByCatCost(String cost, int start, int max) {
    return this.stockDAO.getStockByCatCost(cost, start, max);
  }

  // 获取指定成本信息的股票总数
  public int getStockByCatCostSize(String cost) {
    return this.stockDAO.getStockByCatCostSize(cost);
  }

  // 根据参数信息获取股票总数
  public int sumStockSyAmount(String catno, String cost, String type, String date, String dateTo) {
    return this.stockDAO.sumStockSyAmount(catno, cost, type, date, dateTo);
  }

  // 根据参数信息获取股票成本总金额
  public BigDecimal sumStockCostAmount(String catno, String cost, String type, String date, String dateTo) {
    return this.stockDAO.sumStockCostAmount(catno, cost, type, date, dateTo);
  }

  // 根据参数信息获取股票剩余成本总金额
  public BigDecimal sumSyStockCostAmount(String catno, String cost, String type, String date, String dateTo) {
    return this.stockDAO.sumSyStockCostAmount(catno, cost, type, date, dateTo);
  }

  // 根据参数信息获取股票列表总数
  public int getStockByParmSize(String catno, String cost, String type, String date, String dateTo) {
    return this.stockDAO.getStockByParmSize(catno, cost, type, date, dateTo);
  }

  // 根据参数信息和分页信息获取股票列表
  public List getStockByParm(String catno, String cost, String type, String date, String dateTo, int start, int max) {
    return this.stockDAO.getStockByParm(catno, cost, type, date, dateTo, start, max);
  }

  // 获取按时间范围排序的订单股票列表总数
  public int getStockOrderSize(String starttime, String endtime) {
    return this.stockDAO.getStockOrderSize(starttime, endtime);
  }

  // 获取按时间范围排序的订单股票列表
  public List getStockOrderBy(String starttime, String endtime, int start, int max) {
    return this.stockDAO.getStockOrderBy(starttime, endtime, start, max);
  }

  // 获取报警股票列表总数
  public int getStockAlarmSize(String alarmType, double num) {
    return this.stockDAO.getStockAlarmSize(alarmType, num);
  }

  // 获取报警股票列表
  public List getStockAlarm(String alarmType, double num, int start, int max) {
    return this.stockDAO.getStockAlarm(alarmType, num, start, max);
  }
}
