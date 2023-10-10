package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

@SuppressWarnings("ALL")
public class ClientLoginController {
    @FXML
    private Label phoneLabel, emailLabel, UserLabel, passwordLabel, welcomeLabel, passwordShow, TimeDateLabel;
    @FXML
    ImageView BanklogoGif;
    @FXML 
    TextField nameTextField;  @FXML private PasswordField passwordField;
    @FXML
    private Button Home, SignupButton, loginButton;
    @FXML
    private AnchorPane anchorPane;
    private Stage stage; private Scene scene; private Parent root;
    @FXML
    private String username,password;
    
    protected void SignUpPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("SignUpPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }
