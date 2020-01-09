/*
 * 자바에서 제공하는 라이브러리
 * => 자바 
 * 	  1) 사용자 정의 
 *    2) 라이브러리
 *    ============= 1) + 2) ==> 조립
 *    자바 제공
 *    =======
 *    1. java.lang : import를 하지 않고 사용
 *     1) String : 문자열과 관련된 클래스
 *     		(1) equals : 문자열 비교 
 *     		(2) trim() : 좌우의 공백 제거	
 *     		(3) indexOf(), lastIndexOf();:
 *     		(4) length()
 *     		(5) startsWith,endsWith
 *     		(6) subString()
 *     		(7) split()
 *      	(8) vlaueOf()
 *     2) System : 종료, 입력출력, GC(Garbage Collector) 부를 때
 *     		(1) gc : 가비지콜렉터 호출 
 *     		(2) exit  
 *     3) Object : 모든 클래스의 상위 클래스
 *     		(1) clone() : 복제
 *     		(2) finalize9); :소멸자 
 *     4) Math : 수학 
 *     		(1) random()
 *     		(2) ceil()
 *     5) StringBuffer: Buffer 써야 속도 더 빠르다. 문자열 결합 시 사용. (https://wikidocs.net/276 참고)    
 *     		(1) toSpring()
 *     		(2) append() : 문자열 결합 
 *     6) Thread   
 *    2. java.util : 유용하게 사용할 수 있는 클래스의 집합
 *     - Scanner : 콘솔에만 찍히기 때문에, 앞으로는 사용자에게 입력받을 때 Scanner말고 다른걸 쓸 거다.  
 *     - StringTokenizer : 
 *     - Collection(배열) : 배열과 달리 가변형이라서 내가 원하는 갯수만 가져갈 수 있다! 
 *     - ArrayList★, Vector, LinkedList, Map★, ... : 자료구조 
 *     	  자료구조 : 메모리 저장 관리  
 *         ┗ ArrayList : 클래스를 저장 
 *    3. java.io
 *     - Reader, Writer (2byte) - 한글이 나오면 반드시 이거 써야. InputStream쓰면 한글 다 깨짐. 
 *     - InputStream, OutputStream (1byte)
 *     - File
 *     - OjbectInputStream, ObjectOutputStream
 *    4. java.net
 *     - Socket
 *     - URL
 *     
*/		
class My
{
	public My(){
		System.out.println("My 생성자 함수 호출 (객체 생성)");
	}
	
	public void display(){
		System.out.println("My:display() (객체 생성)");
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
		My m=new My();
		
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My m=new My(); //생성
		// 활용
		m.display();
		//소멸
		m=null;
		m=null;
		System.gc(); // 메로리 소멸 

	}

}
