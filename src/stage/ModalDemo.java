package stage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.HBoxBuilder;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBoxBuilder;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ModalDemo extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Modal Demo");
		Button btn = new Button();
		btn.setText("Open Dialog");
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				final Stage myDialog = new Stage();
//				final Stage one1 = new Stage();
				myDialog.initModality(Modality.NONE);

				Button okButton = new Button("CLOSE");
//				Button one = new Button("hei");
				okButton.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						myDialog.close();
					}

				});

				Scene myDialogScene = new Scene(
						HBoxBuilder.create().children(new Text("Hello! it's My Dialog."), okButton)
								.alignment(Pos.CENTER).padding(new Insets(10)).build());
//				Scene one1Scene = new Scene (VBoxBuilder.create().children(one, okButton).alignment(Pos.CENTER).padding(new Insets(10)).build());

				myDialog.setScene(myDialogScene);
//				one1.setScene(one1Scene);
//				one1.show();
				myDialog.show();
			}
		});

		StackPane root = new StackPane();
		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}

}
