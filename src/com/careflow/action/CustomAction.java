package com.careflow.action;

import com.careflow.ui.frame.CustomPanel;
import com.careflow.ui.frame.PageContainer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class CustomAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪCustomPanel���Զ�����壩
    PageContainer.getInstance().setDefaultPage(CustomPanel.getInstance());
  }
}
