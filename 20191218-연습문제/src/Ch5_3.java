
public class Ch5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열 안의 값 다 더한 값 출력 
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
		}
		
		System.out.println("sum="+sum);

	}

}
