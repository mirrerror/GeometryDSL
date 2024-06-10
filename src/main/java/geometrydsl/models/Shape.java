package geometrydsl.models;

import java.util.Objects;

public abstract class Shape {

    private final String id;

    public Shape(String id) {
        this.id = id;
    }

    public float calculateDistance(Shape shape) {
        if(shape instanceof Point) {
            return calculateDistance((Point) shape);
        } else if(shape instanceof Line) {
            return calculateDistance((Line) shape);
        } else if(shape instanceof Circle) {
            return calculateDistance((Circle) shape);
        } else if(shape instanceof Rectangle) {
            return calculateDistance((Rectangle) shape);
        } else if(shape instanceof Triangle) {
            return calculateDistance((Triangle) shape);
        } else if(shape instanceof Polygon) {
            return calculateDistance((Polygon) shape);
        } else {
            throw new IllegalArgumentException("Unsupported shape type for distance calculation");
        }
    }

    public String getId() {
        return id;
    }

    public abstract float calculateArea();
    public abstract float calculatePerimeter();
    public abstract float calculateDistance(Point p);
    public abstract float calculateDistance(Line l);
    public abstract float calculateDistance(Circle c);
    public abstract float calculateDistance(Rectangle r);
    public abstract float calculateDistance(Triangle t);
    public abstract float calculateDistance(Polygon p);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(id, shape.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
