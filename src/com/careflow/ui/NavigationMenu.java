//���˵�
package com.careflow.ui;

import com.careflow.Constant;
import com.careflow.SysEnv;
import com.careflow.action.AboutAction;
import com.careflow.action.ActionManager;
import com.careflow.action.CgThAction;
import com.careflow.action.CustomAction;
import com.careflow.action.FlowAction;
import com.careflow.action.GkJlAction;
import com.careflow.action.GkThAction;
import com.careflow.action.GuDZcPanelAction;
//import com.careflow.action.HelpAction;
import com.careflow.action.KCStockAction;
import com.careflow.action.OptionTypeAction;
import com.careflow.action.PassSetAction;
import com.careflow.action.PasswordAction;
import com.careflow.action.RcZcAction;
import com.careflow.action.SellHelperActoin;
import com.careflow.action.StockAction;
import com.careflow.action.SuppliersAction;
//import com.careflow.action.UpdateAction;
import com.careflow.action.YyeTjAction;
import com.careflow.action.ZcTjAction;
import com.careflow.moudle.MoudleContentFactry;
import com.careflow.moudle.UserRightMoudle;
import com.careflow.pojo.UserRight;
import com.careflow.ui.frame.AuthorityPanel;
import com.careflow.ui.frame.CgthPane;
import com.careflow.ui.frame.CurtainPane;
import com.careflow.ui.frame.CustomPanel;
import com.careflow.ui.frame.FlowPanel;
import com.careflow.ui.frame.GkJLPanel;
import com.careflow.ui.frame.GkthPane;
import com.careflow.ui.frame.GuDZcPanel;
import com.careflow.ui.frame.KuCTjPanel;
import com.careflow.ui.frame.ListPane;
import com.careflow.ui.frame.OptionsTypePanel;
import com.careflow.ui.frame.PageContainer;
import com.careflow.ui.frame.RcZcPanel;
import com.careflow.ui.frame.SellHelperPanel;
import com.careflow.ui.frame.SellOrderpane;
//import com.careflow.ui.frame.SettiingPanel;
import com.careflow.ui.frame.StockPanel;
import com.careflow.ui.frame.YyeTjPanel;
import com.careflow.ui.frame.ZcTjPanel;
import com.careflow.ui.skin.ImageManager;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class NavigationMenu
{
  private static NavigationMenu navigationMenu = new NavigationMenu();

  public static NavigationMenu getInstance()
  {
    return navigationMenu;
  }

  public JPanel getMenu() {
    JPanel cutainPane = new JPanel(new BorderLayout());
    CurtainPane cp = getCurtainPane();
    cp.setAnimated(true);
    cp.setSelectedPane(0);
    cutainPane.add(cp, "Center");
    return cutainPane;
  }

  private CurtainPane getCurtainPane()
  {
    CurtainPane fp = new CurtainPane();
    fp.setAnimated(true);
    String longinname = SysEnv.getInstance().getLoginUser();
    String[] right = (String[])null;
    if ("10000".equals(longinname)) {
      right = Constant.RIGHT;
    } else {
      UserRightMoudle rightMoudle = MoudleContentFactry.getUserRightMoudle();
      UserRight userRight = rightMoudle.get(longinname);
      right = userRight.getRight().split(",");
    }
    boolean isxiaos = ("true".equals(right[0])) || ("true".equals(right[1])) || ("true".equals(right[2])) || ("true".equals(right[11]));
    if (isxiaos) {
      fp.addPane("����", ImageManager.getImageIconByShortName("money_dollar.png"), getSellPane(right), isxiaos);
    }
    boolean isjinh = ("true".equals(right[3])) || ("true".equals(right[4])) || ((right.length == 16) && ("true".equals(right[15])));
    if (isjinh) {
      fp.addPane("����", ImageManager.getImageIconByShortName("69.png"), getCgjhPane(right), isjinh);
    }
    boolean iszhicu = ("true".equals(right[5])) || ("true".equals(right[6])) || ((right.length == 17) && ("true".equals(right[16])));
    if (iszhicu) {
      fp.addPane("��֧", ImageManager.getImageIconByShortName("coins_delete.png"), getZCPane(right), iszhicu);
    }
    boolean istongj = ("true".equals(right[7])) || ("true".equals(right[8])) || ("true".equals(right[9])) || 
      ("true".equals(right[10])) || (
      (right.length > 18) && ("true".equals(right[17])));
    if (istongj) {
      fp.addPane("ͳ��", ImageManager.getImageIconByShortName("calculator.png"), getTJPane(right), istongj);
    }

    fp.addPane("����", ImageManager.getImageIconByShortName("applications-system.png"), getSetinngPane(right), true);

    fp.addPane("����", ImageManager.getImageIconByShortName("help.png"), getHelpPane(), true);
    setDefaultPage(right);
    return fp;
  }

  private ListPane getSellPane(String[] right) {
    ListPane p = new ListPane();
    p.addItem("��Ʒ����", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(SellHelperActoin.class), "true".equals(right[0]));
    p.addItem("ÿ����ˮ", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(FlowAction.class), "true".equals(right[1]));
    p.addItem("�˿��˻�", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(GkThAction.class), "true".equals(right[2]));
    p.addItem("�ͻ�����", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(CustomAction.class), "true".equals(right[11]));

    p.setSize(185, 86);
    return p;
  }

  private ListPane getCgjhPane(String[] right)
  {
    ListPane p = new ListPane();
    p.addItem("�ɹ�����", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(StockAction.class), "true".equals(right[3]));
    p.addItem("�ɹ��˻�", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(CgThAction.class), "true".equals(right[4]));
    p.addItem("��Ӧ������", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(SuppliersAction.class), "true".equals(right[15]));
    p.setSize(185, 86);
    return p;
  }

  private ListPane getZCPane(String[] right) {
    ListPane p = new ListPane();
    p.addItem("�ճ���֧", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(RcZcAction.class), "true".equals(right[5]));
    p.addItem("�̶�֧��", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(GuDZcPanelAction.class), "true".equals(right[6]));

    p.setSize(185, 86);
    return p;
  }

  private ListPane getTJPane(String[] right) {
    ListPane p = new ListPane();
    p.addItem("���ͳ��", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(KCStockAction.class), "true".equals(right[7]));
    p.addItem("��֧ͳ��", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(ZcTjAction.class), "true".equals(right[8]));
    p.addItem("Ӫҵ��ͳ��", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(YyeTjAction.class), "true".equals(right[9]));
//    p.addItem("��������ͳ��", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(SellOrderAction.class), "true".equals(right[10]));
    p.addItem("�ͻ�����ͳ��", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(GkJlAction.class), "true".equals(right[17]));
    p.setSize(185, 86);
    return p;
  }

  private ListPane getSetinngPane(String[] right) {
    ListPane p = new ListPane();
//    p.addItem("ϵͳ����", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(SettingAction.class), "true".equals(right[12]));
    p.addItem("�û�Ȩ��", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(PassSetAction.class), "true".equals(right[13]));
    p.addItem("�����޸�", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(PasswordAction.class), true);
    p.addItem("��������", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(OptionTypeAction.class), "true".equals(right[14]));
    p.setSize(185, 86);
    return p;
  }

  private ListPane getHelpPane() {
	    ListPane p = new ListPane();
//	    p.addItem("��������", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(UpdateAction.class), true);
//	    p.addItem("���ʹ��", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(HelpAction.class), true);
	    p.addItem("Careflow ERP", ImageManager.getImageIconByShortName("table_go.png"), ActionManager.getAction(AboutAction.class), true);
	    p.setSize(185, 86);
	    return p;
	  }
  private void setDefaultPage(String[] right)
  {
    if ("true".equals(right[0]))
      PageContainer.getInstance().setDefaultPage(SellHelperPanel.getInstance());
    else if ("true".equals(right[1])) {
      PageContainer.getInstance().setDefaultPage(FlowPanel.getInstance());
    }
    else if ("true".equals(right[2])) {
      PageContainer.getInstance().setDefaultPage(GkthPane.getInstance());
    }
    else if ("true".equals(right[3])) {
      PageContainer.getInstance().setDefaultPage(StockPanel.getInstance());
    }
    else if ("true".equals(right[4])) {
      PageContainer.getInstance().setDefaultPage(CgthPane.getInstance());
    }
    else if ("true".equals(right[5])) {
      PageContainer.getInstance().setDefaultPage(RcZcPanel.getInstance());
    }
    else if ("true".equals(right[6])) {
      PageContainer.getInstance().setDefaultPage(GuDZcPanel.getInstance());
    }
    else if ("true".equals(right[7])) {
      PageContainer.getInstance().setDefaultPage(KuCTjPanel.getInstance());
    }
    else if ("true".equals(right[8])) {
      PageContainer.getInstance().setDefaultPage(ZcTjPanel.getInstance());
    }
    else if ("true".equals(right[9])) {
      PageContainer.getInstance().setDefaultPage(YyeTjPanel.getInstance());
    }
    else if ("true".equals(right[10])) {
      PageContainer.getInstance().setDefaultPage(SellOrderpane.getInstance());
    }
    else if ("true".equals(right[11])) {
      PageContainer.getInstance().setDefaultPage(CustomPanel.getInstance());
    }
    else if ("true".equals(right[12])) {
//      PageContainer.getInstance().setDefaultPage(SettiingPanel.getInstance());
    }
    else if ("true".equals(right[13])) {
      PageContainer.getInstance().setDefaultPage(AuthorityPanel.getInstance());
    }
    else if ("true".equals(right[14]))
      PageContainer.getInstance().setDefaultPage(OptionsTypePanel.getInstance());
    else if ("true".equals(right[15]))
      PageContainer.getInstance().setDefaultPage(GkJLPanel.getInstance());
    else if ("true".equals(right[15]))
      PageContainer.getInstance().setDefaultPage(GkJLPanel.getInstance());
  }
}