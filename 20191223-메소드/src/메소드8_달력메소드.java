import java.util.Calendar;
import java.util.Scanner;

public class 메소드8_달력메소드 {
	//년,월 입력받기
	static int setYear()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("년도를 입력하세요 :");
		int year = scan.nextInt(); 
		return year;
	}
	static int setMonth()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력하세요 :");
		int month = scan.nextInt(); 
		return month;
	}
	
	
	
	// 1일자의 요일구하기
	static int getWeek(int year, int month)
	{
		//1일자의 요일을 구한다
				// 전년도의 12/31 => 총합
				int total = (year-1)*365+(year/4)-(year/100)+(year/400);
				// 전달
				int[] lastDay = {31,28,31,30,31,30, 
						 		 31,31,30,31,30,31};
				if((year%4==0 && year%100 != 0 )||(year%400==0))
				{
					lastDay[1] = 29;
				}
				else 
					lastDay[1] = 28;
				
				for(int i=0; i<month-1; i++)
				{
					total += lastDay[i];
				}
				// +1
				total++; // 각달의 1일자
				
				int week = total%7;
				
			return week;
		
	}
	// 달력 출력
	static void datePrint(int week, int month)
	{
		char[] strWeek = {'일','월','화','수','목','금','토'};
		int[] lastDay = {31,28,31,30,31,30, 
		 		 31,31,30,31,30,31};

		for(int i=0; i<strWeek.length; i++)
		{
			System.out.print(strWeek[i] + "\t");
		}
		
		System.out.println();
		for(int i=1; i<=lastDay[month-1]; i++)
		{
			if(i==1)
			{
				for(int j=0; j<week; j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week > 6)
			{
				week = 0;
				System.out.println();
			}
		}
	}
	//출력
	static void today(int year, int month)
	{
		char[] strWeek = {'일','월','화','수','목','금','토'};
		Calendar cal = Calendar.getInstance();
		int y = cal.get(cal.YEAR);
		int m = cal.get(cal.MONTH)+1;
		int d = cal.get(cal.DATE);
		int w = cal.get(cal.DAY_OF_WEEK);
		System.out.println("====== " + y+"년도"+m+"월"+d+"일"+strWeek[w-1]+"요일 ======");
		System.out.println(year+"년도 "+ month+"월");
	}

	//조립
	static void process()
	{
		int year = setYear();
		int month = setMonth();
		today(year,month);
		
		int week = getWeek(year, month);
		datePrint(week, month);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
	}

}
