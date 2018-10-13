/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto2_atm.services;

import java.sql.*;
      
/***
 * @author RAFAEL URBINA
 */
public class Conexion implements IConstantesBD{
   
    private static Connection conn = null;
    
    public static Connection obtener()  {
        
        if (conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                
                conn = DriverManager.getConnection("jdbc:mysql://" + HOST_DB + ":3306/" + NOMBRE_DB,LOGIN_DB,PASSW_DB);
           
            } catch (SQLException ex) {
              
                System.out.println("SQLException:" + ex.getMessage());
                System.out.println("SQLException:" + ex.getSQLState());
                System.out.println("SQLException:" + ex.getErrorCode());
                
            } catch (ClassNotFoundException ex) {
                
               System.out.println("ClassNotFoundException:" + ex.getMessage());
                
            }
                         
        }
          
    return conn;  
    }
              
    public static void cerrar() {
                    
        try {
           
            if (conn != null) {
            conn.close();
        }
            
            
        } catch(SQLException ex) {
            
             System.out.println("SQLException:" + ex.getMessage());
                System.out.println("SQLException:" + ex.getSQLState());
                System.out.println("SQLException:" + ex.getErrorCode());
        }
        
        
       
    }
       
}
