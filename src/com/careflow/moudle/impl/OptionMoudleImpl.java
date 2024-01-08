package com.careflow.moudle.impl;

import com.careflow.dao.OptionDAO;
import com.careflow.moudle.OptionMoudle;
import com.careflow.pojo.Option;

import java.util.List;

// OptionMoudleImpl ��ʵ���� OptionMoudle �ӿ�
public class OptionMoudleImpl implements OptionMoudle {

  // ѡ�����ݷ��ʶ���
  private OptionDAO optionDAO;

  // ����ѡ�����ݷ��ʶ���
  public void setOptionDAO(OptionDAO optionDAO) {
    this.optionDAO = optionDAO;
  }

  // ���ѡ��
  public boolean addOption(Option option) {
    return this.optionDAO.addOption(option);
  }

  // ɾ��ѡ��
  public boolean deleteOption(String id) {
    return this.optionDAO.deleteOption(id);
  }

  // �������ͻ�ȡѡ���б�
  public List getOption(String type) {
    return this.optionDAO.getOption(type);
  }

  // ��ȡ����ѡ���б�
  public List getOption() {
    return this.optionDAO.getOption();
  }
}
