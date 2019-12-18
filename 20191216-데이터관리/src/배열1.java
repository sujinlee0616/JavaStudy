/*
 * 배열 (Array)
 * 1. 같은 데이터를 여러개 모아서 한개의 변수명으로 제어
 * 2. 배열 선언시에 자동으로 연속적인 메모리를 생성
 * 					===========
 * 					=> 시작과 끝이 일관적으로 정해져 있다.
 * 					=> 0~배열 갯수 (반복문 조절) 
 * 3. 단점 : 고정적 
 * 4. 사용처 : 관련된 데이터가 3개 이상이면 => 배열 
 * 5. 사용
 * 	1) 선언
 * 		1) 데이터형[] 배열명 ; // Java의 권장방식 
 * 		2) 데이터형 배열명[]; //주로 C언어, C++ 의 방식
 * 		ex) 
 * 			정수
 * 			int[] arr;
 * 			실수
 * 			double[] arr;
 * 			문자
 * 			char[] arr;
 * 			문자열
 * 			String[] arr;
 * 	2) 초기값 설정
 * 		ex) int a; a+=10; ==> Error. 초기값 없으므로 연산처리/제어문 처리 불가. 
 * 
 * 		ex1) int[] arr={10,20,30,40,50}; ==> 자동으로 배열 갯수가 5라고 인식함. 
 * 			arr => =====================================
 * 			값		10	20	30	40	50	
 * 				   =====================================
 * 				   │	│	│	│	│
 * 			주소	  100  104 108 112  116
 * 			index   [0]  [1] [2] [3]
 * 			변수(?) arr[0] arr[1] arr[2] arr[3]
 * 				  =======
 * 					일반 변수와 동일하게 사용 가능
 * 					값을 변경 => arr[0]=100;
 * 							배열명 index
 * 		
 * 
 * 		ex2) char[] arr={'A', 'B', 'C', 'D', 'E'} 	
 * 			arr => =====================================
 * 			값		'A'	'B'	'C'	'D'	'E'	
 * 				   =====================================
 * 				   │	│	│	│	│
 * 			주소	  100  102 104 106  108
 * 			===> 배열의 주소 간격은 배열에 저장된 데이터의 타입에 따라 달라진다. (ex1 - int : 4byte, ex2 - char : 2byte)
 *  		===> 주소를 참조해서 데이터를 관리 ==> 참조변수
 *  			 (배열, 클래스)
 *  	
 *  	ex3) int[] arr=new int[5];
 *  		 =====================
 *  			new			int[5]
 *  			===			======
 *  			메모리 할당 		정수 5개를 저장할 수 있는 공간을 만들어라  
 *  						(연속적인 메모리 구조를 만든다) 
 *  			*** new 초기값 ==> 전체(0)
 *  			double[] arr=new double[3]; 0.0
 *  			String[] arr=new String[3]; null (실제 존재하지 않는 값)
 *  			char[]=new char[3]; '\0'
 *  			boolean[] arr=new boolean[3]; false
 *  			===> ex1) 처럼 모든 배열의 값을 다 초기값 주기보다는, ex3) 처럼 하는 경우가 많다.   
 * 
 * 	3) 활용 
 * 		=> 값을 변경
 * 		       첨자를 이용 ==> arr[1]=100, arr[4]=200, ...
 * 					   =========
 * 					      저장된 메모리의 위치값 
 * 		=> 출력 ==> 배열의 모든 첨자는 0부터 시작 ==> 
 * 				  for(int i=0....)
 * 	4) 이미 지정된 배열의 크기를 초과하거나 줄일 수 없다 ==> 에러발생
 * 	   ArrayIndexOfBoundsException => 배열의 범위가 초과됐을 때 
 * 	5) 배열의 갯수 ==> 배열명.length
 *	==========================
 *
 * 
*/
import java.util.Scanner;
public class 배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ex1. 정수를 3개 입력 받은 후, 입력받은 데이터를 출력해라. 
		int a,b,c;
		// 변수를 처리하기 전에 값을 채운다 
		// 	   === 연산, 출력 
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번째 정수 입력:");
		a=scan.nextInt();
		
		System.out.println("두번째 정수 입력:");
		b=scan.nextInt();
		
		System.out.println("세번째 정수 입력:");
		c=scan.nextInt();
		
		// 제어 ==> a,b,c 중에 가장 큰 수를 출력 
		/* if a=10, b-5, c=20 
		*/
		int max=0;
		if(a>max) 
			max=a; //max=10;
		if(b>max)
			max=b;
		if(c>max)
			max=c; //max=20;
		
		System.out.println("가장 큰값:"+max);
		
	}

}








