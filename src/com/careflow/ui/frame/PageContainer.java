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
  // 静态变量，表示页面容器的实例
  private static PageContainer thisPage = new PageContainer();

  // 静态变量，表示标题控制面板
  private static JPanel titleControlPanel;

  // 静态变量，表示页面容器
  private static JPanel pageContainer;

  // 静态变量，表示卡片布局
  private static CardLayout card;

  // 静态变量，表示标题标签
  private static JLabel titleLabel;

  // 默认页面
  private IPage defaultPage;

  // 私有构造函数，设置布局并添加标题控制面板和页面容器
  private PageContainer() {
    setLayout(new BorderLayout());

    add(getTitleControlPanel(), "North");

    add(getPageContainer(), "Center");
  }

  // 获取页面容器的实例
  public static PageContainer getInstance() {
    return thisPage;
  }

  // 获取标题控制面板
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

  // 获取标题标签
  private JLabel getTitleLabel() {
    if (titleLabel == null) {
      titleLabel = new JLabel();

      titleLabel.setFont(new Font("宋体", 0, 12));
      setTitleLabelText("Card Title");
      titleLabel.setBackground(Color.RED);
    }

    return titleLabel;
  }

  // 设置标题文本
  public void setTitleLabelText(String title) {
    if ((titleLabel != null) && (title != null)) {
      titleLabel.setText(title);
    }
  }

  // 获取页面容器
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

  // 设置默认页面
  public void setDefaultPage(IPage cardComponent) {
    if ((cardComponent != null) && ((cardComponent instanceof Component))) {
      this.defaultPage = cardComponent;
      this.defaultPage.setDefaultPage(true);
      addPage((Component)this.defaultPage, this.defaultPage.getPageId());
    }
  }

  // 获取默认页面
  public IPage getDefaultPage() {
    return this.defaultPage;
  }

  // 添加页面到页面容器
  public void addPage(Component comp, Object constraints) {
    Component[] components = getPageContainer().getComponents();

    getPageContainer().add(comp, constraints);
    show((String)constraints);
  }

  // 显示指定名称的页面
  public void show(String name) {
    card.show(pageContainer, name);
    updateTitleControlPanel();
  }

  // 更新标题控制面板的内容
  private void updateTitleControlPanel() {
    if (this.defaultPage != null) {
      setTitleLabelText(this.defaultPage.getPageName());
    } else {
      setTitleLabelText("Change to Default title.");
    }
  }

  // 实现 AncestorListener 接口的方法
  public void ancestorAdded(AncestorEvent event) {
  }

  // 实现 AncestorListener 接口的方法
  public void ancestorRemoved(AncestorEvent event) {
  }

  // 实现 AncestorListener 接口的方法
  public void ancestorMoved(AncestorEvent event) {
  }
}
