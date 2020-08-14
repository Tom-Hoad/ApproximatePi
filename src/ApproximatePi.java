import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ApproximatePi extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("ApproximatePi");

        // Creates the circle.
        Circle circle = new Circle();
        circle.setRadius(200);
        circle.setLayoutX(200);
        circle.setLayoutY(200);
        circle.setStroke(Color.WHITE);

        Pane layout = new Pane();
        layout.getChildren().addAll(circle);

        // Creates random dots.
        for (int i = 1; i < 10000; i++) {
            Circle dot = new Circle();
            dot.setRadius(0);
            dot.setLayoutX(Math.random() * 400);
            dot.setLayoutY(Math.random() * 400);
            dot.setStroke(Color.WHITE);

            layout.getChildren().add(dot);
        }

        Scene scene = new Scene(layout, 400, 400, Color.BLACK);
        stage.setScene(scene);
        stage.show();
    }

    // Launches the game.
    public static void main(String[] args) {
        launch(args);
    }
}