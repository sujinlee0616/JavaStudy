package com.sist.io;
import java.io.*;
import java.net.*;
/*
 * 	MVC, Spring, Kotlin
 * 	===================
 * 	서버 : 
 * 		대기서버 => 1개 ===> 연결기기(Socket) => 전화기
 * 				ServerSocket => 접속 시 처리 
 * 		통신서버 => 접속자 수만큼 생성 (Thread)
 * 				Socket => 실제 통신 
 * 
 * 	서버 => 여러개의 통신하는 프로그램이 필요 
 * 		   ========= 동일해야. 
 * 
 * 바인드 : 개통과정 
 * 
*/
public class Server implements Runnable{
	private ServerSocket ss;
	public Server()
	{
		try 
		{
			ss=new ServerSocket(3355);
			// bind => 개통 (통신이 가능) 
			// bind => 1.IP, 2. Port
			// 서버는 Port ==> 고정 포트, 클라이언트 => 임시 포트
			// listen => 대기상태 
			// 요 생성자 한 방에 끝남! 매우 편함!
			System.out.println("Server start.....");
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		new Thread(server).start(); // 서버가 가지고 있는 run함수를 호출해라
		
	}
	// 쓰레드 작동 : 쓰레드는 출력만 담당!!!
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) 
		{
			try
			{
				Socket s=ss.accept();// 접속한 클라이언트의 정보를 받는다. (Socket)
				System.out.println("접속한 클라이언트의 IP+"+s.getInetAddress().getHostAddress());
				System.out.println("임시포트"+s.getPort());
				System.out.println("=================================");
			}catch(Exception ex) {} 
			
		}
	}

}


