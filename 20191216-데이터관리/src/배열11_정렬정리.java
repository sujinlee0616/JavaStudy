import java.util.Arrays;

public class 배열11_정렬정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수 저장 
		int[] arr=new int[5];
		//초기값 
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전:");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();		
		
		System.out.println("정렬 후 (오름차순):");
		//★정리★ 오름차순 정렬 (ASC) 
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;		
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("정렬 후 (내림차순):");
		//★정리★ 내림차순 정렬 (DESC) 
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;		
				}
			}
		}
		// Arrays.sort(arr); <=== 이렇게 한방에도 내림차순 정렬됨. 
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}

}
