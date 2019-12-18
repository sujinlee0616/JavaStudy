/*
 * 
 * Java에는 저장공간이 3개 뿐! - method, 
 * 
 * 	================================
 * 		method 공간 (static)
 * 	================================
 * 		stack --> 메모리 관리 ({}블록이 끝나면 자동으로 회수됨.) : 우리가 지금 쓰고 있는 영역. 지역 변수. 
 *  ================================
 *  	heap --> 사용자가 관리 -> 가비지 컬렉션이 나중에 회수함. : 전역 변수(멤버변수). 
 *  ================================
 * 
*/
public class 단항연산자_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ++, --
		int a=10;
		a++; //후치연산 --> a=a+1 -> a=10+1 : 값은 오른쪽에 먼저 넣는다.. 
		a++; 
		a++;
		System.out.println("a="+a); //a=13
		
		int b=10;
		++b;
		++b;
		++b;
		System.out.println("b="+b); //b=13
		//대입연산자 없으면 후치든 전치든 걍 단순하게 생각하면 됨.
		
		int c=10;
		int d=c++;
		System.out.println("c="+c); // c=11;
		System.out.println("d="+d); // d=10;
		
		int e=10;
		int g=++e; //e값을 먼저 증가하고 증가된 값을 g에 대입
		System.out.println("e="+e); //e=11;
		System.out.println("g="+g); //g=11;
		
	}
}











