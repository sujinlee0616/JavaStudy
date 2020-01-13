import java.util.*;
/*
 * Map => 키, 값
 * 키 => 중복이 없다
 * 값 => 중복이 가능 
 * =================> 저장 =====> put(키, 값)
 * 					    저장된 값 ==> get(key)
 * Map (interface)
 * ===============
 * 구현한 클래스 
 * 	: 1. Hashtable
 * 	  2. Hashmap ==> Hashtable을 보완한 클래스. 많이 사용함. 
*/
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("id","admin");
		map.put("pwd", "1234");
		
		System.out.println("ID:"+map.get("id"));
		System.out.println("Password:"+map.get("pwd"));
		
	}

}
