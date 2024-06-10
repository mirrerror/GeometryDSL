package geometrydsl.models;

public class Line extends Shape {

    private float x1;
    private float y1;
    private float x2;
    private float y2;

    public Line(String id, float x1, float y1, float x2, float y2) {
        super(id);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line(String id, Point point1, Point point2) {
        super(id);
        this.x1 = point1.getX();
        this.y1 = point1.getY();
        this.x2 = point2.getX();
        this.y2 = point2.getY();
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
    public String toString() {
        return "Line{" +
                "id='" + getId() + '\'' +
                ", x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }

    @Override
    public float calculateArea() {
        throw new UnsupportedOperationException("Area calculation is not supported for lines");
    }

    @Override
    public float calculatePerimeter() {
        throw new UnsupportedOperationException("Perimeter calculation is not supported for lines");
    }

    public float calculateLength() {
        return (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public float calculateDistance(Point p) {
        Triangle triangle = new Triangle(null, p.getX(), p.getY(), getX1(), getY1(), getX2(), getY2());
        return (2f * triangle.calculateArea() / calculateLength());
    }

    @Override
    public float calculateDistance(Line l) {
        Triangle triangle1 = new Triangle(null, l.getX1(), l.getY1(), l.getX2(), l.getY2(), x1, y1);
        Triangle triangle2 = new Triangle(null, l.getX1(), l.getY1(), l.getX2(), l.getY2(), x2, y2);
        return Math.min(2 * triangle1.calculateArea() / l.calculateLength(), 2 * triangle2.calculateArea() / l.calculateLength());
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
}
