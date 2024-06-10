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

    public boolean contains(Shape shape) {
        if(shape instanceof Point) {
            return contains((Point) shape);
        } else if(shape instanceof Line) {
            return contains((Line) shape);
        } else if(shape instanceof Circle) {
            return contains((Circle) shape);
        } else if(shape instanceof Rectangle) {
            return contains((Rectangle) shape);
        } else if(shape instanceof Triangle) {
            return contains((Triangle) shape);
        } else if(shape instanceof Polygon) {
            return contains((Polygon) shape);
        } else {
            throw new IllegalArgumentException("Unsupported shape type for contains calculation");
        }
    }

    public boolean intersects(Shape shape) {
        if(shape instanceof Point) {
            return intersects((Point) shape);
        } else if(shape instanceof Line) {
            return intersects((Line) shape);
        } else if(shape instanceof Circle) {
            return intersects((Circle) shape);
        } else if(shape instanceof Rectangle) {
            return intersects((Rectangle) shape);
        } else if(shape instanceof Triangle) {
            return intersects((Triangle) shape);
        } else if(shape instanceof Polygon) {
            return intersects((Polygon) shape);
        } else {
            throw new IllegalArgumentException("Unsupported shape type for intersects calculation");
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

    public abstract boolean contains(Point p);
    public abstract boolean contains(Line l);
    public abstract boolean contains(Circle c);
    public abstract boolean contains(Rectangle r);
    public abstract boolean contains(Triangle t);
    public abstract boolean contains(Polygon p);

    public abstract boolean intersects(Point p);
    public abstract boolean intersects(Line l);
    public abstract boolean intersects(Circle c);
    public abstract boolean intersects(Rectangle r);
    public abstract boolean intersects(Triangle t);
    public abstract boolean intersects(Polygon p);

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
