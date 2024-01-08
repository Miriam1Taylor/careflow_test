package com.careflow.ui.substance;

import org.jvnet.substance.api.ComponentState;
import org.jvnet.substance.api.SubstanceColorScheme;
import org.jvnet.substance.api.SubstanceColorSchemeBundle;
import org.jvnet.substance.api.SubstanceSkin;
import org.jvnet.substance.colorscheme.DarkGrayColorScheme;
import org.jvnet.substance.colorscheme.EbonyColorScheme;
import org.jvnet.substance.colorscheme.TintColorScheme;
import org.jvnet.substance.painter.border.ClassicBorderPainter;
import org.jvnet.substance.painter.decoration.ArcDecorationPainter;
import org.jvnet.substance.painter.decoration.DecorationAreaType;
import org.jvnet.substance.painter.gradient.GlassGradientPainter;
import org.jvnet.substance.painter.highlight.ClassicHighlightPainter;
import org.jvnet.substance.shaper.ClassicButtonShaper;

// SubstanceATunesDarkSkin 类继承自 SubstanceSkin，用于定义 aTunes Dark 皮肤
public class SubstanceATunesDarkSkin extends SubstanceSkin {

  // 构造方法，定义 aTunes Dark 皮肤的外观特征
  public SubstanceATunesDarkSkin() {
    // 定义活动状态、默认状态和禁用状态的颜色方案
    SubstanceColorScheme activeScheme = new TintColorScheme(new EbonyColorScheme(), 0.1000000014901161D);
    SubstanceColorScheme defaultScheme = new EbonyColorScheme();
    SubstanceColorScheme disabledScheme = new TintColorScheme(new DarkGrayColorScheme(), 0.2D);

    // 创建颜色方案集合并注册
    SubstanceColorSchemeBundle defaultSchemeBundle = new SubstanceColorSchemeBundle(activeScheme, defaultScheme, disabledScheme);
    defaultSchemeBundle.registerHighlightColorScheme(activeScheme, 0.7F, new ComponentState[] { ComponentState.SELECTED });
    registerDecorationAreaSchemeBundle(defaultSchemeBundle, new DecorationAreaType[] { DecorationAreaType.NONE });

    SubstanceColorSchemeBundle specialSchemeBundle = new SubstanceColorSchemeBundle(activeScheme, activeScheme, disabledScheme);
    registerDecorationAreaSchemeBundle(specialSchemeBundle, new DecorationAreaType[] { DecorationAreaType.PRIMARY_TITLE_PANE, DecorationAreaType.SECONDARY_TITLE_PANE, DecorationAreaType.TOOLBAR,
            DecorationAreaType.FOOTER, DecorationAreaType.HEADER, DecorationAreaType.GENERAL });

    // 设置按钮形状、渐变绘制器、边框绘制器、装饰绘制器和高亮绘制器
    this.buttonShaper = new ClassicButtonShaper();
    this.gradientPainter = new GlassGradientPainter();
    this.borderPainter = new ClassicBorderPainter();
    this.decorationPainter = new ArcDecorationPainter();
    this.highlightPainter = new ClassicHighlightPainter();
  }

  // 获取皮肤的显示名称
  public String getDisplayName() {
    return "aTunes Dark skin";
  }
}
