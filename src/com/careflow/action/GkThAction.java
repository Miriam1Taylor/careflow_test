package com.careflow.action;

import com.careflow.ui.frame.GkthPane;
import com.careflow.ui.frame.PageContainer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class GkThAction extends AbstractAction {

  // 当触发动作时调用的方法
  public void actionPerformed(ActionEvent e) {
    // 设置PageContainer中的默认页面为GkthPane（工况退货面板）
    PageContainer.getInstance().setDefaultPage(GkthPane.getInstance());
  }
}
