
public class 연산자_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//문제1 - 65430원을 만들기 위한 화폐의 갯수
		int money=65430;
		int h10000=money/10000;
		int h1000=(money%10000)/1000;
		int h100=(money%1000)/100;
		int h10=(money%100)/10;
		System.out.println("만원짜리:"+h10000);
		System.out.println("천원짜리:"+h1000);
		System.out.println("백원짜리:"+h100);
		System.out.println("십원짜리:"+h10);
		
		String s=100+10.5+""+'A'+10f+100L;
		//110.5+A+10.0+100 -->110.5A10.0100 
		System.out.println("s는"+s);
		
		//문제2 - 급여명세서 작성
		int basic=1500000;
		int bonus=55000;
		int tax=basic/10;
		int real_pay=basic+bonus-tax;
		System.out.println("실수령액: "+real_pay+" 원");
		

	}

}
