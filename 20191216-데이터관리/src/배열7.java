// 5개의 정수를 입력받아서 => 5개 정수를 출력하고 ==> 합, 평균 출력 (for each 구문 사용) 
import java.util.Scanner;
public class 배열7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int number[]=new int[5];
		int sum=0; double avg=0.0;
		
		for(int i=0;i<number.length;i++) {
			System.out.println((i+1)+"번째 정수 입력:");
			number[i]=scan.nextInt();
			sum+=number[i];
		}
		
		//for each 구문 
		for (int i:number) {
			System.out.println(i);
		}
		
		avg=sum/(double)number.length;
		System.out.println("합계: "+sum);
		System.out.printf("평균: %.2f\n",avg);
		
		

	}

}
