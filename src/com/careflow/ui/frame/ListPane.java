package com.careflow.ui.frame;

import com.careflow.ui.widget.LinkLabel;
import com.careflow.util.GuiUtils;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListPane extends JPanel {
  private static final long serialVersionUID = 6807890033041814417L;
  private static final int HORZ_PAD = 12;
  private static final int VERT_PAD = 6;

  public ListPane() {
    initComponents();
    // 设置面板的边框
    Border b = BorderFactory.createEmptyBorder(6, 12, 6, 12);
    setBorder(b);
  }

  private void initComponents() {
    // 设置面板布局为垂直布局
    BoxLayout boxLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
    setLayout(boxLayout);
  }

  // 向列表中添加一个带有文本和图标的项
  public void addItem(String text, ImageIcon icon) {
    addItem(text, icon, null, true);
  }

  // 向列表中添加一个带有文本、图标和操作的项
  public void addItem(String text, ImageIcon icon, final Action action, boolean isVisible) {
    LinkLabel lblItem = new LinkLabel();
    lblItem.setFont(new Font("宋体", Font.PLAIN, 12));
    lblItem.setCursor(new Cursor(Cursor.HAND_CURSOR));
    lblItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
        if (action != null)
          action.actionPerformed(event);
        else
          System.out.println(((LinkLabel) event.getSource()).getText());
      }
    });
    if (icon != null) {
      lblItem.setIcon(icon);
      lblItem.setForeground(GuiUtils.getLookAndFeelColor("foregroundColor"));
    } else {
      lblItem.setForeground(GuiUtils.getLookAndFeelColor("foregroundColor"));
    }
    lblItem.setText(text);
    lblItem.setVisible(isVisible);
    add(lblItem);

    // 用于调整布局的占位标签
    JLabel jLabel = new JLabel("      ");
    jLabel.setSize(185, 10);
    jLabel.setFont(new Font("宋体", Font.PLAIN, 6));
    jLabel.setPreferredSize(new Dimension(185, 10));
    jLabel.setVisible(isVisible);
    add(jLabel);
  }

  // 向列表中添加一个带有文本和图标的按钮项
  public void addButtonItem(String text, ImageIcon icon) {
    JButton btnItem = new JButton();
    btnItem.setBorder(BorderFactory.createCompoundBorder());
    btnItem.setBackground(GuiUtils.getLookAndFeelColor("backgroundFillColor"));
    if (icon != null) {
      btnItem.setIcon(icon);
    }
    btnItem.setForeground(GuiUtils.getLookAndFeelColor("foregroundColor"));
    btnItem.setText(text);
    add(btnItem);
  }

  // 向列表中添加一个 JList 组件项
  public void addListItem() {
    String[] data = {"one", "two", "three", "four"};
    JList<String> lstItem = new JList<>(data);
    add(lstItem);
  }
}
