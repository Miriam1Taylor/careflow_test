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
//  // ����������ʱ���õķ���
//  public void actionPerformed(ActionEvent e) {
//    // ��ȡ���滷��
//    Desktop desktop = Desktop.getDesktop();
//
//    // �������ҳ���URI
//    URI netSite = null;
//    try {
//      netSite = new URI("http://code.google.com/p/bluebee-accounting-system/");
//    } catch (URISyntaxException ex) {
//      ex.printStackTrace();
//    }
//
//    // ��Ĭ��������д򿪰���ҳ��
//    try {
//      desktop.browse(netSite);
//    } catch (IOException ex) {
//      ex.printStackTrace();
//    }
//  }
//}
