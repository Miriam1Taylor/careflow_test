package com.careflow.ui.skin;

import com.careflow.util.GuiUtils;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

// ColorDefinitions �������̬��ɫ���������ṩһ����ʼ�� UI ��ɫ�ķ���
public class ColorDefinitions {

  // �Ի�������������ɫ
  public static final Color TITLE_DIALOG_FONT_COLOR = Color.WHITE;

  // ������ɫ
  public static final Color WARNING_COLOR = Color.RED;

  // һ��δ֪Ԫ�ص�ǰ��ɫ
  public static final Color GENERAL_UNKNOWN_ELEMENT_FOREGROUND_COLOR = Color.RED;

  // ��ʼ�� UI ��ɫ�ķ���
  public static void initColors() {
    // ���ù�����ʾ�߿���ɫ
    UIManager.put("ToolTip.border", BorderFactory.createLineBorder(GuiUtils.getLookAndFeelColor("borderColor")));

    // ���ù�����ʾ�ı�����ǰ����ɫ
    UIManager.put("ToolTip.background", new ColorUIResource(Color.WHITE));
    UIManager.put("ToolTip.foreground", new ColorUIResource(Color.BLACK));

    // ���ø��� UI ���������
    Font font = new Font("����", 0, 12);
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
