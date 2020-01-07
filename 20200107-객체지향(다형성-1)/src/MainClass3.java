/*
 * 	클래스의 종류
 * 	=========
 * 	1. 추상 클래스 : 설계 = 구현 하지 않은 메소드를 포함하고 있다. 
 * 				 공통점을 모아두고 => 해당 프로그램에서 구현
 * 				1) 서로 다른 클래스를 연결
 * 				2) 여러개 클래스를 모아서 관리
 * 				3) 표준화 (독립적 사용) 
 * 		public abstract class ClassName
 * 		{
 * 			일반변수
 * 			int a=10;
 * 			구현된 메소드	
 * 			public void display(){
 * 			}
 * 			구현이 안 된 메소드
 * 			public abstract int disp();
 * 		}
 * 		===> 미완성된 클래스 => 자신이 메모리 할당을 할 수 없다. 
 * 						  (new를 사용할 수 없고 생성시에는 반드시 구현한 하위클래스를 통해서 생성이 가능) 
 * 		예) public abstract class A
 * 			{
 * 				구현이 안 된 메소드
 * 			}
 * 			public class B extends A
 * 			{
 * 				구현이 안 된 메소드는 상속 시에 반드시 구현해서 사용해야. 
 * 			}
 * 			B b=new B(); <== (O)
 * 			A a=new A(); <== (X)
 * 			A a=new B(); <== (O). 표준!
 * 
 * 			==> 클래스 객체를 생성하는데 new가 없거나 같은 생성자를 사용하지X ==> 추상클래스 OR 인터페이스.
 * 				ex) List list=new ArrayList();
 *   
 * 	2. 인터페이스 : 추상클래스의 일종 
 * 				서로 다른 클래스 연결
 * 				표준화 작업 (구현은 틀릴수도 있다)
 * 				여러개의 관련된 클래스를 묶어서 제어
 * 		public interface Interface명 {
 * 			변수
 * 			int a=10; <==> public static final int a=10;
 * 			===			   ====================
 * 			 │			       생략 가능!
 * 			 ┗ 앞에 public static final이 생략되어 있는거임! 주의! 
 * 			
 * 			메소드(구현이 안 된 메소드!)
 * 			void display(); <==> public abstract void display();
 * 			====				 ===============
 * 			 │					  생략 가능!
 * 			 ┗ 앞에 public abstract가 생략되어 있는거임! 주의!
 * 			public void disp(); <==> public (abstract) void disp();
 * 			 │	
 * 			 ┗ 앞에 public (abstract)가 생략되어 있는거임! 주의! 
 * 		} 
 * 		===> 라이브러리 (인터페이스로 만들어진 라이브러리)
 * 			 Swing => 이벤트 처리
 * 					  =======
 * 						1) 자동 호출
 * 						2) 지정된 메소드
 * 				1. 컴포넌트
 * 					1) JButton
 * 						(1) JButton => JButton, JMenu
 * 						(2) ToggleButton => JRadioButton, JCheckBox
 * 					===============================================
 * 						=> 이들을 처리해주는 interface : ActionListener.
 * 						=> actionPerformed();
 * 				2. 입력창
 * 					1) 한 줄 입력
 * 						JTextField =발전=> JPasswordField
 * 					2) 여러줄 입력 
 * 						JTextArea =발전=> JTextPane 
* 					=> 이들을 처리해주는 interface : ActionListener.
 * 					=> actionPerformed();
 * 				3. 목록출력 
 * 					JTrable : Mouselistener이용 
 * 					JTree : '상동'
 * 					JList : ItemListener 사용. 
 * 					JComboBox : '상동'
 * 			  데이터베이스 => DB
 * 
 * 			 Collection : List, Set, Map
 * 				- List : index 번호 있고, 저장. 중복허용. 
 * 				- Set : 중복허용X. index번호나 key 아예 없음. 
 * 				- Map★ : key주고, 저장...
 * 
 * 	3. 내부클래스
 * 	 1) 멤버클래스 : 쓰레드 사용 시, 네트웍 사용 시  
 * 		- 클래스 안에 클래스! 
 * 		public class A
 * 		{
 * 			class B
 * 			{
 * 			}
 * 		}
 * 	 2) 익명의 클래스
 * 		- 상속 없이 오버라이딩, 메소드 추가가 가능.
 * 		public class A
 * 		{
 * 			B b = new B(){	
 * 				public void display(){}
 * 				public int plus(){}
 * 			};
 * 		}
 * 		public class A
 * 		{
 * 			public void display(){}
 * 		}
 * 	 3) 지역 클래스
 * 		- 
 * 		public class A
 * 		{
 * 			public void display(){
 * 				classB
 * 				{
 * 				}
 * 			}
 * 		}
 * 
 * 	4. 종단클래스 : 확장이 없는 클래스! 
 * 	 - public final class A
 * 		{
 * 		}
 * 
*/
// 메모리에 저장(할당) 조건 => 모든 메소드가 구현이 되어 있어야만 메모리 할당이 가능. 
abstract class Ani{
	public abstract void walking(); // 선언만 해야! abstract니까 구현X! 선언만!
	public abstract void eating();
	// 얘는 구현 안 된 애가 두 개 있기 때문에 메모리 할당이 불가.
	// ==> 무조건 구현을 해줘야. 
	public void setName() {
		System.out.println("");
	}
	// 얘는 이미 구현 된 애. 
	// ==> 필요하다면 재정의(오버라이딩)해야. 필요 없으면 안 해도 됨. 
}
class Human extends Ani{
	// 처음에 윗줄만 적으면 오류남. 'Add unimplemented methods'라고 나옴. 해당 내용 클릭하면 아래와 같이 오버라이딩됨. 
	// walking과 eating만 오버라이딩되고 setName은 오버라이딩X.
	// setName은 필요하면 자기가 알아서 오버라이딩하면 된다. 
	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("사람이 걷는다.");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("사람이 먹는다.");
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		System.out.println("홍길동이다.");
	}
	
}
class Dog extends Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("개가 걷는다.");
	}
	
	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("개가 먹는다.");
	}
	
	
}
class Pig extends Ani{

	@Override
	public void walking() {
		// TODO Auto-generated method stub
		System.out.println("돼지가 걷는다.");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("돼지가 먹는다.");
	}
	
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ani ani=new Human();
		ani.walking();
		ani.eating();
		ani.setName();
		
		ani=new Dog(); // 주소만 바꿔...
		ani.walking();
		ani.eating();
		ani.setName(); // 값 없어서 빈칸으로 나옴 
		
		ani=new Pig(); // 주소만 바꿔...
		ani.walking();
		ani.eating();
		ani.setName(); // 값 없어서 빈칸으로 나옴 
	}

}
