import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 메소드5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기";
		//문자 갯수 확인 ==> 공백도 포함한다. 
		System.out.println("문자 갯수:"+data.length());

		/*
		 * System.out.println("'버섯'이라는 단어의 갯수:"); int count=0; Pattern
		 * p=Pattern.compile("버섯"); Matcher m=p.matcher(data); while(m.find()) {
		 * count++; } System.out.println(count);
		 */
		// substring(int start), substring(int start, int end)
		// ★'end-1'번 글자까지 가져옴에 유의!! ★
		String fData=data.substring(0,data.indexOf("!"));
		System.out.println(fData);
		String lData=data.substring(data.indexOf("!")+1);
		System.out.println(lData.trim());
		
		int a=10;
		int b=20;
		double d=10.5;
		// 102010.5 와 같이 출력하고 싶다면 ex) 2019122301, 2019122302 <== 오늘(19.12.22) 가입하신 손님 명단 
		String sss=a+""+b+""+d;
		System.out.println(sss);
		// 이런 함수를 static 함수라고 한다. static 메소드. 
		// 앞에 클래스 명을 통해 접근 ==> static ex) System.out, Math.random();
		sss=String.valueOf(a)+String.valueOf(b)+String.valueOf(d);
		System.out.println(sss);
		// valueOf : 모든 데이터형을 문자로 바꿔주는 함수. 
		
				
	}

}









