package com.careflow;

import com.careflow.dao.JdbcConnectionPoolHelper;
import com.careflow.moudle.MoudleContentFactry;
import com.careflow.pojo.Config;
import com.careflow.ui.LoginFrame;
import com.careflow.ui.skin.ColorDefinitions;
import com.careflow.ui.skin.LookAndFeelSelector;
import com.careflow.util.LanguageLoader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import javax.swing.SwingUtilities;
import org.h2.Driver;

public class Launcher {
  public static void main(String[] args) {
    Launcher launcher = new Launcher();
    launcher.run();
  }

  private void run() {
    try {
      // 初始化JDBC连接
      initJDBCConnect();

      // 设置应用程序语言
      LanguageLoader.setLanguage(Locale.getDefault());

      // 具体的Swing UI初始化
      try {
        String skin = SysEnv.getInstance().getSkin();
        LookAndFeelSelector.setLookAndFeel(skin);
        ColorDefinitions.initColors();

        // 使用Swing的invokeLater确保UI更新发生在事件调度线程上
        SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            float vnew = Float.parseFloat(Version.getInstance().getVersion());
            float vold = Float.parseFloat(SysEnv.getInstance().getVersion());

            // 检查版本并执行相应的操作
            if (vold < vnew) {
//              Patch.pachExexcute(vold, vnew);
              Config config = new Config();
              config.setKey("VERSION");
              config.setValue(Version.getInstance().getVersion());
              MoudleContentFactry.getConfigMoudle().saveOrUpdateConfig(config);
            }

            // 创建并显示登录界面
            LoginFrame login = LoginFrame.getInstance();
            login.setDefaultCloseOperation(3);
            login.setVisible(true);
          }
        });
      } catch (Exception e) {
        e.printStackTrace();
      }
    } catch (SQLException e1) {
      e1.printStackTrace();
    }
  }

  private static void initJDBCConnect() throws SQLException {
    // 使用H2数据库初始化JDBC连接
    String url = "jdbc:h2:file:" + Constant.DATA_PATH;
    Connection conn = null;
    Driver.load();
    String user = "sa";
    String password = "admin@bluebee";
    try {
      conn = DriverManager.getConnection(url, user, password);
      JdbcConnectionPoolHelper.getInstance().setConnection(conn);
    } catch (SQLException e) {
      // 如果连接失败，尝试使用不同的密码
      conn = DriverManager.getConnection(url, user, "sa");
      JdbcConnectionPoolHelper.getInstance().setConnection(conn);
    }
  }
}
