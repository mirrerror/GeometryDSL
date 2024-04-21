package geometrydsl.visual;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {

    private final FigureManager figureManager = new FigureManager();

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        stage.setScene(scene);
        stage.show();
    }
}
