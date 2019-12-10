/*
 * 컴퓨터 -> 1~100 사이의 임의의 수를 추출
 * UP/DOWN 게임..
*/
import java.util.Scanner;
public class 업다운 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//컴퓨터 난수 발생 
		int com=(int)(Math.random()*100)+1; //0.0~0.99
		
		//유저 데이터 받는다 
		Scanner scan=new Scanner (System.in);
		
		System.out.println("1~100 사이의 정수 입력:");
				
		while(true) {
			
			int user=scan.nextInt();
			//예외처리-유저가 이상한 값 입력 시
			if(user<1 || user>100) {
				System.out.println("잘못된 입력입니다.");
				continue; //continue : while문의 조건식으로 이동 ★★
			}

			if(com>user) {
				System.out.println("UP!");
			}
			else if(com<user) {
				System.out.println("DOWN!");
			}
			else {
				System.out.println("Correct! Game Over!");
				//종료 : break; 또는 System.exit(0);을 준다.
				break; //break : 이 위치에서 while문을 종료시킨다.★★
				//System.exit(0);
				//break나 continue 아래에는 아무 문장도 입력하면 안 된다.
			}
		}

	}

}
