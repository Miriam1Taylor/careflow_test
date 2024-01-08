package com.careflow.action;

import com.careflow.ui.frame.PageContainer;
import com.careflow.ui.frame.StockPanel;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class StockAction extends AbstractAction {

  // 当触发动作时调用的方法
  public void actionPerformed(ActionEvent e) {
    // 设置PageContainer中的默认页面为StockPanel（库存面板）
    PageContainer.getInstance().setDefaultPage(StockPanel.getInstance());
  }
}
