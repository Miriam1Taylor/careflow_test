package com.careflow.ui.frame;

import com.careflow.Version;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

// AboutPanel 类，表示关于 BlueBee 蓝蜜蜂软件的信息面板
public class AboutPanel extends JPanel implements IPage {

  private static AboutPanel aboutPanel = new AboutPanel();
  private boolean isDefaultPage = false;

  private AboutPanel() {
    setLayout(null);


    // 技术支持信息面板
    JPanel supportpanel = new JPanel();
    supportpanel.setBorder(new TitledBorder(null, "技术支持", 4, 2, null, null));
    supportpanel.setLayout(null);
    supportpanel.setBounds(22, 10, 544, 98);
    add(supportpanel);

    JLabel lblQqlycvipgmailcom = new JLabel("QQ群:746780476 “JA什么VA”");
    lblQqlycvipgmailcom.setFont(new Font("宋体", 0, 12));
    lblQqlycvipgmailcom.setBounds(30, 21, 300, 17);
    supportpanel.add(lblQqlycvipgmailcom);

    JLabel lblwwwsyscom = new JLabel("<html>网址:<u>careflow-system</u></html>");
    lblwwwsyscom.setCursor(Cursor.getPredefinedCursor(12));
    lblwwwsyscom.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        Desktop desktop = Desktop.getDesktop();
        URI netSite = null;
        try {
          netSite = new URI("https://github.com/Miriam1Taylor/careflow_test");
        } catch (URISyntaxException ex) {
          ex.printStackTrace();
        }
        try {
          desktop.browse(netSite);
        } catch (IOException ex) {
          ex.printStackTrace();
        }
      }
    });
    lblwwwsyscom.setFont(new Font("宋体", 0, 12));
    lblwwwsyscom.setBounds(30, 71, 300, 17);
    supportpanel.add(lblwwwsyscom);

    JLabel lblQqlycvipgmailcom_1 = new JLabel("邮箱:1300271325@qq.com 3304124360@qq.com 1662115200@qq.com");
    lblQqlycvipgmailcom_1.setFont(new Font("宋体", 0, 12));
    lblQqlycvipgmailcom_1.setBounds(30, 47, 300, 17);
    supportpanel.add(lblQqlycvipgmailcom_1);
  }

  // 获取 AboutPanel 的实例
  public static AboutPanel getInstance() {
    return aboutPanel;
  }

  // 释放页面资源
  public void disposePage() {
  }

  // 获取页面 ID
  public String getPageId() {
    return getClass().getName();
  }

  // 获取页面名称
  public String getPageName() {
    return ">>>关于Careflow ERP";
  }

  // 判断是否为默认页面
  public boolean isDefaultPage() {
    return this.isDefaultPage;
  }

  // 设置是否为默认页面
  public void setDefaultPage(boolean bool) {
    this.isDefaultPage = bool;
  }
}
