/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto2_atm.models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author rafae
 */
public class atm_currency_status {
    
    private final IntegerProperty id;
    private final IntegerProperty iddenomination;
    private final DoubleProperty quantity;
    private final DoubleProperty amount;
    
    public atm_currency_status(int id0, int idden,double quant, double amou ){
        
        id = new SimpleIntegerProperty(id0);
        iddenomination = new SimpleIntegerProperty(idden);
        quantity = new SimpleDoubleProperty(quant);
        amount = new SimpleDoubleProperty(amou);
                
    }
    
    public int getId() { return id.get(); }
    public void setId(int id1) { id.set(id1); }
    
    public int getIddenomination() { return iddenomination.get(); }
    public void setIddenomination(int idden) { iddenomination.set(idden); }
    
    public double getQuantity() { return quantity.get(); }
    public void setQuantity(double quan) { quantity.set(quan); }
    
    public double getAmount() { return amount.get(); }
    
    public void setAmount(double amou) { amount.set(amou); }  
      
    
}
