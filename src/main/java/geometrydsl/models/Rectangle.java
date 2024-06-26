package geometrydsl.models;

public class Rectangle extends Shape{

    private float x;
    private float y;
    private float width;
    private float height;

    public Rectangle(String id, float x, float y, float width, float height) {
        super(id);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(String id, Point point, float width, float height) {
        super(id);
        this.x = point.getX();
        this.y = point.getY();
        this.height = height;
        this.width = width;
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

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "id='" + getId() + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public float calculateArea() {
        return height * width;
    }

    @Override
    public float calculatePerimeter() {
        return 2 * (height + width);
    }

    @Override
    public float calculateDistance(Point p) {
        return createPolygon().calculateDistance(p);
    }

    @Override
    public float calculateDistance(Line l) {
        return createPolygon().calculateDistance(l);
    }

    @Override
    public float calculateDistance(Circle c) {
        return createPolygon().calculateDistance(c);
    }

    @Override
    public float calculateDistance(Rectangle r) {
        return createPolygon().calculateDistance(r);
    }

    @Override
    public float calculateDistance(Triangle t) {
        return createPolygon().calculateDistance(t);
    }

    @Override
    public float calculateDistance(Polygon p) {
        return createPolygon().calculateDistance(p);
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

    public Polygon createPolygon() {
        Polygon polygon = new Polygon(null);
        float halfWidth = width/2;
        float halfHeight = height/2;
        polygon.addPoint(x + halfWidth, y + halfHeight);
        polygon.addPoint(x - halfWidth, y + halfHeight);
        polygon.addPoint(x - halfWidth, y - halfHeight);
        polygon.addPoint(x + halfWidth, y - halfHeight);
        return polygon;
    }
}
