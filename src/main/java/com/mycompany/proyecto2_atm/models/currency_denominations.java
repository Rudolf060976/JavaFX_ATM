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
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author rafae
 */
public class currency_denominations {
    
    private final IntegerProperty iddenom;
    private final StringProperty coddenom;
    private final DoubleProperty amountdenom;
    
    
    public currency_denominations(int idden, String codden, double amount) {
        
        iddenom = new SimpleIntegerProperty(idden);
        coddenom = new SimpleStringProperty(codden);
        amountdenom = new SimpleDoubleProperty(amount);
                
    }
    
    public int getIddenom() { return iddenom.get(); }
    
    public void setIddenom(int idden) { iddenom.set(idden); }
    
    public String getCoddenom()  { return coddenom.get(); }
    
    public void setCoddenom(String codden) { coddenom.set(codden); }
    
    public double getAmountdenom() { return amountdenom.get(); }
    
    public void setAmountdenom(double amountden) { amountdenom.set(amountden); }
    
    
}
