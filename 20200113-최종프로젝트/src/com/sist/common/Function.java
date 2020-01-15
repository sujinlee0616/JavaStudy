package com.sist.common;
/*
 * <네트워크> (CS : Client + Server)
 * 1. Server
 *  - 클라이언트의 요청을 받아서 응답 (명령) ★
 *  - ex) Fuction.LOGIN ==> id|pwd|sex|loc ==> waitVc에 저장
 * 
 * 2. Client
 *  - 서버에 요청을 해서, 서버로부터 응답 받아서 클라이언트 프로그램에 출력 ★  
 *  - ex) Fuction.LOGIN ==> id|pwd|sex|loc ==> table에 출력 
 * 
 * 3. 유의사항
 *  1) 클라이언트마다 통신이 따로 만들어져야 한다 ==> 쓰레드 이용. 쓰레드는 통신만 담당. 
 *  2) 클라이언트 자체에서 처리하지 않고, 모든 지시가, 항상 서버를 통해 들어와야 한다. 
 *   - 서버가 명령을 내리는데, 임의로 명령을 내릴 수 없으므로 명령마다 번호를 정해놓고 그 명령을 지시한다.  
 *  3) 스트림을 이용한 프로그램 
 *     ====
 *     전송 => 바이트스트림 ==> OutputStream
 *     수신 => 문자스트림 ==> BufferedReader
*/
public class Function {
	// 들어가는/나가는 사람과 남아있는 사람 이 두 개로 나눠서 생각해라. 
	// 1) MY가 들어가면 '변환'. 혼자만 바뀌게 만들어 주는 것. 
	// 2) 나머지는 남아 있는 사람을 처리.

	public static final int LOGIN=100; // 목록 출력 명령 
	public static final int MYLOG=110; // 로그인 => 대기실로 변경 
	
	public static final int MAKEROOM=200; // 방정보를 출력
	public static final int ROOMIN=210; // 방에 들어가라 
	public static final int ROOMOUT=220;
	public static final int ROOMADD=230;
	public static final int MYROOMOUT=240;
	public static final int WAITUPDATE=250; // 대기실에서 게임방 리스트 및 유저리스트 업데이트. 
	public static final int POSCHANGE=260; // 이 사람이 방에 들어가면 대기실을 방 이름으로 바꿔치기 해줌. 
	public static final int WAITCHAT=270; // 대기실에서 채팅 
	public static final int ROOMCHAT=280; // 게임방에서 채팅 
	
	public static final int EXIT=900; // 기존에 있는 사람들에게 나간 애를 알려줌 
	public static final int MYEXIT=910; // 내가 나감 
	
	
}
