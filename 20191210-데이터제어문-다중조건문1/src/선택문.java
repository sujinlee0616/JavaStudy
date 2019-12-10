/*
 * 선택문 : 한개의 값을 받아서 처리 (한번만 수행하게 하려면 break 넣음.)
 * 		   게임, 네트워크 분야에서 자주 사용됨. 
 * 형식) 
 * 	switch(값){ <-- 값에 들어갈 수 있는 데이터: 정수,문자,문자열
 * 		case1:
 * 			처리(1)
 * 			break; <-- break 있는 지점에서 종료함
 * 		case2:
 * 			처리(2)
 * 		case3:
 * 			처리(3)
 * 			break; <-- break 있는 지점에서 종료함 // 값이 2일 경우에는 처리2,처리3 둘 다 실행함. 
 * 		case4:
 *		case5:
 * 			처리(4) <-- 값이 4,5일 경우에는 처리(4)를 실행함 
 * 			break;
 * 		=========
 * 		default: <-- 값이 1,2,3,4,5가 아닐 경우 디폴트 처리. 
 * 			처리
 * 		========= default 는 생략 가능. 
 * 	}
*/
import java.util.Scanner;
public class 선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 마지막 날짜 구하는 프로그램을 switch 구문으로 짜기 
		// if <===> switch
		// 다중 if문과 switch 문은 서로 바꿔서 쓸 수 있다. 
		// Servlet <===> JSP ===> MVC ===> Spring 
		// 				  ┗ JSP : Java와 HTML로 구성... MVC로 둘을 구분. 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수:");
		int num1=scan.nextInt();
		
		System.out.println("두번째 정수:");
		int num2=scan.nextInt();
		
		System.out.println("연산자(+,-,*,/):");
		String op=scan.next();
		
		switch(op) {
			case "+":
				System.out.printf("%d+%d=%d",num1,num2,num1+num2);
				break;
			case "-":
				System.out.printf("%d-%d=%d",num1,num2,num1-num2);
				break;
			case "*":
				System.out.printf("%d*%d=%d",num1,num2,num1*num2);
				break;
			case "/":
				if(num2==0)
					System.out.println("0으로 나눌 수 없습니다.");
				else
					System.out.printf("%d/%d=%.1f",num1,num2,num1/(double)num2);
				break;
		}
		

	}

}










