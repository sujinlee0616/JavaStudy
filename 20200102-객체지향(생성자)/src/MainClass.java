/*
 * 	<클래스의 구성요소>
 * 	==============================================================
 * 	■ 변수 (전역변수, 멤버변수) 
 * 		=> 다른 클래스에서 사용이 가능 
 * 		=> 메모리에서 해제되는 시점이 프로그램 종료 시 
 * 			(이 때 사용하는 메모리는 heap) 
 * 	==============================================================
 * 	■ 생성자 : ★'멤버변수'에 대한 초기화 담당★ 
 * 	특징) 1. 클래스명과 동일 
 * 		 2. 리턴형이 없다 (void도 안 씀!!) 
 * 		 3. 생성자는 여러개를 만들 수 있고 사용하지 않을 수도 있다 
 * 			- 사용하지 않을 때는 JVM이 자동으로 생성자를 생성해준다.
 * 		 4. 오버로딩을 지원한다.
 * 			[오버로딩의 특징]  
 * 			1) 한 개의 클래스 안에서 같은 이름의 메소드를 여러개 사용 
 * 			2) 매개변수가 다르다 (매개변수의 데이터형 또는 개수가 다르면 다른 메소드로 인지함) 
 * 			3) 리턴형은 오버로딩과는 상관이 없다. 
 * 			 ex) 아래의 두 메소드는 같은 메소드이다. 오버로딩 아님!! 
 * 				 void display()
 * 				 int display()
 * 			4) 기능이 같다 ex) println(boolean a), println(int a)
 * 		 5. 상속 예외 조건(생성자, static)에 해당한다. (상속 불가)  
 * 		 6. 생성자도 메소드의 일종이므로, 생성자 내에서도 구현이 가능. 
 * 	==============================================================
 * 	■ 메소드 : 멤버변수를 활용 => "기능★"
 * 		 - 연산처리 = 제어문 처리
 * 		 - 명령문의 집합 ==> 관련된 명령을 모아서 처리 (구조적 프로그램)   
 *  	 - 사용자의 요청을 처리 
 * 	==============================================================
 * 
 *  ex) CGV 싸이트 ( http://www.cgv.co.kr/movies/)
 *  - 주메뉴(GNB) : 클래스
 *  - 부메뉴(SNB) : 클릭하면 영화가 출력됨 ==> 메소드
 *
 * 
*/
public class MainClass {
	String name;
	String sex;
	int age;
	// ↓ 생성자 : 멤버변수를 초기화 시킴  
	public MainClass() 
	{
		// ex) 10명의 데이터를 저장해야함... ==> 생성자 이용해서...
		// 윈도우, 네트워크, 데이터베이스에 생성자가 많이 이용됨. 
		name = "심청이";
		sex = "여자";
		age = 25;
	}
	// ↓ 매개변수를 가진 생성자 
	public MainClass(String name, String sex, int age) 
	{
		// 우선순위 : 지역변수(갈색) > 멤버변수(파란색) (지역변수가 우선!)
		name = name;
		// ==> if 지역변수명 = 멤버변수명 ==> this 사용  
		System.out.println("this="+this);
		this.name = name;
		this.sex = sex;
		this.age = age;
		// ★모든 클래스는 this를 가지고 있다. ★(자신의 변수나 자신의 함수를 호출)
		// ==> this는 static임 
		// 자신의 객체 주소 => this => 반드시 메소드 안에서만 사용이 가능. 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass mc = new MainClass(); 
		
		MainClass mc1 = new MainClass("이순신", "남자", 30); // new하면 메모리 주소가 할당되고, 따라서 this에도 주소가 할당된다. 
		System.out.println("mc1="+mc1);
		System.out.println(mc1.name);
		System.out.println(mc1.sex);
		System.out.println(mc1.age);
		
		MainClass mc2 = new MainClass("심청이", "여자", 20); 
		System.out.println("mc2="+mc2);
		System.out.println(mc2.name);
		System.out.println(mc2.sex);
		System.out.println(mc2.age);
		
		MainClass mc3 = new MainClass("강감찬", "남자", 35);
		System.out.println("mc3="+mc3);
		System.out.println(mc3.name);
		System.out.println(mc3.sex);
		System.out.println(mc3.age);
		
		// new가 있어야 저장공간을 따로따로 만들어줌.
		// static이 아닌 변수는 저장공간 생성을 위해서 'new'를 사용해야. ★
		// 'new'는 메모리값만을 주기 때문에, 초기값을 설정해주는 생성자가 있어야. 
		// 결론 : 생성자는 호출 시에 반드시 'new'를 동반한다. 
		//MainClass(); // Error. 생성자만 단독으로 호출 불가.  
		new MainClass(); // 가능. 생성자는 호출 시에 반드시 new를 동반해야.
		System.out.println(mc.name);
		System.out.println(mc.sex);
		System.out.println(mc.age);
		
		// 아래의 세 개는 다른 객체임. (주소가 다름) 
		// 호출하고 밑에서 활용하지 않을 때는 아래와 같이 써도 된다. 
		System.out.println(new MainClass("박문수", "남자", 10).name);
		System.out.println(new MainClass("박문수", "남자", 10).sex);
		System.out.println(new MainClass("박문수", "남자", 10).age);
		
	}

}





