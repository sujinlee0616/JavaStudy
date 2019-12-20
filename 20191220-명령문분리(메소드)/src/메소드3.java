import java.util.Scanner;
public class 메소드3 {
	
	// 1.입력
	static int userInput() { //매개변수 없다. 
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int input=scan.nextInt();
		return input; //값을 넘겨줌 
	}
	// 2.이진법 처리 
	static int[] toBinary(int input) { //매개변수는 input. input 값을 받아서 처리해야 하니까.  
		int[] binary=new int[16];  
		int index=15; 
		while(true) {
			binary[index]=input%2;
			input=input/2; 
			if(input==0) 
					break;
			index--;
		}
		return binary; //값을 넘겨줌 
	}
	// 3.출력
	static void print(int[] binary) {
		for(int i=0;i<16;i++) {
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
	}
	static void process() {
		int input=userInput();
		int[] binary=toBinary(input);
		print(binary);
	}
	
	// 조립 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		

	}

}
