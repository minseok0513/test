package Box;

public class Box {
	private int x,y;
	private double z;
	
	Box(){
		
	}
	public void setBox(int a, int b, double c) {
		x=a;
		y=b;
		z=c;
	}
	Box(int a, int b, double c){
		x=a;
		y=b;
		z=c;
	}
	public int setX() {
		return x;
	}
	public int setY() {
		return y;
	}
	public double setZ() {
		return z;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public double getZ() {
		return z;
	}
	public double getVolume() {
		return x*y*z;
	}
	public int getArea(int x,int y) {
		return x*y;
	}
	public double getArea(int y, double z) {
		return (double)y*z;
	}
	
	
}
