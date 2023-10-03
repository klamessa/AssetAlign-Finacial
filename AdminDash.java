import com.example.AssetAlign-Financial.Connection;
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
    private TextField ck_acc_bal_fld;
    @FXML
    private TextField sv_acc_bal_fld;
    @FXML
    private Button Create_new_btn;
    @FXML
    private ChoiceBox state_fld;
    @FXML
    private TextField rusername_fld;

    private void handleClicks(ActionEvent event) throws IOException {
        
        if (event.getSource() == create_c_btn) {
            pnCreateClient.toFront();
        } else if (event.getSource() == Clients_btn) {
            pnClientsListview.toFront();
        } else if (event.getSource() == deposit_btn) {
            pnDeposits.toFront();
         } else if (event.getSource() == logout_btn) {
            root =  FXMLLoader.load(getClass().getResource("AdminSignin.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.show();
        }
    }
    
}

@Override
public void initialize(URL url, ResourceBundle resourceBundle) {
      Connection con; 
     try {
            con = DriverManager.getConnection("jdbc:mysql://34.68.83.162/bs_db1", "root", "1558");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            ResultSet rs = con.createStatement().executeQuery("select * from customer_personal_info ");
            while (rs.next()) {

                clientsList.add(new ConnTable(rs.getString("Account_number"),rs.getString("First_name"), rs.getString("Last_name"),rs.getString("Middle_name"),rs.getString("date_of_birth"),rs.getString("address"),rs.getString("zipp_code"),rs.getString("state"),rs.getString("Country"),rs.getString("city"),rs.getString("contact_no"),rs.getString( "ssn"),rs.getString( "username"),rs.getString( "email")));

            }
            col_accnum.setCellValueFactory(new PropertyValueFactory<>("Account_number"));
            col_fname.setCellValueFactory(new PropertyValueFactory<>("First_name"));
            col_lname.setCellValueFactory(new PropertyValueFactory<>("Last_name"));
            col_mname.setCellValueFactory(new PropertyValueFactory<>("Middle_name"));
            col_dob.setCellValueFactory(new PropertyValueFactory<>("date_of_birth"));
            col_address.setCellValueFactory(new PropertyValueFactory<>("address"));
            col_zip.setCellValueFactory(new PropertyValueFactory<>("zipp_code"));
            col_state.setCellValueFactory(new PropertyValueFactory<>("state"));
            col_city.setCellValueFactory(new PropertyValueFactory<>("city"));
            col_contactnum.setCellValueFactory(new PropertyValueFactory<>("contact_no"));
            col_last4ssn.setCellValueFactory(new PropertyValueFactory<>("ssn"));
            col_username.setCellValueFactory(new PropertyValueFactory<>("username"));
            col_email.setCellValueFactory(new PropertyValueFactory<>("email"));

            
            table.setItems(clientsList);
            state_ComboBox.setItems(stateList);
            FilteredList<ConnTable> filteredData = new FilteredList<>(clientsList, b -> true );

            search_db_fld.textProperty().addListener((observable, oldValue, newValue) -> {
                filteredData.setPredicate(ConnTable ->{
                     if(newValue.isEmpty() || newValue.isBlank() || newValue == null){
                         return true;
                     }

                     String searchKeyword = newValue.toLowerCase();
                     if(ConnTable.getLast_name().toLowerCase().indexOf(searchKeyword) >-1){
                         return true;
                     }
                   else
                         if(ConnTable.getFirst_name().toLowerCase().indexOf(searchKeyword) >-1) {
                             return true;
                         }
                     else
                         if ((ConnTable.getAccount_number().toString().indexOf(searchKeyword) >-1)) {
                               return true;
                         }else
                             return false;
                });
            });

            sortedData.comparatorProperty().bind(table.comparatorProperty());
            table.setItems(sortedData);

            Connectivity connectivity = new Connectivity();
            Connection conc= connectivity.getConnection();

            
          
                                          

           

