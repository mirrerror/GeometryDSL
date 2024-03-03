package models;

import java.util.Objects;

public class Point implements IShape {

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
        return 1;
    }

    @Override
    public float calculatePerimeter() {
        return 1;
    }

    @Override
    public float calculateDistance(Point p) {
        return (float) Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2));
    }

    @Override
    public float calculateDistance(Line l) {
        return 0;
    }

    @Override
    public float calculateDistance(Circle c) {
        return 0;
    }
}
