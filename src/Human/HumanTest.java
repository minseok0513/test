package Human;
import java.util.Scanner;
public class HumanTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,sum=0;
		Human[] h = new Human[3];
		for(i=0; i<h.length; i++) {
			h[i]=new Human(sc.next(),sc.nextInt());
			sum+=h[i].getAge();
			System.out.println(h[i].getName());
		}
		System.out.println(sum);
		
		sc.close();
	}
}
