package com.careflow.action;

import com.careflow.ui.frame.GkthPane;
import com.careflow.ui.frame.PageContainer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class GkThAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪGkthPane�������˻���壩
    PageContainer.getInstance().setDefaultPage(GkthPane.getInstance());
  }
}
