package geometrydsl.models;

import java.util.Objects;

public class Circle extends Shape {

    private String id;
    private float x;
    private float y;
    private float radius;

    public Circle(String id, float x, float y, float radius) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(String id, Point point, float radius) {
        this.id = id;
        this.x = point.getX();
        this.y = point.getY();
        this.radius = radius;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(id, circle.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id='" + id + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }

    @Override
    public float calculateArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public float calculatePerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public float calculateDistance(Point p) {
        return (float) Math.abs(Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2)) - radius);
    }

    @Override
    public float calculateDistance(Line l) {
        float distanceToCenter = (float) Math.sqrt(Math.pow(l.getX1() - x, 2) + Math.pow(l.getY1() - y, 2));
        return Math.abs(distanceToCenter - radius);
    }

    @Override
    public float calculateDistance(Circle c) {
        float distanceBetweenCenters = (float) Math.sqrt(Math.pow(c.getX() - x, 2) + Math.pow(c.getY() - y, 2));
        return Math.abs(distanceBetweenCenters - (c.getRadius() + radius));
    }
}
