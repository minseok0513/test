package Human;

public class Student extends Human{
	private String major;
	private int score;
	Student(){}
	Student(String m, int s, String name, int age){
		major=m;
		score=s;
		super.setName(name);
		super.setAge(age);
	}
	public void setMajor(String m) {
		major=m;
	}
	public void setScore(int s) {
		score=s;
	}
	public String getMajor() {
		return major;
	}
	public int getScore() {
		return score;
	}
}
