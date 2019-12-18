/*
*/
public class 선택조건문_예제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤 : 난수발생. 
		// 난수 : 컴퓨터에서 임의의 수를 추출.
		
		int score=(int)(Math.random()*101);
		//0.0~0.99 *101 // 0.00 ~ 99.... --> int (0.0 ~ 99.xx) --> 0~100
		System.out.println("score="+score);
		
		//90점 이상 A, 80점 이상  B, 70점 이상 C, 60점 이상 D, 60점 이하 F
		if(score>=90) 
			System.out.println("A");
		else if(score>=80) 
			System.out.println("B");
		else if(score>=70) 
			System.out.println("C");
		else if(score>=60) 
			System.out.println("D");
		else  
			System.out.println("F");

	}

}
