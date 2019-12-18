import java.util.Scanner;
public class 배열12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ex) 사용자가 0X 입력해서 몇 개를 맞췄는지 점수내기
		
		//컴퓨터 답 생성 
		char[] dap=new char[10];
		for(int i=0;i<dap.length;i++) {
			int k=(int)(Math.random()*2); //0,1
			if(k==0) {
				dap[i]='O';
			}
			else {
				dap[i]='X';
			}
		}
		
		//사용자에게 입력받음
		char[] user=new char[10];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<user.length;i++) {
			System.out.print((i+1)+"번째 답 입력(O,X):");
			String s=scan.next();
			user[i]=s.charAt(0);
		}
		
		//점수산출
		int score=0;
		for(int i=0;i<user.length;i++) {
			if(user[i]==dap[i]) {
				score+=1;
			}
		}
		
		//출력
		System.out.println("정답:");
		for(char c:dap) {
			System.out.print(c+" ");
		}
		System.out.println("\n사용자 입력값");
		for(char c:user) {
			System.out.print(c+" ");
		}
		System.out.println("\n점수: "+score*10+"점");
		

	}

}
