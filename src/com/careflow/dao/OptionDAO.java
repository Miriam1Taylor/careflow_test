package com.careflow.dao;

import com.careflow.pojo.Option;

import java.util.List;

// OptionDAO接口定义了对系统选项（Option）进行数据库操作的方法
public interface OptionDAO {

  // 添加系统选项
  boolean addOption(Option paramOption);

  // 删除系统选项
  boolean deleteOption(String paramString);

  // 获取所有系统选项列表
  List getOption();

  // 根据参数获取系统选项列表
  List getOption(String paramString);
}
