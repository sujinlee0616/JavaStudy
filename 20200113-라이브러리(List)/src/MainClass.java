import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List<String> list = new ArrayList<String>();
		// interface        // 구현된 클래스 
		// String[] list 와 비슷 ==> String만 저장해야함. <String> 이걸 제네릭스라고 함.
		// ArrayList ==> index가 바뀐다! (가변형!) 
		// 배열 대신 가변형이면서 배열 기능을 하는 ArrayList를 사용함!! ★
		// 제네릭스는 ArrayList의 데이터형을 통일할 수 있게 해줌!! ★
		
		//List<String> list = new ArrayList<String>();
		//List<String> list = new Vector<String>();
		List<String> list = new LinkedList<String>();
		// ArrayList든 Vector든 LinkedList든 사실은 거의 똑같다! 
		
		// 저장 명령형식 : add()
		list.add("홍길동"); //0
		list.add("심청이"); //1 ==> 2 (춘향이 땜에 한 칸 밀렸음) ===> "이순신"으로 바뀜 
		list.add("박문수"); //2 ==> 3 (춘향이 땜에 한 칸 밀렸음)
		
		int i=0;
		
		// 중간에 저장 
		list.add(1,"춘향이"); // 
		i=0;
		for(String name:list) { // ★for-each 방식 : 배열, 컬렉션에 사용 가능★ 
			System.out.println(name+":"+i);
			i++;
		}
		
		// 수정
		list.set(2, "이순신");
		System.out.println("=========");
		i=0;
		for(String name:list) { 
			System.out.println(name+":"+i);
			i++;
		}
		
		// 삭제 
		list.remove(1);
		System.out.println("=========");
		i=0;
		for(String name:list) { 
			System.out.println(name+":"+i);
			i++;
		}
		
		// 데이터가 저장된 갯수 : .size()
		System.out.println("저장된 갯수:"+list.size());
		
		
		
	}

}


