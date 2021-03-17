/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities.fc001;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.connection.JDBC;

/**
 *
 * @author rubens
 */
public class Financeiro_Titulos {
    
    // Variáveis para conexão
    private Connection connection;
    private PreparedStatement ps;
    private ResultSet rs;
    
    // Variáveis globais
    private Integer id;
    private Date sendDate; //Data de Envio
    private String entity; //Código de Entidade
    private Date initialIssue; //Data de emissão inicial
    private Date finalIssue; //Data de emissão final
    private String entityType; //Tipo de entidade Cliente = C e Representante = R
    private String shippingType; //Tipo de envio Títulos vencidos = V e Títulos a vencer = AV
    private Integer totalDelays;
    
    // Tipos de SQL
    private String select;
    private String insert;
    private String update;
    private String delete;
    
    
    public void closeConnection() {
        try {
            if (this.ps != null) {
                this.ps.close();
                this.connection.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    /**
     *
     * @return
     */
    public Connection openConnection() {
            return this.connection = new JDBC().open();
    }
    
    /*
        @Busca de envios de títulos por mês.
    */
    
    /*public List<Financeiro_Titulos> monthlyShipmentsByEntity(Date initialDate, Date finalDate, String entityType, String shippingType) {
        
    }*/
    
    public void saveShipping(Date sendDate, String entity, Date initialIssue, Date finalIssue, String entityType, String shippingType, Integer totalDalays) {
        try {
            this.insert = "INSERT INTO financeiro_titulos(envio, entidade, data_inicial, data_final, tipo_entidade, tipo_envio, total_atrasos) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?)";
            
            this.openConnection();
            this.ps = this.openConnection().prepareStatement(this.insert);
            this.rs = this.ps.executeQuery();
            
            this.ps.setDate(1, sendDate);
            this.ps.setString(2, entity);
            this.ps.setDate(3, initialIssue);
            this.ps.setDate(4, finalIssue);
            this.ps.setString(5, entityType);
            this.ps.setString(6, shippingType);
            this.ps.setInt(7, totalDalays);
            
            this.ps.execute();
            this.ps.close();
            this.closeConnection();

        } catch (SQLException e) {
            System.out.println(e);
        }
        
    }
}
