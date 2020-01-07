/*
 * <오버로딩>
 * 한 개의 클래스에서 같은 이름의 메소드
 * 매개변수가 다르다. (갯수, 데이터형이 틀리다) 
 * 리턴형은 관계없다. 
 * 
 * byte < char, short < int < long < float < double 
 * 
 * String, boolean : 변환 불가! 다른 데이터형으로 변환 불가능하다. 
 * 숫자형 데이터만 형변환 가능. 
 * 
*/
class Calc
{
	public void display(int a)
	{
		System.out.println("a="+a);
	}
	public void display(int a,int b,int c)
	{
		System.out.println("display(int a,int b,int c) call");
	}
	public void display(double a,int b,double c)
	{
		System.out.println("display(double a,int b,double c) call");
		
	}
	public void display(float a,char b,int c)
	{
		System.out.println("display(float a,char b,int c) call");
		
	}
	public void display(double a,double b,double c)
	{
		System.out.println("display(double a,double b,double c) call");
		
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calc 객체 생성 
		Calc c=new Calc();
		c.display('A'); // 더 작은 데이터형은 들어갈 수 있다.
		//c.display(10.5); // 더 큰 데이터형은 들어갈 수 없다. 
		c.display(10,10.5,'A'); // int, double, char를 커버할 수 있는 4번째 애를 사용한다. 
		

	}

}
