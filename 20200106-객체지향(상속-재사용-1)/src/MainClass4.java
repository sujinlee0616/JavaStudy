// 추상 클래스의 일종 => 모든 메소드가 구현이 없다 
// 상속에 두가지가 있음.  
// 1. 메소드만 갖다 씀 (extends) 2. implements 
interface Ani{
	void working();
	void eating();
}
class Human implements Ani{ // 인터페이스일 경우 1. 'implements' 사용 

	@Override
	public void working() {
		// TODO Auto-generated method stub
		System.out.println("두발로 걷는다");
	}

	@Override
	public void eating() {
		// TODO Auto-generated method stub
		System.out.println("수저로 먹는다");
	}
	
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
