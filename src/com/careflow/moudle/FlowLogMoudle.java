package com.careflow.moudle;

import com.careflow.dao.FlowLogDAO;
import com.careflow.dao.StockDAO;
import com.careflow.pojo.Flowlog;

import java.math.BigDecimal;
import java.util.List;

// FlowLogMoudle 接口定义了对流水日志信息进行操作的方法
public abstract interface FlowLogMoudle {

  // 设置流水日志数据访问对象
  public abstract void setFlowLogDAO(FlowLogDAO flowLogDAO);

  // 设置库存数据访问对象
  public abstract void setStockDAO(StockDAO stockDAO);

  // 添加流水日志信息
  public abstract boolean add(Flowlog flowlog);

  // 批量添加流水日志信息
  public abstract boolean add(Flowlog[] flowlogs);

  // 根据流水号获取流水日志信息
  public abstract Flowlog getFlowByflowno(String flowno);

  // 获取今日指定类型的流水日志信息列表
  public abstract List getFlowlogByToday(String type);

  // 更新流水日志信息
  public abstract boolean update(Flowlog flowlog, String type);

  // 根据流水号删除流水日志信息
  public abstract boolean delete(String flowno, String catno, double amount);

  // 根据流水号删除流水日志信息
  public abstract boolean delete(String flowno);

  // 获取指定购物车号的流水日志信息列表
  public abstract List getFlowlog(String cartno, int size);

  // 获取指定购物车号的流水日志信息列表
  public abstract List getFlowlog(String cartno);

  // 获取指定时间范围内的统计信息列表
  public abstract List getStatistical(String starttime, String endtime, String type);

  // 获取指定时间范围内的统计信息列表的大小
  public abstract int getStatisticalSize(String starttime, String endtime, String type);

  // 获取指定时间范围内的统计信息列表
  public abstract List getStatistical(String starttime, String endtime, String type, int start, int max);

  // 计算指定时间范围内的成本总价
  public abstract BigDecimal sumCostPrice(String starttime, String endtime, String type);

  // 计算指定时间范围内的利润总价
  public abstract BigDecimal sumLrPrice(String starttime, String endtime, String type);

  // 计算指定时间范围内的流水总价
  public abstract BigDecimal sumFlowPrice(String starttime, String endtime, String type);

  // 统计指定商品编号和流水标志的总数量
  public abstract int sumFlow(String catno, String flowflag);

  // 获取指定时间范围内的订单流水信息列表的大小
  public abstract int getFlowLogOrderSize(String starttime, String endtime);

  // 获取指定时间范围内的订单流水信息列表
  public abstract List getFlowLogOrderBy(String starttime, String endtime, int start, int max);

  // 获取指定时间范围内的订单流水信息列表
  public abstract List getFlowLogOrderBy(String starttime, String endtime);

  // 获取指定时间范围内的客户流水信息列表的大小
  public abstract int getFlowLogKeHLogSize(String starttime, String endtime, String cno, String cName);

  // 获取指定时间范围内的客户流水信息列表
  public abstract List getFlowLogKeHLog(String starttime, String endtime, String cno, String cName, int start, int max);

  // 获取指定时间范围内的客户流水信息列表
  public abstract List getFlowLogKeHLog(String starttime, String endtime, String cno, String cName);
}
