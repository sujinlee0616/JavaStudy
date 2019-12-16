import java.util.Scanner;
public class 연습문제1_등수산출 {
	//점수 5개를 입력받거나 랜덤으로 5개를 생성시켜서 각각의 등수를 구하라. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//점수입력 
		int[] num=new int[5];
		for(int i=0;i<5;i++) {
			System.out.println((i+1)+"번쨰 정수 입력:");
			num[i]=scan.nextInt();
		}
		
		//등수산출
		int[] rank=new int[5];
		//내 등수(1) = 5(총 경기횟수) - 4 (이긴횟수)
		//(방식1) 내가 푼 방법 - 처음에 꼴등으로 놓고. 이길때마다 등수-1. (등수가 올라감) 
		/*
		 * for(int i=0;i<5;i++) { rank[i]=5; for(int j=0;j<5;j++) { if(num[i]>num[j]) {
		 * rank[i]--; } } System.out.println(num[i]+"("+rank[i]+")"); }
		 */
		
		//(방식2) 선생님이 푼 방법 - 처음에 1등으로 놓고. 질때마다 등수 +1. (등수가 내려감)
		 for(int i=0;i<5;i++) { 
			  rank[i]=1; 
			  for(int j=0;j<5;j++) { 
				if(num[i]<num[j]) {
					  rank[i]++; 
				} 
		} 
		System.out.println(num[i]+"("+rank[i]+")"); }
		 		
	}
}
