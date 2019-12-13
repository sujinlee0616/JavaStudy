/*
 * 	ex1) for문과 while문을 사용하여 구구단을 출력하라. 
 * 
*/

class A{
	
}

{
	static int aa=10;
}
public class 이중반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		A a=new A();
		a.aa=100;
		A b=new A();
		System.out.println("b="+b.aa); //b=10 //new를 쓰면 공간을 새로 만든다. 
		
		
		for(int i=1;i<=9;i++) {
			int j=2;		//while문에서는 초기값을 미리 설정해놔야. //이렇게 하면 i가 바뀔때마다 변수 j가 새로 생기므로 i가 바뀔때마다 메모리가 새로 생성된다. ==> 될 수 있으면 for문 안에 int를 안 쓰는게 좋다.  
			while(j<=9) {
				System.out.printf("%d*%d=%d\t",j,i,j*i);
				j++;
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
