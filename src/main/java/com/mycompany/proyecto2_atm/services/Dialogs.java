/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto2_atm.services;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 *
 * @author rafae
 */
public class Dialogs {
    
    public static void OperationCompleted() {
    
    
        Alert alert = new Alert(AlertType.INFORMATION);
        
        alert.setTitle("Information");
        alert.setHeaderText(null);
        alert.setContentText("Operation Completed!!");
    
        alert.showAndWait();
        
    }
    
    
    
}
