package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DemoController {

    @FXML
    private Label label;

    @FXML
    private TextField txtt;
    
    @FXML
    void onClick(ActionEvent event) {
    	String str = txtt.getText();
    	label.setText(str);
    }
}
