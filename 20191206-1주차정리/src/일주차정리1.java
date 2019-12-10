/*
 * 변수 : 한 개의 데이터를 저장
 * 
 * 1. 변수선언
 * 2. 선언과 동시에 값을 입력
 * 
 * ======
 * 변수가 여러개일 때
 * int kor;
 * int eng;
 * int math;
 * 혹은 int kor,eng,math; 이렇게 한 줄로 한 방에 쓸 수도 있음.
 * 
 * ======
 * 초기값 
 * int kor=100;
 * int eng=100;
 * int math=100;
 * 혹은 int kor=100,eng=100,math=100; 이렇게 한 줄로 한 방에 쓸 수도 있음. 
 * 
 * ======
 * int kor,eng,math;
 * kor=eng=math=100; 이렇게도 할 수 있음 
 *  
 * 
*/
//변수명 --> 의미를 부여해서 붙이자! ex) int a=90; <--a가 뭔데? -_-: BAD vs int kor=90; <-- 아..국어가 90점이구나. : GOOD

public class 일주차정리1 {
	//전역변수(member변수) 는 여기에 선언!

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//지역변수는 여기에 선언! - 메소드 안에 씁니당!!
		
		int kor,eng,math;
		kor=eng=math=100;
		
		System.out.println("kor="+kor);
		System.out.println("eng="+eng);
		System.out.println("math="+math);
		
		String first_name="홍"; 
		String last_name="길동";
		
		System.out.println("이름:"+first_name+last_name);
		// 변수명도 f,l까지만 치고 Ctrl+space 하면 자동완성된다. ★★ 
		/*
		 * <변수명 붙이기>
		 * 1. 클래스명 : ★대문자★로 시작!!
		 * 2. 메소드명, 변수명 : 소문자로 시작 
		 *    ex) firstName : 헝가리안식
		 * 3. 상수 : 전체 대문자 
		 * 4. 들여쓰기  
		 * 
		*/

	}

}










