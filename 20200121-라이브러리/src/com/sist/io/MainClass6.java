// [파일복사] 빈 C:\oracle 폴더에 C:\image에 있는 이미지 중 하나를 옮겨보자. 
/*
 * 읽기 : int read(), read(byte[], off, len)
 * 		===			=====
 * 		문자번호 		읽은 바이트수 ex) MainClass6의 int i
 * 		ex) MainClass5의 int i
 * 쓰기 : write(byte[]), write(String)
 * 닫기 : close()
*/
package com.sist.io;
import java.io.*;
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis = new FileInputStream("C:\\image\\movie5.jpg");
			FileOutputStream fos = new FileOutputStream("C:\\oracle\\\\movie5.jpg");
			
			int i=0; // int i는 "읽은 바이트 수"를 의미함.★ : 여러글자를 한 번에 읽을 때 ★
			byte[] buffer = new byte[1024]; 
			// Q. 왜 1024 byte 사용하나요? 
			// A. 꼭 1024 byte 안 써도 된다. 
			//    하지만 주로 512(UDP), 1024(TCP) byte 많이 사용 ==> 주로 2의 배수를 많이 사용한다. 
			while((i=fis.read(buffer, 0, 1024))!=-1) // 
			{
				fos.write(buffer, 0, i); 
				// out.write()
			}
			fis.close();
			fos.close();
			System.out.println("파일 복사 완료");
			
		}catch (Exception ex) {}
	}

}
