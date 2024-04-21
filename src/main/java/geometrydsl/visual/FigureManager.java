package geometrydsl.visual;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;

public class FigureManager {

    public void addFigure(Group root, Shape shape) {
        root.getChildren().add(shape);
    }

    public void removeFigure(Group root, Shape shape) {
        root.getChildren().remove(shape);
    }

    public void addLine(Group root, geometrydsl.models.Line line) {
        Line fxLine = new Line();
        fxLine.setStartX(line.getX1());
        fxLine.setStartY(line.getY1());
        fxLine.setEndX(line.getX2());
        fxLine.setEndY(line.getY2());
        fxLine.setStroke(Color.BLACK);
        addFigure(root, fxLine);
    }

    public void addCircle(Group root, geometrydsl.models.Circle circle) {
        Circle fxCircle = new Circle();
        fxCircle.setCenterX(circle.getX());
        fxCircle.setCenterY(circle.getY());
        fxCircle.setRadius(circle.getRadius());
        fxCircle.setStroke(Color.BLACK);
        fxCircle.setFill(Color.WHITE);
        addFigure(root, fxCircle);
    }

    public void addPoint(Group root, geometrydsl.models.Point point) {
        Circle circle = new Circle();
        circle.setCenterX(point.getX());
        circle.setCenterY(point.getY());
        circle.setRadius(1);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.BLACK);
        addFigure(root, circle);
    }

}
