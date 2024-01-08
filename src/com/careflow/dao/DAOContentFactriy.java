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

// ���ݷ��ʶ��󹤳���
public class DAOContentFactriy {

  // ��ȡStockDAOʵ��
  public static StockDAO getStockDAO() {
    return new StockDAOImpl();
  }

  // ��ȡFlowLogDAOʵ��
  public static FlowLogDAO getFlowLogDAO() {
    return new FlowLogDAOImpl();
  }

  // ��ȡConfigDAOʵ��
  public static ConfigDAO getConfigDAO() {
    return new ConfigDAOImpl();
  }

  // ��ȡOptionDAOʵ��
  public static OptionDAO getOptionDAO() {
    return new OptionDAOImpl();
  }

  // ��ȡPatchDAOʵ��
//  public static PatchDAO getPatchDAO() {
//    return new PatchDAOImpl();
//  }

  // ��ȡDailyExpensesDAOʵ��
  public static DailyExpensesDAO getDailyExpensesDAO() {
    return new DailyExpensesDAOImpl();
  }

  // ��ȡCustomDAOʵ��
  public static CustomDAO getCustomDAO() {
    return new CustomDAOImpl();
  }

  // ��ȡCustomtTypeDAOʵ��
  public static CustomtTypeDAO getCustomtTypeDAO() {
    return new CustomtTypeDAOImpl();
  }

  // ��ȡUserDAOʵ��
  public static UserDAO getUserDAO() {
    return new UserDAOImpl();
  }

  // ��ȡUserRightDAOʵ��
  public static UserRightDAO getUserRightDAO() {
    return new UserRightDAOImpl();
  }

  // ��ȡSuppliersDAOʵ��
  public static SuppliersDAO getSuppliersDAO() {
    return new SuppliersDAOImpl();
  }
}
