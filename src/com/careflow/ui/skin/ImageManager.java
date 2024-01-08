package com.careflow.ui.skin;

import com.careflow.Constant;
import com.careflow.util.ResouceLoader;

import java.awt.Image;
import java.util.HashMap;
import javax.swing.ImageIcon;

// ImageManager �����ڹ���ͼ����Դ
public class ImageManager {

  // ͼ��ע������ڴ洢�Ѽ��ص�ͼ��
  private static HashMap<String, ImageIcon> imageRegistry = new HashMap();

  // ��ȡͼ��ע���
  public static HashMap<String, ImageIcon> getImageRegistry() {
    if (imageRegistry == null) {
      imageRegistry = new HashMap();
    }
    return imageRegistry;
  }

  // ��ȡָ�����Ƶ�ͼ��ͼ��
  public static ImageIcon getImageIcon(String imageName) {
    return getImageIcon(imageName, null);
  }

  // ��ȡָ�����ƺ�������ͼ��ͼ��
  public static ImageIcon getImageIcon(String imageName, String description) {
    // ��ͼ��ע����в���ͼ��
    ImageIcon getImageIcon = (ImageIcon) imageRegistry.get(imageName);

    // ���ͼ��δ��ע������ҵ�������ͼ����ӵ�ע�����
    if (getImageIcon == null) {
      getImageIcon = (description == null)
              ? new ImageIcon(ResouceLoader.getResouce(imageName))
              : new ImageIcon(ResouceLoader.getResouce(imageName), description);
      imageRegistry.put(imageName, getImageIcon);
    }

    return getImageIcon;
  }

  // ��ȡָ�����Ƶ�ͼ��
  public static Image getImage(String imageName) {
    return getImageIcon(imageName).getImage();
  }

  // ���ݶ����ƻ�ȡͼ��ͼ�꣨�����ͼ��Ŀ¼��
  public static ImageIcon getImageIconByShortName(String imageName) {
    return getImageIcon(Constant.ICON_DIR + Constant.getSlash() + imageName);
  }

  // ���ݶ����ƻ�ȡͼ�������ͼ��Ŀ¼��
  public static Image getImageByShortName(String imageName) {
    return getImageIcon(Constant.ICON_DIR + Constant.getSlash() + imageName)
            .getImage();
  }
}
