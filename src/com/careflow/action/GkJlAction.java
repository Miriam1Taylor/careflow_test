package com.careflow.action;

import com.careflow.ui.frame.GkJLPanel;
import com.careflow.ui.frame.PageContainer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class GkJlAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪGkJLPanel��������¼��壩
    PageContainer.getInstance().setDefaultPage(GkJLPanel.getInstance());
  }
}
