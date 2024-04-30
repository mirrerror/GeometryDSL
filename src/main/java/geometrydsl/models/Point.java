package geometrydsl.models;

public class Point extends Shape {

    private float x;
    private float y;

    public Point(String id, float x, float y) {
        super(id);
        this.x = x;
        this.y = y;
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
    public String toString() {
        return "Point{" +
                "id='" + getId() + '\'' +
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
