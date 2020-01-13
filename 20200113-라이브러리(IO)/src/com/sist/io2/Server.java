package com.sist.io2;
import java.util.*;
import java.io.*;
import java.net.*;
/*
 *  클래스의 종류
 *  	= 일반 클래스
 *  	= 추상 클래스(인터페이스)
 *  	= 내부 클래스
 *  	  1) 클래스끼리 데이터를 공유 => static ==> 멤버클래스 
 *  		 class A
 *  		 {
 *  			class B
 *  			{
 *  			}
 *  		 }
 *  	     Server가 가지고 있는 모든 변수를 공유 
 *  	  2) 상속 없이 오버라이딩을 사용 => 익명의 클래스  
 *  
*/
public class Server implements Runnable {
	private ServerSocket ss;
	private final int PORT=8888;
	private Vector<Client> waitVc=new Vector<Client>(); // 접속한 유저의 정보 (ip, port)
	// WiatVc에 있는 사람을 받고.... 그 사람을 찾아줘야...
	// 이 안에 스레드를 통째로 저장했음
	// 저장은 서버가 하고 사용은 클라이언트가..!
	// 서버는 두 번 돌면 오류남...!
	// 하나의 서버에는 서버가 하나씩만 작동하게 만들어야..!
	
	// 서버 가동 => Server => 메모리 할당을 한 번만 사용 
	public Server() {
		try 
		{
			ss=new ServerSocket(PORT); // 디폴트 ==> 50명 정도 사용 가능 
			// 개통 ==> bind, 대기상태 ==> listen 
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 접속 시에 처리 
		while(true) 
		{
			try
			{
				// 접속시에 클라이언트의 정보를 받아서 저장하고 => 쓰레드로 전송 
				// 접속 시에 정보 ==> Socket (ip, port) : 유저의 ip와 port 번호...
				Socket s=ss.accept(); // 접속이 되면 호출되는 함수 // 접속이 될 떄만 호출되는 함수 
				// Socket ==> 클라이언트 (유저)
				System.out.println("클라이언트 접속 완료!! =>"+s.getInetAddress().getHostAddress());
				Client client = new Client(s);
				client.start();
				waitVc.add(client);
				// 정보를 저장 
			}catch(Exception ex) {}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		new Thread(server).start();

	}
	// inner 클래스 => Thread, 윈도우 => 빅데이터
	class Client extends Thread
	{
		// Server가 가지고 있는 모든 데이터를 사용할 수 있다.
		Socket s; //클라이언트와 연결 전화기(연결기계=>소프트웨어)
		OutputStream out; // 클라이언트로 결과값 전송 
		BufferedReader in; // 클라이언트로부터 요청값을 받는다. 
		public Client(Socket s)  
		{
			try 
			{
				this.s=s;
				out=s.getOutputStream(); // 클라이언트로 값을 전송할 목적으로
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				// inputStream : 1바이트 ,, Reader : 2바이트
				// s.getInputStream : 클라이언트가 저장된 위치로부터 
				// 앞으로 모든 데이터를 받을 때 1바이트로 받아서 2바이트로 변환해줘야.
				// 왜냐하면 한글은 2바이트인데 C로 짠 온갖 프로그램들이 다 1바이트가 단위이기 때문에 조치 안 해주면 글자 깨져서 나온다.
			}catch(Exception ex) {}
			
		}
		// 통신 
		// 보통 통신 윗 부분 셋팅은 다 똑같음... 통신(run)부분만 변형하면 됨.

		public void run() 
		{
			while(true) 
			{
				try 
				{	
					// 클라이언트가 전송한 메시지 읽기 
					String msg=in.readLine();
					System.out.println("Client=>"+msg);
					// 접속한 전체 클라이언트에 값을 전송
					// 이렇게 코딩하는걸 JSP 라고 함... Java Server Page(페이지 : 파일 비슷한 것)  
					for(Client c:waitVc) // 공유된 데이터  
					{
						c.out.write((msg+"\n").getBytes());
					}
				}catch(Exception ex) {}
			}
			
		}
	}

}
