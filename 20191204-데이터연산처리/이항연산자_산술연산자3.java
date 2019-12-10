// % --> 나머지 연산자
/*
 * 연산자 --> 형변환
 * 		        산술 : /, %
 * 				/ --> 0으로 나눌 수 없다. 
 * 					  정수/정수 = 정수  ★★   ex) 30/4=7 이 되어버림 
 * 				% --> 나머지의 부호는 왼쪽 숫자의 부호와 같다. : 부호 주의!★★
 * 					 양수%양수=양수, 양수%음수=양수, 음수%양수=음수, 음수%음수=음수 
 * 					ex) 5%2=1, 5%-2=1, -5%2=-1, -5%-2=-1 
*/
public class 이항연산자_산술연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a=30; int b=0; int c=a/b; System.out.println("c="+c); //error. 0으로 나눌 수
		 * 없기 때문.
		 */		
		
		//나머지
		int d1=5%2;
		int d2=-5%2;
		int d3=-5%-2;
		int d4=5%-2;
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);
		System.out.println("d4="+d4);
		
		int e=369;
		int h100=e/100;
		int h10=(e%100)/10; //100으로 나눈 나머지를 10으로 나눵..
		int h1=(e%10); //10으로 나눈 나머지..
		System.out.println("100자리:"+h100);
		System.out.println("10자리:"+h10);
		System.out.println("1자리:"+h1);

	}

}









