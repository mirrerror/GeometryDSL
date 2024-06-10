package geometrydsl.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
        int n = polygonPoints.size();
        if (n < 3) {
            throw new UnsupportedOperationException("A polygon must have at least 3 points to form an area");
        }

        float area = 0;
        for (int i = 0; i < n; i++) {
            CoordinateVector current = polygonPoints.get(i);
            CoordinateVector next = polygonPoints.get((i + 1) % n);

            area += (current.getX() * next.getY()) - (next.getX() * current.getY());
        }

        return Math.abs(area / 2.0f);
    }


    @Override
    public float calculatePerimeter() {
        float perimeter = 0;

        ListIterator<CoordinateVector> pointsIterator = polygonPoints.listIterator();
        CoordinateVector a = pointsIterator.next();
        while (pointsIterator.hasNext()) {
            CoordinateVector b = pointsIterator.next();

            Line line = new Line(null, a.getX(), a.getY(), b.getX(), b.getY());

            perimeter += line.calculateLength();
            a = b;
        }

        return perimeter;
    }

    @Override
    public float calculateDistance(Point p) {
        float minDistance = Float.MAX_VALUE;

        ListIterator<CoordinateVector> pointsIterator = polygonPoints.listIterator();
        while (pointsIterator.hasNext()) {
            CoordinateVector a = pointsIterator.next();
            CoordinateVector b = pointsIterator.hasNext() ? pointsIterator.next() : polygonPoints.get(0);

            Line line = new Line(null, a.getX(), a.getY(), b.getX(), b.getY());

            float distance = line.calculateDistance(p);
            System.out.println("Distance: " + distance);

            if(distance < minDistance) {
                minDistance = distance;
            }
        }

        return minDistance;
    }

    @Override
    public float calculateDistance(Line l) {
        Point p1 = new Point(null, l.getX1(), l.getY1());
        Point p2 = new Point(null, l.getX2(), l.getY2());

        return Math.min(calculateDistance(p1), calculateDistance(p2));
    }

    @Override
    public float calculateDistance(Circle c) {
        return calculateDistance(new Point(null, c.getX(), c.getY())) - c.getRadius();
    }
}
