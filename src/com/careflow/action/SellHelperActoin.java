package com.careflow.action;

import com.careflow.ui.frame.PageContainer;
import com.careflow.ui.frame.SellHelperPanel;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class SellHelperActoin extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪSellHelperPanel������������壩
    PageContainer.getInstance().setDefaultPage(SellHelperPanel.getInstance());
  }
}
