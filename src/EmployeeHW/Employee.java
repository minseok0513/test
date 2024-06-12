package EmployeeHW;
import java.lang.String;
public class Employee {
	private int salary;
	private String name; 
	Employee(){
		
	}
	Employee(int a, String b){
		salary=a;
		name=b;
	}
	public void setEmployee(int a, String b) {
		salary=a;
		name=b;
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
}
