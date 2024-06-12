package String;
import java.util.Scanner;
public class WordB {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s=sc.next();
		int BigCnt=0;
		int SmallCnt=0;
		for(int i =0; i<s.length(); i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				BigCnt++;
			} else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				SmallCnt++;
			}
		}
		System.out.println(BigCnt+" "+SmallCnt);
		
	}
}
