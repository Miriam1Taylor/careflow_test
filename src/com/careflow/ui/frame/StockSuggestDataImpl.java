package com.careflow.ui.frame;

import com.careflow.moudle.MoudleContentFactry;
import com.careflow.moudle.StockMoudle;
import com.careflow.ui.widget.SuggestTextField.SuggestData;

import java.util.List;

// StockSuggestDataImpl ��ʵ���� SuggestData �ӿڣ������ṩ��Ʊ��������
public class StockSuggestDataImpl implements SuggestData {

  // ʵ�� SuggestData �ӿڵ� getData ��������������� value ��ȡ��Ʊ��������
  public List<String> getData(String value) {
    // ��ȡ StockMoudle ��ʵ��
    StockMoudle stockMoudle = MoudleContentFactry.getStockMoudle();

    // ���� StockMoudle �еķ�������ȡ������ value ��صĹ�Ʊ�������ݣ����10����
    return stockMoudle.getStockSuggestByCatNo(value, 10);
  }
}
