package com.careflow.action;

import com.careflow.ui.frame.PageContainer;
import com.careflow.ui.frame.SuppliersPanel;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class SuppliersAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪSuppliersPanel����Ӧ����壩
    PageContainer.getInstance().setDefaultPage(SuppliersPanel.getInstance());
  }
}
