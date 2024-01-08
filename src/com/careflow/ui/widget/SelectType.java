//库存筛选界面
package com.careflow.ui.widget;

import com.careflow.moudle.CustomtTypeMoudle;
import com.careflow.moudle.MoudleContentFactry;
import com.careflow.moudle.OptionMoudle;
import com.careflow.pojo.CustomType;
import com.careflow.pojo.Option;
import com.careflow.pojo.User;

import java.util.List;

public class SelectType {

  // 获取指定类型的选项数组
  public static Object[] getOptions(String type) {
    Object[] ob = new Object[0];
    OptionMoudle optionMoudle = MoudleContentFactry.getOptionMoudle();
    List<Option> list = optionMoudle.getOption(type);
    if ((list != null) && (list.size() > 0)) {
      ob = new Object[list.size()];
      for (int i = 0; i < list.size(); i++) {
        Option option = list.get(i);
        ob[i] = new Options(option.getId(), option.getText());
      }
    }
    return ob;
  }

  // 获取带有 "全部类型" 的指定类型选项数组
  public static Object[] getOptionsWithAll(String type) {
    Object[] ob = new Object[0];
    OptionMoudle optionMoudle = MoudleContentFactry.getOptionMoudle();
    List<Option> list = optionMoudle.getOption(type);
    if ((list != null) && (list.size() > 0)) {
      ob = new Object[list.size() + 1];
      ob[0] = new Options("all", "全部类型");
      for (int i = 0; i < list.size(); i++) {
        Option option = list.get(i);
        ob[i + 1] = new Options(option.getId(), option.getText());
      }
    }
    return ob;
  }

  // 获取自定义类型的数组
  public static Object[] getCustomType() {
    Object[] ob = new Object[0];
    CustomtTypeMoudle typeMoudle = MoudleContentFactry.getCustomtTypeMoudle();
    List<CustomType> list = typeMoudle.getCustomtTypes();
    if ((list != null) && (list.size() > 0)) {
      ob = new Object[list.size()];
      for (int i = 0; i < list.size(); i++) {
        CustomType option = list.get(i);
        ob[i] = new Options(option.getTypename(), option.getTypename());
      }
    }
    return ob;
  }

  // 获取用户列表数组
  public static Object[] getUserList() {
    Object[] ob = new Object[0];
    List<User> list = MoudleContentFactry.getUserMoudle().getUser("Manage");
    if (!list.isEmpty()) {
      ob = new Object[list.size()];
      for (int i = 0; i < list.size(); i++) {
        User user = list.get(i);
        ob[i] = user;
      }
    }
    return ob;
  }

  // 获取库存报警类型的数组
  public static Object[] getStockAlarmTypes() {
    Options option1 = new Options("<", "库存不足");
    Options option2 = new Options(">", "库存过多");
    return new Object[] { option1, option2 };
  }

  // 检查给定的文本是否匹配特定类型的选项
  public static boolean isequals(String text, String type) {
    OptionMoudle optionMoudle = MoudleContentFactry.getOptionMoudle();
    List<Option> list = optionMoudle.getOption(type);
    boolean is = false;
    if ((list != null) && (list.size() > 0)) {
      for (int i = 0; i < list.size(); i++) {
        Option option = list.get(i);
        if (text.equals(option.getText())) {
          is = true;
          break;
        }
      }
    }
    return is;
  }
}
