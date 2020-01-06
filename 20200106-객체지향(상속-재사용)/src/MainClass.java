/*
 * <객체 지향> 
 * 
 * 1. 캡슐화
 * 	1) 접근지정어 
 * 	====================================================================
 * 				자신의 클래스 	같은 폴더(패키지) 	다른 폴더(패키지) 	모든 클래스 
 * 	====================================================================
 * 	private			O			X				X				X		
 * 	====================================================================
 * 	default			O			O				X				X
 * 	====================================================================
 * 	protected		O			O				X,O				X
 * 											O : 상속받은 경우만. 
 * 	====================================================================
 * 	public			O			O				O				O
 * 	====================================================================
 * 
 * 	=> 클래스 : public class className : 부품 => 연결해서 사용 
 * 	=> 변수 : private int a; => 데이터를 보호할 목적으로 사용 
 *	=> 메소드: 메소드를 통해서 클래스와 클래스를 연결
 *			 public 리턴형 메소드명(){} 
 *	=> 생성자 : 연결 => 메모리 할당 
 *			 public 클래스명(){}
 *	=> 변수는 은닉화하고 메소드를 통해서 접근하는 방식 ==> getter/setter 
 *	
 *
 * 2. 재사용 기법 
 *	1) 상속 (is-a) : 기존의 클래스의 모든 내용을 받아서 재정의해서 사용
 *					=> 자바는 단일 상속만 지원한다. 
 *						ex) public class MyWindow extends JFrame,JPanel : (X)! 다중상속 불가능!!
 *					=> 형식 
 *						public class MyWindow extends JFrame
 *											  ======= 
 *											     상속기호  
 *					=> 상속은 모든 내용(변수, 메소드, 생성자)을 받아서 확장
 *					   *** 예외) 생성자, static - 생성자는 상속이 없다. static은 공유 가능한 애라 상속이라기엔 좀 개념이... 
 *	2) 포함 (has-a) : public class MyWindow
 *					{
 *						JFrame f=new JFrame();
 *					}
 *					=> 기능변경, 기능추가, 데이터 추가가 있는 경우에 상속 
 *					=> 있는 그대로 기능 사용 => 포함 
 *
 * 	3) 상속 시 (클래스 비교) 
 * 		=> 상속을 내리는 클래스가, 상속을 받는 클래스보다, 크기가 더 크다. 
 * 		=> 형변환이 존재.
 * 		=> 아무거나 상속 받으면 안 되고 관련된 걸 받아야. 
 * 		=> 상속을 내리킄 늘래스는 공통점을 가지고 있다. (추상화) 
 * 		=> ~이다 라는 과정이 성립한다. (is-a) 
 * 			ex) 인간
 * 				 ↑
 * 			===========
 * 			  │		│  
 * 			   남자       여자 
 * 			남자 man=new 남자(); ==> 남자는 남자다 
 * 			여자 woman=new 여자(); ==> 여자는 여자다 
 * 				
 * 			인간 human = new 남자(); ==> 남자는 인간이다 (O) : '~이다'가 성립함 ==> 상속 
 * 			인간 human = new 여자(); ==> 여자는  인간이다 (O) : '~이다'가 성립함 ==> 상속 
 * 			==> 상위 클래스에 하위 클래스를 대입하는 것은 괜찮음! ==> ★왼쪽편이 크거나 같아야!!!!★ 상속 내린 애가 더 크다!!★ (기억할 것!)
 * 
 * 			남자 man = new 인간(); ==> 인간은 남자다 (X) : Error.
 * 			남자 man = new 여자(); ==> 여자는 남자이다. (X) : Error.
 * 			==> 같은 클래스로부터 상속받은 클래스들이라고 해도, 서로 크기 비교 불가. 아무 관계 없음. 
 * 
 * 			형변환
 * 			남자 man = (남자)new 인간(); ==> (O). 가능. 
 * 
*/
/*
 *  상위 클래스 (상속을 내리는 클래스) : super 클래스, 부모 클래스, base 클래스 
 *  하위 클래스 (상속을 받는 클래스) : sub클래스, 자식클래스, 파생클래스
 *   
 *  => 상속 : 기존의 클래스의 모든 내용을 가지고 와서 확장.
 *  => 자바의 모든 클래스는 Object 상속을 가지고 있다. (Object: 자바의 최상위 클래스)
 *  => static, 생성자는 상속을 할 수 없다. 
 *  => 목적: 중복된 코딩 방지. 재사용.
 *  
 *  => 상속을 내리는 클래스가 항상 크다. 
*/
import java.util.*;

class Human{
	String name;
	int age;
	public Human() 
	{
		System.out.println("Human() call...");
	}
}

class Sawon extends Human{ //눈에는 보이지 않지만 Human에서 상속받은 name, age를 가지고 있다! 
	String dept;
	String loc;
	public Sawon() {
		System.out.println("Sawon() call..."); 
		// 출력 결과 : Huamn() call... Sawon() call... 
		// 항상 상위클래스 먼저 메모리 할당한다. 
	}
}
public class MainClass {

	public static void main(String[] args) {
		
		Sawon s=new Sawon();
		s.age=30;
		s.name="홍길동";
		s.loc="서울";
		s.dept="개발부";
		
		System.out.println("이름:"+s.name);
		System.out.println("부서:"+s.dept);
		System.out.println("근무지:"+s.loc);
		System.out.println("나이:"+s.age);
		
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();  
		// ArrayList는 뭐가 들어올지 모르니까 Object를 넣어놓는다... 디폴트가 Object!!
		// Java 데이터형 중에서 가장 큰 데이터형이 Object이기 때문.
		// ==> Object는 모든 데이터형을 다 표현할 수 있다. 모든 데이터형의 모든 속성을 다 가지고 있음. 
		list.add("홍길동");
		
		String name = (String)list.get(0); 
		// String으로 형변환해주지 않으면 Object이므로 에러남. 
		
		//ArrayList<String> list=new ArrayList<String>();  
		// 위의 과정을 요런 식으로 쉽고 간단하게 쓸 수 있다.  
		// 이런걸 제네릭스라고 한다. ==> 데이터형을 관리하기 쉽게 바꿔주는 것.  
		
		 
	}

}
