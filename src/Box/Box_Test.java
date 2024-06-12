package Box;
import java.util.Scanner;
public class Box_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Box b1 = new Box();
		Box b2 = new Box(sc.nextInt(),sc.nextInt(),sc.nextDouble());
		b1.setBox(sc.nextInt(),sc.nextInt(),sc.nextDouble());
		if(b1.getVolume()-b2.getVolume()<0) {
			System.out.println((b1.getVolume()-b2.getVolume())*-1);
		} else {
			System.out.println(b1.getVolume()-b2.getVolume());
		}
		
		System.out.println(b1.getArea(sc.nextInt(),sc.nextInt()));
		System.out.println(b2.getArea(sc.nextInt(),sc.nextInt()));
		System.out.println(b1.getArea(sc.nextInt(),sc.nextDouble()));
		System.out.println(b2.getArea(sc.nextInt(),sc.nextDouble()));
	}
}
