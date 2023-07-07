public class ClientLoginController {
protected void passwordRecovery(ActionEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("PasswordRecovery.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxml);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }
}
