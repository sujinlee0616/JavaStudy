
public class Ch4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4-2
		//1~20 정수 중에서 2또는 3의 배수가 아닌 수의 총합
		int sum=0;
		for(int i=1;i<=20;i++) {
			if(i%2!=0 || i%3!=0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
