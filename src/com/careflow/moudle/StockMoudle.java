package com.careflow.moudle;

import com.careflow.dao.StockDAO;
import com.careflow.pojo.Stock;

import java.math.BigDecimal;
import java.util.List;

// StockMoudle �ӿڶ��������������صķ���
public abstract interface StockMoudle {

  // ���� StockDAO ����
  public abstract void setStockDAO(StockDAO paramStockDAO);

  // ��ӿ���¼
  public abstract boolean add(Stock paramStock);

  // ���ݿ��IDɾ������¼
  public abstract boolean delete(String paramString);

  // ��ȡ���յĿ���¼�б�
  public abstract List getStockByTaday();

  // ���¿��������type ������ʾ���ӻ��Ǽ���
  public abstract boolean updateSyAmount(String paramString1, double paramDouble, String paramString2);

  // ������Ʒ��Ż�ȡ����Ŀ���¼
  public abstract Stock getLastStockByNo(String paramString);

  // ������Ʒ��Ż�ȡ��ǰ�Ŀ���¼
  public abstract Stock getStockByNo(String paramString);

  // ���ݿ��ID��ȡ����¼
  public abstract Stock getStockByID(String paramString);

  // ���¿���¼
  public abstract boolean updateStock(Stock paramStock);

  // ������Ʒ�ܿ������
  public abstract double sumStockAmount(String paramString);

  // ������Ʒ���ÿ������
  public abstract double sumStockSyAmount(String paramString);

  // ��ȡ����ʱ�䷶Χ����Ŀ���¼�б�
  public abstract List getStockOrderBy(String paramString1, String paramString2);

  // ��ȡ���п���¼�б�
  public abstract List getStock();

  // ��ȡ��Ʒ��ŵĿ�潨���б�max ������ʾ���������
  public abstract List<String> getStockSuggestByCatNo(String paramString, int paramInt);

  // ��ҳ��ȡ����¼�б�
  public abstract List getStock(int paramInt1, int paramInt2);

  // ��ȡ����¼����
  public abstract int getStockSize();

  // ������Ʒ���ղ��������Ŀ��ÿ������
  public abstract int sumStockSyAmount(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);

  // ��ȡ���ղ��������Ŀ���¼����
  public abstract int getStockByParmSize(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);

  // ��ȡ���ղ���������ҳ�Ŀ���¼�б�
  public abstract List getStockByParm(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2);

  // ��ȡ��Ʒ��ŵĿ���¼����
  public abstract int getStockByCatNoSize(String paramString);

  // ��ȡ������Ʒ��ŷ�ҳ�Ŀ���¼�б�
  public abstract List getStockByCatNo(String paramString, int paramInt1, int paramInt2);

  // ��ȡ������Ʒ�ɱ���ҳ�Ŀ���¼�б�
  public abstract List getStockByCatCost(String paramString, int paramInt1, int paramInt2);

  // ��ȡ������Ʒ�ɱ��Ŀ���¼����
  public abstract int getStockByCatCostSize(String paramString);

  // ���㰴�ղ��������Ŀ��ÿ��ɱ��ܶ�
  public abstract BigDecimal sumStockCostAmount(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);

  // ���㰴�ղ��������Ŀ��ÿ��ɱ��ܶ�
  public abstract BigDecimal sumSyStockCostAmount(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);

  // ��ȡ����ʱ�䷶Χ��ҳ�Ŀ���¼����
  public abstract int getStockOrderSize(String paramString1, String paramString2);

  // ��ȡ����ʱ�䷶Χ��ҳ�Ŀ���¼�б�
  public abstract List getStockOrderBy(String paramString1, String paramString2, int paramInt1, int paramInt2);

  // ��ȡ���տ�汨��������ҳ�Ŀ���¼����
  public abstract int getStockAlarmSize(String paramString, double paramDouble);

  // ��ȡ���տ�汨��������ҳ�Ŀ���¼�б�
  public abstract List getStockAlarm(String paramString, double paramDouble, int paramInt1, int paramInt2);
}
