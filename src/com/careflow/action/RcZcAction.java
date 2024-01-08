package com.careflow.action;

import com.careflow.ui.frame.PageContainer;
import com.careflow.ui.frame.RcZcPanel;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class RcZcAction extends AbstractAction {

  // 当触发动作时调用的方法
  public void actionPerformed(ActionEvent e) {
    // 设置PageContainer中的默认页面为RcZcPanel（日常资产面板）
    PageContainer.getInstance().setDefaultPage(RcZcPanel.getInstance());
  }
}
