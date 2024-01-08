package com.careflow.ui.frame;

import com.careflow.moudle.FlowLogMoudle;
import com.careflow.moudle.MoudleContentFactry;
import com.careflow.ui.widget.SuggestTextField.SuggestData;

import java.util.List;

public class FlowSuggestDataImpl implements SuggestData {
  // ��ȡ��������
  public List<String> getData(String value) {
    // ͨ��������ȡ��ˮ��ģ��
    FlowLogMoudle flowLogMoudle = MoudleContentFactry.getFlowLogMoudle();

    // ��ȡ��ˮ����صĽ������ݣ���෵��10��
    return flowLogMoudle.getFlowlog(value, 10);
  }
}
