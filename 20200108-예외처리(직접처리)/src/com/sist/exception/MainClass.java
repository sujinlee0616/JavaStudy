package com.sist.exception;
/* 
 * <예외처리>
 * 1. 예외란?
 *  - 소스 상에서 수정이 가능한 에러 (가벼운 에러: 프로그래머가 처리가 가능) 
 * 	  ex) 0으로 나눈다, 파일명이 틀렸다, IP가 틀리다, URL 주소가 틀리다, 배열의 범위가 초과됐다.. 등등
 *  - 오류(프로그래머가 고칠 수 없음)와 예외는 다름. 
 * 2. 예외처리의 목적
 *  1) 에러 발생 시 예방을 하는 프로그램 
 *  2) 에러 발생 시 => 정상 상태 유지 방법  
 * 3. 예외처리
 * 					자바
 * 	======================================
 * 	┃									 ┃
 * 	컴파일 시 (javac)						 실행 시 (java)
 *  =============					 	=============
 *  JVM이 검색								 실행시마다 에러 
 * 	=> 반드시 예외처리해야 						 => 필요하면 예외처리
 *  입출력
 *   - 메모리 입출력
 *     ex) System.out.print():출력
 *     ex) System.in.read(): 메모리에 값 저장  
 *         ┗ 예외처리 안 배웠어서 이때까지 이거 안 쓰고 
 *           Scanner 사용했었다. 
 *   - 파일 입출력
 *   - 네트워크 입출력 
*/
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[6];
		// 오류가 나면 catch 쪽으로 빠진다. 
		try{
			for(int i=0;i<=6;i++) { 
				//배열크기 초과
				//이클립스에선 에러 안 나는 이유? : 실행 시 알게 되기 때문에 실행 전에는 모름 
				arr[i]=(int)(Math.random()*45)+1;
			}
		}catch(Exception e) {}
		
		for(int i=0;i<6;i++) {
			System.out.println(arr[i]+"");
			try {
				Thread.sleep(500);
				// sleep : 잠깐ㄴ잠깐 멈춰라. 
				// ex) for문 : 한 바퀴 돌고 설정한 만큼의 초 있다가 다시 해라. 
				// 단위가 밀리세컨드 ==> 1000 = 1s. 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			// 단위 : 
		}
		
		
	}

}


