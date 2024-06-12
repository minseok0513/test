package Book;
import java.util.Scanner;
public class MegazineTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Megazine m = new Megazine(sc.next(),sc.next(),sc.nextInt(),sc.nextInt());
		System.out.println(m.getInfo());
	}
}
