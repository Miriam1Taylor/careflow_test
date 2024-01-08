package com.careflow;

public class Constant {

  // 版本信息
  public static final String VERSION = "VERSION";

  // 常用域名
  public static final String DOMAIN_NAME = "com";

  // 项目名称
  public static String PROJECT_NAME = "careflow";

  // 包的根路径
  public static String PACKAGE_ROOT = "com" + getDot() + PROJECT_NAME;

  // 文件协议
  public static final String PROTOCOL_FILE = "file:";

  // Log4j配置文件路径
  public static final String LOG4J_FILE = "config/log4j.properties";

  // 资源包路径
  public static String PACKAGE_RESOURSE = PACKAGE_ROOT + getDot() + "resource";

  // 图片资源路径
  public static final String PACKAGE_IMAGE = PACKAGE_RESOURSE + getDot() + "image";

  // 数据存储路径
  public static final String DATA_PATH = "config" + getSlash() + "data" + getSlash() + "careflow";

  // 图标目录路径
  public static String ICON_DIR = dotToSlash(PACKAGE_IMAGE);

  // 应用程序图标路径
  public static String APP_ICON = ICON_DIR + getSlash() + "yygl.png";

  // 皮肤相关
  public static final String SKIN = "skin";

  // 策略相关
  public static final String SELLPOLICY = "policy";

  // 密码相关
  public static final String PASSWORD = "password";

  // 自定义字段
  public static final String MYDZJ = "mydzj";
  public static final String MYDF = "mydf";
  public static final String MYSJ = "gdzc_mysj";
  public static final String MYGLF = "gdzc_myglf";
  public static final String MYSFF = "gdzc_mysf";
  public static final String MYGZ = "gdzc_mygz";
  public static final String MYQT = "gdzc_myqt";
  public static final String MYGDZCZH = "gdzc_ZH";

  // 类型相关
  public static final String TYPE_HW = "HWLX";
  public static final String TYPE_ZC = "ZCLX";
  public static final String TYPE_SR = "SRLX";

  // 流程类型
  public static final String FLOW_TYPE_SELL = "sell";
  public static final String FLOW_TYPE_TH = "tuihuo";

  // 库存类型
  public static final String STCOK_TYPE_JINHUO = "JINHUO";
  public static final String STCOK_TYPE_TH = "tuihuo";

  // 用户类型
  public static final String USER_TYPE_M = "Manage";
  public static final String USER_TYPE_P = "Personnel";

  // 管理员ID和名称
  public static final String ADMIN = "10000";
  public static final String ADMIN_NAME = "管理员";

  // 收入和支出
  public static final String INCOME = "income";
  public static final String EXPENSES = "expenses";

  // 用户权限，默认为true
  public static final String[] RIGHT = {
          "true", "true", "true", "true", "true",
          "true", "true", "true", "true", "true",
          "true", "true", "true", "true", "true",
          "true", "true", "true" };

  // 将字符串中的点替换为斜杠
  public static String dotToSlash(String oldString) {
    return oldString.replace(getDot(), getSlash());
  }

  // 获取点号
  public static String getDot() {
    return ".";
  }

  // 获取斜杠
  public static String getSlash() {
    return "/";
  }
}
