package Plane;
import java.util.Scanner;
public class PlaneTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, model_name;
		int P_num;
		System.out.println("비행기 정보 입력");
		System.out.printf("id 입력");
		id=sc.nextLine();
		System.out.printf("승객 수");
		P_num=sc.nextInt();
		System.out.printf("모델");
		model_name=sc.nextLine();
		sc.nextLine();
		
		
		Plane p1 = new Plane(id, P_num, model_name);
		System.out.println("\n생성된 비행기 정보:");
        System.out.println(p1);
        System.out.println("\n현재 비행기 수: " + Plane.getNplanes());
	}
}
