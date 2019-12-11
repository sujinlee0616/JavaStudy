
public class 반복문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=false;
		while(true) {
			bCheck=!bCheck;
			if(bCheck==true) {
				System.out.println("본인 차례");
			}
			else {
				System.out.println("컴퓨터 차례");
				}
			}
			//이렇게 하면 턴제(두 사람이서 왔다갔다..) 할 수 있음.
			//만약 6명이서 턴제 하고 싶으면, i++해서 숫자 증가시키고, 6으로 나눈 나머지로 턴제 주면 됨.  
		
	}

}
