package com.careflow.moudle.impl;

import com.careflow.dao.ConfigDAO;
import com.careflow.moudle.ConfigMoudle;
import com.careflow.pojo.Config;

import java.util.List;

// ConfigMoudleImpl ��ʵ���� ConfigMoudle �ӿ�
public class ConfigMoudleImpl implements ConfigMoudle {

  // �������ݷ��ʶ���
  private ConfigDAO configDAO;

  // �����������ݷ��ʶ���
  public void setConfigDAO(ConfigDAO configDAO) {
    this.configDAO = configDAO;
  }

  // ��ȡ����������Ϣ
  public List getConfigs() {
    return this.configDAO.getConfigs();
  }

  // ��������������Ϣ
  public boolean saveOrUpdateConfig(Config config) {
    return this.configDAO.saveOrUpdateConfig(config);
  }

  // �������ü���ȡ������Ϣ
  public Config getConfig(String key) {
    return this.configDAO.getConfig(key);
  }

  // ��ӵ�������
  public boolean addConfig(Config config) {
    return this.configDAO.addConfig(config);
  }

  // ɾ��������Ϣ
  public boolean deleteConfig(String key) {
    return this.configDAO.deleteConfig(key);
  }

  // ��Ӷ������
  public boolean addConfigs(Config[] config) {
    return this.configDAO.addConfigs(config);
  }
}
