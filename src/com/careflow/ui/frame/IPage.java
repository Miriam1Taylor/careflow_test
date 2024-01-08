package com.careflow.ui.frame;

public interface IPage {
  // 获取页面ID
  String getPageId();

  // 获取页面名称
  String getPageName();

  // 销毁页面
  void disposePage();

  // 检查是否为默认页面
  boolean isDefaultPage();

  // 设置页面是否为默认页面
  void setDefaultPage(boolean isDefault);
}
