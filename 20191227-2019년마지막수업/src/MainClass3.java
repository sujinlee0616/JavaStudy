/* 변수 우선순위 : 지역변수 > 전역변수  
 * 1. 지역변수 (지역변수,매개변수) : {}이 종료되면 사라짐
 * 		==> 지역변수는 사라지기 때문에 계속 쓰고 싶으면 retrun 해줘야.. 
 * 2. 전역변수 (instance변수, static 변수) 
*/
class Sawon{
	int sabun;
	String name;
	String dept;
	String loc;
	long pay; 
	static String company; // 같은 회사라면, 회사명 바뀔 때 한 번에 바뀌는게 좋으니까 static으로.
	
	Sawon(){
		int sabun=10;
		sabun=sabun;
		//지역변수와 instance변수/static 변수는 같은 이름을 쓸 수 있다. 
		//instance 변수 sabun도 있음에도 불구하고 지역변수 sabun이 호출되었음. 
		// ===> 메소드 안에서는 지역변수가 우선순위가 높다.
		this.sabun=sabun;
		//인스턴스 변수 : 파란색 
		//static 변수 : 파란색 필기체 
		//지역변수 : 갈색 		
	}
	
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s1=new Sawon();
		s1.sabun=1;
		s1.name="홍길동";
		s1.dept="개발팀";
		s1.loc="서울";
		s1.pay=3500;
		s1.company="SIST";
		
		Sawon s2=new Sawon();
		s2.sabun=2;
		s2.company="SIST2";
		
		Sawon.company="SIST3"; // 다른 클래스에서 사용 
		//클래스이름.static변수 로 호출했음
		//static 변수는 요렇게 호출 가능 
		
		System.out.println("s1:"+s1.sabun);
		System.out.println("s2"+s2.sabun);
		System.out.println(s1.company);
		System.out.println(s2.company);
		System.out.println(Sawon.company);
		//company는 static이니까 한번 바꾸면 전체가 바뀜
		
		
		
	}

}








