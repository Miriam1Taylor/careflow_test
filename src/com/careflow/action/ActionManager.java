package com.careflow.action;

import java.util.HashMap;
import java.util.Map;
import javax.swing.Action;

public class ActionManager {

  // �洢Action������ʵ����ӳ���ϵ
  private static Map<Class<? extends Action>, Action> map = new HashMap();

  // ��ȡActionʵ�������ʵ���������򴴽����洢
  public static Action getAction(Class<? extends Action> clazz) {
    Action action = (Action) map.get(clazz);
    if (action == null) {
      try {
        // ʹ�÷��䴴��Actionʵ��
        action = (Action) clazz.newInstance();
        map.put(clazz, action);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return action;
  }

  // ����һ��Action������״̬
  public static void setEnabledActions(boolean enable, Class<? extends Action>[] actions) {
    for (Class action : actions) {
      // ��ȡActionʵ������������״̬
      getAction(action).setEnabled(enable);
    }
  }

  // ��ֱֹ�ӵ��õı�������
  protected static void error(Object obj) {
    // ��ʵ�֣���ֱֹ�ӵ���
  }
}
