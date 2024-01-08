package com.careflow.ui.frame;

import com.careflow.moudle.FlowLogMoudle;
import com.careflow.moudle.MoudleContentFactry;
import com.careflow.ui.widget.SuggestTextField.SuggestData;

import java.util.List;

public class FlowSuggestDataImpl implements SuggestData {
  // 获取建议数据
  public List<String> getData(String value) {
    // 通过工厂获取流水账模块
    FlowLogMoudle flowLogMoudle = MoudleContentFactry.getFlowLogMoudle();

    // 获取流水账相关的建议数据，最多返回10条
    return flowLogMoudle.getFlowlog(value, 10);
  }
}
