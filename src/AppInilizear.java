import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;

public class AppInilizear extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        URL resource = getClass().getResource("FXML/ManeForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene=new Scene(load);
      primaryStage.initStyle(StageStyle.UNDECORATED);
        //primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
