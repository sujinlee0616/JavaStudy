// 정수 2개를 입력 받아서 --> 연산자 1개 --> 사칙연산
// 자바 --> 입력 받는 경우에 --> char (X), String (O)
// String을 비교할 경우에는 '=='를 쓰지 않고, 'equals'를 사용한다. 

import java.util.Scanner;
public class 다중조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String 비교 시에는 '=='이 아니라 'equals' 사용!!
		String s1=new String("Hello");
		String s2=new String("Hello");
		if(s1==s2) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다"); //이게 출력됨. 
			//왜냐면 ==을 사용하면, s1과 s2에 들어간 '값'인 Hello를 비교하는게 아니라, 
			//s1과 s2의 주소를 비교하기 때문.
			//String은 class. class는 '주소'를 가지고 있다. ★★
			//만약 s1과 s2의 값을 비교하고 싶다면, ==이 아니라 equals 가지고 비교해야함. ★★★
			
			//int a=(int)"10" <-- 안 됨. String을 이렇게 해서는 바꿀 수 없다.  
			Integer.parseInt("10"); //<--이런 식으로 해야. 
		}
		
		// equals 예제
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수:");
		int num1=scan.nextInt();
		
		System.out.println("두번째 정수:");
		
		int num2=scan.nextInt();
		System.out.println("연산자(+,-,*,/):");
		String op=scan.next();
		
		if(op.equals("+")) {
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		}
		else if(op.equals("-")) {
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
		}
		else if(op.equals("*")) {
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
		}
		else if(op.equals("/")) {
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.printf("%d/%d=%.2f\n",num1,num2,num1/(double)num2);
				//세번째 숫자 좌우 형 맞춰놨음. 자동 형 변환 안 되니까 같은 형끼리 매치되게 신경써서 적어놔야함. 
		}
		else {
			System.out.println("잘못된 연산자입니다.");
		}
		//서식 주려면 printf가 편함 
	}	

}







