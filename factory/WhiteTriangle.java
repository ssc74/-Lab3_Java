package factory;

public class WhiteTriangle implements Triangle{

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;


    public WhiteTriangle(double x1, double y1, double x2, double y2, double x3, double y3){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public double getArea(){
        double a = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        double b = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
        double c = Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public double getPerimeter(){
        double a = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        double b = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
        double c = Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
        return a+b+c;
    }

    public String getColor(){
        return "White";
    }
}
