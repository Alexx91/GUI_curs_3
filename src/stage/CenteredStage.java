package stage;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class CenteredStage extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Centered stage");
		primaryStage.show();
		Rectangle2D bounds = Screen.getPrimary().getVisualBounds();
		double x = bounds.getMinX() + (bounds.getWidth() - primaryStage.getWidth()) / 2.0;
		double y = bounds.getMinY() + (bounds.getHeight() - primaryStage.getHeight()) / 2.0;

		primaryStage.setX(x);
		primaryStage.setY(y);

	}

}
