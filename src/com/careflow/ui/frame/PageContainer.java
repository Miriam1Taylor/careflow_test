package com.careflow.ui.frame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class PageContainer extends JPanel implements AncestorListener {
  // ��̬��������ʾҳ��������ʵ��
  private static PageContainer thisPage = new PageContainer();

  // ��̬��������ʾ����������
  private static JPanel titleControlPanel;

  // ��̬��������ʾҳ������
  private static JPanel pageContainer;

  // ��̬��������ʾ��Ƭ����
  private static CardLayout card;

  // ��̬��������ʾ�����ǩ
  private static JLabel titleLabel;

  // Ĭ��ҳ��
  private IPage defaultPage;

  // ˽�й��캯�������ò��ֲ���ӱ����������ҳ������
  private PageContainer() {
    setLayout(new BorderLayout());

    add(getTitleControlPanel(), "North");

    add(getPageContainer(), "Center");
  }

  // ��ȡҳ��������ʵ��
  public static PageContainer getInstance() {
    return thisPage;
  }

  // ��ȡ����������
  public JPanel getTitleControlPanel() {
    if (titleControlPanel == null) {
      titleControlPanel = new JPanel();
      GridBagLayout gridbag = new GridBagLayout();
      GridBagConstraints c = new GridBagConstraints();
      titleControlPanel.setLayout(gridbag);

      int top = 2;
      int left = 1;
      int bottom = 2;
      int right = 1;
      Insets inserts = new Insets(top, left, bottom, right);

      c.fill = 1;
      c.weightx = 0.0D;
      c.weighty = 0.0D;
      c.insets = inserts;
      c.anchor = 21;
      c.gridx = 0;
      c.gridy = 0;
      c.gridwidth = 1;
      c.gridheight = 1;
      titleControlPanel.add(getTitleLabel(), c);

      c.gridx = -1;
      c.weightx = 1.0D;
      titleControlPanel.add(new JLabel(), c);
      c.weightx = 0.0D;
    }

    return titleControlPanel;
  }

  // ��ȡ�����ǩ
  private JLabel getTitleLabel() {
    if (titleLabel == null) {
      titleLabel = new JLabel();

      titleLabel.setFont(new Font("����", 0, 12));
      setTitleLabelText("Card Title");
      titleLabel.setBackground(Color.RED);
    }

    return titleLabel;
  }

  // ���ñ����ı�
  public void setTitleLabelText(String title) {
    if ((titleLabel != null) && (title != null)) {
      titleLabel.setText(title);
    }
  }

  // ��ȡҳ������
  public JPanel getPageContainer() {
    if (pageContainer == null) {
      pageContainer = new JPanel();
      if (card == null) {
        card = new CardLayout();
        pageContainer.setLayout(card);
      }
    }
    return pageContainer;
  }

  // ����Ĭ��ҳ��
  public void setDefaultPage(IPage cardComponent) {
    if ((cardComponent != null) && ((cardComponent instanceof Component))) {
      this.defaultPage = cardComponent;
      this.defaultPage.setDefaultPage(true);
      addPage((Component)this.defaultPage, this.defaultPage.getPageId());
    }
  }

  // ��ȡĬ��ҳ��
  public IPage getDefaultPage() {
    return this.defaultPage;
  }

  // ���ҳ�浽ҳ������
  public void addPage(Component comp, Object constraints) {
    Component[] components = getPageContainer().getComponents();

    getPageContainer().add(comp, constraints);
    show((String)constraints);
  }

  // ��ʾָ�����Ƶ�ҳ��
  public void show(String name) {
    card.show(pageContainer, name);
    updateTitleControlPanel();
  }

  // ���±��������������
  private void updateTitleControlPanel() {
    if (this.defaultPage != null) {
      setTitleLabelText(this.defaultPage.getPageName());
    } else {
      setTitleLabelText("Change to Default title.");
    }
  }

  // ʵ�� AncestorListener �ӿڵķ���
  public void ancestorAdded(AncestorEvent event) {
  }

  // ʵ�� AncestorListener �ӿڵķ���
  public void ancestorRemoved(AncestorEvent event) {
  }

  // ʵ�� AncestorListener �ӿڵķ���
  public void ancestorMoved(AncestorEvent event) {
  }
}
