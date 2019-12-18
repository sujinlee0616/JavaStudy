// 1,2 -> 난수 발생 -> 홀짝맞추기 문제. 

import java.util.Scanner;
public class 이항연산자_비교연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math.random();은 0.0~0.99 안에서 랜덤 수 가져옴.*2하면 0.0~1.98 될거고 int로 만들면 0,1 될거임. 따라서 +1해야 1 or 2.   
		int com=(int)(Math.random()*2)+1;
		Scanner scan=new Scanner(System.in);
		System.out.println("입력(홀,짝):");
		String input=scan.next();
		
		String result=com%2==0?"짝":"홀";
		String dap=input.equals(result)?"정답":"오답"; //문자열 비교 시에는 '=='이 아니라 '.equals()'로 비교해야 한다.★★★★ 암기!!
		
		System.out.println("난수="+com);
		System.out.println(dap+"입니다");
		
		
		
		

	}

}
