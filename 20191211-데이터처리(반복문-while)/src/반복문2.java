
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ex1) A부터 Z까지, 한 줄에 5개씩 나오게 while문으로 출력하시오. 
		// 방법1 - 내가 푼 방법
		char c='A';
		while(c<=90) {
			System.out.printf("%c\t",c);
			if(c%5==4)
				System.out.println();
			c++;
		}
		System.out.printf("\n\n");
		
		//방법2 - 선생님이 푼 방법
		int i=1;
		char c2='A';
		while(i<=26) {
			System.out.print(c2++ +"\t");
			if(i%5==0)
				System.out.println();
			i++;
		}
		System.out.printf("\n\n");	
		
		// ex2) A~Z, a~z, 한 줄은 대문자, 한 줄은 소문자 번갈아가며 출력하시오.
		i=1;
		char c_big='A';
		char c_small='a';
		while(i<=26) {
			System.out.printf("%c\t",c_big);
			if(i%5==0) {
				System.out.println();
				for(int j=i-4;j<=i;j++) {
					System.out.printf("%c\t",c_small);
					c_small+=1;
					if(j%5==0){
						System.out.println();
					}
				}
			}
			i++;
			c_big+=1;
		}
		System.out.printf("\n\n");
		
		// ex3) ABCDE/fghij/KLMNO/... 이런식으로 출력하시오. ★★★
		i=1;
		c='A';
		boolean bCheck=true;
		while(i<=26) {
			//true로 시작
			if(bCheck==true)
				System.out.print(c+"\t");
			else 
				System.out.print((char)(c+32)+"\t"); //소문자로
			//5의 배수마다 true/false 상태 바꾼다.
			if(i%5==0) {
				System.out.println();
				bCheck=!bCheck;
			}
			i++;
			c++;
		}

	}

}










