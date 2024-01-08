package com.careflow.moudle.impl;

import com.careflow.dao.ConfigDAO;
import com.careflow.moudle.ConfigMoudle;
import com.careflow.pojo.Config;

import java.util.List;

// ConfigMoudleImpl 类实现了 ConfigMoudle 接口
public class ConfigMoudleImpl implements ConfigMoudle {

  // 配置数据访问对象
  private ConfigDAO configDAO;

  // 设置配置数据访问对象
  public void setConfigDAO(ConfigDAO configDAO) {
    this.configDAO = configDAO;
  }

  // 获取所有配置信息
  public List getConfigs() {
    return this.configDAO.getConfigs();
  }

  // 保存或更新配置信息
  public boolean saveOrUpdateConfig(Config config) {
    return this.configDAO.saveOrUpdateConfig(config);
  }

  // 根据配置键获取配置信息
  public Config getConfig(String key) {
    return this.configDAO.getConfig(key);
  }

  // 添加单个配置
  public boolean addConfig(Config config) {
    return this.configDAO.addConfig(config);
  }

  // 删除配置信息
  public boolean deleteConfig(String key) {
    return this.configDAO.deleteConfig(key);
  }

  // 添加多个配置
  public boolean addConfigs(Config[] config) {
    return this.configDAO.addConfigs(config);
  }
}
