package com.careflow.action;

import java.awt.event.MouseEvent;

// 页面操作的接口
public interface PageAction {

  // 跳转到第一页
  void pageFirst();

  // 跳转到前一页
  void pagePrev(int paramInt);

  // 跳转到下一页
  void pageNext(int paramInt);

  // 跳转到最后一页
  void pageLast(int paramInt);

  // 选项状态发生改变时调用
  void itemStateChanged(int paramInt);

  // 导出操作
  void export(MouseEvent paramMouseEvent);
}
