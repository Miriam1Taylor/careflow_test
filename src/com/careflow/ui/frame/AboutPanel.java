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

// AboutPanel �࣬��ʾ���� BlueBee ���۷��������Ϣ���
public class AboutPanel extends JPanel implements IPage {

  private static AboutPanel aboutPanel = new AboutPanel();
  private boolean isDefaultPage = false;

  private AboutPanel() {
    setLayout(null);


    // ����֧����Ϣ���
    JPanel supportpanel = new JPanel();
    supportpanel.setBorder(new TitledBorder(null, "����֧��", 4, 2, null, null));
    supportpanel.setLayout(null);
    supportpanel.setBounds(22, 10, 544, 98);
    add(supportpanel);

    JLabel lblQqlycvipgmailcom = new JLabel("QQȺ:746780476 ��JAʲôVA��");
    lblQqlycvipgmailcom.setFont(new Font("����", 0, 12));
    lblQqlycvipgmailcom.setBounds(30, 21, 300, 17);
    supportpanel.add(lblQqlycvipgmailcom);

    JLabel lblwwwsyscom = new JLabel("<html>��ַ:<u>careflow-system</u></html>");
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
    lblwwwsyscom.setFont(new Font("����", 0, 12));
    lblwwwsyscom.setBounds(30, 71, 300, 17);
    supportpanel.add(lblwwwsyscom);

    JLabel lblQqlycvipgmailcom_1 = new JLabel("����:1300271325@qq.com 3304124360@qq.com 1662115200@qq.com");
    lblQqlycvipgmailcom_1.setFont(new Font("����", 0, 12));
    lblQqlycvipgmailcom_1.setBounds(30, 47, 300, 17);
    supportpanel.add(lblQqlycvipgmailcom_1);
  }

  // ��ȡ AboutPanel ��ʵ��
  public static AboutPanel getInstance() {
    return aboutPanel;
  }

  // �ͷ�ҳ����Դ
  public void disposePage() {
  }

  // ��ȡҳ�� ID
  public String getPageId() {
    return getClass().getName();
  }

  // ��ȡҳ������
  public String getPageName() {
    return ">>>����Careflow ERP";
  }

  // �ж��Ƿ�ΪĬ��ҳ��
  public boolean isDefaultPage() {
    return this.isDefaultPage;
  }

  // �����Ƿ�ΪĬ��ҳ��
  public void setDefaultPage(boolean bool) {
    this.isDefaultPage = bool;
  }
}
