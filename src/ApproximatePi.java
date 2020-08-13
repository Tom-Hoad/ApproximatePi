import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ApproximatePi extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("ApproximatePi");

        Circle circle = new Circle();
        circle.setRadius(200);
        circle.setStroke(Color.GREEN);

        StackPane layout = new StackPane();
        layout.getChildren().add(circle);

        Scene scene = new Scene(layout, 400, 400, Color.BLACK);
        stage.setScene(scene);
        stage.show();
    }

    // Launches the game.
    public static void main(String[] args) {
        launch(args);
    }
}