/*
 * 배열 => 여러개의 데이터를 한 개의 이름으로 제어 => 인덱스(첨자)를 이용한다. 
 * 		 ** 인덱스는 0부터 시작
 * 	1. 형식
 * 		1) 선언
 * 			데이터형[] 배열명
 * 			=====
 * 			 = 기본타입 (int, long, float, ..)
 * 				ex) int[] arr
 * 					long[] arr
 * 					char[] arr 
 * 			 = 사용자정의타입 (클래스) ★★
 * 				ex) class Movie
 * 					Movie[] arr
 * 					String[] names <-- String은 기본타입 아님!
 * 					======
 * 					사용자 정의 
 * 		2) 초기값 
 * 			= arr={1,2,3,4,5,6};
 * 			= arr=new int[6]; => 자체 초기값 으로 초기화 (int:0, long:0L, String:null) <=== 모든 class이 디폴트 값은 null 이다.
 * 																					└ null : 메모리에 저장된 주소값이 존재하지 않는다.
 * 		3) 데이터 읽기
 * 			= arr[index] ==> 마지막 index번호는 실제 배열 공간 갯수보다 하나 적다. 
 * 		4) 데이터 저장
 * 			= arr[1]=10;
*/
/* 숫자 야구 게임
 * ========= SB
 * 	=> 난수 => 729
 *  => 사용자 입력 =>  567 => 0S~1B (S : 위치/문자 똑같음. B : 위치는 다르지만 문자는 똑같음.)  
 *  => 			  785 => 1S-0B
 *  			  793 =? 1S-1B
*/
import java.util.Scanner;
/*
 * 	1. 중복없는 난수 발생 ==> com[]
 * 	===============
 * 	2. 사용자 입력 ==> user[]
 * 		비교 ==> com[] user[]
 * 	3. 힌트 ==> s b 
 * 	4. 종료여부 확인 s
 * 	5. 3S => 종료한다. 
 *  =============== 반복 (횟수지정X ==> while문) 
*/
//프로젝트
/*
 * 		변수	연산자	제어문	출력
 * 			============
 * 			메소드
 * 		======================= 클래스 
*/
public class 배열1_중복없는난수응용_숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 컴퓨터 난수 발생 
		int[] com=new int[3];
		int su=0; //난수발생 시 저장
		boolean bCheck=false; //중복여부를 확인 
		
		for(int i=0;i<com.length;i++) {
			bCheck=true;
			//========
			while(bCheck) {
				//난수발생
				su=(int)(Math.random()*9)+1;
				bCheck=false;
				//중복여부 확인
				for(int j=0;j<i;j++) {
					if(com[j]==su) {
						bCheck=true;
						break;
					}
				}
			}
			//========
			com[i]=su;
		}

		//2. 유저 값 입력받음 
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		
		//3. 게임 실행 
		while(true) {
			System.out.println("3자리 정수 입력:");
			//값을 받는다
			int input=scan.nextInt();
			//오류처리
			if(input<99 || input>1000) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				continue;
			}
			
			//배열의 값을 변경 // ex) 567/100
			user[0]=input/100; //5
			user[1]=(input%100)/10; //6
			user[2]=input%10; //7
			
			//오류처리 => 중복된 수를 사용할 수 없다, 0을 사용할 수 없다. 무조건 세자리 수를 입력해야 한다.  
			//유효성 검사 => 맨 앞에 0이 있으면 제거시켜야. 왜냐면 맨 앞에 0이 있으면 8진법이라고 인식하기 때문.
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2]) {
				System.out.println("중복된 수는 사용할 수 없습니다.");
				continue; //처음부터 다시 시작 
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0) {
				System.out.println("0은 사용할 수 없습니다.");
				continue;
			}
			
			//비교 시작
			int s=0,b=0;
			for(int i=0;i<3;i++) { //i ==> com 
				for(int j=0;j<3;j++) { //j ==> user 
					if(com[i]==user[j]) {
						if(i==j) {
							s++;
						}
						else {
							b++;
						}
					}
				}
				
			}
			//힌트
			System.out.printf("Input Number:%d, Result:%dS-%dB\n",input,s,b);
			System.out.println("===============================");
			System.out.print("S:");
			for(int i=0;i<s;i++) {
				System.out.print("●");
			}
			System.out.print("\nB:");
			for(int i=0;i<b;i++) {
				System.out.print("○");
			}
			System.out.println("\n===============================");
			//종료여부 확인
			if(s==3) {
				System.out.println("Game Over! :)");
			}
			
		}
		
	}

}







