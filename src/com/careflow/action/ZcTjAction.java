package com.careflow.action;

import com.careflow.ui.frame.PageContainer;
import com.careflow.ui.frame.ZcTjPanel;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ZcTjAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪZcTjPanel���ʲ�ͳ����壩
    PageContainer.getInstance().setDefaultPage(ZcTjPanel.getInstance());
  }
}
