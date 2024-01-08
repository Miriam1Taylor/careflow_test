package com.careflow.moudle;

import com.careflow.dao.DailyExpensesDAO;
import com.careflow.pojo.DailyExpenses;

import java.math.BigDecimal;
import java.util.List;

// DailyExpensesMoudle 接口定义了对日常支出信息进行操作的方法
public abstract interface DailyExpensesMoudle {

  // 设置日常支出数据访问对象
  public abstract void setDailyExpensesDAO(DailyExpensesDAO dailyExpensesDAO);

  // 添加日常支出信息
  public abstract void add(DailyExpenses dailyExpenses);

  // 获取今日的日常支出信息列表
  public abstract List getDailyExpensesByTaday();

  // 更新日常支出信息
  public abstract void update(DailyExpenses dailyExpenses);

  // 根据支出ID删除日常支出信息
  public abstract void deleteById(String id);

  // 获取所有日常支出信息列表
  public abstract List getList();

  // 获取日常支出信息列表的大小
  public abstract int getListSize();

  // 获取指定范围的日常支出信息列表
  public abstract List getList(int start, int limit);

  // 获取指定时间范围内日常支出信息列表的大小
  public abstract int getListSize(String startTime, String endTime);

  // 获取指定时间范围内的日常支出信息列表
  public abstract List getList(String startTime, String endTime, int start, int limit);

  // 获取指定条件下的日常支出信息列表
  public abstract List getList(String mode, String type, String startTime, String endTime, int start, int limit);

  // 获取指定条件下的日常支出信息列表的大小
  public abstract int getListSize(String mode, String type, String startTime, String endTime);

  // 获取指定条件下的日常支出信息列表
  public abstract List getList(String mode, String type, String startTime, String endTime);

  // 计算指定支付方式的总支出金额
  public abstract BigDecimal sumDailyExpensesPay(String mode);

  // 计算指定类型和时间范围内的总支出金额
  public abstract BigDecimal sumDailyExpensesPay(String type, String startTime, String endTime);

  // 计算指定支付方式、类型和时间范围内的总支出金额
  public abstract BigDecimal sumDailyExpensesPay(String mode, String type, String startTime, String endTime);

  // 计算指定时间范围内的总支出金额
  public abstract BigDecimal sumDailyExpensesPay(String startTime, String endTime);
}
