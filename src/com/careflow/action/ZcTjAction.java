package com.careflow.action;

import com.careflow.ui.frame.PageContainer;
import com.careflow.ui.frame.ZcTjPanel;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ZcTjAction extends AbstractAction {

  // 当触发动作时调用的方法
  public void actionPerformed(ActionEvent e) {
    // 设置PageContainer中的默认页面为ZcTjPanel（资产统计面板）
    PageContainer.getInstance().setDefaultPage(ZcTjPanel.getInstance());
  }
}
