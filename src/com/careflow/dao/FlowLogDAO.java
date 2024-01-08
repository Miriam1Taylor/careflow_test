package com.careflow.dao;

import com.careflow.pojo.Flowlog;

import java.math.BigDecimal;
import java.util.List;

// ��ˮ��־���ݷ��ʶ���ӿ�
public interface FlowLogDAO {

  // �����ˮ��־��¼
  boolean add(Flowlog paramFlowlog);

  // ���������ˮ��־��¼
  boolean add(Flowlog[] paramArrayOfFlowlog);

  // ������ˮ��־��¼
  boolean update(Flowlog paramFlowlog);

  // ������ˮ�Ż�ȡ��ˮ��־��¼
  Flowlog getFlowByflowno(String paramString);

  // ��ȡ������ˮ��־��¼�б�
  List getFlowlog();

  // ����������ȡ��ˮ��־��¼�б�
  List getFlowlog(String paramString, int paramInt);

  // ����������ȡ��ˮ��־��¼�б�
  List getFlowlog(String paramString);

  // ��ȡ�������ˮ��־��¼�б�
  List getFlowlogByToday(String paramString);

  // ������ˮ��ɾ����ˮ��־��¼
  boolean deleteByFlowno(String paramString);

  // ��ȡͳ����Ϣ
  List getStatistical(String paramString1, String paramString2, String paramString3);

  // ��ȡͳ����Ϣ�ļ�¼����
  int getStatisticalSize(String paramString1, String paramString2, String paramString3);

  // ��ҳ��ȡͳ����Ϣ
  List getStatistical(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2);

  // ����ɱ��۸��ܺ�
  BigDecimal sumCostPrice(String paramString1, String paramString2, String paramString3);

  // ���������ܺ�
  BigDecimal sumLrPrice(String paramString1, String paramString2, String paramString3);

  // ������ˮ�ܺ�
  BigDecimal sumFlowPrice(String paramString1, String paramString2, String paramString3);

  // ������ˮ�����ܺ�
  int sumFlow(String paramString1, String paramString2);

  // ��ȡ�������͵���ˮ��־��¼����
  int getFlowLogOrderSize(String paramString1, String paramString2);

  // ��ҳ��ȡ�������͵���ˮ��־��¼
  List getFlowLogOrderBy(String paramString1, String paramString2, int paramInt1, int paramInt2);

  // ��ȡ�������͵���ˮ��־��¼�б�
  List getFlowLogOrderBy(String paramString1, String paramString2);

  // ��ȡ�ͻ����͵���ˮ��־��¼����
  int getFlowLogKeHLogSize(String paramString1, String paramString2, String paramString3, String paramString4);

  // ��ҳ��ȡ�ͻ����͵���ˮ��־��¼
  List getFlowLogKeHLog(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2);
}
