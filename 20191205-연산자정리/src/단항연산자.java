/*
 * 
 * 	*
 * 	**
 * 	***
 *  ****
 *  ***
 *  **
 *  *
 *  for문으로 코딩?
 * 
*/
public class 단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; 
		int b=a++; // b=10, a=11 
		int c=++a; // a=12, c=12
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);	
		
		char ch1='A';
		System.out.println(ch1++); // 출력한 후 증가시킴 --> A출력 //이건 int가 아니라 char로 출력됨!!
		char ch2='A';
		System.out.println(++ch2); // 증가시킨 후 출력 --> B출력  

		int i=10;
		int j=i++ + i++ + ++i + ++i + i++ + i++ + i-- + --i;
		//  j= 10 + 11  +  13 +  14 + 14  + 15  + 16  +  14
		//  i    11    12 13    14      15    16    15  14
		System.out.println("j="+j);
		
		int x=10;
		int y=9;
		boolean bCheck=(x<y)&&(++y==x); 
		// false&& --> bCheck=false. ★왼쪽 편이 이미 false 이므로 오른쪽은 연산수행X --> y는 그대로 9.★ 
		System.out.println(bCheck); 
		System.out.println("x="+x); //10 
		System.out.println("y="+y); //9  
		
		//증감연산자 --> 반복문에 많이 쓰임. ex) for (i=0;i<4;i++){}
		
		// ! : 부정연산자. not. 결과값이 항상 boolean(true/false)임 --> 조건문에 많이 쓰임. 
		
	}

}




