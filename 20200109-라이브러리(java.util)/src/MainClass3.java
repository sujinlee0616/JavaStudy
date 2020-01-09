import java.util.*;
import java.text.*;
public class MainClass3 {

	public static void main(String[] args) {
		
		// 시스템의 시간 읽기 : Date
		Date date=new Date();
		System.out.println(date); //요즘엔 toString 안 써도 잘 출력됨  // Thu Jan 09 15:10:44 KST 2020
		//System.out.println(date.toString()); 
		
		// SimpleDateFormat: 날짜를 내가 원하는 형태로 표현해줌 
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //2020-01-09 03:10:44
		SimpleDateFormat sdf2=new SimpleDateFormat("yy-M-d h:m:s"); //20-1-9 3:10:44
		//MM만 대문자로 쓴다! mm은 minute라서 그렇다. 
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		
		StringTokenizer st=new StringTokenizer(sdf1.format(date),"-");
		while(st.hasMoreTokens()) { //hasMoreTokens : 데이터가 몇 개 들어왔는지 모를 때 사용. 
			System.out.println(st.nextToken());
		}
		
		String year=st.nextToken();
		String month=st.nextToken();
		String day=st.nextToken();
		
		System.out.println("년도:"+year);
		System.out.println("월:"+month);
		System.out.println("일:"+day);
		
		
	}

}
