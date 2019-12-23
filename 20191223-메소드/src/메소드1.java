/*
 * 메소드
 * 	= 매개변수 (사용자 요청값) => 행위  ====> 여러개 
 * 		ex) 영화 관련 사이트에서...
 * 			
 * 	= 리턴형 => 요청내용에 대한 결과값 전송 ====> 한 개만 출력. (데이터 여러개 => 묶어서) 
 * 			  ===================
 * 			    기본형, 배열, 클래스 
 * 	======================================================
 * 	형식) ★★★
 * 		리턴형 메소드명(매개변수, ...) => 선언부
 * 		{
 * 			==> 구현부
 * 			return 결과값		======> ★(리턴형=결과값) ★
 * 				   =====				   ==== 작은 데이터형을 사용할 수 있다. 
 * 		}
 * 		ex1)  
 * 		int aaa()
 * 		{
 * 			return (int, char, byte, short 가능) <== 결과값은 리턴형보다 작아야 하니까 
 * 		}
 * 		***** 호출
 * 			int a=aaa()
 * 	
 * 		==> return 생략 가능 : 리턴형이 void일때 생략 가능. 
 * 
 * 		ex2)
 * 		배열
 * 		int[] aaa()
 * 		{	
 * 			return 배열명 
 * 		}
 * 		int[] arr=aaa(); <== double[] arr=aaa(); 도 가능하지만 권장사항은 (리턴형=결과값)
 * 		
 * 		ex3) 
 * 		클래스 
 * 		String aaa()
 * 		{
 * 			return ""(문자열)
 * 		}
 * 		결과값이 없는 경우
 * 		void aaa()
 * 		{
 * 			return;
 * 		}
 * 		aaa()
 * 		==========================================================================
 * 
 * 		매개변수가 있는 경우
 * 		ex) 
 * 		int plus(int a,int b)
 * 		===		=============
 * 		
 * 		{
 * 			a=10, b=30;
 * 			return a+b;
 * 		}
 * 		int a=plus(10,30) ==> 40 
 * 		
 * 		ex) 
 * 		void aaa()
 * 		{
 * 			=== 1
 * 			=== 2
 * 			=== 3
 * 			=== 4
 * 			=== 5
 * 			=== 6
 * 			=== 7
 * 		}
 * 		aaa() ==> 1234567
 * 		aaa() ==> 1234567  ==> 반복과 관련된 ..
 *  
 * 		ex) 
 * 		1234567
 * 		780
 * 		345
 * 		1234567
 * 		70
 * 		90
 * 		1234567 <== 반복되는 요 아이는 메소드로 만들면 편하겠쥬?
 * 
 * 		제어문 => 반드시 패턴이 존재 
 * 
 * 		묶어보자...
 * 		1 232 43434 434 343 4 34 34 343434 <== 이걸 묶고 싶다면 데이터형이 같으니까... 배열로 묶는다. => int[] 
 * 		113 "aaa" "aadad" 0.9 10.2F 10L 'A' <== 이걸 묶고 싶다면 데이터형이 다르니까... 클래스로 묶는다. => class
*/
public class 메소드1 {
	static void message() //<== static 붙이면 가상머신에 자동 저장됨. 
	{
		System.out.println("Hello Java!!");
		return; //생략되면 => JVM이 자동으로 return 코딩해준다. 
	} 
	static int aaa() {
		return 10;
	}
	static double bbb() {
		return 10.5;
	}
	static String ccc() {
		return "Hello";
	}	
	static int[] ddd()	{
		int[] arr={1,2,3,4,5,6};
		return arr;
	}	
	static int eee(int a) {
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		message(); //<== 만약 위에서 static 안 붙였으면 에러남. 저장 안 됐기 때문.
		
		//객체지향 방식으로 사용하면 아래와 같음. 이렇게 쓰는게 더 많음. 
		메소드1 a=new 메소드1(); //new 해야 저장됨. 
		a.message();
		
		//내가 만든 메소드의 결과값, 메소드가 무엇인지 유의해서 호출해야.
		//호출 ==> 1. 결과값 2. 매개변수 요청 
		int ex=aaa();
		double d=bbb();
		String s=ccc();
		int[] arr=ddd();
		int aa=eee(10);
	}

}











