class Super{
	int a=10;
	public Super() {
		a=20;
	}
	void display() {
		System.out.println("Super:display Call...");
	}
}
class Sub extends Super{
	int b=20;
	int a=10;
	public Sub() 
	{
		a=100;		
	}
	void display() {
		System.out.println("Sub:display Call...");
	}
	void display(int a) 
	{
		System.out.println("Sub:display(int a) Call....");
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super s = new Super();
		System.out.println(s.a);
		s.display();
		
		// 평상시 호출 방법  
		Sub s1=new Sub(); // 아래의 총 4개에 접근 가능 
		System.out.println(s1.a);
		System.out.println(s1.b);
		s1.display();
		s1.display(10);
		
		// 여러개의 클래스가 존재 ==> 메소드만 존재할 때 쓰는 방식 
		// 객체 하나로 여러개를 쓸 수 있다. 
		Super s2=new Sub(); // 아래의 총 2개에만 접근 가능 - Super가 갖고 있는 2개에만 접근 가능!!@
		System.out.println(s2.a);
		s2.display();
		// ★메소드는 Sub껄로 바뀌었는데 변수는 그대로 Super꺼임.★
		// => 변수 : 클래스 타입을 확인! 변수는 원래꺼 그대로 쓰고 !!
		// => 메소드 : 생성자 확인! 메소드는 변경된 내용을 가져오더라!! 
	}

}
