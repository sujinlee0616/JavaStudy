/* 	{3, "aaa", 10.5, 'A', 9.5F, 10L} <== 배열(같은 데이터형을 묶음)인데, 다른 데이터형을 배열로 묶을 수 있나..? 
 * 										   ㅇㅇ. Object 사용하면 가능하다.  
 * 	ex) Object[] arr={3, "aaa", 10.5, 'A', 9.5F, 10L}; <== Object 나중에 배울 예정. 
*/
public class 메소드3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Object[] arr={3, "aaa", 10.5, 'A', 9.5F, 10L}; //int a=arr[0]; <=== 이렇게는 불가능
		  int a=(int)arr[0]; //<=== 이렇게는 가능. //Object는 가장 큰 데이터형. 
		  for(int i=0;i<arr.length;i++) { 
			  System.out.println(arr[i]); 
		  }
		 
	}

}
