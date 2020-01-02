/*
 * 	변수 초기화
 * 	========
 * 	선언과 동시에 초기화
 * 
 * 	ex1) int a=10;
 * 
 * 	ex2) 초기화 블록 : 멤버변수의 초기화. (static일 경우 블록 앞에 static을 붙인다) 
 * 
 * 	①	{
 * 			a=100;
 * 		}
 * 
 * 	②	static
 * 		{
 * 			코딩 
 * 		}
 * 
 * 	ex3) 클래스명()
 * 		 {
 * 			a=200;
 * 		 }
 * 		 
*/
class MyData{
	static int[] arr=new int[6];
	//arr[0]=10; // Error. 얘 구현임!!! 값을 바꾼거니까!! 클래스 영역 안에 구현쓰면 안됨!!!!★
	
	//초기화 블록 
	public MyData()
	{
		for(int i=0; i<6;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * MyData m1=new MyData(); for(int i=0;i<6;i++) {
		 * System.out.print(MyData.arr[i]+""); }
		 */
		
		MyData m1=new MyData(); 
		for(int i=0;i<6;i++) {
			System.out.print(MyData.arr[i]+" "); 
		}
		System.out.println("\n=================");
		
		MyData m2=new MyData(); 
		for(int i=0;i<6;i++) {
			System.out.print(MyData.arr[i]+" "); 
		}
		System.out.println("\n=================");
		
		MyData m3=new MyData(); 
		for(int i=0;i<6;i++) {
			System.out.print(MyData.arr[i]+" "); 
		}
		System.out.println("\n=================");
		for(int i=0;i<6;i++) {
			System.out.print(MyData.arr[i]+" "); 
		}
		System.out.println("\n=================");
		for(int i=0;i<6;i++) {
			System.out.print(MyData.arr[i]+" "); 
		}
		System.out.println("\n=================");
		
	}
}
