package com.careflow.dao;

import com.careflow.pojo.Config;

import java.util.List;

// 配置数据访问对象接口
public interface ConfigDAO {

  // 添加一组配置
  boolean addConfigs(Config[] paramArrayOfConfig);

  // 添加单个配置
  boolean addConfig(Config paramConfig);

  // 删除指定键的配置
  boolean deleteConfig(String paramString);

  // 保存或更新配置
  boolean saveOrUpdateConfig(Config paramConfig);

  // 根据键获取配置
  Config getConfig(String paramString);

  // 获取所有配置项
  List getConfigs();
}
