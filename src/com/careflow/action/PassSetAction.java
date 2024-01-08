package com.careflow.action;

import com.careflow.ui.frame.AuthorityPanel;
import com.careflow.ui.frame.PageContainer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class PassSetAction extends AbstractAction {

  // 当触发动作时调用的方法
  public void actionPerformed(ActionEvent e) {
    // 设置PageContainer中的默认页面为AuthorityPanel（权限设置面板）
    PageContainer.getInstance().setDefaultPage(AuthorityPanel.getInstance());
  }
}
