package Calculator;

public class Calculator {
	private int a,b;
	Calculator(int x, int y){
		a=x;
		b=y;
	}
	public int setA() {
		return a;
	}
	public int setB() {
		return b;
	}
	public int getSum() {
		return a+b;
	}
	public int getMinus() {
		return a-b;
	}
	public int getMul() {
		return a*b;
	}
	public int getDivide() {
		return a/b;
	}
}
