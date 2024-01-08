package com.careflow;

public class Version {

  // 静态实例，单例模式
  private static Version version = new Version();

  // 获取Version类的唯一实例
  public static Version getInstance() {
    return version;
  }

  // 获取应用程序的版本号
  public String getVersion() {
    return "1.4";
  }

  // 获取应用程序的构建信息
  public String getBuild() {
    return "(build100924)Beta版";
  }
}
