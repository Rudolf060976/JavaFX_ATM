/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto2_atm;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import com.mycompany.proyecto2_atm.models.FormatedTableCellFactory;
import com.mycompany.proyecto2_atm.models.atm_config;
import com.mycompany.proyecto2_atm.models.atm_currency_status;
import com.mycompany.proyecto2_atm.services.Actualizaciones;
import com.mycompany.proyecto2_atm.services.Conexion;
import com.mycompany.proyecto2_atm.services.Consultas;
import com.mycompany.proyecto2_atm.services.Dialogs;

/**
 * FXML Controller class
 *
 * @author rafae
 */
public class FXML_ATMConfigController implements Initializable {

    private ObservableList<atm_currency_status> listacurstatus;
    
    private ObservableList<atm_config> listaatmconfig;
    
    @FXML
    private RadioButton radioALLOWDEPNO;
    @FXML
    private RadioButton radioALLOWDEPYES;
    @FXML
    private RadioButton radioALLOWWITHNO;
    @FXML
    private RadioButton radioALLOWWITHYES;
    @FXML
    private RadioButton radioSHOWCLKNO;
    @FXML
    private RadioButton radioSHOWCLKYES;
    @FXML
    private TextField txtADMINPIN;
    @FXML
    private CheckBox chkOUTOFSERVICE;
    @FXML
    private TextField txtMAXAMOUNTWITH;
    @FXML
    private TextField txtMAXAMOUNTDEP;
    @FXML
    private TableView<atm_currency_status> tblCURRENCY;
    @FXML
    private Button btnIN;
    @FXML
    private Button btnOUT;
    @FXML
    private Button btnEXIT;
    @FXML
    private Button btnAPPLY;
    @FXML
    private Button btnLAUNCH;
    @FXML
    private TableColumn<atm_currency_status,Integer> colID;
    @FXML
    private TableColumn<atm_currency_status,Integer> colIDDENOMINATION;
    @FXML
    private TableColumn<atm_currency_status,Double> colAMOUNT;
    @FXML
    private TableColumn<atm_currency_status,Double> colQUANTITY;

    
    
    @FXML
    void handlebtnAPPLYAction(ActionEvent event) {

        
        SaveConfigSettings();
        
    }

    @FXML
    void handlebtnEXITAction(ActionEvent event) {

        javafx.application.Platform.exit();
        
        
    }

    @FXML
    void handlebtnINAction(ActionEvent event) {

    }

    @FXML
    void handlebtnLAUNCHAction(ActionEvent event) {

    }

    @FXML
    void handlebtnOUTAction(ActionEvent event) {

    }

       
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        // First, we are going to populate tblCURRENCY with the data in Mysql Table atm_currency_status
        
        listacurstatus = getAtmCurrencies();
        
        tblCURRENCY.setItems(listacurstatus);
        
        tblCURRENCY.setEditable(false);
        
        
        colID.setCellValueFactory(new PropertyValueFactory<>("Id"));
        
        colID.setVisible(false);
        
        colIDDENOMINATION.setCellValueFactory(new PropertyValueFactory<>("Iddenomination"));
        
        colIDDENOMINATION.setVisible(false);
        
        colAMOUNT.setCellValueFactory(new PropertyValueFactory<>("Amount"));
        
        colQUANTITY.setCellValueFactory(new PropertyValueFactory<>("Quantity"));
        
        FormatedTableCellFactory<atm_currency_status,Double> fmt = new FormatedTableCellFactory<>();
        
        fmt.setLugaresdecimales(0);
        
        colAMOUNT.setCellFactory(fmt);
        colQUANTITY.setCellFactory(fmt);
        
        // Next, we load the config settings from Table atm_config
        
        listaatmconfig = getAtmConfig();
        
        atm_config atmconf = listaatmconfig.get(0);  // Taking the first row.
      
        LoadConfigSettings(atmconf);
                
        
    }    
    
    private ObservableList<atm_currency_status> getAtmCurrencies() {
    
        Connection conn = Conexion.obtener();
        
               
        return Consultas.currencies_atm(conn);
           
    }
    
    private ObservableList<atm_config> getAtmConfig() {
    
        Connection conn = Conexion.obtener();
              
        
        return Consultas.configs_atm(conn);
          
       
   
    }
   
    
    private void LoadConfigSettings(atm_config atmconf) {
        
          
        chkOUTOFSERVICE.setSelected(atmconf.getOutofservice());
       
        txtADMINPIN.setText(atmconf.getAdminpin());

        radioALLOWDEPYES.setSelected(atmconf.getAllowdeposits());
        
        radioALLOWDEPNO.setSelected(!atmconf.getAllowdeposits());
        
        radioALLOWWITHYES.setSelected(atmconf.getAllowwithdrawals());
        
        radioALLOWWITHNO.setSelected(!atmconf.getAllowwithdrawals());
        
        radioSHOWCLKYES.setSelected(atmconf.getShowclock());
        
        radioSHOWCLKNO.setSelected(!atmconf.getShowclock());
        
        txtMAXAMOUNTWITH.setText(String.valueOf(atmconf.getMaxamountwithdrawals()));
        
        txtMAXAMOUNTDEP.setText(Double.toString(atmconf.getMaxamountdeposits()));
                
    }
      
    private void SaveConfigSettings() {
        
       atm_config atmc = new atm_config(chkOUTOFSERVICE.isSelected(),txtADMINPIN.getText(),radioALLOWDEPYES.isSelected(),radioALLOWWITHYES.isSelected(),radioSHOWCLKYES.isSelected(),Double.parseDouble(txtMAXAMOUNTWITH.getText()),Double.parseDouble(txtMAXAMOUNTDEP.getText()));
        
       Connection conn = Conexion.obtener();
       
       Actualizaciones.atmconfig(atmc, conn);
        
       Dialogs.OperationCompleted();
      
       
    }
    
    
}
