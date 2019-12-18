/*
 * 반복문 
 * 	=============== 선조건 : 실행 안 될 수도 있음.  
 * 	= for : 반복횟수가 지정되어 있을 때 
 *  = while : 반복횟수가 지정되어 있지 않을 때 
 *    초기값
 *    while(조건문){
 *  	실행문장
 *  	증가식
 *    }
 *  =============== 후조건 : 한 번 이상 반드시 수행 
 *  = do~while 
 *    초기값
 *    do{
 *    	실행문장
 *    	증가식
 *    }while(조건문)
 *  ===============
*/
public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String[] s= {"a","b","c","d","e","f","g","h","i","k"}; int[] ss=
		 * {3,4,6,7,8,9,10,11,4,5}; int i=0; while(i<=10) {
		 * System.out.println(s[i]+"-"+ss[i]); i++; }
		 */
		
		int i=1; // 1
		int sum=0; 
		while(i<=100) { // 2
			sum+=i; // 3
			i++; //  4
		}
		
		System.out.println("1~100까지의 합:"+sum);
		/*
		 * 실행순서 : 1→2→3→4
		 *          →2→3→4
		 *          ===
		 *          2가 false가 되면 종료
		 */		
		
		//1~100 에서, 3/5/7의 배수의 합을 구하라
		int j=1;
		int sum1=0;
		int sum2=0;
		int sum3=0;
		while(j<=100) {
			if(j%3==0) 
				sum1+=i;
			if(j%5==0) 
				sum2+=i;
			if(j%7==0) 
				sum3+=i;
			j++;
		}
		System.out.println("3의 배수의 합:"+sum1);
		System.out.println("5의 배수의 합:"+sum2);
		System.out.println("7의 배수의 합:"+sum3);
		
		//while문 써서 알파벳 대문자를 출력하라.
		
		char alphabet='A';
		while(alphabet<='Z') {
			System.out.print(alphabet+" ");
			alphabet++;
		}
		
		
		
		
	}

}







