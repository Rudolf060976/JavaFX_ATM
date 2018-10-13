/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto2_atm.services;

import com.mycompany.proyecto2_atm.models.atm_config;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rafae
 */
public class Actualizaciones {
    
    
    public static void atmconfig(atm_config atmconf,Connection conn) {
    
         Statement st = null;
                      
        String sConsulta = "UPDATE atm_config SET ST_OUTOFSERVICE=" + Integer.toString(atmconf.getOutofservice() ? 1 : 0) + ",ADMIN_PIN='" + atmconf.getAdminpin() + "', CF_ALLOW_DEPOSITS=" + Integer.toString(atmconf.getAllowdeposits() ? 1:0) + ", CF_ALLOW_WITHDRAWALS=" + Integer.toString(atmconf.getAllowwithdrawals() ? 1:0) + ",ST_SHOW_CLOCK=" + Integer.toString(atmconf.getShowclock() ? 1:0) + ",MAX_AMOUNT_WITHDRAWAL=" + Double.toString(atmconf.getMaxamountwithdrawals()) + ",MAX_AMOUNT_DEPOSITS=" + Double.toString(atmconf.getMaxamountdeposits());
        
         try {
        
             st = conn.createStatement(); 
          
             st.executeUpdate(sConsulta);
                           
             
        }catch(SQLException ex) {
        
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        
                   
        }finally {
         
         
           try{
          
                  
                 if(st!=null) {st.close();}
                    
          
             }catch(SQLException ex) {}
          
         }
        
        
    
    }
    
    
}
