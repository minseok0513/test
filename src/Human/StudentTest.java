package Human;
import java.util.Scanner;
public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] t= new Student[3];
		int sum=0;
		double ave=0.0;
		for(int i =0; i<t.length; i++) {
			t[i]=new Student();
			t[i].setName(sc.next());
			t[i].setAge(sc.nextInt());
			t[i].setMajor(sc.next());
			t[i].setScore(sc.nextInt());
			sum+=t[i].getScore();
		}
		ave=(double)sum/t.length;
		System.out.println(sum+"  "+ave);
	}
}
