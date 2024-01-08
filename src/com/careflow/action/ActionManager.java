package com.careflow.action;

import java.util.HashMap;
import java.util.Map;
import javax.swing.Action;

public class ActionManager {

  // 存储Action类与其实例的映射关系
  private static Map<Class<? extends Action>, Action> map = new HashMap();

  // 获取Action实例，如果实例不存在则创建并存储
  public static Action getAction(Class<? extends Action> clazz) {
    Action action = (Action) map.get(clazz);
    if (action == null) {
      try {
        // 使用反射创建Action实例
        action = (Action) clazz.newInstance();
        map.put(clazz, action);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return action;
  }

  // 设置一组Action的启用状态
  public static void setEnabledActions(boolean enable, Class<? extends Action>[] actions) {
    for (Class action : actions) {
      // 获取Action实例并设置启用状态
      getAction(action).setEnabled(enable);
    }
  }

  // 防止直接调用的保护方法
  protected static void error(Object obj) {
    // 空实现，防止直接调用
  }
}
