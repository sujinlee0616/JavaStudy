class Box implements Cloneable{ 
	// implements했으니까 인터페이스고, 그러면 메소드 있어야 하는데 왜 구현 메소드가 없지? 
	// 이건 그냥 '클래스를 모아서 관리할 목적'이기 때문.
	int a=10;
	int b=20;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// NotSupportedException : 
		return super.clone();
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box();
		Box b2=b1;
		
		b2.a=100; // 
		b2.b=200; // 주소가 같기 때문에...
		
		System.out.println("b1.a="+b1.a);
		System.out.println("b1.b="+b2.a);
		try {
			//Box b3=b1.clone(); //Object를 리턴하니까 Object가 더 상위클래스니까 크기가 안 맞아서 못 받음 ==> 형변환 시켜야
			Box b3=(Box)b1.clone(); //형변환 해줘야 제대로 나옴.  //[참고] 라이브러리는 모든게 다 Object임
			System.out.println("b3.a="+b3.a);
			System.out.println("b3.b="+b3.b);
			
			b3.a=1000;
			b3.b=2000;
			System.out.println("b3.a="+b3.a);
			System.out.println("b3.b="+b3.b);
			
			System.out.println("b1.a="+b1.a);
			System.out.println("b1.b="+b2.a);
		}catch(Exception ex) {} //Exception이 더 상위클래스니까 Exception 써도 됨 
		
	
	}

}





