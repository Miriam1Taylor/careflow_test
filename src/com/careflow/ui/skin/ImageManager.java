package com.careflow.ui.skin;

import com.careflow.Constant;
import com.careflow.util.ResouceLoader;

import java.awt.Image;
import java.util.HashMap;
import javax.swing.ImageIcon;

// ImageManager 类用于管理图像资源
public class ImageManager {

  // 图像注册表，用于存储已加载的图像
  private static HashMap<String, ImageIcon> imageRegistry = new HashMap();

  // 获取图像注册表
  public static HashMap<String, ImageIcon> getImageRegistry() {
    if (imageRegistry == null) {
      imageRegistry = new HashMap();
    }
    return imageRegistry;
  }

  // 获取指定名称的图像图标
  public static ImageIcon getImageIcon(String imageName) {
    return getImageIcon(imageName, null);
  }

  // 获取指定名称和描述的图像图标
  public static ImageIcon getImageIcon(String imageName, String description) {
    // 从图像注册表中查找图像
    ImageIcon getImageIcon = (ImageIcon) imageRegistry.get(imageName);

    // 如果图像未在注册表中找到，加载图像并添加到注册表中
    if (getImageIcon == null) {
      getImageIcon = (description == null)
              ? new ImageIcon(ResouceLoader.getResouce(imageName))
              : new ImageIcon(ResouceLoader.getResouce(imageName), description);
      imageRegistry.put(imageName, getImageIcon);
    }

    return getImageIcon;
  }

  // 获取指定名称的图像
  public static Image getImage(String imageName) {
    return getImageIcon(imageName).getImage();
  }

  // 根据短名称获取图像图标（相对于图标目录）
  public static ImageIcon getImageIconByShortName(String imageName) {
    return getImageIcon(Constant.ICON_DIR + Constant.getSlash() + imageName);
  }

  // 根据短名称获取图像（相对于图标目录）
  public static Image getImageByShortName(String imageName) {
    return getImageIcon(Constant.ICON_DIR + Constant.getSlash() + imageName)
            .getImage();
  }
}
