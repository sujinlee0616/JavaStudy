/*
 * 시프트연산자 (비트 이동 연산자)
 * 	<< (왼쪽 이동)    >> (오른쪽 이동)
 * 
 *   10<<2
 *   1010 --> 101000 (두 칸 0으로 채워라) --> X(2^2) --> 10*4=40
 *   
 *   10>>2
 *   1010 --> 10 (두 자리 삭제) --> /(2^2) --> 10/4=2
 *   
 *   X<<Y --> X * 2^Y
 *   X>>Y --> X / 2^Y
 *   
 *   ex) 14<<3 : 14*8 =112 
 *   ex) 14>>3 : 14/8=1 
 *   
*/
public class 이항연산자_시프트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=14<<3;
		int b=14>>3;
		System.out.println("a="+a);
		System.out.println("b="+b);

	}

}
