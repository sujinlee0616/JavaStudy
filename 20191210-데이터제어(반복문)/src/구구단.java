import java.util.Scanner;
public class 구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("단을 입력(2~9단):");
		int dan=scan.nextInt();
		
		int i=1;
		while(i<=9) {
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
			i++;
		}
		
		
	}

}
