/*
 * 	<자바 클래스 구조> 
 * 	=> 구성요소 : 변수 + 메소드 + 생성자
 * 	=> 컴포넌트 베이스 
 * 		ex) 컴퓨터 구조 
 * 			CPU, 메모리, 하드디스크, 사운드 카드 ... (컴포넌트)
 *  => 변수로 사용이 가능한 것 :
 *  	1) 단일 변수 => int year,month, ...
 *  	2) 클래스★★ => String name, Jbutton b1,b2, ....
 *  		: Java 데이터 타입에는 (1)기본형 (2)참조형 이 있는데, (2)참조형은 변수로 사용이 가능함. ★★
 *  		  (선생님이 '사용자정의형'이라고 말씀하시는데, 질문하니 참조형과 똑같은 말이라고 하심. 즉, 참조형=사용자정의형) 
 *  		     ( ※ 참조형 대표적인 예: ①클래스형Class Type, ②인터페이스형Interface Type, ③배열형Array Type)
 *  		  ==> 클래스가 변수로 들어갈 수 있다.  ==> 질문) 그럼 인터페이스형도 변수로 사용 가능? 
 *  	3) 배열★★
 *  	※ [참고] 라이브러리도 변수로 쓸 수 있다!  
 *  
 * 	class ClassName 
 * 	{ // 클래스 영역 
 * 	  ========================================================
 * 		■ 전역변수 : 클래스만 가지고 있는 변수 (다른 클래스에서도 사용 가능) 
 * 		1. instance 변수 : 메모리에 따로 저장. 메모리 공간에 따로따로 저장된다.  ==> 'new'를 사용하면 저장이 따로따로 된다.
 * 			ex) 비행기에 총 쏘는 게임에서 각 비행기의 (x,y) 좌표  
 * 		2. static 변수 : 공유하는 변수. => 메모리 공간이 한 개. => 1개가 바뀌면 싹 다 바뀐다.
 * 			ex) 비행기에 총 쏘는 게임에서 나의 점수 
 * 		기타) 범위 설정에 따라서 instance 변수인지 static 변수인지가 달라진다. 
 * 			ex) 3층 정수기 : 3층에서는 static 변수. 하지만 학원 전체 건물로 보면 instance 변수.   
 * 	  ========================================================
 * 		■ 생성자 함수 : 전역변수를 초기화.  
 * 				사용 예시) 윈도우, 네트워크, 데이터베이스 
 * 				한 번만 호출, 객체가 생성될 때 처음으로 호출.
 * 				클래스명과 동일, 리턴형이 없다.   
 * 				=> 만약 생성자가 없는 경우에는 JVM이 자동으로 만들어 준다. (default 생성자)
 * 		※ JVM이 자동으로 해주는 것들 : 
 * 		1) 몇몇 애들의 import (ex.java.lang) 
 * 		2) void에서의 return 생략해도 자동으로 return 넣어줌  
 * 		3) 생성자 없는 경우 자동으로 만들어줌  
 * 	  ========================================================
 * 		■ 메소드 : 기능 수행  
 * 	}
 *
 * 	
 * 	<클래스 이름> 
 * 	: 클래스 이름을 보고 클래스의 기능을 유추할 수 있다. ex) MovieVO, MusicVO, RecipeVO, ...
 * 	1. VO : Value Object. 데이터만 저장된 클래스. 
 *  2. DTO : Data Transfer Object. 데이터를 처리하고 전송할 수 있는 클래스.
 *  3. DAO : Data Access Object. 데이터베이스에 접근해서 작업을 하는 부분만을 소유한 클래스.
 * 	4. ~Manager, ~Service
 *  
 *  
 * 	ex) 클래스 만들기 
 *	백두산 (2019)
 * 	평점6.9/10
 * 	드라마/액션
 * 	한국
 * 	2019.12.19 개봉
 *	128분, 12세이상관람가
 *	(감독) 이해준, 김병서
 *	(주연) 이병헌, 하정우, 마동석, 전혜진, 수지
 *	※ [참고] public 클래스는 한 개만 사용한다!
 *
 *	class MovieVO
 *	=> 사용자가 만든 데이터형
 *	<비교>
 *	1.기본형 ex) int a, doulble d 
 *		: 기본형이라서 컴퓨터가 데이터 크기를 안다  => 컴퓨터가 메모리 크기 인식 가능  
 *	2. 클래스 ex) MovieVO vo 
 *		: 사용자가 만든거라서 컴퓨터가 데이터 크기를 모른다
 *		 => new 사용!! (몇바이트인지 알 수 없으므로... 메모리 크기를 확인해야 하므로... new가 필요!)
 *		  ※ 예전에는 malloc(sizeOf(MovieVO)) 이런걸 썼는데... 지금은 안 씀. malloc 대신 new 씀.   
 *
*/
class MovieVO{
	// instance 변수 ==> 메모리에 저장되는 시점 : new 연산자 사용 시 
	// (new : 새로운 메모리를 만들 떄 => 따로 메모리를 생성.)  
	String title;
	double score;
	String genre;
	String regdate;
	int time;
	String grade;
	String director;
	String actor;
	// MovieVO 클래스 = 4byte(String)*6 + 8byte(double) + 4byte(int) = 4*7+8 = 28+8 = 36byte.
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스를 불러들일 때 
		// 메모리에 저장 => 호출 연습 
		MovieVO m1=new MovieVO();
		m1.title="백두산 (2019)"; 
		// . (메모리 주소 접근 연산자) 
		MovieVO m2=new MovieVO();
		m2.title="천문: 하늘에 묻는다";
		MovieVO m3=new MovieVO();
		m3.title="캣츠 (2019)";
		
		MovieVO m4=m3;
		m4.title="시동 (2019)";
		
		System.out.println("m1: "+m1); //주소가 출력됨. 3개 다 다르게 나옴. instance 변수니까! 
		System.out.println("m2: "+m2);
		System.out.println("m3: "+m3);
		System.out.println("m4: "+m4); //m3과 주소가 같다.
		System.out.println();
		System.out.println("m1 title: "+m1.title);
		System.out.println("m2 title: "+m2.title);
		System.out.println("m3 title: "+m3.title); //m4의 타이틀을 바꾸면 m3의 타이틀도 바뀐다. 왜냐면 m4=m3 했으니까. 
		System.out.println("m4 title: "+m4.title);
		
		//MovieVO[] vo=new MovieVO[3]; // class도 배열로 만들 수 있다!! ★★
		MovieVO[] vo= {m1,m2,m3,m4};
		for(int i=0;i<vo.length;i++) {
			System.out.println(vo[i].title);
		}

	}

}





