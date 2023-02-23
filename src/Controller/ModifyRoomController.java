package Controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class ModifyRoomController implements Initializable{


    public JFXComboBox<String>roomTypes;


    public void OnActionSubmitBotton(ActionEvent actionEvent) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("../FXML/SubmintForm.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        public void onClickBackToRoomDetails(MouseEvent mouseEvent) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("/FXML/RoomDetailsForm.fxml"));
            Stage stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
         this.roomTypes.getItems().add("Single");
         this.roomTypes.getItems().add("Double");
         this.roomTypes.getItems().add("Triple");
         this.roomTypes.getItems().add("Quad");
    }

    public void onclickedRoomDetails(MouseEvent mouseEvent) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/FXML/RoomDetailsForm.fxml"));
        Stage stage = (Stage)((Node)mouseEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}


