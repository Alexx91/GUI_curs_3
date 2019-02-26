package stage;

import javafx.application.Application;
import javafx.stage.Stage;

public class CustomizedStage extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello World!");
		primaryStage.setX(400);
		primaryStage.setY(200);
		primaryStage.setWidth(800);
		primaryStage.setHeight(600);
		primaryStage.show();
	}

}
