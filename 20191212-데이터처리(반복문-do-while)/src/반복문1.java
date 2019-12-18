/*
 * do while : 한 번 이상 실행하는 반복문. (사용 빈도는 많지는 않음) 
 * 	형식)
 * 		데이터 베이스 : 웹 
 * 		네트워크 : 스마트폰
 * 		=============
 * 
 * 		초기값
 * 		do{
 * 			실행문장 ==> 여러 문장을 사요할 수 있다. 
 * 			증감식  ==> ex) i++;, i--;, i+=2;, i-=2;
 * 		}while(조건문); <=== while 다음에 세미콜론(;) 까먹지 말 것!!!
 * 	
 * 	기타) C, C++, C#, Java ==> 0부터 시작함. (ex. 문자열, 자료구조(List, Set, Map), 배열)  
 * 
*/		
public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~10 출력 
		int i=1; // 루프변수
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		
		System.out.println();
		
		//10~1 출력 : 선생님이 짠 거
		do {
			System.out.println("i="+(i-1));
			i--;
		}while(i>1);
		
		//10~1 출력 : 내가 짠 거 
		i=10;
		do {
			System.out.println(i);
			i--;
		}while(i>=1);

	}

}
