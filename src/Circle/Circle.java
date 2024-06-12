package Circle;

public class Circle {
	private int x,y,r;
	Circle(){
		
	}
	public void setCircle(int a, int b, int c) {
		x=a;
		y=b;
		r=c;
	}
	Circle(int a, int b, int c){
		x=a;
		y=b;
		r=c;
	}
	
	public int setXCoordinate() {
		return x;
	}
	public int setYCoordinate() {
		return y;
	}
	public int setRadius() {
		return r;
	}
	public double getArea() {
		return r*r*3.1415;
	}
}
