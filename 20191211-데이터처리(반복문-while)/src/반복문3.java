// 가위바위보 ==> 5번 한다고 치면 ==> 1승3패1무
import java.util.Scanner;
public class 반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// ex1) [while] while문으로 가위바위보 만들기 - 총 5판 하고, 마지막에 몇승몇패몇무인지 알려주는. 
		int i=1;
		int win=0,lose=0,same=0;		
		while(i<=5) {
			// 컴퓨터 --> 가위바위보
			int com=(int)(Math.random()*3);//0.0~0.99*2//int(0.0~2.99)//0,1,2
			//사용자  --> 입력
			Scanner scan = new Scanner(System.in);
			System.out.println("가위바위보! (가위:0,바위:1,보:2):");
			int user=scan.nextInt();
			//비교
			int result=com-user;
			if(result==0) {
				System.out.println("비겼어요!");
				same++;
			}
			else if(result==-1||result==2) {
				System.out.println("사용자 win!");
				win++;
			}
			else {
				//result==1 ||result==-2 일 때.
				System.out.println("컴퓨터 win");
				lose++;
			}
			i++;
		}
		//승무패 카운트 
		System.out.println("사용자 전적: 총 5판 중 "+win+"승 "+lose+"패 "+same+"무");
		System.out.println("End of the game\n\n");
		
		
		// ex2) [switch case] ex1번을 switch case로 다시 짜기
		i=1;
		win=0;
		lose=0;
		same=0;		
		while(i<=5) {
			// 컴퓨터 --> 가위바위보
			int com=(int)(Math.random()*3);//0.0~0.99*2//int(0.0~2.99)//0,1,2
			//사용자  --> 입력
			Scanner scan = new Scanner(System.in);
			System.out.println("가위바위보! (가위:0,바위:1,보:2):");
			int user=scan.nextInt();
			//비교
			int result=com-user;
			switch(result) {
				case -1:
				case 2:
					System.out.println("사용자 win!");
					win++;
					break;
				case 1:
				case -2:
					System.out.println("컴퓨터 win!");
					lose++;
					break;
				case 0:
					System.out.println("비겼어요!");
					same++;
					break;
			}
			i++;			
		}
		//승무패 카운트 
		System.out.println("사용자 전적: 총 5판 중 "+win+"승 "+lose+"패 "+same+"무");		
		
		

	}

}
