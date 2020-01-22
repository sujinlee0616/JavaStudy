package com.sist.io;
// 폴더 
/*
 * ※ 라이브러리의 리턴형/매개변수 기억할 것 !!★
 * 1. 폴더에 있는 모든 파일 읽기 ==> listFiles => 리턴형 : File[]
 * 2. 폴더 생성 : mkdir() => void 
 * 3. 폴더 삭제 : delete() => void 
*/
import java.io.*;
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File dir=new File("c:\\oracle");
//			if(!dir.exists()) // dir(oracle 폴더)가 존재하지 않으면 
//			{
//				dir.mkdir(); // oracle 폴더를 만들어라 
//			}
//			System.out.println("oracle 폴더 생성 완료");
			if(dir.exists())
			{
				dir.delete(); 
				// 해당 폴더가 비어있어야만 삭제 가능함. 비어 있지 않으면 삭제 불가. 
				// ==> 이 폴더 지우려면 안에 파일들 먼저 다 지우고 폴더 지워야. 
			}
			System.out.println("oracle 폴더 삭제 완료");
		}catch(Exception ex) {}
	}

}
