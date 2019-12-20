/*
 * 5개의 난수 발생. ==> 배열. 내림차순으로 정렬할 것. 
*/
public class 배열11_내림차순오름차순 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5개의 난수발생 
		int[] arr=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		//내림차순으로 정렬
		for(int i=0;i<4;i++) { //i<4인 이유 : 4바퀴 돈다! 왜냐면 마지막에는 안 돌아도 됨. arr[4]는 비교 안 해도 이미 결정났으니까. 
			//arr[0]에서부터 생각해보면, 내 뒤에 있는 수와 나를 비교하면 내림차순 정렬할 수 있음. 
			for(int j=i+1;j<5;j++) {
				//앞에 있는 수가 더 작으면 순서 잘못된거니까 바꿔야 
				if(arr[i]<arr[j]) {
					//교환할 때 바로 두 개 교환 안되니까 temp에다가 하나 보관하면 서로 값 바꿀 수 있다.
					//temp에다가 arr[i]를 보관해두고, arr[i]에 arr[j]값을 담음. 그 후 arr[j]에는 보관해놓은 원래 arr[i]값을 담음. 
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr) {
			System.out.printf("%d\t",i);
		}
		System.out.println();
		
		//오름차순으로 정렬
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<5;j++) {
				if(arr[i]>arr[j]) {
					//교환할 때 바로 두 개 교환 안되니까 temp에다가 하나 보관하면 서로 값 바꿀 수 있다.  
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr) {
			System.out.printf("%d\t",i);
		}
	}

}
