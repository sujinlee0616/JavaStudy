package com.sist.io;
import java.io.File;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			File dir=new File("c:\\oracle");
			if(dir.exists())
			{
				File[] files=dir.listFiles();
				//System.out.println(files.length);
				if(files.length>0) // 파일이 존재하는 경우 ==> 폴더 지우려면 해당 폴더의 파일들 먼저 다 삭제해야함 
				{
					for(File f:files)
					{
						f.delete();
					}
					dir.delete();
				}
				else // 파일이 없는 경우 ==> 폴더만 지우면 됨 
				{
					dir.delete();
				}
			}
			System.out.println("oracle 폴더 삭제 완료");
		}catch(Exception ex) {
			System.out.println(ex.getMessage()); // 오류나면 오류메시지 출력해라 
		}

	}

}
