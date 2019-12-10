/*
 * 값 표현
 * char --> '' 
 * int --> 10(10진법), 010(8진법), 0x12(16진법), 0b1010101(2진법) : 4가지 형식으로 표현 가능.
 * long --> 10L, 10l 
 * float --> 10.5F, 10.5f
 * boolean --> true, false
 * String --> ""
 * 
 * 비교연산자 --> 결과값 (boolean) : true, false 
 * =======
 * 	1) == (같다) ex) 6==7 (false), 6==6 (true)
 *	2) != (같지 않다) ex) 6!=7 (true), 6!=6 (false)
 *	3) < (작다) ex) 6<5 (false) 6<7 (true)
 *	4) > (크다) ex) 6>5 (true) 6>7 (false)
 *	5) <= (작거나 같다) ex) 6<=6 (true) 
 *						====
 *						6<6 || 6==6 : 한 쪽이 true면 true. 
 *	6) >= (크거나 같다) ex) 6>=6 (true)
 *	=========================================== if, while, for문에서 주로 사용.
 *		** if : 조건문 / while,for : 반복문
 *  
 *  
*/
import java.util.Scanner; // Scanner만 불러옴. 속도가 빠름. 
//import java.util.*; <-- 모든 클래스를 불러옴. 속도가 느려짐. 
public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1=10==1;
		System.out.println("b1="+b1);
		
		b1=10!=11;
		System.out.println("b1="+b1);
		
		b1=10<11;
		System.out.println("b1="+b1);
		
		b1=10>11;
		System.out.println("b1="+b1);
		
		// char ==> 모든 연산에서 정수(숫자)로 변경됨. 
		b1=65<='A'; //A=65니까 b1=65<=65;
		System.out.println("b1="+b1); 
		
		b1=65>='B'; //B=66
		System.out.println("b1="+b1);
		
		//char --> 번호 몇 개 기억해놔야. : 아스키코드 
		System.out.println((int)'A'); //'A'=65 ★
		System.out.println((int)'0'); //'0'=48 ★
		System.out.println((int)'a'); //'a'=97 ★
		
		// 두 개의 정수를 받아서 큰 값을 출력 
		
		Scanner scan=new Scanner(System.in);
		// new --> 메모리에 저장. 
		// System.in : 생성자 --> 초기값 부여.
		/*
		 * 	scan.nextInt() : int 받음
		 * 	scan.nextDouble() : double 받음
		 * 	scan.next() : String 받음
		 * 	scan.nextBoolean() : boolean 받음 
		 * 	--> char(X) char는 없다. 
		*/
		// 1. 받아서 저장할 변수
		int num1,num2;
		System.out.print("첫번째 정수 입력:");
		num1=scan.nextInt();
		// 입력 후 엔터 치면 num1에 입력한 숫자가 저장된다. 
		
		System.out.println("두번쨰 정수 입력:");
		num2=scan.nextInt();
		
		// 조건식?:값1:값2 <-- 조건식이 true면 값1, false면 값2.
		int result=num1<num2?num2:num1; //true면 num2출력, false면 num1 출력
		System.out.println(num1+"과 "+num2+" 중 더 큰 값은 "+result+"입니다.");
		
		
		
		 

	}

}
















