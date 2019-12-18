
public class Ch4_정리문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4-4
		int num=1;
		int sum3=0;
		for(;;) {
			if(num%2==0) {
				sum3-=num;
			}
			else
				sum3+=num;
			if(sum3>100) 
				break;
			num++;
		}
		System.out.println("총합은 "+sum3+", 어디까지냐면 "+num+"까지");
		System.out.println(sum3);

	}

}
