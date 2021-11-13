package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SampleController {

	double x= 286.0;

    @FXML
    private Label label;


    @FXML
    void onClick1(ActionEvent event) {
    	label.setLayoutX(x-=10);
    }

    @FXML
    void onClick2(ActionEvent event) {
    	label.setLayoutX(x+=10);
    }

}
