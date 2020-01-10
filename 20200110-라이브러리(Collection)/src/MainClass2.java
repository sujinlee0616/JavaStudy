import java.util.ArrayList;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread();
		t.stop(); // 취소선 그어진 것 : 쓰지 말라는 뜻. ==> 대체하는 함수를 찾아야. ex) stop → interrupt
		ArrayList list=new ArrayList(); // 노란색: 제네릭스 쓰지 않아서 경고 받은 것 
		// 이름 목록
		list.add("홍길동"); //0
		list.add("심청이"); //1
		//여기에다가 새로운 거 넣자 ==> 이 이하로는 index 번호가 1씩 증가 
		list.add("박문수"); //2
		list.add("춘향이"); //3
		list.add("이순신"); //4
		
		// 저장된 갯수 확인 
		System.out.println("저장된 인원:"+list.size());
		
		// 출력 
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		
		System.out.println("============================");
		// 추가 
		list.add("강감찬"); // add쓰면 맨 마지막에 추가된다. 
		// 출력
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		System.out.println("============================");
		
		list.add(2,"갸갸갸"); //2번째에 추가
		// 출력
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		System.out.println("============================");
		
		// 삭제
		list.remove(3);
		// 출력
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		System.out.println("============================");
		
		// 수정
		list.set(4, "이순신 수정");
		// 출력
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i);
			System.out.println(name);
		}
		System.out.println("============================");
		
		// 문제 발생
		list.add(100); //int값을 집어넣어서 형변환 안돼서 오류남 
		// 출력
		for (int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i);
			System.out.println(name);
		}
		
		// 실무 가서 jdk 낮은 버젼으로 짜인 코드 만나게 될 수도 있음...
	}

}



