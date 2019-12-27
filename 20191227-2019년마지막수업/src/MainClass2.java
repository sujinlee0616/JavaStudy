/*
 * 변수 
 * 	= instance 변수 : 생성 시점 : new를 이용해서 메모리를 만들 때. 
 * 	= static 변수 : 생성 시점 : 컴파일 될 때 
 * 		※ static 변수는 메소드에서는 사용이 불가능. 클래스영역에서만 사용 가능. 
 * 	===================> 자동 초기화 되는 아이들 
 *  
 * 	= 지역변수 : 생성 시점 : 메소드를 호출할 때 
 * 	===================> 반드시 초기화 시켜야 하는 아이 
*/
class Data{
	//클래스 영역에서는 선언만 가능..
	//메소드나 블록 안의 영역에서만 구현(연산처리, 제어문, 메소드호출) 가능
	//멤버변수에 초기값이 자동으로 들어간다. 
	int a; //0
	float f; //0.0f
	double d; //0.0
	boolean boo; //false
	long l; //0L
	char c; //'\0'
	String s="Hello"; //null <== 초기값이 null이라서 값 지정 안해주면 nullPointException 뜰 수 있음. 
	String ss=""; //<== 이렇게 하면 값이 들어간다... null 아님 ★
	//지역변수는 메소드 호출할 때 생성됨...
	static int aa; //0 
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Data.aa); //static 은 이미 저장이 되어 있으므로 오류 안 남
		//System.out.println(Data.a); //얘는 메모리에 아직 저장이 안된 아이 이므로 출력할 수X
		/*
		 * Data dd=new Data(); //dd가 객체 System.out.println(dd.a);
		 * System.out.println(dd.f); System.out.println(dd.d);
		 * System.out.println(dd.boo); System.out.println(dd.l);
		 * System.out.println(dd.c); System.out.println(dd.s);
		 * System.out.println(dd.ss);
		 */
	}

}
