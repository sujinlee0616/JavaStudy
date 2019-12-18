import java.util.Scanner;

/*
 * for:반복문 (반복횟수가 지정)
 * ====
 * 일반 for문
 * 	형식) 
 * 		for(초기값;조건식;증가식)
 * 			실행문장
 * 					===================== ↑
 * 					↓false : 종료 
 * 		=> 초기값 => 조건식 => 실행문장 => 증가식
 * 
 *  	= 초기값
 *  	= 
 *  	= 실행문장의 범위
 *  	  =============> 한문장{}(O,X), 여러문장{}(O)
 *  	= 증가식 ==> 1개씩
 *  	= 변수가 한개이상
 *  	  for(int i=0,j=1;i<=1 && j>=1;... ) <=== 조건을 여러개 걸 수 있다. 
 *  	= for(int i=0; ...) => i는 지역변수이므로 i는 for문 안에서만 사용 가능. 
 *  	변수선언
 *  	{
 *  		변수선언
 *  	}
 *  
 *  
 * 향상된 for문 (JDK1.5이상) : 배열, 컬렉션(데이터베이스)
 * 	
 * ====
 * ***메소드(일반메소드, 람다식(함수포인터):JDK1.8)
 * 
*/
public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// public과 static은 위치 바꿔도 괜찮다. 
		// args 대신 변수를 바꿔도 된다.
//		Scanner scan=new Scanner(System.in);
//		scan.nextInt();
//		scan.nextDouble(); 
//		scan.nextBoolean();
//		scan.hasNext();
//		System.out.println("Hello Java!!");
		//11.01 (금) 카드 발급 --> 8개월 --> 7월까지.
		int i=1;
		for(i=1;i<10;i++) {
			System.out.println("i="+i);
		}
		System.out.println("i="+i);

	}

}






