package Calculator;
import java.util.Scanner;
public class Calculator_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator(sc.nextInt(),sc.nextInt());
		
		System.out.println(c.getSum() + "  " +c.getMinus()+"  "+c.getMul()+"  "+c.getDivide());
	}
}
