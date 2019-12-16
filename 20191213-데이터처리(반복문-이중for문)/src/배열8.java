/*
 * 3명의 학생 ==> 국어,영어,수학 점수를 입력 받아서 출력 (1차원 배열로 풀 것.) 
 * ==================
 * 80 80 80 240 B 2 80.0
 * 90 90 90 270 A 1 90.0 
 * 70 70 70 210 C 3 70.0 
*/
import java.util.Scanner;
public class 배열8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] sum=new int[3];
		char[] grade=new char[3];
		int[] rank=new int[3];
		double[] avg=new double[3];
		
		for(int i=0;i<kor.length;i++) {
			System.out.println((i+1)+"번째 학생 국어점수: ");
			kor[i]=scan.nextInt();
			System.out.println((i+1)+"번째 학생 영어점수: ");
			eng[i]=scan.nextInt();
			System.out.println((i+1)+"번째 학생 수학점수: ");
			math[i]=scan.nextInt();
			sum[i]=kor[i]+eng[i]+math[i];
			avg[i]=sum[i]/kor.length;
			//학점
			switch((int)avg[i]/10) { //switch() 안에는 실수 들어갈 수 없으므로 int로 형변환시켜야함. //switch 안에는 정수, 문자, 문자열만 가능. 
			case 10: case 9:
				grade[i]='A';
				break;
			case 8:
				grade[i]='B';
				break;
			case 7:
				grade[i]='C';
				break;
			case 6:
				grade[i]='D';
				break;
			default:
				grade[i]='F';	
			}			
		}		
		//등수 
		//avg[i]끼리 비교. 1등은 다른 avg보다 큼. ==> 2번 크다. ==? 1등. 전체개수3-이긴횟수2=1 랭킹 
		//2등은 다른 avg보다 1번 큼 ==> 전체개수3-이긴횟수1=2 랭킹 
		for(int i=0;i<kor.length;i++) {
			rank[i]=kor.length;
			for(int j=0;j<kor.length;j++) {
				if(avg[i]>avg[j]) {
					rank[i]--;
				}
			}
			
		}
		
		
		for (int i=0;i<kor.length;i++) {
			System.out.printf("%d\t%d\t%d\t%d\t%c\t%d\t%.1f\n",kor[i],eng[i],math[i],sum[i],grade[i],rank[i],avg[i]);
		}
		
	}

}
