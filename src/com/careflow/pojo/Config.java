package com.careflow.pojo;

// Config 类表示配置项的信息
public class Config {

  // 配置项的键
  private String key;

  // 配置项的值
  private String value;

  // 获取配置项的键
  public String getKey() {
    return this.key;
  }

  // 设置配置项的键
  public void setKey(String key) {
    this.key = key;
  }

  // 获取配置项的值
  public String getValue() {
    return this.value;
  }

  // 设置配置项的值
  public void setValue(String value) {
    this.value = value;
  }
}
