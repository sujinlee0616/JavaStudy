// 입력(정수) --> 년도 윤년으로.

/*
 * 4년마다
 * 100년마다 제외
 * 400년마다
 * 
*/
import java.util.Scanner; 
public class 제어문_조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("년도를 입력하세요.");
		int year=scan.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.println(year+"년은 윤년입니다.");
		}
		
		if(!((year%4==0 && year%100!=0) || year%400==0)) {
			System.out.println(year+"년은 윤년이 아닙니다.");			
		}

	}

}
