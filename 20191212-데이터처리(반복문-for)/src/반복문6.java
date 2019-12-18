/*
 * ex) 3글자 값을 입력받고, 그 값에서 3을 뺀 글자를 출력하라. (시져스 암호화) 
 * 알파벳을 대문자로.
 * ex) DDD ===> AAA, ZZZ ===> WWW. 
*/
import java.util.Scanner;
public class 반복문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//내가 푼 방식 
		Scanner scan = new Scanner(System.in);
		System.out.println("영어대문자 3글자를 입력해주세요.");
		String input=scan.next();
		
		char c0=input.charAt(0);
		char c1=input.charAt(1);
		char c2=input.charAt(2);
		
		c0-=3;
		c1-=3;
		c2-=3;
		
		System.out.printf("%c%c%c\n\n",c0,c1,c2);
		
		//선생님이 푼 방식 
		System.out.println("영어대문자 3글자를 입력해주세요.");
		String data=scan.next();
		for(int i=0;i<data.length();i++){
			char c=data.charAt(i);
			System.out.print((char)(c-3));
		}
		
		
	}

}
