package com.careflow.ui.frame;

import com.careflow.Constant;
import com.careflow.ui.skin.ImageManager;

import java.awt.Component;
import java.awt.event.ActionListener;
import org.jdesktop.swingx.JXFrame;

// BaseFrame 类，继承自 JXFrame，用于创建基础的窗口框架
public abstract class BaseFrame extends JXFrame implements ActionListener {

  private static final long serialVersionUID = -3172874700605827735L;

  // 默认构造函数
  public BaseFrame() {
    setIconImage(ImageManager.getImage(Constant.APP_ICON));
  }

  // 带有标题的构造函数
  public BaseFrame(String title) {
    super(title);
    setIconImage(ImageManager.getImage(Constant.APP_ICON));
  }

  // 带有标题、宽度、高度和拥有者组件的构造函数
  public BaseFrame(String title, int width, int height, Component owner) {
    super(title);
    setSize(width, height);
    setLocationRelativeTo(owner);
    setIconImage(ImageManager.getImage(Constant.APP_ICON));
  }
}
