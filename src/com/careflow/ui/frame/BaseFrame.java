package com.careflow.ui.frame;

import com.careflow.Constant;
import com.careflow.ui.skin.ImageManager;

import java.awt.Component;
import java.awt.event.ActionListener;
import org.jdesktop.swingx.JXFrame;

// BaseFrame �࣬�̳��� JXFrame�����ڴ��������Ĵ��ڿ��
public abstract class BaseFrame extends JXFrame implements ActionListener {

  private static final long serialVersionUID = -3172874700605827735L;

  // Ĭ�Ϲ��캯��
  public BaseFrame() {
    setIconImage(ImageManager.getImage(Constant.APP_ICON));
  }

  // ���б���Ĺ��캯��
  public BaseFrame(String title) {
    super(title);
    setIconImage(ImageManager.getImage(Constant.APP_ICON));
  }

  // ���б��⡢��ȡ��߶Ⱥ�ӵ��������Ĺ��캯��
  public BaseFrame(String title, int width, int height, Component owner) {
    super(title);
    setSize(width, height);
    setLocationRelativeTo(owner);
    setIconImage(ImageManager.getImage(Constant.APP_ICON));
  }
}
