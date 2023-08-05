package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



    public class PasswordRecoveryController {
        @FXML
        public Button loginButton;
        @FXML
        private TextField ssn;
        @FXML
        private TextField email;
        @FXML
        private TextField username;

