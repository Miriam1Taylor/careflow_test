package com.careflow.action;

import com.careflow.ui.frame.AuthorityPanel;
import com.careflow.ui.frame.PageContainer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class PassSetAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪAuthorityPanel��Ȩ��������壩
    PageContainer.getInstance().setDefaultPage(AuthorityPanel.getInstance());
  }
}
