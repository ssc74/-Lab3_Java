package factory;

import factory.WhiteTriangle;
import factory.WhiteCircle;

public class WhiteFactory implements AbstractFactory {
    public WhiteTriangle createTriangle(double x1,double y1,double x2,double y2,double x3,double y3) {
        return new WhiteTriangle(x1,y1,x2,y2,x3,y3);
    }
    public WhiteCircle createCircle(double center_x,double center_y,double radius) {
        return new WhiteCircle(center_x,center_y,radius);
    }
}
