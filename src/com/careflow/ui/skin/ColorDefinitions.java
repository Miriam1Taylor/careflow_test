package com.careflow.ui.skin;

import com.careflow.util.GuiUtils;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

// ColorDefinitions 类包含静态颜色常量，并提供一个初始化 UI 颜色的方法
public class ColorDefinitions {

  // 对话框标题的字体颜色
  public static final Color TITLE_DIALOG_FONT_COLOR = Color.WHITE;

  // 警告颜色
  public static final Color WARNING_COLOR = Color.RED;

  // 一般未知元素的前景色
  public static final Color GENERAL_UNKNOWN_ELEMENT_FOREGROUND_COLOR = Color.RED;

  // 初始化 UI 颜色的方法
  public static void initColors() {
    // 设置工具提示边框颜色
    UIManager.put("ToolTip.border", BorderFactory.createLineBorder(GuiUtils.getLookAndFeelColor("borderColor")));

    // 设置工具提示的背景和前景颜色
    UIManager.put("ToolTip.background", new ColorUIResource(Color.WHITE));
    UIManager.put("ToolTip.foreground", new ColorUIResource(Color.BLACK));

    // 设置各种 UI 组件的字体
    Font font = new Font("宋体", 0, 12);
    UIManager.put("Frame.titleFont", font);
    UIManager.put("InternalFrame.titleFont", font);
    UIManager.put("Frame.font", font);
    UIManager.put("Menu.font", font);
    UIManager.put("MenuItem.font", font);
    UIManager.put("TitledBorder.font", font);
    UIManager.put("InternalFrame.font", font);
    UIManager.put("InternalFrame.titleFont", font);
    UIManager.put("Table.font", font);
    UIManager.put("TableHeader.font", font);
    UIManager.put("Button.font", font);
    UIManager.put("Label.font", font);
  }
}
