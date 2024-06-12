package Practice_workout;
import java.util.Scanner;
public class ArrayBasic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		double ave;
		double [] arr=new double[5];
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextDouble();
			sum+=arr[i];
		}
		ave=sum/arr.length;
		System.out.println(sum+"  "+ave);
	}
}
