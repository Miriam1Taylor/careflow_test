package com.careflow.moudle;

import com.careflow.dao.FlowLogDAO;
import com.careflow.dao.StockDAO;
import com.careflow.pojo.Flowlog;

import java.math.BigDecimal;
import java.util.List;

// FlowLogMoudle �ӿڶ����˶���ˮ��־��Ϣ���в����ķ���
public abstract interface FlowLogMoudle {

  // ������ˮ��־���ݷ��ʶ���
  public abstract void setFlowLogDAO(FlowLogDAO flowLogDAO);

  // ���ÿ�����ݷ��ʶ���
  public abstract void setStockDAO(StockDAO stockDAO);

  // �����ˮ��־��Ϣ
  public abstract boolean add(Flowlog flowlog);

  // ���������ˮ��־��Ϣ
  public abstract boolean add(Flowlog[] flowlogs);

  // ������ˮ�Ż�ȡ��ˮ��־��Ϣ
  public abstract Flowlog getFlowByflowno(String flowno);

  // ��ȡ����ָ�����͵���ˮ��־��Ϣ�б�
  public abstract List getFlowlogByToday(String type);

  // ������ˮ��־��Ϣ
  public abstract boolean update(Flowlog flowlog, String type);

  // ������ˮ��ɾ����ˮ��־��Ϣ
  public abstract boolean delete(String flowno, String catno, double amount);

  // ������ˮ��ɾ����ˮ��־��Ϣ
  public abstract boolean delete(String flowno);

  // ��ȡָ�����ﳵ�ŵ���ˮ��־��Ϣ�б�
  public abstract List getFlowlog(String cartno, int size);

  // ��ȡָ�����ﳵ�ŵ���ˮ��־��Ϣ�б�
  public abstract List getFlowlog(String cartno);

  // ��ȡָ��ʱ�䷶Χ�ڵ�ͳ����Ϣ�б�
  public abstract List getStatistical(String starttime, String endtime, String type);

  // ��ȡָ��ʱ�䷶Χ�ڵ�ͳ����Ϣ�б�Ĵ�С
  public abstract int getStatisticalSize(String starttime, String endtime, String type);

  // ��ȡָ��ʱ�䷶Χ�ڵ�ͳ����Ϣ�б�
  public abstract List getStatistical(String starttime, String endtime, String type, int start, int max);

  // ����ָ��ʱ�䷶Χ�ڵĳɱ��ܼ�
  public abstract BigDecimal sumCostPrice(String starttime, String endtime, String type);

  // ����ָ��ʱ�䷶Χ�ڵ������ܼ�
  public abstract BigDecimal sumLrPrice(String starttime, String endtime, String type);

  // ����ָ��ʱ�䷶Χ�ڵ���ˮ�ܼ�
  public abstract BigDecimal sumFlowPrice(String starttime, String endtime, String type);

  // ͳ��ָ����Ʒ��ź���ˮ��־��������
  public abstract int sumFlow(String catno, String flowflag);

  // ��ȡָ��ʱ�䷶Χ�ڵĶ�����ˮ��Ϣ�б�Ĵ�С
  public abstract int getFlowLogOrderSize(String starttime, String endtime);

  // ��ȡָ��ʱ�䷶Χ�ڵĶ�����ˮ��Ϣ�б�
  public abstract List getFlowLogOrderBy(String starttime, String endtime, int start, int max);

  // ��ȡָ��ʱ�䷶Χ�ڵĶ�����ˮ��Ϣ�б�
  public abstract List getFlowLogOrderBy(String starttime, String endtime);

  // ��ȡָ��ʱ�䷶Χ�ڵĿͻ���ˮ��Ϣ�б�Ĵ�С
  public abstract int getFlowLogKeHLogSize(String starttime, String endtime, String cno, String cName);

  // ��ȡָ��ʱ�䷶Χ�ڵĿͻ���ˮ��Ϣ�б�
  public abstract List getFlowLogKeHLog(String starttime, String endtime, String cno, String cName, int start, int max);

  // ��ȡָ��ʱ�䷶Χ�ڵĿͻ���ˮ��Ϣ�б�
  public abstract List getFlowLogKeHLog(String starttime, String endtime, String cno, String cName);
}
