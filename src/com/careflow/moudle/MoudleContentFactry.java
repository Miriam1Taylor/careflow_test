package com.careflow.moudle;

import com.careflow.dao.DAOContentFactriy;
import com.careflow.moudle.impl.ConfigMoudleImpl;
import com.careflow.moudle.impl.CustomMoudleImpl;
import com.careflow.moudle.impl.CustomtTypeMoudleImpl;
import com.careflow.moudle.impl.DailyExpensesMoudleImpl;
import com.careflow.moudle.impl.FlowLogMoudleImpl;
import com.careflow.moudle.impl.OptionMoudleImpl;
//import com.careflow.moudle.impl.PatchMoudleImpl;
import com.careflow.moudle.impl.StockMoudleImpl;
import com.careflow.moudle.impl.SuppliersMoudleImpl;
import com.careflow.moudle.impl.UserMoudleIMpl;
import com.careflow.moudle.impl.UserRightMoudleImpl;

// MoudleContentFactry 类是一个模块工厂类，用于创建不同模块的实例
public class MoudleContentFactry {

  // 获取库存模块实例
  public static StockMoudle getStockMoudle() {
    StockMoudle stockMoudle = new StockMoudleImpl();
    stockMoudle.setStockDAO(DAOContentFactriy.getStockDAO());
    return stockMoudle;
  }

  // 获取流水日志模块实例
  public static FlowLogMoudle getFlowLogMoudle() {
    FlowLogMoudle slowLogMoudle = new FlowLogMoudleImpl();
    slowLogMoudle.setFlowLogDAO(DAOContentFactriy.getFlowLogDAO());
    slowLogMoudle.setStockDAO(DAOContentFactriy.getStockDAO());
    return slowLogMoudle;
  }

  // 获取配置模块实例
  public static ConfigMoudle getConfigMoudle() {
    ConfigMoudle slowLogMoudle = new ConfigMoudleImpl();
    slowLogMoudle.setConfigDAO(DAOContentFactriy.getConfigDAO());
    return slowLogMoudle;
  }

  // 获取选项模块实例
  public static OptionMoudle getOptionMoudle() {
    OptionMoudle slowLogMoudle = new OptionMoudleImpl();
    slowLogMoudle.setOptionDAO(DAOContentFactriy.getOptionDAO());
    return slowLogMoudle;
  }

  // 获取补丁模块实例
//  public static PatchMoudle getPatchMoudleImpl() {
//    PatchMoudleImpl patchMoudle = new PatchMoudleImpl();
//    patchMoudle.setPatchDAO(DAOContentFactriy.getPatchDAO());
//    return patchMoudle;
//  }

  // 获取每日开支模块实例
  public static DailyExpensesMoudle getDailyExpensesMoudle() {
    DailyExpensesMoudle expensesMoudle = new DailyExpensesMoudleImpl();
    expensesMoudle.setDailyExpensesDAO(DAOContentFactriy.getDailyExpensesDAO());
    return expensesMoudle;
  }

  // 获取客户模块实例
  public static CustomMoudle getCustomMoudle() {
    CustomMoudle customMoudle = new CustomMoudleImpl();
    customMoudle.setCustomDAO(DAOContentFactriy.getCustomDAO());
    return customMoudle;
  }

  // 获取客户类型模块实例
  public static CustomtTypeMoudle getCustomtTypeMoudle() {
    CustomtTypeMoudle customMoudle = new CustomtTypeMoudleImpl();
    customMoudle.setCustomtTypeDAO(DAOContentFactriy.getCustomtTypeDAO());
    return customMoudle;
  }

  // 获取用户模块实例
  public static UserMoudle getUserMoudle() {
    UserMoudle userMoudle = new UserMoudleIMpl();
    userMoudle.setUserDAO(DAOContentFactriy.getUserDAO());
    return userMoudle;
  }

  // 获取用户权限模块实例
  public static UserRightMoudle getUserRightMoudle() {
    UserRightMoudle userMoudle = new UserRightMoudleImpl();
    userMoudle.setUserRightDAO(DAOContentFactriy.getUserRightDAO());
    return userMoudle;
  }

  // 获取供应商模块实例
  public static SuppliersMoudle getSuppliersMoudle() {
    SuppliersMoudle suppliersMoudle = new SuppliersMoudleImpl();
    suppliersMoudle.setSuppliersDAO(DAOContentFactriy.getSuppliersDAO());
    return suppliersMoudle;
  }
}
