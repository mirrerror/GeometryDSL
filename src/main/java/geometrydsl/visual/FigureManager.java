package geometrydsl.visual;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

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
    public void addRectangle(Group root, geometrydsl.models.Rectangle rectangle){
        Rectangle fxRectangle = new Rectangle();
        fxRectangle.setX(rectangle.getX());
        fxRectangle.setY(rectangle.getY());
        fxRectangle.setHeight(rectangle.getHeight());
        fxRectangle.setWidth(rectangle.getWidth());
        fxRectangle.setFill(Color.BLACK);
        addFigure(root, fxRectangle);
    }
    public void addTriangle(Group root, geometrydsl.models.Triangle triangle){
        Polygon fxTriangle = new Polygon();
        fxTriangle.getPoints().setAll(
                (double)triangle.getX1(), (double)triangle.getY1(),
                (double)triangle.getX2(), (double)triangle.getY2(),
                (double)triangle.getX3(), (double)triangle.getY3()
        );
        fxTriangle.setFill(Color.BLACK);
        addFigure(root, fxTriangle);

    }

}
