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

// MoudleContentFactry ����һ��ģ�鹤���࣬���ڴ�����ͬģ���ʵ��
public class MoudleContentFactry {

  // ��ȡ���ģ��ʵ��
  public static StockMoudle getStockMoudle() {
    StockMoudle stockMoudle = new StockMoudleImpl();
    stockMoudle.setStockDAO(DAOContentFactriy.getStockDAO());
    return stockMoudle;
  }

  // ��ȡ��ˮ��־ģ��ʵ��
  public static FlowLogMoudle getFlowLogMoudle() {
    FlowLogMoudle slowLogMoudle = new FlowLogMoudleImpl();
    slowLogMoudle.setFlowLogDAO(DAOContentFactriy.getFlowLogDAO());
    slowLogMoudle.setStockDAO(DAOContentFactriy.getStockDAO());
    return slowLogMoudle;
  }

  // ��ȡ����ģ��ʵ��
  public static ConfigMoudle getConfigMoudle() {
    ConfigMoudle slowLogMoudle = new ConfigMoudleImpl();
    slowLogMoudle.setConfigDAO(DAOContentFactriy.getConfigDAO());
    return slowLogMoudle;
  }

  // ��ȡѡ��ģ��ʵ��
  public static OptionMoudle getOptionMoudle() {
    OptionMoudle slowLogMoudle = new OptionMoudleImpl();
    slowLogMoudle.setOptionDAO(DAOContentFactriy.getOptionDAO());
    return slowLogMoudle;
  }

  // ��ȡ����ģ��ʵ��
//  public static PatchMoudle getPatchMoudleImpl() {
//    PatchMoudleImpl patchMoudle = new PatchMoudleImpl();
//    patchMoudle.setPatchDAO(DAOContentFactriy.getPatchDAO());
//    return patchMoudle;
//  }

  // ��ȡÿ�տ�֧ģ��ʵ��
  public static DailyExpensesMoudle getDailyExpensesMoudle() {
    DailyExpensesMoudle expensesMoudle = new DailyExpensesMoudleImpl();
    expensesMoudle.setDailyExpensesDAO(DAOContentFactriy.getDailyExpensesDAO());
    return expensesMoudle;
  }

  // ��ȡ�ͻ�ģ��ʵ��
  public static CustomMoudle getCustomMoudle() {
    CustomMoudle customMoudle = new CustomMoudleImpl();
    customMoudle.setCustomDAO(DAOContentFactriy.getCustomDAO());
    return customMoudle;
  }

  // ��ȡ�ͻ�����ģ��ʵ��
  public static CustomtTypeMoudle getCustomtTypeMoudle() {
    CustomtTypeMoudle customMoudle = new CustomtTypeMoudleImpl();
    customMoudle.setCustomtTypeDAO(DAOContentFactriy.getCustomtTypeDAO());
    return customMoudle;
  }

  // ��ȡ�û�ģ��ʵ��
  public static UserMoudle getUserMoudle() {
    UserMoudle userMoudle = new UserMoudleIMpl();
    userMoudle.setUserDAO(DAOContentFactriy.getUserDAO());
    return userMoudle;
  }

  // ��ȡ�û�Ȩ��ģ��ʵ��
  public static UserRightMoudle getUserRightMoudle() {
    UserRightMoudle userMoudle = new UserRightMoudleImpl();
    userMoudle.setUserRightDAO(DAOContentFactriy.getUserRightDAO());
    return userMoudle;
  }

  // ��ȡ��Ӧ��ģ��ʵ��
  public static SuppliersMoudle getSuppliersMoudle() {
    SuppliersMoudle suppliersMoudle = new SuppliersMoudleImpl();
    suppliersMoudle.setSuppliersDAO(DAOContentFactriy.getSuppliersDAO());
    return suppliersMoudle;
  }
}
