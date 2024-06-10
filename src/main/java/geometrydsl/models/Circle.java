package geometrydsl.models;

public class Circle extends Shape {

    private float x;
    private float y;
    private float radius;

    public Circle(String id, float x, float y, float radius) {
        super(id);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(String id, Point point, float radius) {
        super(id);
        this.x = point.getX();
        this.y = point.getY();
        this.radius = radius;
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
    public String toString() {
        return "Circle{" +
                "id='" + getId() + '\'' +
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
        Triangle triangle = new Triangle(null, x, y, l.getX1(), l.getY1(), l.getX2(), l.getY2());
        return (2 * triangle.calculateArea() / l.calculateLength()) - radius;
    }

    @Override
    public float calculateDistance(Circle c) {
        float distanceBetweenCenters = (float) Math.sqrt(Math.pow(c.getX() - x, 2) + Math.pow(c.getY() - y, 2));
        return Math.abs(distanceBetweenCenters - (c.getRadius() + radius));
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
}
