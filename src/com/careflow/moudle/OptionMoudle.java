package com.careflow.moudle;

import com.careflow.dao.OptionDAO;
import com.careflow.pojo.Option;

import java.util.List;

// OptionMoudle 接口定义了对选项进行操作的方法
public abstract interface OptionMoudle {

  // 设置 OptionDAO 实例
  public abstract void setOptionDAO(OptionDAO paramOptionDAO);

  // 添加选项
  public abstract boolean addOption(Option paramOption);

  // 删除选项
  public abstract boolean deleteOption(String paramString);

  // 获取所有选项列表
  public abstract List getOption();

  // 根据类型获取选项列表
  public abstract List getOption(String paramString);
}
