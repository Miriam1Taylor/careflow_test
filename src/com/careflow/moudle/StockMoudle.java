package com.careflow.moudle;

import com.careflow.dao.StockDAO;
import com.careflow.pojo.Stock;

import java.math.BigDecimal;
import java.util.List;

// StockMoudle 接口定义了与库存管理相关的方法
public abstract interface StockMoudle {

  // 设置 StockDAO 对象
  public abstract void setStockDAO(StockDAO paramStockDAO);

  // 添加库存记录
  public abstract boolean add(Stock paramStock);

  // 根据库存ID删除库存记录
  public abstract boolean delete(String paramString);

  // 获取今日的库存记录列表
  public abstract List getStockByTaday();

  // 更新库存数量，type 参数表示增加还是减少
  public abstract boolean updateSyAmount(String paramString1, double paramDouble, String paramString2);

  // 根据商品编号获取最近的库存记录
  public abstract Stock getLastStockByNo(String paramString);

  // 根据商品编号获取当前的库存记录
  public abstract Stock getStockByNo(String paramString);

  // 根据库存ID获取库存记录
  public abstract Stock getStockByID(String paramString);

  // 更新库存记录
  public abstract boolean updateStock(Stock paramStock);

  // 计算商品总库存数量
  public abstract double sumStockAmount(String paramString);

  // 计算商品可用库存数量
  public abstract double sumStockSyAmount(String paramString);

  // 获取按照时间范围排序的库存记录列表
  public abstract List getStockOrderBy(String paramString1, String paramString2);

  // 获取所有库存记录列表
  public abstract List getStock();

  // 获取商品编号的库存建议列表，max 参数表示最大建议数量
  public abstract List<String> getStockSuggestByCatNo(String paramString, int paramInt);

  // 分页获取库存记录列表
  public abstract List getStock(int paramInt1, int paramInt2);

  // 获取库存记录总数
  public abstract int getStockSize();

  // 计算商品按照参数条件的可用库存数量
  public abstract int sumStockSyAmount(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);

  // 获取按照参数条件的库存记录总数
  public abstract int getStockByParmSize(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);

  // 获取按照参数条件分页的库存记录列表
  public abstract List getStockByParm(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2);

  // 获取商品编号的库存记录总数
  public abstract int getStockByCatNoSize(String paramString);

  // 获取按照商品编号分页的库存记录列表
  public abstract List getStockByCatNo(String paramString, int paramInt1, int paramInt2);

  // 获取按照商品成本分页的库存记录列表
  public abstract List getStockByCatCost(String paramString, int paramInt1, int paramInt2);

  // 获取按照商品成本的库存记录总数
  public abstract int getStockByCatCostSize(String paramString);

  // 计算按照参数条件的可用库存成本总额
  public abstract BigDecimal sumStockCostAmount(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);

  // 计算按照参数条件的可用库存成本总额
  public abstract BigDecimal sumSyStockCostAmount(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5);

  // 获取按照时间范围分页的库存记录总数
  public abstract int getStockOrderSize(String paramString1, String paramString2);

  // 获取按照时间范围分页的库存记录列表
  public abstract List getStockOrderBy(String paramString1, String paramString2, int paramInt1, int paramInt2);

  // 获取按照库存报警条件分页的库存记录总数
  public abstract int getStockAlarmSize(String paramString, double paramDouble);

  // 获取按照库存报警条件分页的库存记录列表
  public abstract List getStockAlarm(String paramString, double paramDouble, int paramInt1, int paramInt2);
}
