
public class Ch4_정리문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4-5 for문을 while문으로 변경 
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
				
		int i=0;
		while(i<=10) {
			int j=0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}		
				
				

	}

}
