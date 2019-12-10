//정수입력 --> 1,2,3,4
import java.util.Scanner; 
public class 제어문_조건문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int UP=1;
		final int DOWN=2;
		final int LEFT=3;
		final int RIGHT=4;
		
		int x=0,y =800; //높이는 맨 위가 0, 맨 아래가 800임 
		Scanner scan=new Scanner(System.in);
		System.out.println("키보드 입력(위:1, 아래:2, 왼쪽:3, 오른쪽:4) :");
		int input=scan.nextInt();
		
		if(input==UP) {
			System.out.println("위쪽으로 올라간다!!");
			y-=5; //y를 -5하면 5만큼 올라간다.
		}

	}

}
