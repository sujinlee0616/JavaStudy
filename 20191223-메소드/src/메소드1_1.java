
public class 메소드1_1 {
	static String name; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		메소드1_1 a=new 메소드1_1();
			a.name="홍길동1";
		메소드1_1 b=new 메소드1_1();
			b.name="홍길동2";
		메소드1_1 c=new 메소드1_1();
			c.name="홍길동3";
		메소드1_1 d=new 메소드1_1();
			d.name="홍길동4";
		메소드1_1 e=new 메소드1_1();
			e.name="홍길동5";
		System.out.println(a.name);	//<==결과값 : 홍길동5. 왜냐면 line2에서 'static' String name이라고 했기 때문!! 저장공간이 똑같아서 그럼. 
		//line2에서 'static' 지우면 결과값은 홍길동1이 된다. 

	}

}
