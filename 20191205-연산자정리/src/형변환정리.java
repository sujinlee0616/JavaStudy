/*
 * <형변환>
 * 	1. 자동 형변환 
 * 		: 연산 시 많이 나옴
 * 		ex) int + double = double
 * 			===
 * 			double로 변경하여 연산
 * 		ex) char + int = int
 * 			====
 * 			int로 변경하여 연산
 * 		ex) char c='A'; c>='A' && c<='Z'
 * 							==		 ===
 * 							65        90	--> ★★char는 모든 연산 시 int로 변경됨★★
 * 		ex) ★★★int 이하는 계산 시 모두 int로 변경됨 ★★★
 * 			byte+byte=int
 * 			short+short=int
 * 			char+char=int
 * 	2. 강제 형변환 : cast 연산자
 * 		: down할 때 많이 사용. 
 * 		ex) int → char 로 바꿀 때.
 * 			char c=65; (O) char에 int 넣으면, 데이터 크기 안 맞지만 예외적으로 에러 안 남. 
 * 			float f=10.7; (X) error. 왜냐면 float에 double 데이터를 넣으면 크기가 안 맞아서 에러남. (double이 더 크니까)
 * 			int a=10.7 (X) error. int에다가 double 데이터를 넣으면 크기가 안 맞아서 에러남.(double이 더 크니까)
 * 
 * 		ex) double → int 로 바꿀 때.
 * 
 * 
 * 
*/		
public class 형변환정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c=65;
		float f=10;
		double d='A';
		System.out.println("c="+c); //c=A
		System.out.println("f="+f); //f=10.0
		System.out.println("d="+d); //d=65.0
		

	}

}
