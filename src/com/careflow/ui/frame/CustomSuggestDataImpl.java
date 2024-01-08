package com.careflow.ui.frame;

import com.careflow.moudle.CustomMoudle;
import com.careflow.moudle.MoudleContentFactry;
import com.careflow.pojo.Custom;
import com.careflow.ui.widget.SuggestTextField.SuggestData;

import java.util.ArrayList;
import java.util.List;

// CustomSuggestDataImpl 类，实现了 SuggestData 接口，用于提供客户建议数据
public class CustomSuggestDataImpl implements SuggestData {

  // 根据输入的值获取客户建议数据
  public List<String> getData(String value) {
    // 获取客户模块实例
    CustomMoudle customMoudle = MoudleContentFactry.getCustomMoudle();

    // 获取客户数据列表
    List list = customMoudle.getCustoms(value, 10);
    if (list != null) {
      // 将客户对象转换为字符串形式
      ArrayList s = new ArrayList();
      for (int i = 0; i < list.size(); i++) {
        Custom custom = (Custom)list.get(i);
        s.add(custom.toString());
      }
      list = s;
    }

    return list;
  }
}
