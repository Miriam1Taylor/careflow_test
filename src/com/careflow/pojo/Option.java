package com.careflow.pojo;

// Option 类表示选项的实体类
public class Option {

  // 选项编号
  private String id;

  // 选项文本
  private String text;

  // 选项类型
  private String type;

  // 获取选项编号
  public String getId() {
    return this.id;
  }

  // 设置选项编号
  public void setId(String id) {
    this.id = id;
  }

  // 获取选项文本
  public String getText() {
    return this.text;
  }

  // 设置选项文本
  public void setText(String text) {
    this.text = text;
  }

  // 获取选项类型
  public String getType() {
    return this.type;
  }

  // 设置选项类型
  public void setType(String type) {
    this.type = type;
  }
}
