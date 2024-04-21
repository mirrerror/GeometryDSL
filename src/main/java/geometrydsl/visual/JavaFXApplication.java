package geometrydsl.visual;

import geometrydsl.Main;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class JavaFXApplication extends Application {

    private final FigureManager figureManager = new FigureManager();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root,600,600, Color.WHITE);
        Stage stage = new Stage();

        stage.setFullScreen(true);

        Main.getShapesToDraw().forEach(shape -> {
            if(shape instanceof geometrydsl.models.Line) {
                figureManager.addLine(root, (geometrydsl.models.Line) shape);
            } else if(shape instanceof geometrydsl.models.Circle) {
                figureManager.addCircle(root, (geometrydsl.models.Circle) shape);
            } else if(shape instanceof geometrydsl.models.Point) {
                figureManager.addPoint(root, (geometrydsl.models.Point) shape);
            } else if(shape instanceof geometrydsl.models.Triangle) {
                figureManager.addTriangle(root, (geometrydsl.models.Triangle) shape);
            } else if(shape instanceof geometrydsl.models.Rectangle) {
                figureManager.addRectangle(root, (geometrydsl.models.Rectangle) shape);
            }
        });

        stage.setScene(scene);
        stage.show();
    }
}
