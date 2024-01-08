package com.careflow.dao;

import com.careflow.pojo.DailyExpenses;

import java.math.BigDecimal;
import java.util.List;

// �ճ�֧�����ݷ��ʶ���ӿ�
public interface DailyExpensesDAO {

  // ����ճ�֧����¼
  void add(DailyExpenses paramDailyExpenses);

  // �����ճ�֧����¼
  void update(DailyExpenses paramDailyExpenses);

  // ����IDɾ���ճ�֧����¼
  void deleteById(String paramString);

  // ��ȡ�����ճ�֧����¼�б�
  List getList();

  // ��ȡ������ճ�֧����¼�б�
  List getDailyExpensesByTaday();

  // ��ȡ�ճ�֧����¼����
  int getListSize();

  // ��ҳ��ȡ�ճ�֧����¼�б�
  List getList(int paramInt1, int paramInt2);

  // ����������ȡ�ճ�֧����¼�б�����
  int getListSize(String paramString1, String paramString2);

  // ����������ҳ��ȡ�ճ�֧����¼�б�
  List getList(String paramString1, String paramString2, int paramInt1, int paramInt2);

  // ���ݶ�������ҳ��ȡ�ճ�֧����¼�б�
  List getList(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2);

  // ���ݶ�������ȡ�ճ�֧����¼�б�
  List getList(String paramString1, String paramString2, String paramString3, String paramString4);

  // ���ݶ�������ȡ�ճ�֧����¼�б�����
  int getListSize(String paramString1, String paramString2, String paramString3, String paramString4);

  // ����ָ�����ڵ��ճ�֧���ܶ�
  BigDecimal sumDailyExpensesPay(String paramString);

  // ����ָ�����ڷ�Χ���ճ�֧���ܶ�
  BigDecimal sumDailyExpensesPay(String paramString1, String paramString2, String paramString3);

  // ����ָ�����ڷ�Χ��ָ��֧�����͵��ճ�֧���ܶ�
  BigDecimal sumDailyExpensesPay(String paramString1, String paramString2, String paramString3, String paramString4);

  // ����ָ�����ڷ�Χ��ָ��֧�����͵��ճ�֧���ܶ�
  BigDecimal sumDailyExpensesPay(String paramString1, String paramString2);
}
