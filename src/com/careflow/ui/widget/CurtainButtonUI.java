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

// CurtainButtonUI 类是一个用户界面组件，用于绘制窗帘按钮的外观
public class CurtainButtonUI extends ComponentUI implements MouseListener, MouseMotionListener {
  // 定义按钮的首选高度
  public static final int PREFERED_HEIGHT = 22;

  // 定义按钮的首选大小
  private static final Dimension PREFERED_SIZE = new Dimension(200, 22);

  // 定义按钮按下时的深色和浅色
  private static final Color pressed_dark_color = new Color(254, 145, 78);
  private static final Color pressed_light_color = new Color(254, 204, 135);

  // 定义按钮悬停时的深色和浅色
  private static final Color hovered_dark_color = new Color(255, 211, 150);
  private static final Color hovered_light_color = new Color(255, 244, 204);

  // 定义按钮的亮色、暗色和边框颜色
  private Color light_color;
  private Color dark_color;
  private Color border_color;

  // 记录按钮是否被按下和悬停
  private boolean pressed;
  private boolean hovered;

  // 引用对应的 CurtainButton
  private CurtainButton button;

  // 构造方法
  public CurtainButtonUI() {
    // 获取外观颜色，如果为 null，则使用默认颜色
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

  // 创建 CurtainButtonUI 实例
  public static ComponentUI createUI(JComponent c) {
    return new CurtainButtonUI();
  }

  // 安装 UI，将监听器添加到按钮
  public void installUI(JComponent c) {
    this.button = ((CurtainButton) c);
    this.button.addMouseListener(this);
    this.button.addMouseMotionListener(this);
  }

  // 卸载 UI，将监听器从按钮移除
  public void uninstallUI(JComponent c) {
    this.button.removeMouseListener(this);
    this.button.removeMouseMotionListener(this);
  }

  // 鼠标点击事件处理
  public void mouseClicked(MouseEvent e) {
  }

  // 鼠标按下事件处理
  public void mousePressed(MouseEvent e) {
    setPressed(true);
  }

  // 鼠标释放事件处理
  public void mouseReleased(MouseEvent e) {
    setPressed(false);
    // 触发按钮的 ActionEvent
    this.button.fireActionPerformed(new ActionEvent(this.button, 0, this.button.getText()));
  }

  // 鼠标进入事件处理
  public void mouseEntered(MouseEvent e) {
    setHovered(true);
  }

  // 鼠标退出事件处理
  public void mouseExited(MouseEvent e) {
    setHovered(false);
  }

  // 鼠标拖动事件处理
  public void mouseDragged(MouseEvent e) {
  }

  // 鼠标移动事件处理
  public void mouseMoved(MouseEvent e) {
  }

  // 获取按钮是否被按下
  public boolean isPressed() {
    return this.pressed;
  }

  // 设置按钮是否被按下
  public void setPressed(boolean pressed) {
    this.pressed = pressed;
    this.button.repaint();
  }

  // 获取按钮是否被悬停
  public boolean isHovered() {
    return this.hovered;
  }

  // 设置按钮是否被悬停
  public void setHovered(boolean hovered) {
    this.hovered = hovered;
    this.button.repaint();
  }

  // 获取按钮的首选大小
  public Dimension getPreferredSize(JComponent c) {
    return PREFERED_SIZE;
  }

  // 绘制按钮的外观
  public void paint(Graphics g, JComponent c) {
    paintComponentBackground(g);

    int w = this.button.getWidth();
    int h = this.button.getHeight();
    int wd = 0;

    // 计算图标和文本的宽度
    if (this.button.getIcon() != null)
      wd += this.button.getIcon().getIconWidth();
    FontMetrics fm = g.getFontMetrics();
    if (this.button.getText() != null)
      wd += fm.stringWidth(this.button.getText()) + 6;

    // 计算文本和图标的位置
    int x = (int) (12.0F + (w - 24 - wd) * this.button.getAlignment());

    // 绘制图标
    if (this.button.getIcon() != null) {
      int y = (h - this.button.getIcon().getIconHeight()) / 2;
      this.button.getIcon().paintIcon(this.button, g, x, y);
      x += this.button.getIcon().getIconWidth() + 6;
    }

    // 绘制文本
    if (this.button.getText() != null) {
      int y = (h - fm.getHeight()) / 2 + fm.getAscent();
      g.setColor(this.button.getForeground());
      g.drawString(this.button.getText(), x, y);
    }
  }

  // 绘制按钮的背景
  protected void paintComponentBackground(Graphics g) {
    int w = this.button.getWidth();
    int h = this.button.getHeight();

    // 根据按钮状态选择不同的颜色
    Color font_color = this.hovered ? Color.black : this.pressed ? Color.GRAY : null;
    this.button.setForeground(font_color);
    this.button.setFont(new Font("宋体", 1, 12));

    Color top_color = this.hovered ? hovered_light_color : this.pressed ? pressed_dark_color : this.light_color;
    Color bottom_color = this.hovered ? hovered_dark_color : this.pressed ? pressed_light_color : this.dark_color;

    // 使用渐变颜色绘制背景
    GradientPaint gp = new GradientPaint(1.0F, 1.0F, top_color, 1.0F, h - 2, bottom_color);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setPaint(gp);
    g2d.fillRect(1, 1, w - 2, h - 2);

    // 绘制边框线条
    g.setColor(this.border_color);
    g.drawLine(0, 0, w - 1, 0);
    g.drawLine(0, 0, 0, h - 1);
    g.setColor(this.border_color);
    g.drawLine(0, h - 1, w - 1, h - 1);
    g.drawLine(w - 1, 0, w - 1, h - 1);
  }
}
