package com.careflow.moudle.impl;

import com.careflow.dao.FlowLogDAO;
import com.careflow.dao.StockDAO;
import com.careflow.moudle.FlowLogMoudle;
import com.careflow.pojo.Flowlog;

import java.math.BigDecimal;
import java.util.List;

// FlowLogMoudleImpl ��ʵ���� FlowLogMoudle �ӿ�
public class FlowLogMoudleImpl implements FlowLogMoudle {

  // ��ˮ��־���ݷ��ʶ���
  private FlowLogDAO flowLogDAO;

  // ������ݷ��ʶ���
  private StockDAO stockDAO;

  // ������ˮ�Ż�ȡ��ˮ��¼
  public Flowlog getFlowByflowno(String flowno) {
    return this.flowLogDAO.getFlowByflowno(flowno);
  }

  // ��ȡ�������ˮ��¼�б�
  public List getFlowlogByToday(String type) {
    return this.flowLogDAO.getFlowlogByToday(type);
  }

  // ������ˮ��ɾ����ˮ��¼�������¶�Ӧ���
  public boolean delete(String flowno, String catno, double amount) {
    this.stockDAO.updateSyAmount(catno, amount, "+");
    return this.flowLogDAO.deleteByFlowno(flowno);
  }

  // ������ˮ��ɾ����ˮ��¼
  public boolean delete(String flowno) {
    return this.flowLogDAO.deleteByFlowno(flowno);
  }

  // ������ˮ��¼�����������͸��¶�Ӧ���
  public boolean update(Flowlog flowlog, String type) {
    if (type != null) {
      this.stockDAO.updateSyAmount(flowlog.getCatno(), flowlog.getAmount(), type);
    }
    return this.flowLogDAO.update(flowlog);
  }

  // �����ˮ��¼
  public boolean add(Flowlog flowlog) {
    return this.flowLogDAO.add(flowlog);
  }

  // ���������ˮ��¼
  public boolean add(Flowlog[] flowlogs) {
    return this.flowLogDAO.add(flowlogs);
  }

  // ��ȡָ�������µ���ˮ��¼�б�
  public List getFlowlog(String catno, int size) {
    return this.flowLogDAO.getFlowlog(catno, size);
  }

  // ��ȡָ�������µ�������ˮ��¼�б�
  public List getFlowlog(String catno) {
    return this.flowLogDAO.getFlowlog(catno);
  }

  // ������ˮ��־���ݷ��ʶ���
  public void setFlowLogDAO(FlowLogDAO flowLogDAO) {
    this.flowLogDAO = flowLogDAO;
  }

  // ���ÿ�����ݷ��ʶ���
  public void setStockDAO(StockDAO stockDAO) {
    this.stockDAO = stockDAO;
  }

  // ��ȡָ��ʱ�䷶Χ�ڵ�ͳ����Ϣ�б�
  public List getStatistical(String starttime, String endtime, String type) {
    return this.flowLogDAO.getStatistical(starttime, endtime, type);
  }

  // ��ȡָ��ʱ�䷶Χ�ڵ�ͳ����Ϣ����
  public int getStatisticalSize(String starttime, String endtime, String type) {
    return this.flowLogDAO.getStatisticalSize(starttime, endtime, type);
  }

  // ��ҳ��ȡָ��ʱ�䷶Χ�ڵ�ͳ����Ϣ�б�
  public List getStatistical(String starttime, String endtime, String type, int start, int max) {
    return this.flowLogDAO.getStatistical(starttime, endtime, type, start, max);
  }

  // ͳ��ָ��ʱ�䷶Χ�ڵĳɱ����ܺ�
  public BigDecimal sumCostPrice(String starttime, String endtime, String type) {
    return this.flowLogDAO.sumCostPrice(starttime, endtime, type);
  }

  // ͳ��ָ��ʱ�䷶Χ�ڵ������ܺ�
  public BigDecimal sumLrPrice(String starttime, String endtime, String type) {
    return this.flowLogDAO.sumLrPrice(starttime, endtime, type);
  }

  // ͳ��ָ��ʱ�䷶Χ�ڵ����۽���ܺ�
  public BigDecimal sumFlowPrice(String starttime, String endtime, String type) {
    return this.flowLogDAO.sumFlowPrice(starttime, endtime, type);
  }

  // ͳ��ָ���������ˮ��־�µ���ˮ��¼����
  public int sumFlow(String catno, String flowflag) {
    return this.flowLogDAO.sumFlow(catno, flowflag);
  }

  // ��ȡָ��ʱ�䷶Χ�ڵ���ˮ��¼��������
  public int getFlowLogOrderSize(String starttime, String endtime) {
    return this.flowLogDAO.getFlowLogOrderSize(starttime, endtime);
  }

  // ��ҳ��ȡָ��ʱ�䷶Χ�ڵ���ˮ��¼�����б�
  public List getFlowLogOrderBy(String starttime, String endtime, int start, int max) {
    return this.flowLogDAO.getFlowLogOrderBy(starttime, endtime, start, max);
  }

  // ��ȡָ��ʱ�䷶Χ�ڵ���ˮ��¼�����б�
  public List getFlowLogOrderBy(String starttime, String endtime) {
    return this.flowLogDAO.getFlowLogOrderBy(starttime, endtime);
  }

  // ��ȡָ��ʱ�䷶Χ�ڵĿͻ���ˮ��¼����
  public int getFlowLogKeHLogSize(String starttime, String endtime, String cno, String cName) {
    return this.flowLogDAO.getFlowLogKeHLogSize(starttime, endtime, cno, cName);
  }

  // ��ҳ��ȡָ��ʱ�䷶Χ�ڵĿͻ���ˮ��¼�б�
  public List getFlowLogKeHLog(String starttime, String endtime, String cno, String cName, int start, int max) {
    return this.flowLogDAO.getFlowLogKeHLog(starttime, endtime, cno, cName, start, max);
  }

  // ��ȡָ��ʱ�䷶Χ�ڵĿͻ���ˮ��¼�б�
  public List getFlowLogKeHLog(String starttime, String endtime, String cno, String cName) {
    return this.flowLogDAO.getFlowLogKeHLog(starttime, endtime, cno, cName, -1, -1);
  }
}
