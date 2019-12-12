
public class 반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello For문:1");
		System.out.println("Hello For문:2");
		System.out.println("Hello For문:3");
		System.out.println("Hello For문:4");
		System.out.println("Hello For문:5");

		String[] name= {"aaa","bbb","ccc","ddd","eee"};
		String[] addr= {"111","222","333","444","555"};
		
		for(int i=1;i<=4;i++) {
			System.out.println("Hello For문:"+name[i]+"-"+addr[i]);
		}
	}

}
