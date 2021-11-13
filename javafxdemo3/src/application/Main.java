package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
	//		BorderPane root = new BorderPane();
			Button b1 = new Button("OK");
			Scene scene = new Scene(b1,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
			
						
			Stage stage = new Stage();
			stage.setTitle("Second");
			stage.setScene(new Scene(new Button("New"),200,200));
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
