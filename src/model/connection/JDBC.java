/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rubens
 */
public class JDBC {
    private Connection connection;
            
    public Connection open() {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://192.168.0.5:5432/zeno?autoReconnect=true","postgres","postgres");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return connection;
    }
}
