/*
 * <메소드>
 * 
 * 1) 형식
 * 	리턴형 메소드명(매개변수1, 매개변수2,...) <== 선언부
 * 	====얘와
 *  {
 *  	기능구현 <== 구현부 
 *   	return 결과값;
 *   			=== 얘가 같은 데이터형. : 리턴형과 결과값은 같은 데이터형!!★
 *  }
 *  => 리턴형이 없는 경우 => return을 생략할 수 있다. 
 *  => 모든 메소드는 종료하기 위해서 반드시 마지막에 return을 사용해야 한다.
 *  	예외) => 조건문을 사용해서 return을 사용할 수 있다. 
 *  	=> return문 아래는 어떤 문장도 사용이 불가능하다.
 *  	ex) display(10); => 메소드 호출 
 *  		static void display (int a)
 *  		{
 *  			System.out.println(a);  ==> 10 
 *  			return;
 *  			System.out.println(a+1);  ==> 오류남. 수행 안 됨. (return문 아래는 어떤 문장도 사용이 불가능하다.)  
 *  		}
 *  	ex) static void display (int a)
 *  		{
 *  			System.out.println(a); ==> 10 
 *  			if(a==10)
 *  				return;				==> 위에서 a=10 이었므로 종료됨. 
 *  			System.out.println(a+1);	==> 실행 안 됨. 이미 위에서 종료되었으니까. 
 *  		}
 *  
 * 2) 리턴형 : 기본형, 클래스, 배열
 * 	int method()
 * 	Movie method()
 * 	int[] method()
 * 	결과값이 없는 경우 => void  
 * 
 * 3) 매개변수 : 사용자 요청값 
 * 	=> 3개 이상이면 묶어서 요청 => 배열, 클래스 
 * 	   ┖ ex) 회원가입(클래스), 게시판 글쓰기 (클래스) 
 * 
 * 
 * 4) 매개변수 전송법
 * 	(1) call by value : 기본형, String 
 *		- 메모리를 따로 생성 (복제(값))  
 * 	(2) call by reference : 배열, 클래스 
 * 		- 같은 주소를 이용해서 값을 변경 
 * 
 * 5) 호출
 * 	메소드명()
 * 	메소드명(10,20) 
 * 	=============== return이 없는 경우
 * 	데이터형 변수=메소드()
 * 	데이터형 변수=메소드(19,20)
 * 	*** 모든 메소드는 수행이 종료된 다음 다시 호출한 위치로 돌아온다 ★★
 * 	*** 메소드를 여러개 호출 시 => 한 개의 메소드가 수행을 종료해야만 다음 메소드를 호출/수행 될 수 있다. ★
 * 		==> 메소드를 동시다발적으로 수행 못하므로 스레드를 사용... 멀티 스레드.... 
 * 		ex) a()	
 * 			b()
 * 			c()
 * 			==================
 * 				c()
 * 			==================
 * 				b()
 * 			==================
 * 				a()   =========> 수행 (콜 스택 call stack) 
 * 			================== 
*/

// ex) call by value : 기본형, String  
public class 메소드_CallByValue {
	//static void swap(int a,int b) 
	static void swap(String a,String b){ //<== ★호출 시에 a,b 메모리 생김★ 
		System.out.println("변경 전=> swap: a="+a+", b="+b); //a=10, b=20; //a=Hello, b=Java
		//a와 b의 값 변경 
		//int temp=a;
		String temp=a;
		a=b;
		b=temp;
		System.out.println("변경 후=> swap: a="+a+", b="+b); //a=20, b=10; //a=Java, b=Hello <== 값이 바뀌었음 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello";
		String b="Java";
		//int a=10;
		//int b=20;
		swap(a,b);
		System.out.println("main: a="+a+", b="+b);
		// a=10, b=20 <== 값이 바뀌지 않았다! ★
		// a=Hello, b=Java <== 값이 바뀌지 않았다!
		// 기본형과 String은 이런식으로 구동됨. 
		// swap의 a,b와 main의 a,b는 사용하는 메모리가 다르기 때문!!!★★

	}

}
