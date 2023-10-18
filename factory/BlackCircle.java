package factory;

public class BlackCircle extends Circle {

	String colour ;
	
	public BlackCircle(double center_x, double center_y, double radius) {
		super(center_x, center_y, radius);
	}


	public String getColor(){
		return "Black";
	}
	
}
