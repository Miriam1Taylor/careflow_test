package com.careflow.action;

import com.careflow.ui.frame.PageContainer;
import com.careflow.ui.widget.PasswordDialog;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JPanel;

public class PasswordAction extends AbstractAction {

  // 当触发动作时调用的方法
  public void actionPerformed(ActionEvent e) {
    // 创建密码对话框，并将PageContainer中的默认页面作为父组件传递给对话框
    PasswordDialog passwordDialog = new PasswordDialog((JPanel) PageContainer.getInstance().getDefaultPage());

    // 设置密码对话框可见
    passwordDialog.setVisible(true);
  }
}
