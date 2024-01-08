package com.careflow.ui.widget;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JComponent;

public class CurtainButton extends JComponent {
  private static final long serialVersionUID = 8224371439953976749L;
  private ArrayList<ActionListener> listeners = new ArrayList();
  private String text;
  private Icon icon;
  private float alignment = 0.0F;

  // 默认构造方法
  public CurtainButton() {
    this(null, null);
  }

  // 带参数的构造方法，接受文本和图标
  public CurtainButton(String text, Icon icon) {
    this.text = text;
    this.icon = icon;
    setFont(new Font("宋体", 0, 12));
    setUI(new CurtainButtonUI());
  }

  // 添加事件监听器
  public void addActionListener(ActionListener listener) {
    if (!this.listeners.contains(listener))
      this.listeners.add(listener);
  }

  // 移除事件监听器
  public void removeActionListener(ActionListener listener) {
    if (this.listeners.contains(listener))
      this.listeners.remove(listener);
  }

  // 触发按钮点击事件
  protected void fireActionPerformed(ActionEvent e) {
    for (ActionListener listener : this.listeners)
      listener.actionPerformed(e);
  }

  // 设置按钮文本
  public void setText(String text) {
    this.text = text;
    repaint();
  }

  // 获取按钮文本
  public String getText() {
    return this.text;
  }

  // 获取按钮图标
  public Icon getIcon() {
    return this.icon;
  }

  // 设置按钮图标
  public void setIcon(Icon icon) {
    this.icon = icon;
    repaint();
  }

  // 获取按钮文本与图标的对齐方式
  public float getAlignment() {
    return this.alignment;
  }

  // 设置按钮文本与图标的对齐方式
  public void setAlignment(float alignment) {
    this.alignment = alignment;
    repaint();
  }

  // 更新UI，设置按钮UI为CurtainButtonUI
  public void updateUI() {
    setUI(new CurtainButtonUI());
  }
}
