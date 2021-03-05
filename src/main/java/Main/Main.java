package Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label lable = new Label("hello world");
        Scene scene = new Scene(lable);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
