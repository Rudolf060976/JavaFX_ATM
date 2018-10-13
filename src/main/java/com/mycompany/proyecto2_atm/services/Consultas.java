/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto2_atm.services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import com.mycompany.proyecto2_atm.models.atm_config;
import com.mycompany.proyecto2_atm.models.atm_currency_status;

/**
 *
 * @author rafae
 */
public class Consultas {
    
    
    public static ObservableList<atm_currency_status> currencies_atm(Connection con) {
        
        ObservableList<atm_currency_status> lista = FXCollections.observableArrayList();
        
        ResultSet rs = null;
        Statement st = null;
        
        String sConsulta = "SELECT A.*,B.DENOMINATION_AMOUNT FROM atm_currency_status A INNER JOIN currency_denominations B ON A.idDENOMINATION=B.idDENOMINATION ORDER BY A.ID";
        
        try {
            
            st = con.createStatement();
            
            rs = st.executeQuery(sConsulta);
            
            while(rs.next()) {
                
                lista.add(new atm_currency_status(rs.getInt("ID"),rs.getInt("idDENOMINATION"),rs.getDouble("QUANTITY"),rs.getDouble("DENOMINATION_AMOUNT")));
                
            }
            
            return lista;
            
        }catch (SQLException ex) {
        
             System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
      
            return null;
        
        }finally {
            
             try{
          
          if(rs!=null) { rs.close();}
          
          if(st!=null) {st.close();}
                    
          
          }catch(SQLException ex) {}
            
        }
        
        
        
    }
    
    
    
    public static ObservableList<atm_config> configs_atm(Connection con) {
        
        ObservableList<atm_config> lista = FXCollections.observableArrayList();
        
        ResultSet rs = null;
        Statement st = null;
        
        String sConsulta = "SELECT * FROM atm_config ORDER BY idCONFIG";
        
        try {
            
            st = con.createStatement();
            
            rs = st.executeQuery(sConsulta);
            
            while(rs.next()) {
                
                lista.add(new atm_config(rs.getBoolean("ST_OUTOFSERVICE"),rs.getString("ADMIN_PIN"),rs.getBoolean("CF_ALLOW_DEPOSITS"),rs.getBoolean("CF_ALLOW_WITHDRAWALS"),rs.getBoolean("ST_SHOW_CLOCK"),rs.getDouble("MAX_AMOUNT_WITHDRAWAL"),rs.getDouble("MAX_AMOUNT_DEPOSITS")));
                
            }
            
            return lista;
            
        }catch (SQLException ex) {
        
             System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
      
            return null;
        
        }finally {
            
             try{
          
          if(rs!=null) { rs.close();}
          
          if(st!=null) {st.close();}
                    
          
          }catch(SQLException ex) {}
            
        }
        
        
        
    }
    
    
    
}
