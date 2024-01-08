package com.careflow.dao;

import com.careflow.pojo.Flowlog;

import java.math.BigDecimal;
import java.util.List;

// 流水日志数据访问对象接口
public interface FlowLogDAO {

  // 添加流水日志记录
  boolean add(Flowlog paramFlowlog);

  // 批量添加流水日志记录
  boolean add(Flowlog[] paramArrayOfFlowlog);

  // 更新流水日志记录
  boolean update(Flowlog paramFlowlog);

  // 根据流水号获取流水日志记录
  Flowlog getFlowByflowno(String paramString);

  // 获取所有流水日志记录列表
  List getFlowlog();

  // 根据条件获取流水日志记录列表
  List getFlowlog(String paramString, int paramInt);

  // 根据条件获取流水日志记录列表
  List getFlowlog(String paramString);

  // 获取今天的流水日志记录列表
  List getFlowlogByToday(String paramString);

  // 根据流水号删除流水日志记录
  boolean deleteByFlowno(String paramString);

  // 获取统计信息
  List getStatistical(String paramString1, String paramString2, String paramString3);

  // 获取统计信息的记录总数
  int getStatisticalSize(String paramString1, String paramString2, String paramString3);

  // 分页获取统计信息
  List getStatistical(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2);

  // 计算成本价格总和
  BigDecimal sumCostPrice(String paramString1, String paramString2, String paramString3);

  // 计算利润总和
  BigDecimal sumLrPrice(String paramString1, String paramString2, String paramString3);

  // 计算流水总和
  BigDecimal sumFlowPrice(String paramString1, String paramString2, String paramString3);

  // 计算流水数量总和
  int sumFlow(String paramString1, String paramString2);

  // 获取订单类型的流水日志记录总数
  int getFlowLogOrderSize(String paramString1, String paramString2);

  // 分页获取订单类型的流水日志记录
  List getFlowLogOrderBy(String paramString1, String paramString2, int paramInt1, int paramInt2);

  // 获取订单类型的流水日志记录列表
  List getFlowLogOrderBy(String paramString1, String paramString2);

  // 获取客户类型的流水日志记录总数
  int getFlowLogKeHLogSize(String paramString1, String paramString2, String paramString3, String paramString4);

  // 分页获取客户类型的流水日志记录
  List getFlowLogKeHLog(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2);
}
