package QuestionC;

public class IllegalRectangle extends Exception{
	
	private double x;
	private double y;
	
	public IllegalRectangle(double x, double y) {
		this.x = x;
		this.y = y;
		
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	
}
