package stage;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SplashDemo extends Application {
	double dragOffsetX = 0;
	double dragOffsetY = 0;
	
	public static void main(String[] args) {
		launch(args);
	}

	

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new AnchorPane();
		pane.getChildren().add(new ImageView(new Image(new FileInputStream("logo.png"))));
		Scene scene = new Scene(pane);
		pane.setBackground(Background.EMPTY);
		scene.setFill(Color.TRANSPARENT);
		scene.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				dragOffsetX = event.getScreenX() - primaryStage.getX();
				dragOffsetY = event.getScreenY() - primaryStage.getY();
			}

		});
		scene.setOnMouseDragged(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				primaryStage.setX(event.getScreenX() - dragOffsetX);
				primaryStage.setY(event.getScreenY() - dragOffsetY);
			}
		});
		
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
