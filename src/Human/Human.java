package Human;

public class Human {
	private String name;
	private int age;
	
	Human(){}
	Human(String s, int age){
		name=s;
		this.age=age;
	}
	public void setName(String s) {
		name=s;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return this.age;
	}
}
