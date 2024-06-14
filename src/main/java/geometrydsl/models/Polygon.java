package geometrydsl.models;

import java.util.ArrayList;
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

        CoordinateVector b = polygonPoints.get(0);
        Line line = new Line(null, a.getX(), a.getY(), b.getX(), b.getY());
        perimeter += line.calculateLength();

        return perimeter;
    }

    @Override
    public float calculateDistance(Point p) {
        float minDistance = Float.MAX_VALUE;
        int numPoints = polygonPoints.size();

        for (int i = 0; i < numPoints; i++) {
            CoordinateVector a = polygonPoints.get(i);
            CoordinateVector b = polygonPoints.get((i + 1) % numPoints);

            float distance = pointToSegmentDistance(p.getX(), p.getY(), a.getX(), a.getY(), b.getX(), b.getY());

            if (distance < minDistance) {
                minDistance = distance;
            }
        }

        return minDistance;
    }

    private float pointToSegmentDistance(float px, float py, float x1, float y1, float x2, float y2) {
        float ABx = x2 - x1;
        float ABy = y2 - y1;
        float APx = px - x1;
        float APy = py - y1;
        float AB_AB = ABx * ABx + ABy * ABy;
        float AP_AB = APx * ABx + APy * ABy;
        float t = AP_AB / AB_AB;

        float closestX, closestY;
        if (t < 0) {
            closestX = x1;
            closestY = y1;
        } else if (t > 1) {
            closestX = x2;
            closestY = y2;
        } else {
            closestX = x1 + t * ABx;
            closestY = y1 + t * ABy;
        }

        float distX = px - closestX;
        float distY = py - closestY;
        return (float) Math.sqrt(distX * distX + distY * distY);
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

    @Override
    public float calculateDistance(Rectangle r) {
        return calculateDistance(r.createPolygon());
    }

    @Override
    public float calculateDistance(Triangle t) {
        return calculateDistance(t.createPolygon());
    }

    @Override
    public float calculateDistance(Polygon p) {
        float minDistance = Float.MAX_VALUE;

        List<CoordinateVector> points1 = this.getPolygonPoints();
        List<CoordinateVector> points2 = p.getPolygonPoints();
        int numPoints1 = points1.size();
        int numPoints2 = points2.size();

        for (int i = 0; i < numPoints1; i++) {
            CoordinateVector a1 = points1.get(i);
            CoordinateVector b1 = points1.get((i + 1) % numPoints1);

            for (int j = 0; j < numPoints2; j++) {
                CoordinateVector a2 = points2.get(j);
                CoordinateVector b2 = points2.get((j + 1) % numPoints2);

                float distance = segmentToSegmentDistance(
                        a1.getX(), a1.getY(), b1.getX(), b1.getY(),
                        a2.getX(), a2.getY(), b2.getX(), b2.getY()
                );

                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
        }

        return minDistance;
    }

    @Override
    public boolean contains(Point p) {
        return false;
    }

    @Override
    public boolean contains(Line l) {
        return false;
    }

    @Override
    public boolean contains(Circle c) {
        return false;
    }

    @Override
    public boolean contains(Rectangle r) {
        return false;
    }

    @Override
    public boolean contains(Triangle t) {
        return false;
    }

    @Override
    public boolean contains(Polygon p) {
        return false;
    }

    @Override
    public boolean intersects(Point p) {
        return false;
    }

    @Override
    public boolean intersects(Line l) {
        return false;
    }

    @Override
    public boolean intersects(Circle c) {
        return false;
    }

    @Override
    public boolean intersects(Rectangle r) {
        return false;
    }

    @Override
    public boolean intersects(Triangle t) {
        return false;
    }

    @Override
    public boolean intersects(Polygon p) {
        return false;
    }

    private float segmentToSegmentDistance(float x1, float y1, float x2, float y2, float x3, float y3, float x4, float y4) {
        float minDist = Float.MAX_VALUE;
        minDist = Math.min(minDist, pointToSegmentDistance(x1, y1, x3, y3, x4, y4));
        minDist = Math.min(minDist, pointToSegmentDistance(x2, y2, x3, y3, x4, y4));
        minDist = Math.min(minDist, pointToSegmentDistance(x3, y3, x1, y1, x2, y2));
        minDist = Math.min(minDist, pointToSegmentDistance(x4, y4, x1, y1, x2, y2));
        return minDist;
    }

}
