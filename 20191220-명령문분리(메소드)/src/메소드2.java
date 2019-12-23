// 정수 1개를 입력받아서 2진법 출력 ==> 1. 그냥 2. 메소드 만들어서 
// 10 ==> 16bit
// 결과) 0000 0000 0000 1010
import java.util.Scanner;
public class 메소드2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.입력
		Scanner scan=new Scanner(System.in);
		// 변수 
		int input=0; //사용자가 입력한 값을 받는 변수 
		System.out.println("정수 입력:");
		input=scan.nextInt();
		//라이브러리 활용하면 한방에 이진법 수 나옴. 
		//System.out.println(Integer.toBinaryString(input));
		//2. 처리 
		int[] binary=new int[16]; 
		// 결과값이 뒤에서부터 값을 채우고 앞에는 다 0으로 채우므로, 배열의 위치를 잡기 위해 위치 잡는 변수를 세우자. 
		int index=15; 
		// 배열 => 값을 변경 ==> 위치 (뒤(length-1), 앞(0))
		// 뒤부터 (binary[15] 부터) 저장해야하므로, 맨 처음에 저장할 애 순서를 index=15, 그리고 index값 하나씩 빼가면서 저장하자.
		/* 10%2==0
		 * 5%2==1
		 * 2%2==0
		 * 1%2==1
		 * ==> 1010 
		*/
		while(true) {
			binary[index]=input%2;
			input=input/2; // input/=2;로 해도 됨.
			if(input==0) //
					break;
			index--;
		}
		//3. 출력 ==> 출력만 했으니까 void 
		for(int i=0;i<16;i++) {
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
		
		
		
	}

}






