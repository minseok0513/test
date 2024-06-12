package EmployeeHW;
import java.util.Scanner;
import java.util.Arrays;
public class EmployeeTest {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		Employee[] e = new Employee[5];
		
		for(int i =0; i<e.length; i++) {
			e[i]=new Employee();
			e[i].setEmployee( sc.nextInt(),sc.next());
		}
		for(int i=0; i<e.length; i++) {
			sum+=e[i].getSalary();
			System.out.println(e[i].getName()+"  "+e[i].getSalary());
		}
		System.out.println(sum);
	}
}
