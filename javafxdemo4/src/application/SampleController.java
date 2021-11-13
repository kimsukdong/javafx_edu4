package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SampleController {
	public static Stage stage;
    @FXML
    void onClick(ActionEvent event) throws IOException {
    	Main.primaryStage.close();
    	Parent root = FXMLLoader.load(getClass().getResource("Second.fxml"));
		stage = new Stage();
		Scene scene = new Scene(root,200,400);
		stage.setTitle("Second");
		stage.setScene(scene);
		stage.show();
    }
}
