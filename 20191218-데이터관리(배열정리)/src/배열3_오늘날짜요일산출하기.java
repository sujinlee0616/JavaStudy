import java.util.Calendar;
import java.util.Scanner;

public class 배열3_오늘날짜요일산출하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] strWeek= {'일','월','화','수','목','금','토'};
		
		// MONTH => 0번부터 시작함
		// DAYS_OF_WEEK ==> 1번부터 시작
		Calendar cal=Calendar.getInstance();
		int y=cal.get(cal.YEAR);
		int m=cal.get(cal.MONTH);
		int d=cal.get(cal.DATE);
		int w=cal.get(cal.DAY_OF_WEEK);
		System.out.println("====== "+y+"년도 "+m+"월 "+d+"일 "+strWeek[w-1]+"요일 ======");
			

	}

}
