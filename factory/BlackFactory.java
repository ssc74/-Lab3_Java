package factory;

import factory.BlackTriangle;
import factory.BlackCircle;

public class BlackFactory implements AbstractFactory {
    public BlackTriangle createTriangle(double x1,double y1,double x2,double y2,double x3,double y3) {
        return new BlackTriangle(x1,y1,x2,y2,x3,y3);
    }
    public BlackCircle createCircle(double center_x,double center_y,double radius) {
        return new BlackCircle(center_x,center_y,radius);
    }
}
