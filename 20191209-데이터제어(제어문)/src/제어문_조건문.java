/*
 *<조건문> 
 * 1. 단일조건문
 * 	1) 형식
 * 	 (1)실행문장 1개인 경우
 * 	   if(조건문)
 * 		실행문장
 * 	 (2)실행문장 2개 이상인 경우 
 * 	   if(조건문){
 * 		실행문장1
 * 		실행문장2
 * 		}
 * 	 (3)기타 - 유의사항 
 * 	   if(조건문)
 * 		실행문장1 --> if 안에 속함 O. 
 * 		실행문장2 --> if 안에 속하지X. 괄호 없으면 if 바로 뒤의 문장만 if절에 소속된다. 
 * 	2) 조건문 처리방법
 * 	   ======
 * 	   true/false --> 부정연산자, 비교연산자, 논리연산자 
 *  3) 실행 --> 조건이 true--> 문장 수행 O 
 *  		     조건이 false --> 문장 수행 X 
 * 2. 선택 조건문
 * 3. 다중 조건문 
*/

/* 1) 자바에서 생략 가능한 부분
 * 	1. import : 라이브러리 클래스를 불러온다. 
 * 				java.lang은 import 하지 않아도 쓸 수 있다. 
 * 				=========
 * 					java.lang 안에 있는 애들 : System, String,Math   
 * 	2. return ★ ★★: 모든 메소드는 return을 가지고 있다. 
 * 	3. 상속 ★★★: java의 모든 클래스(사용자 정의)는 Object 상속 
 * 	4. 예외처리 ★★★: java의 모든 클래스는 예외처리를 갖고 있다. 
 * 	   ======
 * 		비정상 종료를 방지하고 정상상태를 유지 (미리 에러를 방지하는 프로그램) 
 * 
*/
import java.util.Scanner; 
// import : 이미 만들어진 클래스를 불러올 때 사용.
// CBD : Component Based Development. 조립식 프로그램... 라이브러리 하나가 레고같이 사용될 수 있음.  
// 참고) 실무에서는 class를 '컴포넌트'라고 부름. 
// class = 컴포넌트 = 레고 블록 하나. ★★★ --> 조립에 쓸 수 있음.  
// Spring : 클래스 관리자. losely coupling 되므로, 하나의 클래스가 에러나도 다른 클래스들은 멀쩡! 영향 안 받음. 굳굳.  
public class 제어문_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//return; : 원래는 끝나고 맨 끝에 return을 줘야하는데, 생략할 경우에는 jvm(가상머신)에서 알아서 자동으로 return 준다.

		// ex1) 정수를 입력받아서 홀수/짝수 판별
		//키보드 입력 
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력:");
		//입력된 값을 저장
		int num=scan.nextInt();
		
		//짝수 조건
		if(num%2==0) {
			System.out.println(num+ "는(은) 짝수입니다.");
		}
		if(num%2!=0) {
			System.out.println(num+ "는(은) 홀수입니다");
		}
	}

}










