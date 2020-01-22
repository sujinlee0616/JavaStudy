package com.sist.io;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

/*
 * 파일 정보 : 파일 우클릭해서 '속성'에서 볼 수 있는 애들...
 * =======
 * 1. 파일명 : getName()
 * 2. 경로~파일명 : getPath()
 * 3. 경로명 : getParent()
 * 4. 수정일 : lastModified() 
 * 	  => 수정일은 long형으로 되어 있다. => new Date()에다가 long형 넣으면 날짜로 바뀐다. 
 * 5. 파일생성 : createFile() 
 * 6. 파일크기 : length 
 * 7. 속성(읽기/쓰기/감춤) : canRead, canWrite, isHidden(), isFile()
 * 	  ================ 
 * 		boolean 형식
*/
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File file=new File("c:\\javaDev\\객체.pptx");
			if(file.exists())
			{
				// 아래의 별표친 것 반드시 암기할 것!
				System.out.println("***파일명: "+file.getName());
				System.out.println("경로명: "+file.getParent());
				System.out.println("***전체경로: "+file.getPath());
				System.out.println("***크기: "+file.length()+" Byte");
				System.out.println("읽기전용: "+file.canRead());
				System.out.println("쓰기전용: "+file.canWrite());
				System.out.println("숨김파일: "+file.isHidden());
				System.out.println("***파일여부: "+file.isFile());
				System.out.println("***수정일: "+file.lastModified()); // 기본적으로 long형으로 되어있음 
				SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일"); 
				String day=sdf.format(new Date(file.lastModified()));
				System.out.println("수정일: "+day);
				System.out.println("***수정일: "+new Date(file.lastModified()));
			}
		}catch(Exception ex) {}

	}

}
