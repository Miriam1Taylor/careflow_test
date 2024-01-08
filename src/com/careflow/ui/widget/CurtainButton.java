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

  // Ĭ�Ϲ��췽��
  public CurtainButton() {
    this(null, null);
  }

  // �������Ĺ��췽���������ı���ͼ��
  public CurtainButton(String text, Icon icon) {
    this.text = text;
    this.icon = icon;
    setFont(new Font("����", 0, 12));
    setUI(new CurtainButtonUI());
  }

  // ����¼�������
  public void addActionListener(ActionListener listener) {
    if (!this.listeners.contains(listener))
      this.listeners.add(listener);
  }

  // �Ƴ��¼�������
  public void removeActionListener(ActionListener listener) {
    if (this.listeners.contains(listener))
      this.listeners.remove(listener);
  }

  // ������ť����¼�
  protected void fireActionPerformed(ActionEvent e) {
    for (ActionListener listener : this.listeners)
      listener.actionPerformed(e);
  }

  // ���ð�ť�ı�
  public void setText(String text) {
    this.text = text;
    repaint();
  }

  // ��ȡ��ť�ı�
  public String getText() {
    return this.text;
  }

  // ��ȡ��ťͼ��
  public Icon getIcon() {
    return this.icon;
  }

  // ���ð�ťͼ��
  public void setIcon(Icon icon) {
    this.icon = icon;
    repaint();
  }

  // ��ȡ��ť�ı���ͼ��Ķ��뷽ʽ
  public float getAlignment() {
    return this.alignment;
  }

  // ���ð�ť�ı���ͼ��Ķ��뷽ʽ
  public void setAlignment(float alignment) {
    this.alignment = alignment;
    repaint();
  }

  // ����UI�����ð�ťUIΪCurtainButtonUI
  public void updateUI() {
    setUI(new CurtainButtonUI());
  }
}
