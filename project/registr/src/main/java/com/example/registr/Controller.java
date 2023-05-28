package com.example.registr;
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
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button authorization;

    @FXML
    private Button loginSIgnUpButton;

    // ???public void setLoginSIgnUpButton(Button loginSIgnUpButton) {
    //??? Parent root = FXMLLoader.Load(getClass().getResource("SignUp2.fxml"));


    @FXML
    void initialize() {
        // loginSIgnUpButton.setOnAction(new loginSIgnUpButtonListener );
        // loginSIgnUpButton.setOnAction(actionEvent -> {


        authorization.setOnAction(actionEvent -> {
            System.out.println("Вы нажали на кнопку войти");
        });
    }
}

        //class loginSIgnUpButtonListener implements EventHandler<ActionEvent>{
            //@Override
           // public void handle(ActionEvent activeEvent) {

