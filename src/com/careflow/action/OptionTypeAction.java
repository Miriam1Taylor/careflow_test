package com.careflow.action;

import com.careflow.ui.frame.OptionsTypePanel;
import com.careflow.ui.frame.PageContainer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class OptionTypeAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪOptionsTypePanel��ѡ��������壩
    PageContainer.getInstance().setDefaultPage(OptionsTypePanel.getInstance());
  }
}
