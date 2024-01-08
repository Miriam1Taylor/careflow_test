package com.careflow.dao;

import com.careflow.dao.impl.ConfigDAOImpl;
import com.careflow.dao.impl.CustomDAOImpl;
import com.careflow.dao.impl.CustomtTypeDAOImpl;
import com.careflow.dao.impl.DailyExpensesDAOImpl;
import com.careflow.dao.impl.FlowLogDAOImpl;
import com.careflow.dao.impl.OptionDAOImpl;
//import com.careflow.dao.impl.PatchDAOImpl;
import com.careflow.dao.impl.StockDAOImpl;
import com.careflow.dao.impl.SuppliersDAOImpl;
import com.careflow.dao.impl.UserDAOImpl;
import com.careflow.dao.impl.UserRightDAOImpl;

// 数据访问对象工厂类
public class DAOContentFactriy {

  // 获取StockDAO实例
  public static StockDAO getStockDAO() {
    return new StockDAOImpl();
  }

  // 获取FlowLogDAO实例
  public static FlowLogDAO getFlowLogDAO() {
    return new FlowLogDAOImpl();
  }

  // 获取ConfigDAO实例
  public static ConfigDAO getConfigDAO() {
    return new ConfigDAOImpl();
  }

  // 获取OptionDAO实例
  public static OptionDAO getOptionDAO() {
    return new OptionDAOImpl();
  }

  // 获取PatchDAO实例
//  public static PatchDAO getPatchDAO() {
//    return new PatchDAOImpl();
//  }

  // 获取DailyExpensesDAO实例
  public static DailyExpensesDAO getDailyExpensesDAO() {
    return new DailyExpensesDAOImpl();
  }

  // 获取CustomDAO实例
  public static CustomDAO getCustomDAO() {
    return new CustomDAOImpl();
  }

  // 获取CustomtTypeDAO实例
  public static CustomtTypeDAO getCustomtTypeDAO() {
    return new CustomtTypeDAOImpl();
  }

  // 获取UserDAO实例
  public static UserDAO getUserDAO() {
    return new UserDAOImpl();
  }

  // 获取UserRightDAO实例
  public static UserRightDAO getUserRightDAO() {
    return new UserRightDAOImpl();
  }

  // 获取SuppliersDAO实例
  public static SuppliersDAO getSuppliersDAO() {
    return new SuppliersDAOImpl();
  }
}
