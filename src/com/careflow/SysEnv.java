package com.careflow;

import com.careflow.moudle.MoudleContentFactry;
import com.careflow.pojo.Config;
import com.careflow.pojo.User;

public class SysEnv {

  // ��̬ʵ��������ģʽ
  private static SysEnv sysEnv = new SysEnv();

  // Ĭ��Ƥ��
  private String skin = "aTunes Dark";

  // Ĭ�ϲ���
  private String policy = "2";

  // �汾��
  private String version;

  // ��¼�û�ID
  private String loginUserid;

  // ˽�й��캯������ʼ��ϵͳ����
  private SysEnv() {
    // ������ģ���ȡƤ������
    Config configSkin = MoudleContentFactry.getConfigMoudle().getConfig("skin");
    if (configSkin != null) {
      this.skin = configSkin.getValue();
    }

    // ������ģ���ȡ��������
    Config configPolicy = MoudleContentFactry.getConfigMoudle().getConfig("policy");
    if (configPolicy != null) {
      this.policy = configPolicy.getValue();
    }

    // ������ģ���ȡ�汾������
    Config versionConfig = MoudleContentFactry.getConfigMoudle().getConfig("VERSION");
    if (versionConfig == null || "".equals(versionConfig.getValue())) {
      // Ĭ�ϰ汾��
      this.version = "1.1";
    } else {
      this.version = versionConfig.getValue();
    }
  }

  // ��ȡSysEnv��Ψһʵ��
  public static SysEnv getInstance() {
    return sysEnv;
  }

  // ��ȡ��ǰƤ��
  public String getSkin() {
    return this.skin;
  }

  // ��ȡ����Ա�û�
  public User getAdminUser() {
    return MoudleContentFactry.getUserMoudle().getUserByid("10000");
  }

  // ��ȡ��¼�û�ID
  public String getLoginUser() {
    return this.loginUserid;
  }

  // ���õ�¼�û�ID
  public void setLoginUser(String loginUserid) {
    this.loginUserid = loginUserid;
  }

  // ��ȡ�汾��
  public String getVersion() {
    return this.version;
  }

  // ���ð汾��
  public void setVersion(String version) {
    this.version = version;
  }

  // ����Ƥ��
  public void setSkin(String skin) {
    this.skin = skin;
  }

  // ��ȡ����
  public String getPolicy() {
    return this.policy;
  }

  // ���ò���
  public void setPolicy(String policy) {
    this.policy = policy;
  }
}
