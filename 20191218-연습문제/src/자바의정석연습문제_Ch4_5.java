
public class 자바의정석연습문제_Ch4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4-1-1.
		int x=30;
		boolean a= (x>10 && x>20) ;
		//4-1-2.
		char ch=10;
		boolean b=(ch!=' ' && ch!=' ');
		//4-1-3
		boolean c= ch=='x'||ch=='X';
		//4-1-4
		boolean d= ch>='0'||ch<='0';
		//4-1-5
		boolean e= (ch>='A'&&ch<='Z') || (ch>='a'&&ch<='z');
		//4-1-6
		int year=2020;
		boolean f= year%400==0 || (year%4==0 && year%100!=0);
		//4-1-7
		boolean powerOn=true;
		boolean ee= (powerOn==true);
		//4-1-8
		String atr="no";
		//boolean f=str.equals("yes");
		
		//4-2
		int sum=0;
		for(int i=1;i<=20;i++) {
			if(i%2!=0 || i%3!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
		//4-3
		int an=0;
		int sum1=0;
		for(int j=1;j<=10;j++) {
			an+=j;
			sum1+=an;
		}
		System.out.println(sum1);
		
				
				
	}

}








