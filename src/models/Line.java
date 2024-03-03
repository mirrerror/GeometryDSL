package models;

import java.util.Objects;

public class Line extends Shape {

    private String id;
    private float x1;
    private float y1;
    private float x2;
    private float y2;

    public Line(String id, float x1, float y1, float x2, float y2) {
        this.id = id;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line(String id, Point point1, Point point2) {
        this.id = id;
        this.x1 = point1.getX();
        this.y1 = point1.getY();
        this.x2 = point2.getX();
        this.y2 = point2.getY();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    public float getY2() {
        return y2;
    }

    public void setY2(float y2) {
        this.y2 = y2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(id, line.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Line{" +
                "id='" + id + '\'' +
                ", x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }

    @Override
    public float calculateArea() {
        return 0; // Lines do not have area
    }

    @Override
    public float calculatePerimeter() {
        return (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public float calculateDistance(Point p) {
        float numerator = Math.abs((y2 - y1) * p.getX() - (x2 - x1) * p.getY() + x2 * y1 - y2 * x1);
        float denominator = (float) Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));

        return numerator / denominator;
    }

    @Override
    public float calculateDistance(Line l) {
        float xDelta = x2 - x1;
        float yDelta = y2 - y1;
        float numerator = Math.abs((l.getY2() - l.getY1()) * x1 - (l.getX2() - l.getX1()) * y1 + l.getX2() * l.getY1() - l.getY2() * l.getX1());
        float denominator = (float) Math.sqrt(Math.pow(yDelta, 2) + Math.pow(xDelta, 2));

        return numerator / denominator;
    }

    @Override
    public float calculateDistance(Circle c) {
        float distanceToCenter = (float) Math.sqrt(Math.pow(c.getX() - x1, 2) + Math.pow(c.getY() - y1, 2));
        return Math.abs(distanceToCenter - c.getRadius());
    }
}
