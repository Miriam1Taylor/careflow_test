package com.careflow.moudle;

import com.careflow.dao.ConfigDAO;
import com.careflow.pojo.Config;

import java.util.List;

// ConfigMoudle 接口定义了对系统配置信息进行操作的方法
public abstract interface ConfigMoudle {

  // 设置配置数据访问对象
  public abstract void setConfigDAO(ConfigDAO configDAO);

  // 添加一组配置信息
  public abstract boolean addConfigs(Config[] configs);

  // 保存或更新单个配置信息
  public abstract boolean saveOrUpdateConfig(Config config);

  // 添加单个配置信息
  public abstract boolean addConfig(Config config);

  // 删除配置信息
  public abstract boolean deleteConfig(String key);

  // 根据关键字获取配置信息
  public abstract Config getConfig(String key);

  // 获取所有配置信息
  public abstract List getConfigs();
}
