
public class Ch5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2차원 배열 arr에 담긴 모든 값의 총합과 평균 
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20}, 
				{30,30,30,30,30} 
				};
		int total = 0;
		float average = 0;
		
		//total
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j< arr[i].length;j++) {
				total+=arr[i][j];
			}
		}
		
		//avg
		average=total/(float)(arr.length*arr[0].length);
		
		System.out.println("total="+total);
		System.out.println("average="+average);

	}

}
