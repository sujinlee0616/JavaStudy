/* 조건문 : true/false 일 때 별도로 처리를 따로 한다.
 * 	형식) 
 * 		if(조건문)
 * 			실행문장 --> 조건문이 true일 때 실행 
 * 		else
 * 			실행문장 --> 조건문이 false일 때 실행
 * 	ex) 사용자가 두 개의 정수를 입력  --> 처리 (나누기) 
 * 		0/2 --> 0
 * 		2/0 --> error
 * 		- if문은 error를 방지하거나, 원하는 데이터를 출력하고 싶을 때 사용. 
 * 		- if --> error 방지, 원하는 데이터	
 * 				==========
 * 					실제 처리 
*/


public class 선택조건문_형식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=0;
		//System.out.println("a/b="+(a/b));
		if(b==0)
			System.out.println("0으로 나눌 수 없습니다.");
		else
			System.out.println("a/b="+(a/b));

	}

}









