package com.careflow.moudle;

import com.careflow.dao.ConfigDAO;
import com.careflow.pojo.Config;

import java.util.List;

// ConfigMoudle �ӿڶ����˶�ϵͳ������Ϣ���в����ķ���
public abstract interface ConfigMoudle {

  // �����������ݷ��ʶ���
  public abstract void setConfigDAO(ConfigDAO configDAO);

  // ���һ��������Ϣ
  public abstract boolean addConfigs(Config[] configs);

  // �������µ���������Ϣ
  public abstract boolean saveOrUpdateConfig(Config config);

  // ��ӵ���������Ϣ
  public abstract boolean addConfig(Config config);

  // ɾ��������Ϣ
  public abstract boolean deleteConfig(String key);

  // ���ݹؼ��ֻ�ȡ������Ϣ
  public abstract Config getConfig(String key);

  // ��ȡ����������Ϣ
  public abstract List getConfigs();
}
