
public class Ch4_4 {

	public static void main(String[] args) {
		//4-4
		//1+(-2)+3+(-4)+... ==> 몇 개까지 더해야 총합 100 이상?
		//(방식1) - 내 방식. while 문으로 풀었음. 
		int i=1;
		int sum=0;
		while(sum<100) {
			if(i%2!=0) {
				sum+=i;
			}
			else {
				sum-=i;
			}
			i++;
		}
		System.out.println((i-1)+"번째 수까지, 총합은"+sum);
		//i를 sum에 더하거나 뺀 후 i 증가시킨 후에 sum<100 검사하므로, i에서 1 빼준 값이 답. 
		//i=199일때 sum에 +199 되고 i++되서 sum>=100 임. 
		
		//(방식2) 
		int total=0;
		for(int k=1;total<100;k++) {
			if(k%2!=0) {
				total+=k;
			}
			else {
				total-=k;
			}
			if(total>=100) {
				System.out.println(k+"번째 수까지, 총합은 "+total);
				break;
			}
		}
	
				 

	}
}
