package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SceondController {
    @FXML
    void onClickReturn(ActionEvent event) throws IOException {
    	SampleController.stage.close();
		Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
		
		Scene scene = new Scene(root,400,400);
		Main.primaryStage.setScene(scene);
		Main.primaryStage.show();
    }

}
