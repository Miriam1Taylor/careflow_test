package com.careflow;

import com.careflow.moudle.MoudleContentFactry;
import com.careflow.pojo.Config;
import com.careflow.pojo.User;

public class SysEnv {

  // 静态实例，单例模式
  private static SysEnv sysEnv = new SysEnv();

  // 默认皮肤
  private String skin = "aTunes Dark";

  // 默认策略
  private String policy = "2";

  // 版本号
  private String version;

  // 登录用户ID
  private String loginUserid;

  // 私有构造函数，初始化系统环境
  private SysEnv() {
    // 从配置模块获取皮肤配置
    Config configSkin = MoudleContentFactry.getConfigMoudle().getConfig("skin");
    if (configSkin != null) {
      this.skin = configSkin.getValue();
    }

    // 从配置模块获取策略配置
    Config configPolicy = MoudleContentFactry.getConfigMoudle().getConfig("policy");
    if (configPolicy != null) {
      this.policy = configPolicy.getValue();
    }

    // 从配置模块获取版本号配置
    Config versionConfig = MoudleContentFactry.getConfigMoudle().getConfig("VERSION");
    if (versionConfig == null || "".equals(versionConfig.getValue())) {
      // 默认版本号
      this.version = "1.1";
    } else {
      this.version = versionConfig.getValue();
    }
  }

  // 获取SysEnv的唯一实例
  public static SysEnv getInstance() {
    return sysEnv;
  }

  // 获取当前皮肤
  public String getSkin() {
    return this.skin;
  }

  // 获取管理员用户
  public User getAdminUser() {
    return MoudleContentFactry.getUserMoudle().getUserByid("10000");
  }

  // 获取登录用户ID
  public String getLoginUser() {
    return this.loginUserid;
  }

  // 设置登录用户ID
  public void setLoginUser(String loginUserid) {
    this.loginUserid = loginUserid;
  }

  // 获取版本号
  public String getVersion() {
    return this.version;
  }

  // 设置版本号
  public void setVersion(String version) {
    this.version = version;
  }

  // 设置皮肤
  public void setSkin(String skin) {
    this.skin = skin;
  }

  // 获取策略
  public String getPolicy() {
    return this.policy;
  }

  // 设置策略
  public void setPolicy(String policy) {
    this.policy = policy;
  }
}
