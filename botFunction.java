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
    private Label chatbotNameLabel;
    @FXML
    private ImageView chatbotAvatar;
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

 
    

