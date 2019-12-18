
public class Ch4_정리문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4-6 두개의 누사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(i+j==6) {
					System.out.println("("+i+","+j+")");
				}
			}
		}

	}

}
