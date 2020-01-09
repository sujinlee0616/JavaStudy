import java.util.Scanner;

/*
 * <Wrapper 클래스>
 *  - 기본형 (int, long...) 데이터를 쉽게 제어가 가능하도록 해주는 클래스.
 *  - java.lang에 있는 애들이므로 별도로 import 안 해도 된다. 
 * 	- int ==> Integer  
 * 	  double ==> Double
 * 	  byte ==> Byte
 *	  boolean ==> Boolean
 *  - Integer.pareInt() 혹은 Double.pareDouble() 아니면 Boolean.parseBoolean() 이런 애들이 제일 잘 나옴. 
 *  - BOXING, AUTOBOXING
 *  	ex) Integer ii=new Integer(10);
 * 			//예전에는 아래와 같이 해야만 했었지만... (Boxing)
 *  	    int i=ii.valueOf();
 *		    //이제는 아래와 두개와 같이, 마치 기본형처럼 사용 가능해졌음  (AutoBoxing) 
 *  	    int i=ii; 
 *		    Integer ii=10;
 *	
*/
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="100";
		int i=Integer.parseInt(s);
		System.out.println(i+300);
		
		String d="300";
		double j=Double.parseDouble(d);
		System.out.println(d+3.0d);
		
		Integer ii=new Integer(100);
		int i1=ii;
		int k=1000;
		Integer kk=100;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		String no1=scan.next();
		
		System.out.println("정수 입력:");
		String no2=scan.next();
		
		System.out.println(no1+no2); //아무 조치 안 하면 String두개가 이어진 값이 출력됨
		System.out.println(Integer.parseInt(no1)+Integer.parseInt(no2)); //int로 변환해야 두 수가 더해짐 
		//숫자 입력 할 때 공백 입력받으면 NumberFormatException 일어남 ==> 사용자한테 입력받은 값은 trim해줘야...
		
		String s1="true";
		if(Boolean.parseBoolean(s1)==true) {  
			// if(s1==true)하면 안 됨!! String이랑 boolean 데이터형이 다르니까 불가!!
			// 혹은 if(s.equals("true"))로 해서 String이랑 String이랑 비교하는건 가능!
			// 혹은 if(Boolean.parseBolean(s1)) 으로 해도 됨 
			// Boolean boolean = new Boolean(); 안 했으니까 얘네는 static이다!! 와우 
			// 즉, Boolean.parseBoolean이나 Integer.parseInteger은 ★static 메소드★임
			// 사용 빈도가 많아서 귀찮게 메모리 할당 안 해도 되게끔 static 메소드로 만들어놓은듯...
			// 습관적으로 메모리할당 안 하고 그냥 쓰던 Math.Random() 이런 친구들도 static 메소드였던거임! 
			// 클래스이름.메서드이름 ==> static 메소드
			// new 써서 메모리 할당 ==> 인스턴스 메소드
			System.out.println("출력");
		}
		
		String score="4.5";
		System.out.println(Double.parseDouble(score)+1);
		 
		boolean b=true;
		System.out.println(String.valueOf(b));
		// 일반데이터형을 문자로 바꿀 때 : String.valueOf()!! toString() 아니다!
		
	}

}


