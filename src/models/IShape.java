package models;

public interface IShape {

    float calculateArea();
    float calculatePerimeter();
    float calculateDistance(Point p);
    float calculateDistance(Line l);
    float calculateDistance(Circle c);

}
