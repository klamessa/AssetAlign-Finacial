package com.example.demo;

import com.example.demo.customer.Customer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;


@SuppressWarnings("ALL")
public class SignupPage {
    public Label ssnLabel1;
    public Label emailLabel1;
    public ToggleGroup maritaltoggle;
    public TextField UsernameF;
    public TextField PasswordF;
    public ComboBox state_ComboBox;

    @FXML
    private Label firstNameLabel, lastNameLabel, middleNameLabel,
            DOBLabel, ssnLabel, phoneNumberLabel, emailLabel,
            streetNameLabel, zipCodeLabel, aptLabel, cityLabel,
            genderLabel, maritalStatusLabel,
            usernameLabel, passwordLabel,
            verifySSNLabel, verifyPhoneLabel, verifyAgeLabel,
             SignupLabel,  progressLabel, progressPercentLabel ;
  @FXML
  private TextField firstNameTF,middleNameTF,lastNameTF,
            ssnTF, phoneNumberTF, emailTF,
            streetTF, cityTF, apartmentTF, zipCodeTF,
            genderTF, maritalStatusTF,
            usernameTF, passwordTF ;

    private String genderSet = "";
    private String maritalSet = "";
    @FXML
    private RadioButton maleButton, nonbinaryButton, femaleButton, singleButton, marriedButton;
    @FXML
    private ToggleGroup gendertoggle;
    @FXML
    private ToggleGroup martialtoggle;

    private Stage stage;
    private Scene scene;
    private Parent root;


  
    @FXML
    private Button LoginButton, Home, SignupButton, nextButton,
            progressButton;

    @FXML
    private DatePicker datePicker;


    
    @FXML
    private AnchorPane anchorPane;

   
    @FXML
    private int age;

     @FXML
    public void getDate(ActionEvent event) {
        LocalDate date = datePicker.getValue();
    }

    @FXML
    protected void Home(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("MainModified.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }
    


    
   
    

    

  

