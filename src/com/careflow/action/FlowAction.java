package com.careflow.action;

import com.careflow.ui.frame.FlowPanel;
import com.careflow.ui.frame.PageContainer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class FlowAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪFlowPanel��������壩
    PageContainer.getInstance().setDefaultPage(FlowPanel.getInstance());
  }
}
