package factory;

public class WhiteCircle extends Circle {
 
	String colour;
	

	public WhiteCircle(double center_x, double center_y, double radius) {
		super(center_x, center_y, radius);
		
	}

	public String getColor(){
		return "White";
	}

}
