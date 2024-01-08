package com.careflow.ui.frame;

public interface IPage {
  // ��ȡҳ��ID
  String getPageId();

  // ��ȡҳ������
  String getPageName();

  // ����ҳ��
  void disposePage();

  // ����Ƿ�ΪĬ��ҳ��
  boolean isDefaultPage();

  // ����ҳ���Ƿ�ΪĬ��ҳ��
  void setDefaultPage(boolean isDefault);
}
