/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service.fc001;

import java.sql.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import model.entities.fc001.Financeiro_Titulos;

/**
 *
 * @author rubens
 */
public class FC002Service {
    public void onSwitchRadioButton(JRadioButton rb1, JRadioButton rb2) {
        if (rb1.isSelected()) {
            rb2.setSelected(false);
        } else {
            rb1.setSelected(true);
        }
    }
    
    public void onButtonClickedAction(JButton button, Date initialDate, Date finalDate, JRadioButton rb1, JRadioButton rb2) {
        String tipo;
        try {
            if (rb1.isSelected()) {
                tipo = "V";
            } else {
                tipo = "AV";
            }
            Financeiro_Titulos financeiroTitulos = new Financeiro_Titulos();
            List<Object> list = null;
            
            for (Object resltList : list) {
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
