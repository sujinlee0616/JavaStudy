/*	
 * 	자바 (클래스가 여러개) ==> 한 파일 안에 설정, 별도로 파일을 생성
 * 	한개의 파일에서 사용
 * 	
 * 	ex1) 
 * 	==============
 * 	class A
 * 	class C
 * 	class D
 * 	public class B  
 * 	=============== 
 *  - public으로 시작하는 클래스가 반드시 1개 있어야 한다.
 *  - public class는 한 개만 존 
 *  - public을 가지고 있는 class명이 파일 저장명이 된다! 
 * 
 * 	ex2) 
 * 	==============
 * 	class A
 * 	class B
 * 	==============
 * 	- 이 경우에는 파일 이름이 A 또는 B 둘 중 아무거나 해도 된다.
 *  - 단, 메인을 가진 클래스의 이름으로 파일명을 한다. 
*/
class News{
	// 클래스 영역에는 선언만 할 수 있음 
	// ↓인스턴스 변수 
	String title;
	String content;
	String author;
	String regdate;	
	// ↓static 변수 
	//static String site;
} //New 데이터형 <== 우리가 만든 데이터형도 데이터형이라고 말한다. 
// 조립기 
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 저장 => 통으로 저장
		// 메모리 만들기
		News n1=new News();
		n1.title="\"8일째 1위\"..'백두산', 450만명 돌파..'천문' 개봉 첫날 14만 흥행 2위 [종합]";
		// 따옴표 넣으려면 \" 으로 넣어야 함. 
		n1.content="[OSEN=하수정 기자] 영화 '백두산'이 성탄절에 이어 문화의 날에도 흥행 정상을 지켰고, '천문: 하늘에 묻는다'가 첫날 2위에 오르며   박스오피스 판도가 또 바뀌었다.";
		n1.author="OSEN";
		n1.regdate="19.12.27";
		
		//n1=new News(); 
		// 예를 들어 위에서 n1이 100번지에 데이터(4가지)를 저장했는데, n1에 새로운 주소값 200을 줬음
		// n1의 새로운 주소값 200에는 아무런 데이터가 없다 ㅠㅠ 
		//System.out.println(n1.title); // 그래서 이렇게 하면 null나옴 ㅜㅜ  
		
		News n2=new News();
		n2.title="진선규·성유빈 영화 '카운트' 캐스팅";
		n2.content="배우 진선규와 성유빈이 영화 ‘카운트’에서 호흡을 맞춘다고 배급사 CJ엔터테인먼트가 27일 전했다. 금메달리스트 출신 골칫덩이 체육선생(진선규)과 주먹 하나는 타고난 반항아";
		n2.author="아시아경제";
		n2.regdate="19.12.27";
		
		// 출력
		System.out.println(n1.title);
		System.out.println(n2.title);
	}

}







