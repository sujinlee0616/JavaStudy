/*
 * 	1~100까지의 합 
 * 	짝수/홀수 합 출력 
 * 
 * 	결과	
 * 	1~100까지의 합 : 5050
 *  1~100까지의 짝수의 합 : 
 *  1~500까지의 홀수의 합 : 
*/
public class 반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum1=0,sum2=0,sum3=0;
		for(int i=1;i<=100;i++) {
			sum1+=i;
			if(i%2==0)
				sum2+=i;
			else
				sum3+=i;
		}
		System.out.println("1~100까지의 합 :"+sum1);
		System.out.println("1~100까지의 짝수의 합 :"+sum2);
		System.out.println("1~100까지의 홀수의 합 :"+sum3);

	}

}
