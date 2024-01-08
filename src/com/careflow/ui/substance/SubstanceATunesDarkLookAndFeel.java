package com.careflow.ui.substance;

import org.jvnet.substance.SubstanceLookAndFeel;

// SubstanceATunesDarkLookAndFeel ��̳��� SubstanceLookAndFeel���������� aTunes Dark �������
public class SubstanceATunesDarkLookAndFeel extends SubstanceLookAndFeel {

  private static final long serialVersionUID = -3907225219153995877L;

  // ���췽������ʼ���������Ϊ SubstanceATunesDarkSkin
  public SubstanceATunesDarkLookAndFeel() {
    super(new SubstanceATunesDarkSkin());
  }

  // ��ȡ�������� ID
  public String getID() {
    return "Substance aTunes Dark";
  }

  // ��ȡ������������
  public String getName() {
    return "Substance aTunes Dark";
  }
}
