package com.careflow;

public class Version {

  // ��̬ʵ��������ģʽ
  private static Version version = new Version();

  // ��ȡVersion���Ψһʵ��
  public static Version getInstance() {
    return version;
  }

  // ��ȡӦ�ó���İ汾��
  public String getVersion() {
    return "1.4";
  }

  // ��ȡӦ�ó���Ĺ�����Ϣ
  public String getBuild() {
    return "(build100924)Beta��";
  }
}
