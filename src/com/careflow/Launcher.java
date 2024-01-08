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
      // ��ʼ��JDBC����
      initJDBCConnect();

      // ����Ӧ�ó�������
      LanguageLoader.setLanguage(Locale.getDefault());

      // �����Swing UI��ʼ��
      try {
        String skin = SysEnv.getInstance().getSkin();
        LookAndFeelSelector.setLookAndFeel(skin);
        ColorDefinitions.initColors();

        // ʹ��Swing��invokeLaterȷ��UI���·������¼������߳���
        SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            float vnew = Float.parseFloat(Version.getInstance().getVersion());
            float vold = Float.parseFloat(SysEnv.getInstance().getVersion());

            // ���汾��ִ����Ӧ�Ĳ���
            if (vold < vnew) {
//              Patch.pachExexcute(vold, vnew);
              Config config = new Config();
              config.setKey("VERSION");
              config.setValue(Version.getInstance().getVersion());
              MoudleContentFactry.getConfigMoudle().saveOrUpdateConfig(config);
            }

            // ��������ʾ��¼����
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
    // ʹ��H2���ݿ��ʼ��JDBC����
    String url = "jdbc:h2:file:" + Constant.DATA_PATH;
    Connection conn = null;
    Driver.load();
    String user = "sa";
    String password = "admin@bluebee";
    try {
      conn = DriverManager.getConnection(url, user, password);
      JdbcConnectionPoolHelper.getInstance().setConnection(conn);
    } catch (SQLException e) {
      // �������ʧ�ܣ�����ʹ�ò�ͬ������
      conn = DriverManager.getConnection(url, user, "sa");
      JdbcConnectionPoolHelper.getInstance().setConnection(conn);
    }
  }
}
