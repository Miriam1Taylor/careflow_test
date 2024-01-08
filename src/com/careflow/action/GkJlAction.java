package com.careflow.action;

import com.careflow.ui.frame.GkJLPanel;
import com.careflow.ui.frame.PageContainer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class GkJlAction extends AbstractAction {

  // 当触发动作时调用的方法
  public void actionPerformed(ActionEvent e) {
    // 设置PageContainer中的默认页面为GkJLPanel（工况记录面板）
    PageContainer.getInstance().setDefaultPage(GkJLPanel.getInstance());
  }
}
