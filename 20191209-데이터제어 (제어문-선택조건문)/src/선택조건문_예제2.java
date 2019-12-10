// 컴퓨터 난수, 사용자 입력 --> 가위,바위,보 게임 
import java.util.Scanner;
public class 선택조건문_예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열로 풀기
		
		// 0,1,2
		int com=(int)(Math.random()*3);
				
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2):");
		int user=scan.nextInt();
				
		String[] value= {"가위","바위","보"};
				
		System.out.println("컴퓨터:"+value[com]+",플레이어:"+value[user]);
		
		
		
		/*
		//유저의 값을 받는다 
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2):");
		int user=scan.nextInt();
		
		//유저의 값을 보여준다.
		if(user==0)
			System.out.println("user:가위");
		if(user==1)
			System.out.println("user:바위");
		if(user==2)
			System.out.println("user:보");

		//컴터의 값을 받고 컴터 값을 보여준다.
		int com=(int)(Math.random()*3); //0.0~0.99 --> 0.0~2.99... --> 0,1,2	
		//소수를 int로 강제 형변환 시키면 소수점을 다 떼버리고 정수 부분만 남긴다. 
		if(com==0)
			System.out.println("컴퓨터:가위");
		if(com==1)
			System.out.println("컴퓨터:바위");
		if(com==2)
			System.out.println("컴퓨터:보");
		
		//결과계산
		int result=com-user;
		if(result==0)
			System.out.println("비겼어요");
		if(result==1 || result==(-2))
			System.out.println("컴퓨터 Win!");
		if(result==(-1) || result==2)
			System.out.println("user Win!");
		*/
		
	}

}
