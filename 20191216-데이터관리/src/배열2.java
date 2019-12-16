import java.util.Scanner;
public class 배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[3]; //배열을 선언
		Scanner scan=new Scanner(System.in);
		int max=0; 
		for(int i=0;i<arr.length;i++) { //i가 0번부터 시작하기 때문에 <=arr.length가 아니라 <arr.lenth임. 주의.
			System.out.println((i+1)+"번째 정수 입력:");
			arr[i]=scan.nextInt();
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("가장 큰 값:"+max);

	}

}
