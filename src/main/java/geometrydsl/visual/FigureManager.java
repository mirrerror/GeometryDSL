package geometrydsl.visual;

import javafx.scene.Group;
import javafx.scene.shape.Shape;

public class FigureManager {

    public void addFigure(Group root, Shape shape) {
        root.getChildren().add(shape);
    }

    public void removeFigure(Group root, Shape shape) {

    }

}
