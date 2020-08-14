import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;

public class ApproximatePi extends Application {
    private final int radius = 200;
    private final Random rand = new Random();

    @Override
    public void start(Stage stage) {
        stage.setTitle("ApproximatePi");

        // Creates the circle.
        Circle circle = new Circle();
        circle.setRadius(radius);
        circle.setLayoutX(radius);
        circle.setLayoutY(radius);
        circle.setStroke(Color.WHITE);

        Pane layout = new Pane();
        layout.getChildren().addAll(circle);

        // Creates random dots indefinitely.
        Timeline timeline = new Timeline(
                new KeyFrame(
                        Duration.millis(10),
                        event -> {
                            Circle dot = new Circle();
                            dot.setRadius(0);

                            int x = rand.nextInt(2 * radius);
                            int y = rand.nextInt(2 * radius);
                            double d = Math.sqrt(((x - 200) * (x - 200)) + ((y - 200) * (y - 200)));
                            System.out.println("X: " + x + " Y: " + y + " D: " + d);

                            dot.setLayoutX(x);
                            dot.setLayoutY(y);

                            if (d < radius) {
                                dot.setStroke(Color.GREEN);
                            } else {
                                dot.setStroke(Color.WHITE);
                            }

                            layout.getChildren().add(dot);
                        }
                )
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

        Scene scene = new Scene(layout, 2 * radius, 2 * radius, Color.BLACK);
        stage.setScene(scene);
        stage.show();
    }

    // Launches the game.
    public static void main(String[] args) {
        launch(args);
    }
}