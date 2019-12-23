import java.util.Scanner;

// 정수 하나를 입력받아서 출력
// 메소드 2개 (입력, 출력) + 조립  
// 어떻게 받고 어떻게 넘길지를 잘 생각해야.... 메소드가 Java의 70%임!!★
public class 메소드11 {
	//1. 입력
	static int input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int no=scan.nextInt();
		return no;
	}
	
	//2. 출력
	static void print(int no) {
		System.out.println("입력한 수는 "+no+"입니다");
	}
	
	//3. 조립 
	static void process() {
		int no=input();
		print(no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
