package com.careflow.action;

import com.careflow.ui.frame.PageContainer;
import com.careflow.ui.frame.StockPanel;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class StockAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪStockPanel�������壩
    PageContainer.getInstance().setDefaultPage(StockPanel.getInstance());
  }
}
