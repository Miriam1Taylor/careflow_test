package com.careflow.action;

import com.careflow.ui.frame.CustomPanel;
import com.careflow.ui.frame.PageContainer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class CustomAction extends AbstractAction {

  // 当触发动作时调用的方法
  public void actionPerformed(ActionEvent e) {
    // 设置PageContainer中的默认页面为CustomPanel（自定义面板）
    PageContainer.getInstance().setDefaultPage(CustomPanel.getInstance());
  }
}
