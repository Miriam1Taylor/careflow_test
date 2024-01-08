//package com.careflow.action;
//
//import java.awt.Desktop;
//import java.awt.event.ActionEvent;
//import java.io.IOException;
//import java.net.URI;
//import java.net.URISyntaxException;
//import javax.swing.AbstractAction;
//
//public class HelpAction extends AbstractAction {
//
//  // 当触发动作时调用的方法
//  public void actionPerformed(ActionEvent e) {
//    // 获取桌面环境
//    Desktop desktop = Desktop.getDesktop();
//
//    // 定义帮助页面的URI
//    URI netSite = null;
//    try {
//      netSite = new URI("http://code.google.com/p/bluebee-accounting-system/");
//    } catch (URISyntaxException ex) {
//      ex.printStackTrace();
//    }
//
//    // 在默认浏览器中打开帮助页面
//    try {
//      desktop.browse(netSite);
//    } catch (IOException ex) {
//      ex.printStackTrace();
//    }
//  }
//}
