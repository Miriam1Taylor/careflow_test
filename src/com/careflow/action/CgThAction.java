package com.careflow.action;

import com.careflow.ui.frame.CgthPane;
import com.careflow.ui.frame.PageContainer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class CgThAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪCgthPane���ɹ��˻���壩
    PageContainer.getInstance().setDefaultPage(CgthPane.getInstance());
  }
}
