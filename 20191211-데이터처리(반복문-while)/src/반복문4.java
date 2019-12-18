
public class 반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		////100부터 999까지 7의 배수 갯수, 4의 배수가 아닌 애의 갯수 
		
		int multiple7=0,multiple4=0;
		
		int i=100; //루프변수
		while(i<=999) {
			if(i%7==0)
				multiple7+=1;
			if(i%4!=0)
				multiple4+=1;
			i++;
		}
		System.out.println("100~999 중 7의 배수는 "+multiple7+"개 입니다.");
		System.out.println("100~999 중 4의 배수가 아닌 수의는 "+multiple4+"개 입니다.");


	}

}
