package com.careflow.dao;

import com.careflow.pojo.Option;

import java.util.List;

// OptionDAO�ӿڶ����˶�ϵͳѡ�Option���������ݿ�����ķ���
public interface OptionDAO {

  // ���ϵͳѡ��
  boolean addOption(Option paramOption);

  // ɾ��ϵͳѡ��
  boolean deleteOption(String paramString);

  // ��ȡ����ϵͳѡ���б�
  List getOption();

  // ���ݲ�����ȡϵͳѡ���б�
  List getOption(String paramString);
}
