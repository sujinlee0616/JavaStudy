/*
 * 관련된 내용을 묶어서 사용
 * 
 * => 같은 데이터형을 묶어서 한 개의 이름으로 제어 : 배열 
 * 	  ========
 * 	1) 방법1
 * 	  int[] arr={10,20,30,...}; <== 맨 처음 한 번 값이 필요할 때. 
 *  2) 방법2 
 * 	  int[] arr=new int[3]; <== 값 나중에 채워도 상관없을 때. 배열이 값이 많아서 일일이 채워넣기 힘들 때.
 * 								(ex. int[] arr=new int[100]; 100개를 일일이 값 지정 불가능.) 
 * 
 *    int[] arr={'A','B',...}; //가능함.
 * 	  double[] arr={10,20,30...};//가능함. 큰 데이터형의 배열에 작은 데이터 넣는거니까 들어간다.
 * 	  String[] arr={"","","","",""...}; 
 * 
*/
public class 배열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="aaaaa";
		String b;
		String c="";//이건 null이 아니라 공백이 저장됨. 
		a.length();
		//b.length(); //Null값이므로 에러난다. (Null이 length를 어떻게 가져욧!)  
		c.length();
		

	}
}
