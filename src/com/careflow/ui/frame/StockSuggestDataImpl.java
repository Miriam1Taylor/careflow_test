package com.careflow.ui.frame;

import com.careflow.moudle.MoudleContentFactry;
import com.careflow.moudle.StockMoudle;
import com.careflow.ui.widget.SuggestTextField.SuggestData;

import java.util.List;

// StockSuggestDataImpl 类实现了 SuggestData 接口，用于提供股票建议数据
public class StockSuggestDataImpl implements SuggestData {

  // 实现 SuggestData 接口的 getData 方法，根据输入的 value 获取股票建议数据
  public List<String> getData(String value) {
    // 获取 StockMoudle 的实例
    StockMoudle stockMoudle = MoudleContentFactry.getStockMoudle();

    // 调用 StockMoudle 中的方法，获取与输入 value 相关的股票建议数据（最多10个）
    return stockMoudle.getStockSuggestByCatNo(value, 10);
  }
}
