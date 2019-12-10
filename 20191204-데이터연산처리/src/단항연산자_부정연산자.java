/*
 * 단항 : 피연산자(연산대상) 1개일 경우
 * 	부정연산자 : !
 * 	======
 * 	사용할 떄 반드시 boolean 사용. 
 * 	true→false, false→true 로 변경. : 오라클에서도 사용됨.  * 
*/
public class 단항연산자_부정연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=false;
		System.out.println("bCheck 변경 전: "+bCheck);
		bCheck=!bCheck;
		System.out.println("bCheck 변경 후: "+bCheck);

		
		// 주의..
		int x=10;
		int y=9;
		if((x<y) && (++y==x)) {
		}
		System.out.println("x="+x);
		System.out.println("y="+y); //y=9. 왜냐면 && 연산에서 왼쪽이 false면 오른쪽은 계산X. 
				
		int aaa=10;
		int bbb=9;
		if((aaa<bbb) || (++bbb==aaa)) {
		}
		System.out.println("aaa="+aaa);
		System.out.println("bbb="+bbb); //y=9. 왜냐면 || 연산에서는 왼쪽이 false라도 오른쪽도 계산함. 
		
		

	}
}












