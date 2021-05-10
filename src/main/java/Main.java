import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import services.EmployeeService;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("hello world");
        Scene scene = new Scene(label);
        primaryStage.setScene(scene);
        primaryStage.show();
        EmployeeService employeeService = new EmployeeService();
        employeeService.getAllEmployees();
    }
}
