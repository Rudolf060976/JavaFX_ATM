/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto2_atm.models;

import java.util.Formatter;
import javafx.scene.Node;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;


public class FormatedTableCellFactory<S,T> implements Callback<TableColumn<S,T>,TableCell<S,T>> {
       
    private int Lugaresdecimales;
    
    private final Formatter fmt = new Formatter();
    
    public void setLugaresdecimales(int decim){

        Lugaresdecimales = decim;
        
    }
   
    
    @Override
    public TableCell<S, T> call(TableColumn<S, T> param) {
      
        
        TableCell<S, T> cell = new TableCell<S, T>() {

            @Override
            public void updateItem(Object item, boolean empty) {
                if (item == getItem()) {
                    return;
                }
                super.updateItem((T) item, empty);
                if (item == null) {
                    super.setText(null);
                    super.setGraphic(null);
                    
                } else if (item instanceof Node) {
                    super.setText(null);
                    super.setGraphic((Node) item);
                } else {
                    Formatter fmt = new Formatter();
                    fmt.format("%,."+ Lugaresdecimales + "f", item);
                    super.setText(fmt.toString());
                    fmt.close();
                    // super.setText(item.toString());
                    super.setGraphic(null);
                }
            }
        };
        
        return cell;
    }

 
    
    
}
