package com.careflow.dao;

import com.careflow.pojo.Custom;

import java.util.List;

// 客户数据访问对象接口
public interface CustomDAO {

  // 根据客户ID获取客户信息
  Custom getCustomById(String paramString);

  // 添加客户信息
  Custom add(Custom paramCustom);

  // 更新客户信息
  Custom update(Custom paramCustom);

  // 根据客户ID删除客户信息
  boolean deleteById(String paramString);

  // 根据条件获取客户列表
  List getCustom(String paramString1, String paramString2, String paramString3);

  // 获取客户总数
  int getCustomsSize();

  // 分页获取客户列表
  List getCustoms(int paramInt1, int paramInt2);

  // 根据条件和页码获取客户列表
  List getCustoms(String paramString, int paramInt);

  // 获取所有客户列表
  List getCustoms();
}
