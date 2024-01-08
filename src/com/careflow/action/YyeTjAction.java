package com.careflow.action;

import com.careflow.ui.frame.PageContainer;
import com.careflow.ui.frame.YyeTjPanel;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class YyeTjAction extends AbstractAction {

  // 当触发动作时调用的方法
  public void actionPerformed(ActionEvent e) {
    // 设置PageContainer中的默认页面为YyeTjPanel（营业额统计面板）
    PageContainer.getInstance().setDefaultPage(YyeTjPanel.getInstance());
  }
}
