package com.careflow.action;

import com.careflow.ui.frame.PageContainer;
import com.careflow.ui.widget.PasswordDialog;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JPanel;

public class PasswordAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ��������Ի��򣬲���PageContainer�е�Ĭ��ҳ����Ϊ��������ݸ��Ի���
    PasswordDialog passwordDialog = new PasswordDialog((JPanel) PageContainer.getInstance().getDefaultPage());

    // ��������Ի���ɼ�
    passwordDialog.setVisible(true);
  }
}
