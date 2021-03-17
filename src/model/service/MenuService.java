/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import javax.swing.JButton;
import javax.swing.JPanel;
import rojerusan.RSButtonHover;

/**
 *
 * @author rubens
 */
public class MenuService {
    
    public void onMenuOpenOrCloseAction(String resposta, String menu1, String menu2, String menu3, String menu4,
                                        String menu5, String menu6, String menu7, String menu8, String menu9) {
        try {
            if (resposta.equals("close")) {
                System.out.println("Menu 1 Fechado");
            } else if (resposta.equals("open")) {
                System.out.println(menu1 + " Expandido");
                System.out.println(menu2 + " Fechado");
                System.out.println(menu3 + " Fechado");
                System.out.println(menu4 + " Fechado");
                System.out.println(menu5 + " Fechado");
                System.out.println(menu6 + " Fechado");
                System.out.println(menu7 + " Fechado");
                System.out.println(menu8 + " Fechado");
                System.out.println(menu9 + " Fechado");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public void onSubMenuOpenOrCloseAction(String resposta, String menu1, String menu2, String menu3, String menu4,
                                           String menu5, String menu6, String menu7, String menu8, String menu9) {
        try {
            if (resposta.equals("close")) {
                System.out.println("Menu 1 Fechado");
            } else if (resposta.equals("open")) {
                System.out.println(menu1 + " Expandido");
                System.out.println(menu2 + " Aberto");
                System.out.println(menu3 + " Fechado");
                System.out.println(menu4 + " Fechado");
                System.out.println(menu5 + " Fechado");
                System.out.println(menu6 + " Fechado");
                System.out.println(menu7 + " Fechado");
                System.out.println(menu8 + " Fechado");
                System.out.println(menu9 + " Fechado");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public void onButtonSwitchPanelAction(RSButtonHover button, JPanel panel1, JPanel panel2, JPanel panel3, JPanel panel4, JPanel panel5, 
                                    JPanel panel6, JPanel panel7, JPanel panel8, JPanel panel9, JPanel panel10, 
                                    JPanel panel11, JPanel panel12, JPanel panel13, JPanel panel14, JPanel panel15, 
                                    JPanel panel16, JPanel panel17) {
        panel1.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
        panel7.setVisible(false);
        panel8.setVisible(false);
        panel9.setVisible(false);
        panel10.setVisible(false);
        panel11.setVisible(false);
        panel12.setVisible(false);
        panel13.setVisible(false);
        panel14.setVisible(false);
        panel15.setVisible(false);
        panel16.setVisible(false);
        panel17.setVisible(false);
    }
    
}
