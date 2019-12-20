// 1+(1+2)+(1+2+3)+....+(1+2+...+10) 합을 구하라. 
// sum(1) sum(1+2) ... sum(1+2+...+10)
/*
 * 입력
 * 처리 ==> 세분화 
 * 출력
*/
public class 메소드1 {
	
	//sum은 1부터 a까지 합 구해주는 애
	static int sum(int a) {
		int hap=0;
		for(int i=1;i<=a;i++) {
			hap+=i;
		}
		return hap;
	}
	//res는 sum(1), sum(1+2),.. 을 더해서 결과를 출력해주는 애.
	static void process() {
		int res=0;
		for(int i=1;i<=10;i++) {
			res+=sum(i);
		}
		System.out.println("res="+res);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
		
	}

}
