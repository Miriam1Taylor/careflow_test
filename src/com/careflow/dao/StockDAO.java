package com.careflow.dao;

import com.careflow.pojo.Stock;

import java.math.BigDecimal;
import java.util.List;

// StockDAO�ӿڶ�������Stock����棩��ص����ݿ��������
public interface StockDAO {

  // ��ӿ���¼
  boolean add(Stock stock);

  // ���ݿ��IDɾ������¼
  boolean deleteById(String stockId);

  // ���¿��ʣ������
  boolean updateSyAmount(String stockId, double syAmount, String operator);

  // ���¿����Ϣ
  boolean updateStock(Stock stock);

  // ���ݿ���Ż�ȡ�����Ϣ
  Stock getStockByNo(String stockNo);

  // ���ݿ��ID��ȡ�����Ϣ
  Stock getStockByID(String stockId);

  // ���ݿ���Ż�ȡ����Ŀ���¼
  Stock getLastStockByNo(String stockNo);

  // ������Ʒ�����Ż�ȡ��潨��
  List<String> getStockSuggestByCatNo(String catNo, int limit);

  // ������Ʒ�����Ż�ȡ�����Ϣ�б���ҳ��
  List getStockByCatNo(String catNo, int offset, int limit);

  // ������Ʒ�����Ż�ȡ�����Ϣ�б���ܼ�¼��
  int getStockByCatNoSize(String catNo);

  // ������Ʒ�����Ż�ȡ���ɱ���Ϣ�б���ҳ��
  List getStockByCatCost(String catNo, int offset, int limit);

  // ������Ʒ�����Ż�ȡ���ɱ���Ϣ�б���ܼ�¼��
  int getStockByCatCostSize(String catNo);

  // ���������ֶκ�����ʽ��ȡ�����Ϣ�б���ҳ��
  List getStockOrderBy(String orderBy, String order);

  // ���������ֶκ�����ʽ��ȡ�����Ϣ�б���ܼ�¼��
  int getStockOrderSize(String orderBy, String order);

  // ���������ֶκ�����ʽ��ȡ�����Ϣ�б���ҳ��
  List getStockOrderBy(String orderBy, String order, int offset, int limit);

  // ���ݲ�����ȡ�����Ϣ�б���ܼ�¼��
  int getStockByParmSize(String catNo, String stockNo, String name, String spec, String brand);

  // ���ݲ�����ȡ�����Ϣ�б���ҳ��
  List getStockByParm(String catNo, String stockNo, String name, String spec, String brand, int offset, int limit);

  // ��ȡ���п����Ϣ�б�
  List getStock();

  // ��ȡ�����Ϣ�б���ҳ��
  List getStock(int offset, int limit);

  // ��ȡ�����Ϣ�б���ܼ�¼��
  int getStockSize();

  // ����ָ�������µĿ��ʣ�������ܺ�
  int sumStockSyAmount(String catNo, String stockNo, String name, String spec, String brand);

  // ����ָ�������µĿ��ɱ��ܽ��
  BigDecimal sumStockCostAmount(String catNo, String stockNo, String name, String spec, String brand);

  // ����ָ�������µĿ��ʣ��ɱ��ܽ��
  BigDecimal sumSyStockCostAmount(String catNo, String stockNo, String name, String spec, String brand);

  // ����ָ����Ʒ��������
  double sumStockAmount(String stockNo);

  // ����ָ����Ʒ����ʣ������
  double sumStockSyAmount(String stockNo);

  // ��ȡ�������Ŀ����Ϣ�б�
  List getStockByTaday();

  // ��ȡ��汨���ļ�¼��
  int getStockAlarmSize(String catNo, double threshold);

  // ��ȡ��汨�����б���ҳ��
  List getStockAlarm(String catNo, double threshold, int offset, int limit);
}
