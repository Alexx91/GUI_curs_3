package stage;

import javafx.application.Application;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Exercitiu extends Application {
    private int request = 0;
    private String TEXT_RED = new String("Apasa pentru a schimba in rosu");
    private String TEXT_YELLOW = new String("Apasa pentru a schimba in galben");
    private String TEXT_BLUE = new String("Apasa pentru a schimba in albastru");

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        root.setPrefHeight(500);
        root.setPrefWidth(500);
        Button btn = new Button(TEXT_RED);

        root.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        root.getChildren().add(btn);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (request == 0) {
                    root.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                    btn.setText(TEXT_YELLOW);
                }
                if (request == 1) {
                    root.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
                    btn.setText(TEXT_BLUE);
                }
                if (request == 2) {
                    root.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                    btn.setText(TEXT_RED);

                }
                request = (request + 1) % 3;

            }
        });

        Scene scene = new Scene(root, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
