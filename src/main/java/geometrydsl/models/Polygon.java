package geometrydsl.models;

import java.util.ArrayList;
import java.util.List;

public class Polygon extends Shape {

    private List<CoordinateVector> polygonPoints;

    public Polygon(String id, List<CoordinateVector> polygonPoints) {
        super(id);
        this.polygonPoints = new ArrayList<>(polygonPoints);
    }

    public Polygon(String id) {
        super(id);
        this.polygonPoints = new ArrayList<>();
    }

    public void addPoint(float x, float y) {
        polygonPoints.add(new CoordinateVector(x, y));
    }

    public void removePoint(float x, float y) {
        polygonPoints.remove(new CoordinateVector(x, y));
    }

    public void addPoint(Point point) {
        addPoint(point.getX(), point.getY());
    }

    public void removePoint(Point point) {
        removePoint(point.getX(), point.getY());
    }

    public List<CoordinateVector> getPolygonPoints() {
        return polygonPoints;
    }

    public void setPolygonPoints(List<CoordinateVector> polygonPoints) {
        this.polygonPoints = polygonPoints;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "id='" + getId() + '\'' +
                ", polygonPoints=" + polygonPoints +
                '}';
    }

    @Override
    public float calculateArea() {
        return 0;
    }

    @Override
    public float calculatePerimeter() {
        return 0;
    }

    @Override
    public float calculateDistance(Point p) {
        return 0;
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
