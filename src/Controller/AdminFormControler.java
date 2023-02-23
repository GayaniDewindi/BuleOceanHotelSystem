package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminFormControler {
    public PasswordField UserNameTxt;
    public PasswordField PasswordTxt;

    public void goMenu(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/ManeForm.fxml"));
        Stage stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onActionDetails(ActionEvent actionEvent) throws IOException {
        if (UserNameTxt.getText().equals("a") && PasswordTxt.getText().equals("1")){
            Parent root = FXMLLoader.load(getClass().getResource("/FXML/DetailsForm.fxml"));
            Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else {
            (new Alert(Alert.AlertType.WARNING, "Try Again!", new ButtonType[0])).show();
        }
    }
}
