package com.careflow.action;

import com.careflow.ui.frame.PageContainer;
import com.careflow.ui.frame.YyeTjPanel;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class YyeTjAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪYyeTjPanel��Ӫҵ��ͳ����壩
    PageContainer.getInstance().setDefaultPage(YyeTjPanel.getInstance());
  }
}
