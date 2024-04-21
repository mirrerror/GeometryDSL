package geometrydsl.models;

public class Triangle extends Shape {
    private float x1;
    private float y1;
    private float x2;
    private float y2;
    private float x3;
    private float y3;

    public Triangle(String id, float x1, float y1, float x2, float y2, float x3, float y3) {
        super(id);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
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

    public float getX3() {
        return x3;
    }

    public void setX3(float x3) {
        this.x3 = x3;
    }

    public float getY3() {
        return y3;
    }

    public void setY3(float y3) {
        this.y3 = y3;
    }

    @Override
    public float calculateArea() {
        return (float) 0.5 * Math.abs(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2));
    }

    @Override
    public float calculatePerimeter() {
        return (float) (Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))
                + Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2))
                + Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)));
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
