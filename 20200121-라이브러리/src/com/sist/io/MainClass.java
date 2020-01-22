package com.sist.io;
/*
 *  <java.io> 
 *  - (웹 => 파일) : 다운로드/업로드 
 *  - 입출력 
 *  1. 메모리
 *   - Input : BufferedReader(new InputStreamReader(System.in))
 *  	 		==> 키보드 입력값을 받는 경우
 * 	 - Output : Sstem.out.println()
 *  2. 파일
 *   - Input : BufferedReader 
 *   - Output : FileOutputStream, FileWriter
 *  3. 네트워크
 *   - Input : BufferedReader(new InputStreamReader(s.OutputStream())
 *  												===
 *  												s=Socket
 *  	Output : s.getOutputStream()
 *  ==================================================================
 *  <IO> 
 *  - (Stream => 데이터 이동 통로) = 단방향통신 
 *  1. 
 *   - Input :  1byte => InputStream, 2byte => Reader (한글) 
 *   - Output : 1byte => OutputStream, 2byte => Writer 
 *  	===> .txt, .xml, .json (javascript에서도 주로 사용 데이터파일) 
 *  				========== web에서 주로 사용 (데이터 추출 => 파싱) 
 *  				.json => React, Vue => Ajax, RestController
 *  2. File 클래스
 *   1) 파일 : 일반 파일 제어 가능 ex) new File("c:\\javaDev\\a.jpg")
 *   	- 파일은 폴더까지 포함 
 *      - . : 현재폴더 / .. : 상위폴더 ★ 
 *        ex) 커맨드 창에서 cd .. ==> 상위 폴더로 위치 이동 
 *   2) 디렉토리(폴더) ex) new File("c:\\javaDev")
 *  
*/
// Application 프로그래머 => 탐색기 만들줄 알아야. 
import java.io.*;
/* 
 * io, sql ==> 컴파일 예외처리 => 반드시 예외처리 사용
*/
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File dir=new File("c:\\javaDev");
			File[] files=dir.listFiles();
			for(File f:files) // 폴더 또는 파일 
			{
				if(f.isDirectory()) // 폴더 
				{
					System.out.println("["+f.getName()+"]"); // 이름을 가져올 수 있음. 폴더는 [] 해줘야. 
				}
				else //파일
				{
					 System.out.println(f.getName());
				}
			}
		}catch(Exception ex) {}
	}

}
