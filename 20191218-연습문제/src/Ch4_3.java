
public class Ch4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4-3
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)
		int an=0;
		int sum1=0;
		for(int j=1;j<=10;j++) {
			an+=j;
			sum1+=an;
		}
		System.out.println(sum1);
	}

}
