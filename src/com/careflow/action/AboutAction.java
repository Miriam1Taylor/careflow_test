package com.careflow.action;

import com.careflow.ui.frame.AboutPanel;
import com.careflow.ui.frame.PageContainer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class AboutAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪAboutPanel
    PageContainer.getInstance().setDefaultPage(AboutPanel.getInstance());
  }
}
