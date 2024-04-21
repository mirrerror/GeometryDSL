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
        Scene scene = new Scene(root,600,600, Color.BLACK);
        Stage stage = new Stage();
        Line line = new Line();
        line.setStartX(50);
        line.setStartY(50);
        line.setEndX(100);
        line.setEndY(100);
        line.setStroke(Color.RED);
        //line.setStroke(5);
        figureManager.addFigure(root,line );

        stage.setScene(scene);
        stage.show();
    }
}
