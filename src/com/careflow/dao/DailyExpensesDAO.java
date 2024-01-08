package com.careflow.dao;

import com.careflow.pojo.DailyExpenses;

import java.math.BigDecimal;
import java.util.List;

// 日常支出数据访问对象接口
public interface DailyExpensesDAO {

  // 添加日常支出记录
  void add(DailyExpenses paramDailyExpenses);

  // 更新日常支出记录
  void update(DailyExpenses paramDailyExpenses);

  // 根据ID删除日常支出记录
  void deleteById(String paramString);

  // 获取所有日常支出记录列表
  List getList();

  // 获取今天的日常支出记录列表
  List getDailyExpensesByTaday();

  // 获取日常支出记录总数
  int getListSize();

  // 分页获取日常支出记录列表
  List getList(int paramInt1, int paramInt2);

  // 根据条件获取日常支出记录列表总数
  int getListSize(String paramString1, String paramString2);

  // 根据条件分页获取日常支出记录列表
  List getList(String paramString1, String paramString2, int paramInt1, int paramInt2);

  // 根据多条件分页获取日常支出记录列表
  List getList(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2);

  // 根据多条件获取日常支出记录列表
  List getList(String paramString1, String paramString2, String paramString3, String paramString4);

  // 根据多条件获取日常支出记录列表总数
  int getListSize(String paramString1, String paramString2, String paramString3, String paramString4);

  // 计算指定日期的日常支出总额
  BigDecimal sumDailyExpensesPay(String paramString);

  // 计算指定日期范围的日常支出总额
  BigDecimal sumDailyExpensesPay(String paramString1, String paramString2, String paramString3);

  // 计算指定日期范围、指定支出类型的日常支出总额
  BigDecimal sumDailyExpensesPay(String paramString1, String paramString2, String paramString3, String paramString4);

  // 计算指定日期范围、指定支出类型的日常支出总额
  BigDecimal sumDailyExpensesPay(String paramString1, String paramString2);
}
