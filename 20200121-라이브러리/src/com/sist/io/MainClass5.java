// [파일 읽고 쓰기] 특정 파일을 읽어서 다른 파일에 쓰기 
package com.sist.io;
/*
 * File 속성 ==> File 입출력 
 * ======================
 * 1.FileInputStream (읽기), FileOutputStream (쓰기)
 *  - 1byte : byte 단위로 읽고 쓰기 기능함. 
 * 2. FileReader (읽기), FileWriter (쓰기)
 *  - 2byte : 문자열(String) 단위로 읽고 쓰기 가능. 
 * 3. 기타 
 *  - 한글은 모든 글자가 2byte ==> 1byte씩 읽으면 깨진다!! ★  ==> FileReader, FileWriter 사용  
 *  - zip파일, 그림 파일 등은 1byte ==> InputStream으로 읽는다.  
 * 
*/
import java.io.*;
public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File file = new File("C:\\javaDev\\javaStudy\\20200120-자바최종정리\\src\\com\\sist\\java\\MainClass.java");
			// FileInputStream fis=new FileInputStream(file); // FileInputStream 쓰면 위 파일의 한글 다 깨짐
			FileReader fis=new FileReader(file);
			// 생성자 => 여러개의 생성자를 가지고 있을 수 있다. (오버로딩)
			int i=0; // 값을 읽기 ==> int read() => ASC를 읽어 온다. 
			// int i는 "문자번호(아스키코드값)"를 의미함  ★ : 한 글자씩 읽을 때 ★ 
			// ex) a가 들어오면 60으로 받아옴..
			String data="";
			while((i=fis.read())!=-1)  
			{	// -1은 EOF(End Of File)을 의미함. 
				// 즉, i=fis.rea()!=-1이란 '파일이 끝날때까지 읽지 않았다면'을 의미 
				// System.out.println((char)i);
				data+=String.valueOf((char)i);
			}
			System.out.println(data);
			fis.close();
			// r: 읽기 / w: 쓰기 / a: 추가
			File file2=new File("c:\\image\\data.txt");
			if(!file2.exists())
			{
				file2.createNewFile();
			}
			// textarea ==> setText(): 이전 텍스트 지움, append() : 이전 텍스트 냅두고 거기에 추가.
			FileWriter fos=new FileWriter(file2, true); //true를 붙이면 ==> append 모드  ==> 추가 
			// read해온 MainClass.java 파일을 data.txt에 write한다.  
			fos.write(data);
			fos.close();
			System.out.println("파일 쓰기 완료"); 
			
		} catch(Exception ex) {}
	}

}

/*
 * 클래스
 * ====
 * 	1. 구성요소
 * 	 1) 멤버변수 : (개별사용변수(인스턴스), 공통변수(정적변수)) 
 * 				  private int a; ==> 저장공간을 생성 후에 저장 
 * 									 ===========
 * 										new 
 * 				  private static int b; ==> 클래스 로더가 됐을 때 처리됨 
 * 
 * 				   기본형, 클래스, 배열 ===> 데이터형    ===> 클래스도 배열도 변수로 쓸 수 있다!!!★ 
 * 						==========
 * 						사용자정의 데이터형   
 * 					==> 메소드 안에서 사용하는 변수 : 지역변수  
 * 		=========================================================
 * 			멤버변수 : 자동 초기화
 * 			지역변수 : 반드시 초기화를 해서 사용한다. 
 * 	 2) 메소드 : 
 * 		 - 선언만 된 메소드 (추상메소드) => 미완성된 클래스 
 * 		   =========== 완성을 해서 사용 (추상클래스, 인터페이스)
 * 		   public void display(); 
 * 		 - 선언+구현 메소드 
 * 		   public void display()
 * 		   {
 * 				// 구현부 
 * 		   }
 * 			=> 사용자의 요청값을 받아서 처리 결과를 보내준다. 
 * 			   ===========       =======
 * 				매개변수			    리턴형
 * 				======			  =====
 * 				 여러개 사용 가능	  1개만 사용 가능 
 * 									= 경우의 수가 많은 경우 : int, String 많이 사용 
 * 									= 데이터가 많은 경우 : 배열, 클래스, 컬렉션   
 * 				=> 매개변수 : 3개 이상이면 => 클래스로 묶어서 전송
 * 				=> 메소드는 동기화 : 하나의 메소드가 끝나야 다음 메소드가 호출됨 ★
 * 					※ 스레드는 비동기화 : 동시에 여러개 호출 가능  
 * 				=> 메소드가 주로 하는 역할 : 통신 (클래스와 클래스끼리의 통신 ==> 메시지) 
 * 					===============
 * 					
 * 	 3) 생성자  : 멤버변수의 초기화 : 멤버변수에 값을 대입 
 * 							  ================
 * 								1) File을 읽어서 값을 대입
 * 								2) 제어문을 사용 
 * 								*** Class의 블록은 구현을 할 수 없다. (선언만 가능)
 * 								class A
 * 								{
 * 									int a;
 * 									a=10;  // <== (X) 구현!! 안됨!!!
 * 									int b=10; // <== (O) 가능!! 괜춘!! 선언과 동시에 값을 대입하는 것은 가능하다!
 * 								}
 * 		
 * 	
*/

