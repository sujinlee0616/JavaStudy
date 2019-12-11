/*
 * 프로그램
 * ======
 * 	사용자 정의 + java 라이브러리 + 외부오픈소스 (mvn repository에서 가지고 오면 됨 - mvnrepository.com)
 * 	=================================
 * 				조립!
 * 
*/
import java.util.Scanner;

import javax.swing.JOptionPane;
public class 반복문8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//클래스를 불러옴. F11하면 클래스 불러온 결과 출력됨 
		//반복문7_1_클래스만들기.music();
		
		
		//ex1) [for] 단 입력받아서 구구단 
		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력하세요(2~9):");
		int dan=scan.nextInt();
		//입력창 사용
		//JOptionPane.showInputDialog("");
		//근데 이렇게 하면 string으로 받아서 또 int로 변경해줘야함. 지금은 하지 말자. refer class 배운 뒤에 하자. 
		for(int i=1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		System.out.print("\n");
		
		//ex1-1) [while] 단 입력받아서 구구단
		int a=1;
		while(a<=9) {
			System.out.printf("%2d * %2d = %2d\n",dan,a,dan*a);
			a++;
		}
		System.out.print("\n");
		
		//ex2) 2단에서 9단까지 출력
		System.out.println("2단에서 9단 출력");
		for(int i=1;i<=9;i++) {
			for (int j=2;j<=9;j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
		

	}

}
