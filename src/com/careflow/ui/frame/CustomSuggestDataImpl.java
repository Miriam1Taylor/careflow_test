package com.careflow.ui.frame;

import com.careflow.moudle.CustomMoudle;
import com.careflow.moudle.MoudleContentFactry;
import com.careflow.pojo.Custom;
import com.careflow.ui.widget.SuggestTextField.SuggestData;

import java.util.ArrayList;
import java.util.List;

// CustomSuggestDataImpl �࣬ʵ���� SuggestData �ӿڣ������ṩ�ͻ���������
public class CustomSuggestDataImpl implements SuggestData {

  // ���������ֵ��ȡ�ͻ���������
  public List<String> getData(String value) {
    // ��ȡ�ͻ�ģ��ʵ��
    CustomMoudle customMoudle = MoudleContentFactry.getCustomMoudle();

    // ��ȡ�ͻ������б�
    List list = customMoudle.getCustoms(value, 10);
    if (list != null) {
      // ���ͻ�����ת��Ϊ�ַ�����ʽ
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
