package com.careflow.action;

import com.careflow.ui.frame.PageContainer;
import com.careflow.ui.frame.SellOrderpane;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class SellOrderAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪSellOrderpane�����۶�����壩
    PageContainer.getInstance().setDefaultPage(SellOrderpane.getInstance());
  }
}
