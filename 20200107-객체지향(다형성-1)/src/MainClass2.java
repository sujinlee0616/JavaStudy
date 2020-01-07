/*
 * <오버라이딩>
 *  - 추상클래스, 인터페이스에서 많이 사용.
 *    (추상클래스, 인터페이스 : 구현은 안 하고 선언만 함. ==> 상속한거 갖다쓰고 오버라이딩해서 고쳐 씀.) 
 *  - 상속이 존재
 *  - 메소드명이 동일
 *  - 매개변수 동일
 *  - 리턴형 동일 
 *  - 접근지정어의 확장이 가능. 
 *    (※ 접근지정어 : private < default < protected < public)
 *
 * ex) 
 * 	interface Ⅰ
 * 	{
 * 		int a=10; ==> 오류 ===> 여기에 쓴 int a=10;은 사실 'public static final int a=10;'임. 앞에꺼가 생략되어 있는 거. 
 * 												   ===================
 * 		void display(); ===> 얘도 마찬가지. 사실  public abstract void display(); 임. 
 * 							 			   ====================
 * 	}
 * 	public A implements
 * 	{
 * 		void display(){ ===> 오류. pubilc이 빠졌기 때문. public void display(){} 이렇게 해줘야함. 
 * 		}
 * 	}
 * 
*/
/*
 * 상속이 안 되는 클래스 : 종단클래스 
 *  - 'public final class' 이렇게 사용함.  
 *  - ex) String, System : 상속/확장 불가. 마우스오버하면 초록색C 우측상단에 F 붙어있음. 
 * 상속 예외 : static, 생성자 
*/
class Super
{
	public void display() {
		System.out.println("Super:display() Call");
	}
}
// Super로부터 상속 받기 : super꺼를 수정해서 사용 : 상속클래스 
class Sub extends Super
{
	
}
// Super를 포함: 그대로 사용 : 포함클래스 
class Sub2{ // 
	Super su=new Super();
}
// 상속 없이 오버라이딩 하는 경우 : 익명의 클래스 
class Sub3{ // 
	Super su=new Super() {
		public void display() {
			System.out.println("Sub3:display() Call");
		}
	};
}

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		sub.display();
		
		Sub3 s=new Sub3(); //익명클래스 사용 
		 
	}

}
