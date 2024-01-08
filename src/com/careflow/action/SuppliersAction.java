package com.careflow.action;

import com.careflow.ui.frame.PageContainer;
import com.careflow.ui.frame.SuppliersPanel;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class SuppliersAction extends AbstractAction {

  // 当触发动作时调用的方法
  public void actionPerformed(ActionEvent e) {
    // 设置PageContainer中的默认页面为SuppliersPanel（供应商面板）
    PageContainer.getInstance().setDefaultPage(SuppliersPanel.getInstance());
  }
}
