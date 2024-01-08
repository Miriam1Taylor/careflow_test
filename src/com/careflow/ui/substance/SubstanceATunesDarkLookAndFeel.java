package com.careflow.ui.substance;

import org.jvnet.substance.SubstanceLookAndFeel;

// SubstanceATunesDarkLookAndFeel 类继承自 SubstanceLookAndFeel，用于设置 aTunes Dark 外观主题
public class SubstanceATunesDarkLookAndFeel extends SubstanceLookAndFeel {

  private static final long serialVersionUID = -3907225219153995877L;

  // 构造方法，初始化外观主题为 SubstanceATunesDarkSkin
  public SubstanceATunesDarkLookAndFeel() {
    super(new SubstanceATunesDarkSkin());
  }

  // 获取外观主题的 ID
  public String getID() {
    return "Substance aTunes Dark";
  }

  // 获取外观主题的名称
  public String getName() {
    return "Substance aTunes Dark";
  }
}
