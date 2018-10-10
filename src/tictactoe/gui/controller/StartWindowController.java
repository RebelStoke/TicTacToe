/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.gui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Revy
 */
public class StartWindowController implements Initializable {

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pvpStart(ActionEvent event) throws Exception {
         try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/tictactoe/gui/views/TicTacView.fxml"));
        Parent root = (Parent) loader.load();
        Stage stage = new Stage();
            stage.setTitle("TicTacToe");
            stage.setScene(new Scene(root));  
            stage.show();
            TicTacViewController window = loader.<TicTacViewController>getController();
            window.setVsPlayer();
         }
         catch(Exception e) {
           e.printStackTrace();
          }
    }

    @FXML
    private void pvaiStart(ActionEvent event) {
         try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/tictactoe/gui/views/TicTacView.fxml"));
        Parent root = (Parent) loader.load();
        Stage stage = new Stage();
            stage.setTitle("TicTacToe");
            stage.setScene(new Scene(root));  
            stage.show(); }
         catch(Exception e) {
           e.printStackTrace();
          }
    }

    
    
}
