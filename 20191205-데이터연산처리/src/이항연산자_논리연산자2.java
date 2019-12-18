/*

yte --> 연산 (int) 
 * 		
 * 		byte < char,short < int < long < float < double
 * 		
 * 		&& || ! --> 논리 (true, false) : 조건문에 많이 사용... 
 * 
 *  
 *  
*/

public class 이항연산자_논리연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 결과값 --> boolean
		boolean b1=(6<7) && (7==7); //true
		System.out.println("b1="+b1);
		
		b1=(6>7) && (7==7); //false
		System.out.println("b1="+b1);
		
		b1=(6>7) || (7==7); //true
		System.out.println("b1="+b1); 
		
		b1=(6<7) || (7==7); //true
		System.out.println("b1="+b1); 
		
		b1=(6>7) && (7==7); //false
		System.out.println("b1="+b1);
		
	}

}
