package com.careflow.action;

import com.careflow.ui.frame.KuCTjPanel;
import com.careflow.ui.frame.PageContainer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class KCStockAction extends AbstractAction {

  // ����������ʱ���õķ���
  public void actionPerformed(ActionEvent e) {
    // ����PageContainer�е�Ĭ��ҳ��ΪKuCTjPanel�����ͳ����壩
    PageContainer.getInstance().setDefaultPage(KuCTjPanel.getInstance());
  }
}
