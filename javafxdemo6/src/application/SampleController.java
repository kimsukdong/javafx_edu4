package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SampleController {

	int x,y,k;
	String op;
    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    private TextField txt3;

    @FXML
    void onClickDivide(ActionEvent event) {
    	get_txt();
    	k=x/y;
    	op = " / ";
    	set_txt();
    }

    @FXML
    void onClickMinus(ActionEvent event) {
    	get_txt();
    	k=x-y;

    	op = " - ";
    	set_txt();
    }

    @FXML
    void onClickMultiply(ActionEvent event) {
    	get_txt();
    	k=x*y;
    	op = " * ";
    	set_txt();
    }

    @FXML
    void onClickPlus(ActionEvent event) {
    	get_txt();
    	k=x+y;
    	op = " + ";
    	set_txt();
    }
    
    void get_txt() {
    	x = Integer.parseInt(txt1.getText());
    	y = Integer.parseInt(txt2.getText());
    }
    void set_txt() {
    	txt3.setText(x + op + y + " = "+k);
    }
}
