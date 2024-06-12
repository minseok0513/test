package String;
import java.util.Scanner;
public class WordA {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.next();
		int cnt=0;
		for(int i =0; i<s.length(); i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				cnt++;
			} else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
}
