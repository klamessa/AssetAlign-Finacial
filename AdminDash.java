import com.example.demo.Connectivity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AdminDash implements Initializable {
    private Label maritalSetLabel;
    @FXML
    private ToggleGroup maritalStatus;
    @FXML
    private ToggleGroup genderStatus;
    @FXML
     private TextField FName_fld;
    @FXML
    private TextField MName_fld;
    @FXML
    private TextField Ssn_fld;
    @FXML
    private TextField LName_fld;
    @FXML
    private TextField Phone_no_fld;
    @FXML
    private DatePicker DOB_fld;
    @FXML
    private RadioButton Single_radio_btn;
    @FXML
      private RadioButton Married_radio_btn;
    @FXML
    private RadioButton Male_radio_btn;
    @FXML
    private RadioButton Female_radio_btn;
    @FXML
    private TextField email_fld;
    @FXML
    private TextField Address_fld;
    private TextField city_fld;
    @FXML
    private TextField zipcode_fld;
    @FXML
    private TextField username_fld;
    @FXML
     private TextField password_fld;
    @FXML
    private CheckBox ck_acc_cb;
    @FXML
    private CheckBox sv_acc_cb;
    @FXML

    //Third Pane clients deposit
    @FXML
    private TextField rusername_fld;
   
    
}

