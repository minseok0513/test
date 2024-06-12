package String;
import java.util.Scanner;
import java.lang.String;
public class WordC {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String re = "";
		String s = sc.next();
		for(int i = s.length(); i>=0; i--) {
			re+=s.charAt(i);
		}
		System.out.println(re);
	}
}
