//设置图标样式
package com.careflow.ui.widget;

import java.awt.Cursor;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SearchTextField extends JTextField {
  public SearchTextField() {
    // 加载搜索图标
    ImageIcon image = new ImageIcon(SearchTextField.class.getResource("/com/careflow/resource/image/system-search-3.png"));

    // 获取图标的宽度和高度
    int w = image.getIconWidth();
    int h = image.getIconHeight();

    // 获取当前文本框的边距
    Insets m = getMargin();

    // 设置新的边距，将图标放在左侧
    setMargin(new Insets(m.top, m.left + w, m.bottom, m.right));

    // 创建标签，并设置图标和光标
    JLabel label = new JLabel(image);
    label.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
    label.setBorder(null);
    label.setBounds(m.left, m.top, w, h);

    // 将标签添加到文本框中
    add(label);
  }
}
