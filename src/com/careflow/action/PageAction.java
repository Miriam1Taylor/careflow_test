package com.careflow.action;

import java.awt.event.MouseEvent;

// ҳ������Ľӿ�
public interface PageAction {

  // ��ת����һҳ
  void pageFirst();

  // ��ת��ǰһҳ
  void pagePrev(int paramInt);

  // ��ת����һҳ
  void pageNext(int paramInt);

  // ��ת�����һҳ
  void pageLast(int paramInt);

  // ѡ��״̬�����ı�ʱ����
  void itemStateChanged(int paramInt);

  // ��������
  void export(MouseEvent paramMouseEvent);
}
