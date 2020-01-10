import java.util.*;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>(); 
		//ArrayList<int> 쓰면 안된다!!
		list.add(10);
		//list.add("홍길동"); //Error.
		//list.add('c'); //Error. 무조건 정수만 들어가야...
		
		for(int i=0;i<list.size();i++) 
		{
			int num=list.get(i);
			System.out.println(num);
		}
		
	}

}
