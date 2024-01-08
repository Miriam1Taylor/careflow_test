package com.careflow.ui.widget;

import com.careflow.util.GuiUtils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;

// CurtainButtonUI ����һ���û�������������ڻ��ƴ�����ť�����
public class CurtainButtonUI extends ComponentUI implements MouseListener, MouseMotionListener {
  // ���尴ť����ѡ�߶�
  public static final int PREFERED_HEIGHT = 22;

  // ���尴ť����ѡ��С
  private static final Dimension PREFERED_SIZE = new Dimension(200, 22);

  // ���尴ť����ʱ����ɫ��ǳɫ
  private static final Color pressed_dark_color = new Color(254, 145, 78);
  private static final Color pressed_light_color = new Color(254, 204, 135);

  // ���尴ť��ͣʱ����ɫ��ǳɫ
  private static final Color hovered_dark_color = new Color(255, 211, 150);
  private static final Color hovered_light_color = new Color(255, 244, 204);

  // ���尴ť����ɫ����ɫ�ͱ߿���ɫ
  private Color light_color;
  private Color dark_color;
  private Color border_color;

  // ��¼��ť�Ƿ񱻰��º���ͣ
  private boolean pressed;
  private boolean hovered;

  // ���ö�Ӧ�� CurtainButton
  private CurtainButton button;

  // ���췽��
  public CurtainButtonUI() {
    // ��ȡ�����ɫ�����Ϊ null����ʹ��Ĭ����ɫ
    this.light_color = (GuiUtils.getLookAndFeelColor("lightColor") == null ? UIManager.getColor("Panel.background") :
            GuiUtils.getLookAndFeelColor("lightColor"));
    this.light_color = (this.light_color == null ? Color.LIGHT_GRAY : this.light_color);

    this.dark_color = (GuiUtils.getLookAndFeelColor("darkColor") == null ? UIManager.getColor("Menu.selectionBackground") :
            GuiUtils.getLookAndFeelColor("darkColor"));
    this.dark_color = (this.dark_color == null ? Color.LIGHT_GRAY : this.dark_color);

    this.border_color = (GuiUtils.getLookAndFeelColor("borderColor") == null ? UIManager.getColor("Panel.background") :
            GuiUtils.getLookAndFeelColor("borderColor"));
    this.border_color = (this.border_color == null ? Color.DARK_GRAY : this.border_color);
  }

  // ���� CurtainButtonUI ʵ��
  public static ComponentUI createUI(JComponent c) {
    return new CurtainButtonUI();
  }

  // ��װ UI������������ӵ���ť
  public void installUI(JComponent c) {
    this.button = ((CurtainButton) c);
    this.button.addMouseListener(this);
    this.button.addMouseMotionListener(this);
  }

  // ж�� UI�����������Ӱ�ť�Ƴ�
  public void uninstallUI(JComponent c) {
    this.button.removeMouseListener(this);
    this.button.removeMouseMotionListener(this);
  }

  // ������¼�����
  public void mouseClicked(MouseEvent e) {
  }

  // ��갴���¼�����
  public void mousePressed(MouseEvent e) {
    setPressed(true);
  }

  // ����ͷ��¼�����
  public void mouseReleased(MouseEvent e) {
    setPressed(false);
    // ������ť�� ActionEvent
    this.button.fireActionPerformed(new ActionEvent(this.button, 0, this.button.getText()));
  }

  // �������¼�����
  public void mouseEntered(MouseEvent e) {
    setHovered(true);
  }

  // ����˳��¼�����
  public void mouseExited(MouseEvent e) {
    setHovered(false);
  }

  // ����϶��¼�����
  public void mouseDragged(MouseEvent e) {
  }

  // ����ƶ��¼�����
  public void mouseMoved(MouseEvent e) {
  }

  // ��ȡ��ť�Ƿ񱻰���
  public boolean isPressed() {
    return this.pressed;
  }

  // ���ð�ť�Ƿ񱻰���
  public void setPressed(boolean pressed) {
    this.pressed = pressed;
    this.button.repaint();
  }

  // ��ȡ��ť�Ƿ���ͣ
  public boolean isHovered() {
    return this.hovered;
  }

  // ���ð�ť�Ƿ���ͣ
  public void setHovered(boolean hovered) {
    this.hovered = hovered;
    this.button.repaint();
  }

  // ��ȡ��ť����ѡ��С
  public Dimension getPreferredSize(JComponent c) {
    return PREFERED_SIZE;
  }

  // ���ư�ť�����
  public void paint(Graphics g, JComponent c) {
    paintComponentBackground(g);

    int w = this.button.getWidth();
    int h = this.button.getHeight();
    int wd = 0;

    // ����ͼ����ı��Ŀ��
    if (this.button.getIcon() != null)
      wd += this.button.getIcon().getIconWidth();
    FontMetrics fm = g.getFontMetrics();
    if (this.button.getText() != null)
      wd += fm.stringWidth(this.button.getText()) + 6;

    // �����ı���ͼ���λ��
    int x = (int) (12.0F + (w - 24 - wd) * this.button.getAlignment());

    // ����ͼ��
    if (this.button.getIcon() != null) {
      int y = (h - this.button.getIcon().getIconHeight()) / 2;
      this.button.getIcon().paintIcon(this.button, g, x, y);
      x += this.button.getIcon().getIconWidth() + 6;
    }

    // �����ı�
    if (this.button.getText() != null) {
      int y = (h - fm.getHeight()) / 2 + fm.getAscent();
      g.setColor(this.button.getForeground());
      g.drawString(this.button.getText(), x, y);
    }
  }

  // ���ư�ť�ı���
  protected void paintComponentBackground(Graphics g) {
    int w = this.button.getWidth();
    int h = this.button.getHeight();

    // ���ݰ�ť״̬ѡ��ͬ����ɫ
    Color font_color = this.hovered ? Color.black : this.pressed ? Color.GRAY : null;
    this.button.setForeground(font_color);
    this.button.setFont(new Font("����", 1, 12));

    Color top_color = this.hovered ? hovered_light_color : this.pressed ? pressed_dark_color : this.light_color;
    Color bottom_color = this.hovered ? hovered_dark_color : this.pressed ? pressed_light_color : this.dark_color;

    // ʹ�ý�����ɫ���Ʊ���
    GradientPaint gp = new GradientPaint(1.0F, 1.0F, top_color, 1.0F, h - 2, bottom_color);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setPaint(gp);
    g2d.fillRect(1, 1, w - 2, h - 2);

    // ���Ʊ߿�����
    g.setColor(this.border_color);
    g.drawLine(0, 0, w - 1, 0);
    g.drawLine(0, 0, 0, h - 1);
    g.setColor(this.border_color);
    g.drawLine(0, h - 1, w - 1, h - 1);
    g.drawLine(w - 1, 0, w - 1, h - 1);
  }
}
