package com.example.AssetAlign;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class MainControllerOrganizer implements Initializable {

    @FXML
    private Button LoginButton,aboutMeButton;
    @FXML
    private VBox vbox;
    @FXML
    private Parent fxml;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Translation();
    }

    @FXML
    private void open_Login(ActionEvent event){
        Translation();
    }

    private void Translation() {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(1), vbox);
        transition.setToX(vbox.getLayoutX() * 20);
        transition.play();
        transition.setOnFinished((e) ->{
            try{
                fxml = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
                vbox.getChildren().removeAll();
                vbox.getChildren().setAll(fxml);
            }catch(IOException ex){
    
            }
        });
    }

    @FXML
        protected void MainControlOrg(ActionEvent event) throws IOException {
                fxml = FXMLLoader.load(getClass().getResource("AdminDashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(fxml);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.show();
        }
          @FXML
        protected void informationPage(ActionEvent event) throws IOException {
            fxml = FXMLLoader.load(getClass().getResource("AboutMe.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(fxml);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.show();
        }
        @FXML
        private void open_signup(ActionEvent event){
            TranslateTransition transition = new TranslateTransition(Duration.seconds(1), vbox);
            transition.setToX(0);
            transition.play();
            transition.setOnFinished((e) ->{
            try{
                    fxml = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
                    vbox.getChildren().removeAll();
                    vbox.getChildren().setAll(fxml);
                }catch(IOException ex){
                    
                }
            });
        }


    }
}

    
