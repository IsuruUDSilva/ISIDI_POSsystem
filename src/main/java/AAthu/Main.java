package AAthu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label lable = new Label("Hello World");
        Scene scene = new Scene(lable);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
