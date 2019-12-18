/*
 * 
*/
public class 제어문정리 {
	//int abc=100; //전역변수 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc=12345678; // 지역변수 : 얘는 stack에 저장된다. //전역변수와 똑같은 이름의 지역변수 만들 수 있음. 
	
		int i=1;
		do {
			System.out.print(i);
			i++;
		}
		while(i<=10);
		
		int a=10;
		if(a==10) {
			int b=20;
			if(b==20) {
				int c=30;{
					int k=100;
				}//블록을 벗어났으므로 지역변수 k는 사라진다.
			}// if문을 벗어났으므로 지역변수 c는 사라진다. 
		}//if문을 벗어났으므로 지역변수 b는 사라진다. 
		//변수 a는 사라지지 않는다. 
		
		System.out.println();
		aaa();
		aaa();
		aaa();

	}
	
	public static void aaa() {
		int a=10;
		System.out.println("a="+a); 
		++a;
	}

}
