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
protected void Home(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    } 
public void validateLogin(ActionEvent event ) throws SQLException, IOException {
        Connectivity connectivity = new Connectivity();
        Connection connection = connectivity.getConnection();
        String query = "select count(1) from  customer_personal_info where     username = ? and password = ? ";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1,nameTextField.getText());
        statement.setString(2,passwordField.getText());
        ResultSet resultSet = statement.executeQuery();
        
}
