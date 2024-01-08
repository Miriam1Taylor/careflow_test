package com.careflow.dao;

// PatchDAO接口定义了对系统补丁（Patch）的操作方法
public interface PatchDAO {

  // 执行系统补丁操作，升级系统版本
  void patch(float paramFloat1, float paramFloat2);
}
