package com.careflow.action;

import com.careflow.ui.frame.IncomePanel;
import com.careflow.ui.frame.PageContainer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class IncomePanelAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪIncomePanel��������壩
    PageContainer.getInstance().setDefaultPage(IncomePanel.getInstance());
  }
}
