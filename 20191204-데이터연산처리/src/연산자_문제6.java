
public class 연산자_문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//사과개수
		int numOfApples=123;
		
		//바구니 크기
		int sizeOfBucket=10;
		
		//모든 사과를 담는데 필요한 바구니의 수
		int numOfBucket;
		
		//만약 나머지가 0이면 몫만 가져오면 됨. 
		//만약 나머지가 0이 아니라면 +1 해야. 
		if (numOfApples%sizeOfBucket==0) {
			numOfBucket = numOfApples/sizeOfBucket;
		}
		else {
			numOfBucket = numOfApples/sizeOfBucket + 1;
		}
						
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
		

	}

}
