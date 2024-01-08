package com.careflow.moudle.impl;

import com.careflow.dao.CustomDAO;
import com.careflow.moudle.CustomMoudle;
import com.careflow.pojo.Custom;

import java.util.List;

// CustomMoudleImpl 类实现了 CustomMoudle 接口
public class CustomMoudleImpl implements CustomMoudle {

  // 客户数据访问对象
  private CustomDAO customDAO;

  // 设置客户数据访问对象
  public void setCustomDAO(CustomDAO customDAO) {
    this.customDAO = customDAO;
  }

  // 根据客户ID获取客户信息
  public Custom getCustomById(String id) {
    return this.customDAO.getCustomById(id);
  }

  // 添加客户信息
  public Custom add(Custom custom) {
    return this.customDAO.add(custom);
  }

  // 更新客户信息
  public Custom update(Custom custom) {
    return this.customDAO.update(custom);
  }

  // 删除客户信息
  public boolean delete(String id) {
    return this.customDAO.deleteById(id);
  }

  // 根据条件获取客户列表
  public List getCustom(String id, String name, String telephone) {
    return this.customDAO.getCustom(id, name, telephone);
  }

  // 获取客户总数
  public int getCustomsSize() {
    return this.customDAO.getCustomsSize();
  }

  // 分页获取客户列表
  public List getCustoms(int start, int max) {
    return this.customDAO.getCustoms(start, max);
  }

  // 根据条件获取一定数量的客户列表
  public List getCustoms(String value, int max) {
    return this.customDAO.getCustoms(value, max);
  }

  // 获取所有客户列表
  public List getCustoms() {
    return this.customDAO.getCustoms();
  }
}
