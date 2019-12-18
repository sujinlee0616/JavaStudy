//월을 입력 --> 마지막 날짜가 며칠인지 확인하는 프로그램
import java.util.Scanner;
public class 다중조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1,3,5,7,8,10,12 : 31일
		// 2 : 28일(평년), 29일(윤년)
		// 4,6,9,11 : 30일
		
		Scanner scan=new Scanner(System.in);
		System.out.println("년도:");
		int year=scan.nextInt();
		System.out.println("월:");
		int month=scan.nextInt();
		
		int lastday=0;
		if(month==2) {
			if(year%4==0 && year%100==0||year%400!=0) {
				lastday=29;
			}
			else {
				lastday=28;
			}
		}
		else if(month==4||month==6||month==9||month==11) {
			lastday=30;
		}
		else {
			lastday=31;
		}
		System.out.println(year+"년 "+month+"월은 "+lastday+"일까지 있습니다.");
		
		
		

	}

}
