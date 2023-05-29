package com.example.registr;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Button authorization;

    @FXML
    private Button loginSIgnUpButton;

    @FXML
    void initialize(ActionEvent event) {
        loginSIgnUpButton.setOnAction(Event -> {
            loginSIgnUpButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/main/resources/com.example.registr/SignUp2.fxml"));
            try{
                loader.load();
            } catch(IOException e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        } );


    }

}

