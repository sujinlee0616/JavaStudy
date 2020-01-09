/*
 * <StringTokenizer>
 *  - 문자열을 나눠줄 때 사용하는 클래스 
 * 1. 객체단위로 전송 
 * 2. 문자열(0) 
 * 	   id|pwd|avatar 
 *  	- id,pwd,avatar 하나하나를 token이라고 함.
 *  	- split 쓰면 정규식별로 잘라야해서 불편
 *  	- StringTokenizer가 더 편함  
 * 	1) hasMoreTokens() : 
 * 	2) nextToken() : 단어를 하나씩 가져올 때 
*/
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="admin|홍길동|1234|남자|서울|1111-1111";
		StringTokenizer st=new StringTokenizer(data,"|"); //뒤 : 자를 문자열 
		
		/*String id=st.nextToken();
		String name=st.nextToken();
		String pwd=st.nextToken();
		String sex=st.nextToken();
		String addr=st.nextToken();
		String tel=st.nextToken();
		
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Password:"+pwd);
		System.out.println("Address:"+addr);
		System.out.println("Tel:"+tel);*/
		
		while(st.hasMoreTokens()) { //hasMoreTokens : 잘려있는 애들 가져옴. 
			System.out.println(st.nextToken());
		}
	}

}
