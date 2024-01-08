package com.careflow.moudle.impl;

import com.careflow.dao.StockDAO;
import com.careflow.moudle.StockMoudle;
import com.careflow.pojo.Stock;

import java.math.BigDecimal;
import java.util.List;

// StockMoudleImpl ��ʵ���� StockMoudle �ӿ�
public class StockMoudleImpl implements StockMoudle {

  // ��Ʊ���ݷ��ʶ���
  private StockDAO stockDAO;

  // ���ù�Ʊ���ݷ��ʶ���
  public void setStockDAO(StockDAO stockDAO) {
    this.stockDAO = stockDAO;
  }

  // ��ӹ�Ʊ
  public boolean add(Stock stock) {
    return this.stockDAO.add(stock);
  }

  // ���ݹ�ƱIDɾ����Ʊ
  public boolean delete(String stockid) {
    return this.stockDAO.deleteById(stockid);
  }

  // ��ȡ��Ʊ�����б�
  public List<String> getStockSuggestByCatNo(String catno, int max) {
    return this.stockDAO.getStockSuggestByCatNo(catno, max);
  }

  // ��ȡ���չ�Ʊ�б�
  public List getStockByTaday() {
    return this.stockDAO.getStockByTaday();
  }

  // ���¹�Ʊʣ������
  public boolean updateSyAmount(String catno, double ssAmount, String type) {
    return this.stockDAO.updateSyAmount(catno, ssAmount, type);
  }

  // ��ȡ���µĹ�Ʊ��Ϣ
  public Stock getLastStockByNo(String catno) {
    return this.stockDAO.getLastStockByNo(catno);
  }

  // ���ݹ�Ʊ��Ż�ȡ��Ʊ��Ϣ
  public Stock getStockByNo(String catno) {
    return this.stockDAO.getStockByNo(catno);
  }

  // ���¹�Ʊ��Ϣ
  public boolean updateStock(Stock stock) {
    return this.stockDAO.updateStock(stock);
  }

  // �����Ʊ�ܼ�ֵ
  public double sumStockAmount(String catno) {
    return this.stockDAO.sumStockAmount(catno);
  }

  // �����Ʊʣ���ܼ�ֵ
  public double sumStockSyAmount(String catno) {
    return this.stockDAO.sumStockSyAmount(catno);
  }

  // ���ݹ�ƱID��ȡ��Ʊ��Ϣ
  public Stock getStockByID(String id) {
    return this.stockDAO.getStockByID(id);
  }

  // ��ȡ��ʱ�䷶Χ����Ĺ�Ʊ�б�
  public List getStockOrderBy(String starttime, String endtime) {
    return this.stockDAO.getStockOrderBy(starttime, endtime);
  }

  // ��ȡ��ҳ��Ĺ�Ʊ�б�
  public List getStock(int start, int max) {
    return this.stockDAO.getStock(start, max);
  }

  // ��ȡȫ����Ʊ�б�
  public List getStock() {
    return this.stockDAO.getStock();
  }

  // ��ȡ��Ʊ����
  public int getStockSize() {
    return this.stockDAO.getStockSize();
  }

  // ���ݹ�Ʊ���ͷ�ҳ��Ϣ��ȡ��Ʊ�б�
  public List getStockByCatNo(String catno, int start, int max) {
    return this.stockDAO.getStockByCatNo(catno, start, max);
  }

  // ��ȡָ����Ʊ���Ĺ�Ʊ����
  public int getStockByCatNoSize(String catno) {
    return this.stockDAO.getStockByCatNoSize(catno);
  }

  // ���ݳɱ���Ϣ�ͷ�ҳ��Ϣ��ȡ��Ʊ�б�
  public List getStockByCatCost(String cost, int start, int max) {
    return this.stockDAO.getStockByCatCost(cost, start, max);
  }

  // ��ȡָ���ɱ���Ϣ�Ĺ�Ʊ����
  public int getStockByCatCostSize(String cost) {
    return this.stockDAO.getStockByCatCostSize(cost);
  }

  // ���ݲ�����Ϣ��ȡ��Ʊ����
  public int sumStockSyAmount(String catno, String cost, String type, String date, String dateTo) {
    return this.stockDAO.sumStockSyAmount(catno, cost, type, date, dateTo);
  }

  // ���ݲ�����Ϣ��ȡ��Ʊ�ɱ��ܽ��
  public BigDecimal sumStockCostAmount(String catno, String cost, String type, String date, String dateTo) {
    return this.stockDAO.sumStockCostAmount(catno, cost, type, date, dateTo);
  }

  // ���ݲ�����Ϣ��ȡ��Ʊʣ��ɱ��ܽ��
  public BigDecimal sumSyStockCostAmount(String catno, String cost, String type, String date, String dateTo) {
    return this.stockDAO.sumSyStockCostAmount(catno, cost, type, date, dateTo);
  }

  // ���ݲ�����Ϣ��ȡ��Ʊ�б�����
  public int getStockByParmSize(String catno, String cost, String type, String date, String dateTo) {
    return this.stockDAO.getStockByParmSize(catno, cost, type, date, dateTo);
  }

  // ���ݲ�����Ϣ�ͷ�ҳ��Ϣ��ȡ��Ʊ�б�
  public List getStockByParm(String catno, String cost, String type, String date, String dateTo, int start, int max) {
    return this.stockDAO.getStockByParm(catno, cost, type, date, dateTo, start, max);
  }

  // ��ȡ��ʱ�䷶Χ����Ķ�����Ʊ�б�����
  public int getStockOrderSize(String starttime, String endtime) {
    return this.stockDAO.getStockOrderSize(starttime, endtime);
  }

  // ��ȡ��ʱ�䷶Χ����Ķ�����Ʊ�б�
  public List getStockOrderBy(String starttime, String endtime, int start, int max) {
    return this.stockDAO.getStockOrderBy(starttime, endtime, start, max);
  }

  // ��ȡ������Ʊ�б�����
  public int getStockAlarmSize(String alarmType, double num) {
    return this.stockDAO.getStockAlarmSize(alarmType, num);
  }

  // ��ȡ������Ʊ�б�
  public List getStockAlarm(String alarmType, double num, int start, int max) {
    return this.stockDAO.getStockAlarm(alarmType, num, start, max);
  }
}
