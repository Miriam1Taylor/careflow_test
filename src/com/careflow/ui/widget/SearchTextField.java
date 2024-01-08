//����ͼ����ʽ
package com.careflow.ui.widget;

import java.awt.Cursor;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SearchTextField extends JTextField {
  public SearchTextField() {
    // ��������ͼ��
    ImageIcon image = new ImageIcon(SearchTextField.class.getResource("/com/careflow/resource/image/system-search-3.png"));

    // ��ȡͼ��Ŀ�Ⱥ͸߶�
    int w = image.getIconWidth();
    int h = image.getIconHeight();

    // ��ȡ��ǰ�ı���ı߾�
    Insets m = getMargin();

    // �����µı߾࣬��ͼ��������
    setMargin(new Insets(m.top, m.left + w, m.bottom, m.right));

    // ������ǩ��������ͼ��͹��
    JLabel label = new JLabel(image);
    label.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
    label.setBorder(null);
    label.setBounds(m.left, m.top, w, h);

    // ����ǩ��ӵ��ı�����
    add(label);
  }
}
