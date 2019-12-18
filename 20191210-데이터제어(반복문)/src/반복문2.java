/*
 * while --> while(true) : 무한루프 --> 무한루프 돌릴 때는 while문 더 많이 쓴다. 
 * for --> for(;;) : 무한루프
 * 
 * 반복문을 제어 
 * =========
 * 	continue --> 특정내용을 제외.★ ★: continue나오면 위의 for/while 조건으로 돌아가니까..
 * 		ex) 1~10까지 도는데 7,9를 제외하고싶다.
 * 			for (int i=1;i<=10;i++){
 * 				if(i==7||i==9)
 * 					continue;
 * 				if(i==9)          <--- 이 if문은 실행되지 않음. 왜냐면 i==9일 때 위의 if문에서 continue돼서 for문의 조건으로 돌아가서 i=10이 되기 떄문.
 * 					break;
 * 			}
 * 	break --> 반복문을 종료할 때 사용.★★
 * 
*/
import java.util.Scanner;
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while --> 1~(사용자입력값)까지의 짝수의 합, 홀수의 합, 총 합을 구해서 출력하라.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력해주세요.");
		int num=scan.nextInt();
		int sum_even=0;
		int sum_odd=0;
		int sum=0;
		int i=1;
		
		while(i<=num) {
			sum+=i;
			if(i%2==0) {
				sum_even+=i;
			}
			if(i%2!=0) {
				sum_odd+=i;
			}
			i++;
		}
		System.out.println("1~"+num+"까지의 짝수 합은"+sum_even+"입니다.");
		System.out.println("1~"+num+"까지의 홀수 합은"+sum_odd+"입니다.");
		System.out.println("1~"+num+"까지의 모든 수의 합은"+sum+"입니다.");		
		

	}

}
