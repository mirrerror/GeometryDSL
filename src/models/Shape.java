package models;

public abstract class Shape {

    public float calculateDistance(Shape shape) {
        if(shape instanceof Point) {
            return calculateDistance((Point) shape);
        } else if(shape instanceof Line) {
            return calculateDistance((Line) shape);
        } else if(shape instanceof Circle) {
            return calculateDistance((Circle) shape);
        } else {
            throw new IllegalArgumentException("Unsupported shape type for distance calculation");
        }
    }

    public abstract float calculateArea();
    public abstract float calculatePerimeter();
    public abstract float calculateDistance(Point p);
    public abstract float calculateDistance(Line l);
    public abstract float calculateDistance(Circle c);

}
