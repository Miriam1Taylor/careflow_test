package com.careflow.moudle.impl;

import com.careflow.dao.FlowLogDAO;
import com.careflow.dao.StockDAO;
import com.careflow.moudle.FlowLogMoudle;
import com.careflow.pojo.Flowlog;

import java.math.BigDecimal;
import java.util.List;

// FlowLogMoudleImpl 类实现了 FlowLogMoudle 接口
public class FlowLogMoudleImpl implements FlowLogMoudle {

  // 流水日志数据访问对象
  private FlowLogDAO flowLogDAO;

  // 库存数据访问对象
  private StockDAO stockDAO;

  // 根据流水号获取流水记录
  public Flowlog getFlowByflowno(String flowno) {
    return this.flowLogDAO.getFlowByflowno(flowno);
  }

  // 获取今天的流水记录列表
  public List getFlowlogByToday(String type) {
    return this.flowLogDAO.getFlowlogByToday(type);
  }

  // 根据流水号删除流水记录，并更新对应库存
  public boolean delete(String flowno, String catno, double amount) {
    this.stockDAO.updateSyAmount(catno, amount, "+");
    return this.flowLogDAO.deleteByFlowno(flowno);
  }

  // 根据流水号删除流水记录
  public boolean delete(String flowno) {
    return this.flowLogDAO.deleteByFlowno(flowno);
  }

  // 更新流水记录，并根据类型更新对应库存
  public boolean update(Flowlog flowlog, String type) {
    if (type != null) {
      this.stockDAO.updateSyAmount(flowlog.getCatno(), flowlog.getAmount(), type);
    }
    return this.flowLogDAO.update(flowlog);
  }

  // 添加流水记录
  public boolean add(Flowlog flowlog) {
    return this.flowLogDAO.add(flowlog);
  }

  // 批量添加流水记录
  public boolean add(Flowlog[] flowlogs) {
    return this.flowLogDAO.add(flowlogs);
  }

  // 获取指定分类下的流水记录列表
  public List getFlowlog(String catno, int size) {
    return this.flowLogDAO.getFlowlog(catno, size);
  }

  // 获取指定分类下的所有流水记录列表
  public List getFlowlog(String catno) {
    return this.flowLogDAO.getFlowlog(catno);
  }

  // 设置流水日志数据访问对象
  public void setFlowLogDAO(FlowLogDAO flowLogDAO) {
    this.flowLogDAO = flowLogDAO;
  }

  // 设置库存数据访问对象
  public void setStockDAO(StockDAO stockDAO) {
    this.stockDAO = stockDAO;
  }

  // 获取指定时间范围内的统计信息列表
  public List getStatistical(String starttime, String endtime, String type) {
    return this.flowLogDAO.getStatistical(starttime, endtime, type);
  }

  // 获取指定时间范围内的统计信息总数
  public int getStatisticalSize(String starttime, String endtime, String type) {
    return this.flowLogDAO.getStatisticalSize(starttime, endtime, type);
  }

  // 分页获取指定时间范围内的统计信息列表
  public List getStatistical(String starttime, String endtime, String type, int start, int max) {
    return this.flowLogDAO.getStatistical(starttime, endtime, type, start, max);
  }

  // 统计指定时间范围内的成本价总和
  public BigDecimal sumCostPrice(String starttime, String endtime, String type) {
    return this.flowLogDAO.sumCostPrice(starttime, endtime, type);
  }

  // 统计指定时间范围内的利润总和
  public BigDecimal sumLrPrice(String starttime, String endtime, String type) {
    return this.flowLogDAO.sumLrPrice(starttime, endtime, type);
  }

  // 统计指定时间范围内的销售金额总和
  public BigDecimal sumFlowPrice(String starttime, String endtime, String type) {
    return this.flowLogDAO.sumFlowPrice(starttime, endtime, type);
  }

  // 统计指定分类和流水标志下的流水记录总数
  public int sumFlow(String catno, String flowflag) {
    return this.flowLogDAO.sumFlow(catno, flowflag);
  }

  // 获取指定时间范围内的流水记录订单总数
  public int getFlowLogOrderSize(String starttime, String endtime) {
    return this.flowLogDAO.getFlowLogOrderSize(starttime, endtime);
  }

  // 分页获取指定时间范围内的流水记录订单列表
  public List getFlowLogOrderBy(String starttime, String endtime, int start, int max) {
    return this.flowLogDAO.getFlowLogOrderBy(starttime, endtime, start, max);
  }

  // 获取指定时间范围内的流水记录订单列表
  public List getFlowLogOrderBy(String starttime, String endtime) {
    return this.flowLogDAO.getFlowLogOrderBy(starttime, endtime);
  }

  // 获取指定时间范围内的客户流水记录总数
  public int getFlowLogKeHLogSize(String starttime, String endtime, String cno, String cName) {
    return this.flowLogDAO.getFlowLogKeHLogSize(starttime, endtime, cno, cName);
  }

  // 分页获取指定时间范围内的客户流水记录列表
  public List getFlowLogKeHLog(String starttime, String endtime, String cno, String cName, int start, int max) {
    return this.flowLogDAO.getFlowLogKeHLog(starttime, endtime, cno, cName, start, max);
  }

  // 获取指定时间范围内的客户流水记录列表
  public List getFlowLogKeHLog(String starttime, String endtime, String cno, String cName) {
    return this.flowLogDAO.getFlowLogKeHLog(starttime, endtime, cno, cName, -1, -1);
  }
}
