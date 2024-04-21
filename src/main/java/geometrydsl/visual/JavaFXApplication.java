package geometrydsl.visual;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {

    private final FigureManager figureManager = new FigureManager();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root,600,600, Color.WHITE);
        Stage stage = new Stage();

        figureManager.addLine(root, new geometrydsl.models.Line("test", 10, 10, 100, 100));
        figureManager.addCircle(root, new geometrydsl.models.Circle("test1", 200, 200, 50));
        figureManager.addPoint(root, new geometrydsl.models.Point("test2", 300, 300));

        stage.setScene(scene);
        stage.show();
    }
}
