/*
 * <반복문>
 * 1. while
 * 	형식)
 * 		초기값 		===> 1
 * 		while(조건문){===> 2 : 선조건 : 조건이 처음부터 거짓인 경우 실행이 안 될 수도.
 * 			반복실행문장 ===> 3
 * 			증가식 	===> 4 ===> 2번으로 되돌아가서 (참일경우) 3,4 또 수행. (거짓일경우) while문을 빠져나감. 
 * 		}
 * 	ex) 1~10
 * 		int i=11;
 * 		while(i<=10){ 				==> 선조건 : 처음부터 거짓일 경우 실행이 안 될 수도 있다. 
 * 			System.out.println(i);
 * 			i++;	 <-- 비교 후 값 증가 (i++) 
 * 		}
 * 2. do~while
 * 	형식)
 * 		초기값		===> 1
 * 		do{
 * 			실행문장	===> 2
 * 			증가식	===> 3
 * 		}while(조건문); ===> 4 : 후조건 : 조건이 처음부터 거짓이더라도 do가 무조건 한 번은 실행된다. 
 * 	ex) int i=1;
 * 		do{
 * 			System.out.println(i); //출력 // 10까지 출력한다.
 * 			i++; 
 * 		}while(i<=10);	<-- 값 증가 후 (i++) 비교 
 * 
 * 3. for
 * 	형식)      1    2    4
 * 		for(초기값;조건식;증가식){
 * 			실행문장 ===> 3
 * 		}
 * 	ex) for(int i=1;i<=10;i++){
 * 			System.out.println(i);
 * 		}
 * =====================================
 * 4. 기타
 *  - 출력 시에는 ★항상 가로로 출력★된다. 세로로 출력 안 됨. 
 * 
 * 
*/
public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// [for문] 1부터 10까지 출력하는데 한 줄에 숫자 세개씩 출력하시오. 
		System.out.println("For Loop");
		for(int i=1;i<=10;i++) {
			System.out.printf("%d\t",i);
			if(i%3==0) {
				System.out.println();
			}
		}
		System.out.printf("\n\n");
		
		// [while문] 똑같은거 while문으로 만들기
		System.out.println("While Loop");
		int i=1;
		while(i<=10) {
			System.out.printf("%d\t",i);
			if(i%3==0) {
				System.out.println();
			}
			i++; //while은 꼭 while문 안에서 i++ 해줘야함.. for문만 습관적으로 쓰다보니 자꾸 while문에서 i++를 까먹네...
		}
		System.out.printf("\n\n");
		
		// [do~while문] 똑같은거 do while문으로 만들기
		System.out.println("Do/while Loop");
		int j=1;
		do {
			System.out.printf("%d\t",j);
			if(j%3==0) {
				System.out.println();
			}
			j++;
		}while(j<=10);

	}

}



