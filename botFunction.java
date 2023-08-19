import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class BotFunction {
    @FXML
    private AnchorPane anchPane;
    @FXML
    private Button minButton;
    @FXML
    private Label botfunctionNameLabel;
    @FXML
    private ImageView botfunctionAvatar;
    @FXML
    private Circle avatarBackground;
    @FXML
    private Pane sidebar;
    @FXML
    private TextArea console;
    @FXML
    private TextField userInput;
    @FXML
    private Button sendButton;
    @FXML
    private  FontAwesomeIconView minIcon;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private void handleUserInput(ActionEvent event) {
        String input = userInput.getText();

        String response = "You said: " + input;

     
        console.appendText("\n" + response);

       
        userInput.clear();
    }
    @FXML
        protected void home(ActionEvent event) throws IOException {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("LandingPage.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    public void SendMessage(ActionEvent event) {


        if (userInput.getText().contains("hi") || userInput.getText().contains("hello") || userInput.getText().contains("hey") || userInput.getText().contains("howdy")) {
            Console.setText("Hello, this is Summit Financial Corp. ChatBot. How may I assist you?");
        }
        else if (userInput.getText().contains("transfer funds")){
            Console.setText("You can transfer funds by clicking on the Transaction button on your dashboard page.");
        }
         else if(userInput.getText().contains("mobile deposit")){
            Console.setText("This mobile deposit is not supported by this institution.");
        }
        else if (userInput.getText().contains("closing account")){
            Console.setText("You will have to go to the nearest branch and speak with a representative for more information.");
        }
        else{

                Console.setText("Oops, didn't get that! Try entering again!");    
    }
    

