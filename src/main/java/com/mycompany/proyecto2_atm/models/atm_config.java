/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto2_atm.models;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author rafae
 */
public class atm_config {
    
    private final BooleanProperty outofservice;
    private final StringProperty adminpin;
    private final BooleanProperty allowdeposits;
    private final BooleanProperty allowwithdrawals;
    private final BooleanProperty showclock;
    private final DoubleProperty maxamountwithdrawals;
    private final DoubleProperty maxamountdeposits;
    
    
    public atm_config(boolean outofserv, String adminpn, boolean allowdep, boolean allowwith, boolean showclk, double maxamountwith,
            double maxamountdep) {
    
        outofservice = new SimpleBooleanProperty(outofserv);
        
        adminpin = new SimpleStringProperty(adminpn);
        
        allowdeposits = new SimpleBooleanProperty(allowdep);
        
        allowwithdrawals = new SimpleBooleanProperty(allowwith);
        
        showclock = new SimpleBooleanProperty(showclk);
        
        maxamountwithdrawals = new SimpleDoubleProperty(maxamountwith);
        
        maxamountdeposits = new SimpleDoubleProperty(maxamountdep);
            
    }
    
        public boolean getOutofservice() { return outofservice.get(); }    
    
        public void setOutofservice(boolean outos) { outofservice.set(outos);}
        
        public String getAdminpin() { return adminpin.get(); }
        
        public void setAdminpin(String pin) { adminpin.set(pin);}
    
        public boolean getAllowdeposits()  { return allowdeposits.get(); }
        
        public void setAllowdeposits(boolean allowdep) { allowdeposits.set(allowdep); }
        
        public boolean getAllowwithdrawals() { return allowwithdrawals.get(); }
        
        public void setAllowwithdrawals(boolean allowwith) { allowwithdrawals.set(allowwith); }
        
        public boolean getShowclock() { return showclock.get(); }
        
        public void setShowclock(boolean showclk) { showclock.set(showclk); }
        
        public double getMaxamountwithdrawals() { return maxamountwithdrawals.get(); }
        
        public void setMaxamountwithdrawals(double maxamoutwith) { maxamountwithdrawals.set(maxamoutwith); }
        
        public double getMaxamountdeposits() { return maxamountdeposits.get(); }
        
        public void setMaxamountdeposits(double maxamountdep) { maxamountdeposits.set(maxamountdep); }
        
    
}
