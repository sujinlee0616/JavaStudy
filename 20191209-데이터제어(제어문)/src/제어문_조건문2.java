/* if 수행문장의 범위
 * 
 * if(조건문)
 * 	실행문장1 --> if의 소속문장
 * 	실행문장2 --> if와 관련없는 문장 --> true/false와 관련없이 무조건 실행됨
 *  --> 자바에서 모든 제어문은 {}이 없는 경우 한 문장만 수행함.
 *  --> 안 좋은 코드. 가독성 떨어짐.  
 *  
 * if(조건문){
 * 	실행문장1
 * }
 * 실행문장2 
 * --> 좋은 코드. 가독성이 좋다. 항상 이런식으로 블록처리{} 해줘야. 
 * 
 * 
*/
public class 제어문_조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		// 여러개의 실행문장을 동시에 제어할 때 사용하는 조건문 
		if(num%2==0){
			int b=100;
			b++;
		}
		//System.out.println(b); //이렇게 하면 오류남. int b는 if 안에서만 정의된 변수였으므로, if문 빠져나오면 변수 b는 사라진다. 

		int c=100;
		if(num%2==0){
			c++;
		}
		System.out.println(c); //101;		
				
		int d=100;
		if(num%2!=0){
			d++;
		}
		System.out.println(d); //100 <-- if안의 문장은 거짓이므로 수행X --> d는 증가하지 않았음. 
		
		
		

	}

}
