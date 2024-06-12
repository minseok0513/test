package Word_Test;
import java.util.Scanner;
public class Array {
	private double[] numbers;
	
	public Array(double[] numbers) {
		this.numbers=numbers;
	}
	public double sum() {
		double sum=0;
		for(double num : numbers) {
			sum = sum+num;
		}
		return sum;
	}
	public double average() {
		if(numbers.length == 0) {
			return 0;
		}
		return sum()/numbers.length;
	}
	public int count() {
		return numbers.length;
	}
}
class Array_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		double[] nums= new double[a];
		
		for(int i = 0; i<a; i++) {
			nums[i]=sc.nextDouble();
		}
		Array array = new Array(nums);
		System.out.println("합 : "+array.sum());
		System.out.println("평균 : "+array.average());
		System.out.println("개수 : "+array.count());
	}
}
