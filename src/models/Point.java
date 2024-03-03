package models;

import java.util.Objects;

public class Point extends Shape {

    private String id;
    private float x;
    private float y;

    public Point(String id, float x, float y) {
        this.id = id;
        this.x = x;
        this.y = y;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(id, point.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Point{" +
                "id='" + id + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public float calculateArea() {
        return 0; // Points do not have area
    }

    @Override
    public float calculatePerimeter() {
        return 0; // Points do not have perimeter
    }

    @Override
    public float calculateDistance(Point p) {
        return (float) Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2));
    }

    @Override
    public float calculateDistance(Line l) {
        float numerator = Math.abs((l.getY2() - l.getY1()) * x - (l.getX2() - l.getX1()) * y + l.getX2() * l.getY1() - l.getY2() * l.getX1());
        float denominator = (float) Math.sqrt(Math.pow(l.getY2() - l.getY1(), 2) + Math.pow(l.getX2() - l.getX1(), 2));

        return numerator / denominator;
    }

    @Override
    public float calculateDistance(Circle c) {
        float distanceToCenter = (float) Math.sqrt(Math.pow(c.getX() - x, 2) + Math.pow(c.getY() - y, 2));
        return Math.abs(distanceToCenter - c.getRadius());
    }
}
