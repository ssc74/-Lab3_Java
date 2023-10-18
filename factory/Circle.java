package factory;



public class Circle {
	double center_x;
	double center_y;
	double radius;
	
	
	public Circle(double center_x, double center_y, double radius) {
		this.center_x = center_x;
		this.center_y = center_y;
		this.radius = radius;
	}
	

	public double getArea() {
		return Math.PI*Math.pow(this.radius, 2);
	};
	
	
	
	public double getPerimeter() {
		return  2*this.radius*Math.PI;
		
	}

	public double getCenter_x() {
		return center_x;
	}

	public void setCenter_x(double center_x) {
		this.center_x = center_x;
	}

	public double getCenter_y() {
		return center_y;
	}

	public void setCenter_y(double center_y) {
		this.center_y = center_y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	
}
