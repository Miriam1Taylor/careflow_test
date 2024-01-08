package com.careflow.moudle.impl;

import com.careflow.dao.OptionDAO;
import com.careflow.moudle.OptionMoudle;
import com.careflow.pojo.Option;

import java.util.List;

// OptionMoudleImpl 类实现了 OptionMoudle 接口
public class OptionMoudleImpl implements OptionMoudle {

  // 选项数据访问对象
  private OptionDAO optionDAO;

  // 设置选项数据访问对象
  public void setOptionDAO(OptionDAO optionDAO) {
    this.optionDAO = optionDAO;
  }

  // 添加选项
  public boolean addOption(Option option) {
    return this.optionDAO.addOption(option);
  }

  // 删除选项
  public boolean deleteOption(String id) {
    return this.optionDAO.deleteOption(id);
  }

  // 根据类型获取选项列表
  public List getOption(String type) {
    return this.optionDAO.getOption(type);
  }

  // 获取所有选项列表
  public List getOption() {
    return this.optionDAO.getOption();
  }
}
