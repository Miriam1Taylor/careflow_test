package com.careflow.action;

import com.careflow.ui.frame.PageContainer;
import com.careflow.ui.frame.RcZcPanel;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class RcZcAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪRcZcPanel���ճ��ʲ���壩
    PageContainer.getInstance().setDefaultPage(RcZcPanel.getInstance());
  }
}
