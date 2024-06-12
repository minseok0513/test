package Circle;
import java.util.Scanner;
public class Circle_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle();
		Circle c2 = new Circle(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		c1.setCircle(sc.nextInt(),sc.nextInt(),sc.nextInt());
		
		System.out.println(c1.getArea()-c2.getArea());
	}
}
