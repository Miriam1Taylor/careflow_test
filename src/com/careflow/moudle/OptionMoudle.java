package com.careflow.moudle;

import com.careflow.dao.OptionDAO;
import com.careflow.pojo.Option;

import java.util.List;

// OptionMoudle �ӿڶ����˶�ѡ����в����ķ���
public abstract interface OptionMoudle {

  // ���� OptionDAO ʵ��
  public abstract void setOptionDAO(OptionDAO paramOptionDAO);

  // ���ѡ��
  public abstract boolean addOption(Option paramOption);

  // ɾ��ѡ��
  public abstract boolean deleteOption(String paramString);

  // ��ȡ����ѡ���б�
  public abstract List getOption();

  // �������ͻ�ȡѡ���б�
  public abstract List getOption(String paramString);
}
