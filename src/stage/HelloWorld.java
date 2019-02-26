package stage;

import javafx.application.Application;
import javafx.stage.Stage;

public class HelloWorld extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello World!");
		primaryStage.show();
	}
}