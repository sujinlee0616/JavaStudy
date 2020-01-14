package com.sist.server;
import java.io.*;
import java.net.*;
import java.util.*;
import com.sist.common.*;

public class Server implements Runnable{
	// 연결 => 접속처리 => ServerSocket  
	// 각 클라이언트마다 통신담당 (Thread) => Socket <=> Socket 
	// 1. 서버 가동 
	private ServerSocket ss;
	private final int PORT=8888;
	// 접속자 저장 공간 
	private Vector<Client> waitVc=new Vector<Server.Client>();
	public Server() 
	{
		try 
		{
			ss=new ServerSocket(PORT); //bind, listen 
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
	// 접속 시 처리 
	public void run() 
	{
		try 
		{
			while(true) 
			{
				//접속을 했다면 => 클라이언트의 정보를 수집해야 => IP, PORT (Socket)
				Socket s=ss.accept(); // 이 소켓과 클라이언트가 넘겨준 소켓이 합쳐지면 통신이 가능하다.
				// (클라이언트의 정보(ip,port))를 Thread로 전송 ==> 각자마다 통신을 할 수 있다. 
			}
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 통신을 담당하는 부분 (각 클라이언트마다 따로 작업을 한다) 
	class Client extends Thread 
	{
		String id,name,sex,pos;
		// pos : 방 위치 (어느 방에 들어가있는지 확인. 디폴트는 대기실) 
		// 통신을 하기 위해 socket필요
		Socket s; // 통신장비. 소프트웨어로 만든 통신 기계. 주고받고 할 때 쓰는 것. 
		// 보내기
		OutputStream out; // 1바이트 짜리. 보낼 때는 바이트 단위로 보냄. 받을 때는 한글로 다시 써야함..,
		// 받기 
		BufferedReader in;
		
		public Client (Socket s) {
			try
			{
				this.s=s;
				out=s.getOutputStream(); //클라이언트의 저장 위치 =>
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				// InputStreamReader(필터스트림) => 1byte를 받아서 2byte로 변환  
			}catch(Exception ex) {}
		}
		// 반복을 제거하기 위해서 메소드 사용
		// 서버에서 전송 - 아래의 둘 중 하나에서 선택해야.  
		//1) 개인적으로 전송 
		public synchronized void messageTo(String msg)
		{	//synchronized : 보내면서 동기시키는 것 도와주는 것. ==> 동기화 프로그램.
				
			try {
				out.write((msg+"\n").getBytes());
				// readLine() => 끝나는 시점 =(\n)
				// 전송단위 : 패킷 ==> 반드시 \ 찍어야 함 (끝나는 시점이 \n임) 
			}catch(Exception ex) {}
		}
		//2) 전체적으로 전송 
		public synchronized void messageAll(String msg)
		{
			try 
			{
				for(Client user:waitVc) 
				{
					user.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
	}
}





