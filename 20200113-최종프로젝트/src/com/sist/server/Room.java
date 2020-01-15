// 방 정보를 묶어서 저장하는 클래스 
package com.sist.server;
import java.util.*;

public class Room {
	String roomName,roomState,roomPwd;
	int current,maxcount; // 현재인원수, 최대인원수 
	String bang="";
	
	Vector<Server.Client> userVc=new Vector<Server.Client>(); // 방 안에 들어간 사람들만 제어하기 위해 Vector를 만들었음 
	// Vector<Client> userVc=new Vector<Client>(); 라고 쓸수 없음. 
	// Client 클래스는 Room 클래스와 다른 클래스 안에 있으므로, Server.Client라고 위치 알려줘야함. 
	// Server 클래스에서 코딩할 때는 Client 클래스가 Server 클래스 안에 있으므로 Vector<Client> 이렇게 코딩 가능했던 것.
	// Vector의 index 번호가 0인 애가 방장이 됨. 
	// 0이던 애가 나가면, index 번호가 자동 조정되어 1번이던 애가 0번이 된다 ==> 얘가 새로운 방장이 됨 
	
	
	// [생성자] 
	//  - 우클릭 > Generate Constructor using Fields >> current,userVc 빼고 만든다. 
	//  - current, userVc는 서버에서 처리해야 하니까 여기서 생성자 안 만들었음 
	public Room(String roomName, String roomState, String roomPwd, int maxcount) { //얘가 호출되면 방이 만들어진다. //얘를 호출하는 애가 방장이 됨
		
		this.roomName = roomName;
		this.roomState = roomState;
		this.roomPwd = roomPwd;
		this.maxcount = maxcount;
		current=1; // 방이 만들어졌으니까 현재 인원수 1  
	}
	
	
}
