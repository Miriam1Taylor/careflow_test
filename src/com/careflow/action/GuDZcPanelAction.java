package com.careflow.action;

import com.careflow.ui.frame.GuDZcPanel;
import com.careflow.ui.frame.PageContainer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class GuDZcPanelAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪGuDZcPanel���̶��ʲ���壩
    PageContainer.getInstance().setDefaultPage(GuDZcPanel.getInstance());
  }
}
