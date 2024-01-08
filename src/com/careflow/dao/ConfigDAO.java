package com.careflow.dao;

import com.careflow.pojo.Config;

import java.util.List;

// �������ݷ��ʶ���ӿ�
public interface ConfigDAO {

  // ���һ������
  boolean addConfigs(Config[] paramArrayOfConfig);

  // ��ӵ�������
  boolean addConfig(Config paramConfig);

  // ɾ��ָ����������
  boolean deleteConfig(String paramString);

  // ������������
  boolean saveOrUpdateConfig(Config paramConfig);

  // ���ݼ���ȡ����
  Config getConfig(String paramString);

  // ��ȡ����������
  List getConfigs();
}
