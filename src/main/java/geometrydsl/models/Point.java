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
        throw new UnsupportedOperationException("Points do not have area");
    }

    @Override
    public float calculatePerimeter() {
        throw new UnsupportedOperationException("Points do not have perimeter");
    }

    @Override
    public float calculateDistance(Point p) {
        return (float) Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2));
    }

    @Override
    public float calculateDistance(Line l) {
        return l.calculateDistance(this);
    }

    @Override
    public float calculateDistance(Circle c) {
        return c.calculateDistance(this);
    }

    @Override
    public float calculateDistance(Rectangle r) {
        return r.calculateDistance(this);
    }

    @Override
    public float calculateDistance(Triangle t) {
        return t.calculateDistance(this);
    }

    @Override
    public float calculateDistance(Polygon p) {
        return p.calculateDistance(this);
    }

    @Override
    public boolean contains(Point p) {
        return this.x == p.getX() && this.y == p.getY();
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
        return contains(p);
    }

    @Override
    public boolean intersects(Line l) {
        return l.contains(this);
    }

    @Override
    public boolean intersects(Circle c) {
        float distanceToCenter = calculateDistance(new Point(null, c.getX(), c.getY()));
        return distanceToCenter <= c.getRadius();
    }

    @Override
    public boolean intersects(Rectangle r) {
        return r.contains(this);
    }

    @Override
    public boolean intersects(Triangle t) {
        return t.contains(this);
    }

    @Override
    public boolean intersects(Polygon p) {
        return p.contains(this);
    }
}
