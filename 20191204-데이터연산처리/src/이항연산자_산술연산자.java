
public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 산술연산자(+,-,*,/,%) : 서로 다른 데이터형을 연산할 경우 주의!
		 * 	1) int 이하 데이터형 (byte, short, char)이 연산되면 int로 변경됨 ★★★
		 * 		byte + byte = int
		 * 		char + byte = int
		 * 		short + byte + char = int 
		 * 		
		 * 		byte+int = int
		 * 		short+char+int = int
		 * 
		 * 		short+char+int+double = double
		 * 		--> 가장 (표현범위가) 큰 데이터형으로 받아야!!★★★
		 * 
		 * 		어떤 데이터형이든 문자열이랑 붙으면 결과값은 문자형이 된다.
		 * 		""+77 --> "77" (문자열)
		 * 		""+7.5 --> "7.5" (문자열)
		 * 		""+true --> "true" (문자열)
		 */
		
		/*
		 * byte b=10; byte c=20; int d=b+c; //byte d 라고 하면 안 됨!! byte+byte=int니까! ★ 
		 * 정 d를 byte로 바꾸고 싶다면 byte d=(byte)(b+c); 와 같이 해야한다.
		 */
		
		byte ccc=(byte)300;
		System.out.println("ccc="+ccc); //b=44 
		System.out.println(Integer.toBinaryString(300));
		/*
		 * 300 = 100101100 (2) 
		 * 300이 byte의 최대 저장범위인 127을 벗어났으므로, byte가 저장할 수 있는 범위인 뒤에서부터 8비트(8칸)만 잘라서 저장한다.
		 *  --> 00101100(2)만 저장함 --> 2^5+2^3+2^2 =32+8+4=44 그래서 44가 됨. 
		 *  --> 함부로 byte로 설정하거나 형변환하면 안 된다.
		*/
		
		int a=10+20*3; //a=70
		System.out.println("a="+a);
		int b=(10+20)*3; //b=90
		System.out.println("b="+b);
		

	}

}
