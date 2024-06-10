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
}
