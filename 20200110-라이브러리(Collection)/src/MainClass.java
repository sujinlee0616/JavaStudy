import java.util.ArrayList;

/*
 * <컬렉션>
 *  - 데이터를 메모리에 저장할 때, 쉽게 저장하고 쉽게 사용할 수 있게 해주는 애. 
 *  - 표준화가 되는 상태. 
 *    ==== 인터페이스
 *  - 여러개의 데이터를 쉽게 제어 가능
 *  - 가변 배열 ==> 데이터 갯수를 클래스에 제어 
 *  - 단점) 서로 다른 데이터타입을 저장 가능 => 제어 힘듦 => 데이터타입 통일을 위하여 제네릭스 사용
			┗ 데이터타입은 기본형 안 됨! 클래스형이어야. 
			┗ ex) ArrayList<int> (X)  ex) ArrayList<Integer> (O) 
 *  	※ 데이터 저장 시, 같은 데이터형을 저장하는 것이 제어하기 편하다. 
 *  - 종류) 
 * 					Collection
 * 					==========
 * 						┃ ====================> Queue, Stack
 * 			===================================
 * 			List			Set				Map		(interface) 	
 * 			┃				┃				┃
 * 		===========		===========  	============	==>  (interface를 구현한 클래스)
 * 		ArrayList★★		HashSet			Hashtable
 * 		Vector			TreeSet			HashMap★★: Hashtable을 보완 
 * 		LinkedList						=> key, value => 순서X. key:중복허용X. value:중복허용O.
 * 		* 순서를 가지고 있다  * 순서가 없다
 * 		* 중복 데이터 허용     * 중복데이터를 허용하지 않는다. 
 * 		================================================================
 * 		자료구조 => 메모리에 저장된 데이터 관리 
 * 							 ========
 * 							 읽기, 쓰기, 검색, 수정, 삭제 
 * 							 ======================
 * 							 메소드 => 1) 쓰기  
 * 										- add(데이터) <= 자주 씀 
 * 										- add(index, 데이터)
 *									 2) 읽기  
 *										- get(index) 
 *									 3) 수정
 *									    - set(index, 바꿀 데이터값) 
 *									 4) 삭제 
 *										- remove(index)
 *									 	- 중복이 허용이 되지 않는 키 : PK (Private Key) 
 *										  ex) PK의 예시 : KTX 등 								 
 * 
*/
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		// 추가
		list.add("홍길동");
		list.add(30);
		list.add("서울");
		list.add("111-1111");
		list.add(180.5);
		list.add("A");
		// 요렇게 저장하면 데이터형이 다르기 때문에 for문 돌릴 수 없다 => 통일성 있게 좀 저장 좀 해라  ㅋ => 제네릭스 
		
		// 데이터 읽기
		//String name=list.get(0); //<==이렇게 하면 get(0)이 Object라서 좌변의 String보다 큰 자료형이므로 에러남ㅋ
		String name=(String)list.get(0);
		int age=(int)list.get(1);
		String addr=(String)list.get(2);
		String tel=(String)list.get(3);
		double ki=(double)list.get(4);
		String aa=(String)list.get(5);
		// 이렇게 하면 너무 귀찮아짐 ㅠㅠ 이에 대한 해결책으로 제네릭스가 나온 것임. 
		
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		System.out.println("주소:"+addr);
		System.out.println("전화:"+tel);
		System.out.println("키:"+ki);
		System.out.println("혈액형:"+aa);
	
	}

}









