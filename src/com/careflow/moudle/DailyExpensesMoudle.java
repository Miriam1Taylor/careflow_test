package com.careflow.moudle;

import com.careflow.dao.DailyExpensesDAO;
import com.careflow.pojo.DailyExpenses;

import java.math.BigDecimal;
import java.util.List;

// DailyExpensesMoudle �ӿڶ����˶��ճ�֧����Ϣ���в����ķ���
public abstract interface DailyExpensesMoudle {

  // �����ճ�֧�����ݷ��ʶ���
  public abstract void setDailyExpensesDAO(DailyExpensesDAO dailyExpensesDAO);

  // ����ճ�֧����Ϣ
  public abstract void add(DailyExpenses dailyExpenses);

  // ��ȡ���յ��ճ�֧����Ϣ�б�
  public abstract List getDailyExpensesByTaday();

  // �����ճ�֧����Ϣ
  public abstract void update(DailyExpenses dailyExpenses);

  // ����֧��IDɾ���ճ�֧����Ϣ
  public abstract void deleteById(String id);

  // ��ȡ�����ճ�֧����Ϣ�б�
  public abstract List getList();

  // ��ȡ�ճ�֧����Ϣ�б�Ĵ�С
  public abstract int getListSize();

  // ��ȡָ����Χ���ճ�֧����Ϣ�б�
  public abstract List getList(int start, int limit);

  // ��ȡָ��ʱ�䷶Χ���ճ�֧����Ϣ�б�Ĵ�С
  public abstract int getListSize(String startTime, String endTime);

  // ��ȡָ��ʱ�䷶Χ�ڵ��ճ�֧����Ϣ�б�
  public abstract List getList(String startTime, String endTime, int start, int limit);

  // ��ȡָ�������µ��ճ�֧����Ϣ�б�
  public abstract List getList(String mode, String type, String startTime, String endTime, int start, int limit);

  // ��ȡָ�������µ��ճ�֧����Ϣ�б�Ĵ�С
  public abstract int getListSize(String mode, String type, String startTime, String endTime);

  // ��ȡָ�������µ��ճ�֧����Ϣ�б�
  public abstract List getList(String mode, String type, String startTime, String endTime);

  // ����ָ��֧����ʽ����֧�����
  public abstract BigDecimal sumDailyExpensesPay(String mode);

  // ����ָ�����ͺ�ʱ�䷶Χ�ڵ���֧�����
  public abstract BigDecimal sumDailyExpensesPay(String type, String startTime, String endTime);

  // ����ָ��֧����ʽ�����ͺ�ʱ�䷶Χ�ڵ���֧�����
  public abstract BigDecimal sumDailyExpensesPay(String mode, String type, String startTime, String endTime);

  // ����ָ��ʱ�䷶Χ�ڵ���֧�����
  public abstract BigDecimal sumDailyExpensesPay(String startTime, String endTime);
}
