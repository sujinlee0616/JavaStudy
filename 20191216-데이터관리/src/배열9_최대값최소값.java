/*
 * 5개의 정수에서 
 * 최대값, 최소값....
*/
import java.util.Scanner;
public class 배열9_최대값최소값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] num=new int[5];
		
		for(int i=0;i<5;i++) {
			num[i]=(int)(Math.random()*100)+1;
		}
		
		//(방법1) 내가 원래대로 풀던 방법은 안 되나? --> 됨. 
		int max=num[0];
		int min=num[0];
		for(int i:num) {
			System.out.printf("%d\t",i);
		}
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("최대값:"+max+" 최소값:"+min);
		
		//(방법2) 선생님이 푸신 방법.
		max=num[0];
		min=num[0];		
		//처리 => 최대값, 최소값
		for(int i:num) {
			if(max<i)
				max=i;
			if(min>i)
				min=i;
			System.out.printf("%d\t",i);
		}		
		System.out.println("최대값:"+max+" 최소값:"+min);
		
	}

}
