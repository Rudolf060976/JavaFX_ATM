package com.mycompany.proyecto2_atm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {

   @Override
    public void start(Stage stage) throws Exception {
  
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXML_ATMConfig.fxml"));
        
        Parent root = loader.load();
        
       // FXML_ATMConfigController pc = loader.getController();
        
        Scene myScene = new Scene(root);
        
        stage.setScene(myScene);
        
        stage.setTitle("ATM Configuration");
                
        stage.show();
        
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}