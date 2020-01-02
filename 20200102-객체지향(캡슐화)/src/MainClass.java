class Data{
	String title;
	
	//초기화 블록 
	static String poster;
	{
		title="aaa";
	}
	static {
		poster="1.png";
	}
	
	//생성자 
	/*
	 * public Data() { title="홍길동전"; poster="hong.png"; }
	 */
	 
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1 = new Data();
		System.out.println(d1.title);
		System.out.println(d1.poster);

		Data d2 = new Data();
		System.out.println(d2.title);
		System.out.println(d2.poster);
		// 생성자의 단점...
		// 계속 새로 new해줘야해....
		// 귀찮은데... d1, d2  한 번에 초기화 시킬 순 없을까? ==> 초기화블록 쓰면 됨 
		
		// 초기화블록도 쓰고 생성자도 쓰고 동시에 쓰면? 
		// 생성자가 최종적으로 적용됨. 
	}

}
