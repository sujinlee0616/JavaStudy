
public class MainClass2 {
	String name;
	String sex;
	int age;
	
	public MainClass2(String n, String s, int a) 
	{
		name = n;
		sex = s;
		age = a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass mc = new MainClass2(); //Error.
		// 위에 이미 생성자가 하나 정의되었기 때문에 MainClass2(); 생성자는 자동으로 만들어지지 않는다.
		// 이렇게 쓰고 싶으면 1) MainClass2(); 생성자를 만들거나 2) 저 선언문 안에 매개변수 3개를 주거나. 
	}

}
