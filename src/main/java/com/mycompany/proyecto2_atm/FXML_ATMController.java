/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto2_atm;

import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import javafx.animation.FillTransition;
import javafx.animation.ParallelTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 *
 * @author rafae
 */
public class FXML_ATMController implements Initializable {
    
    @FXML
    private Button btnRIGHT1;
    @FXML
    private Button btnRIGHT2;
    @FXML
    private Button btnRIGHT3;
    @FXML
    private Button btnRIGHT4;
    @FXML
    private Button btnLEFT1;
    @FXML
    private Button btnLEFT2;
    @FXML
    private Button btnLEFT3;
    @FXML
    private Button btnLEFT4;
    @FXML
    private Text txtOPCIONLEFT1;
    @FXML
    private Text txtOPCIONLEFT2;
    @FXML
    private Text txtOPCIONLEFT3;
    @FXML
    private Text txtOPCIONLEFT4;
    @FXML
    private Text txtTITULO1;
    @FXML
    private Text txtOPCIONRIGHT1;
    @FXML
    private Text txtOPCIONRIGHT2;
    @FXML
    private Text txtOPCIONRIGHT3;
    @FXML
    private Text txtOPCIONRIGHT4;
    @FXML
    private Text txtTITULO2;
    @FXML
    private Text txtTITULO3;
    @FXML
    private Text txtTITULO4;
    @FXML
    private Text txtRECEIPT;
    @FXML
    private Text txtATMCARD;
    @FXML
    private Text txtCASH;
    @FXML
    private Pane paneRECEIPT;
    @FXML
    private ImageView imgvTICKET;
    @FXML
    private Text txtReceiptCardNumber;
    @FXML
    private Text txtReceiptCustomerName;
    @FXML
    private Text txtReceiptDispensedAmount;
    @FXML
    private Text txtReceiptRequestedAmount;
    @FXML
    private Text txtReceiptAcountType;
    @FXML
    private Text txtReceiptTerminalFee;
    @FXML
    private Text txtReceiptTotalAmount;
    @FXML
    private Text txtReceiptBalance;
    @FXML
    private Text txtReceiptDate;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btn0;
    @FXML
    private Button btnCANCEL;
    @FXML
    private Button btnCLEAR;
    @FXML
    private Button btnENTER;
    @FXML
    private Pane paneDEBITCARD;
    @FXML
    private Text txtCardName;
    @FXML
    private Text txtCardNumber;
    @FXML
    private Button btnADMIN;

    @FXML
    void handlebtnADMINAction(ActionEvent event) {

    }
    
    @FXML
    void handlebtn0Action(ActionEvent event) {

    }

    @FXML
    void handlebtn1Action(ActionEvent event) {

    }

    @FXML
    void handlebtn2Action(ActionEvent event) {

    }

    @FXML
    void handlebtn3Action(ActionEvent event) {

    }

    @FXML
    void handlebtn4Action(ActionEvent event) {

    }

    @FXML
    void handlebtn5Action(ActionEvent event) {

    }

    @FXML
    void handlebtn6Action(ActionEvent event) {

    }

    @FXML
    void handlebtn7Action(ActionEvent event) {

    }

    @FXML
    void handlebtn8Action(ActionEvent event) {

    }

    @FXML
    void handlebtn9Action(ActionEvent event) {

    }

    @FXML
    void handlebtnCANCELAction(ActionEvent event) {

    }

    @FXML
    void handlebtnCLEARAction(ActionEvent event) {

    }

    @FXML
    void handlebtnENTERAction(ActionEvent event) {

    }

    @FXML
    void handlebtnLEFT1Action(ActionEvent event) {

    }

    @FXML
    void handlebtnLEFT2Action(ActionEvent event) {

    }

    @FXML
    void handlebtnLEFT3Action(ActionEvent event) {

    }

    @FXML
    void handlebtnLEFT4Action(ActionEvent event) {

    }

    @FXML
    void handlebtnRIGHT1Action(ActionEvent event) {

    }

    @FXML
    void handlebtnRIGHT2Action(ActionEvent event) {

    }

    @FXML
    void handlebtnRIGHT3Action(ActionEvent event) {

    }

    @FXML
    void handlebtnRIGHT4Action(ActionEvent event) {

    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Setinitialstatuscontrols();
        
        Init_ATM();
        
        
    }    
    
    
    
    
    
    private void Init_ATM() {
    
        Thread thd = new Thread(()-> {
        
             AudioClip snd = new AudioClip(Paths.get("src/main/resources/Sounds/ATM_INIT.mp3").toUri().toString());
                                
             snd.play();
          
        
        });
        
        
        FillTransition fillINIT = new FillTransition(new Duration(3000),txtTITULO2);
       
        fillINIT.setFromValue(Color.web("#141414"));
        fillINIT.setToValue(Color.web("#2EF220"));
        fillINIT.setCycleCount(8);
        fillINIT.setAutoReverse(true);
        
        
        FillTransition fillCASH = new FillTransition(new Duration(3000),txtCASH);
        
        fillCASH.setFromValue(Color.web("#141414"));
        fillCASH.setToValue(Color.web("#2EF220"));
        fillCASH.setCycleCount(8);
        fillCASH.setAutoReverse(true);
        
        FillTransition fillRECEIPT = new FillTransition(new Duration(3000),txtRECEIPT);
        
        fillRECEIPT.setFromValue(Color.web("#141414"));
        fillRECEIPT.setToValue(Color.web("#2EF220"));
        fillRECEIPT.setCycleCount(8);
        fillRECEIPT.setAutoReverse(true);
        
        FillTransition fillATMCARD = new FillTransition(new Duration(3000),txtATMCARD);
        
        fillATMCARD.setFromValue(Color.web("#141414"));
        fillATMCARD.setToValue(Color.web("#2EF220"));
        fillATMCARD.setCycleCount(8);
        fillATMCARD.setAutoReverse(true);
        
        ParallelTransition par = new ParallelTransition(fillINIT,fillCASH,fillRECEIPT,fillATMCARD);
        
        par.setRate(4);
        
        thd.start();
        par.play();
    
    }
    
    private void Setinitialstatuscontrols() {
    
        txtTITULO1.setFill(Color.web("#141414"));
        txtTITULO2.setFill(Color.web("#141414"));
        txtTITULO3.setFill(Color.web("#141414"));
        txtTITULO4.setFill(Color.web("#141414"));
        
        txtTITULO2.setText("I N I C I A L I Z A N D O");
        
        
        txtOPCIONLEFT1.setFill(Color.web("#141414"));
        txtOPCIONLEFT2.setFill(Color.web("#141414"));
        txtOPCIONLEFT3.setFill(Color.web("#141414"));
        txtOPCIONLEFT4.setFill(Color.web("#141414"));
    
        txtOPCIONRIGHT1.setFill(Color.web("#141414"));
        txtOPCIONRIGHT2.setFill(Color.web("#141414"));
        txtOPCIONRIGHT3.setFill(Color.web("#141414"));
        txtOPCIONRIGHT4.setFill(Color.web("#141414"));
        
        paneRECEIPT.setVisible(false);
        paneDEBITCARD.setVisible(false);
        
        
    }
         
    
}
