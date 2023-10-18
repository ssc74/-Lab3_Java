package factory;

import factory.Triangle;
import factory.Circle;

public interface AbstractFactory {
    Triangle createTriangle(double x1, double y1, double x2, double y2, double x3, double y3);
    Circle createCircle(double center_x,double center_y,double radius);
}
