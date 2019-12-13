/*
 * 	// 정보처리기능사, 코딩테스트 ==> 2for
 * 
 * 1. break : 반복 중단
 * ex) 
 * 	for(int i=1;i<=10;i++){
 * 		if(i==5)
 * 			break;
 * 		System.out.print(i);  // 결과:1234 // 위에 break가 있어서 5는 출력X. 
 * 	}
 * 
 * 2. continue : 특정 부분을 제외할 때 
 *  ex) 
 *   	for(int i=1;i<=10;i++){
 * 		if(i==5)
 * 			continue;
 * 		System.out.print(i);  // 결과:1234678910 // i==5에서 continue를 만나서 증감식(i++)로 올라가서 5에서는 sysout 을 안 거치기 때문. 
 * 	}
 * 
 *  break
 *  continue
 *  ======== 본인의 반복문만 제어
 *  		 break ==> for, do~while, while, switch~case 
 *  		 continue ==> for, do~while, while
 *  		  ※ 참고) return ==> 어떤 제어문이든 사용이 가능하다.   
 *  
*/
public class 이중반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++){
			if(i==5)
				break;				  //break : 반복 중단
				System.out.print(i);  // 결과:1234 // 위에 break가 있어서 5는 출력X. 
		}
		System.out.println();
		
		for(int i=1;i<=10;i++){
			if(i==5||i==7)
				continue; 			  //continue: 특정 부분을 제외할 때 
				System.out.print(i);  // 결과:123468910 // 5랑 7에서는 continue때문에 sop실행X하고 조건식으로 돌아가므로 5,7은 출력X
		}
		System.out.println();
		
		for(int i=1;i<=10;i++){
			if(i%2!=0)
				continue; 			  //continue: 특정 부분을 제외할 때 
				System.out.print(i);  // 결과값: 짝수만 나옴 
		}
		System.out.println();
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(j==2)
					break;		// 이 break의 소속문장은 2차 for문임. 즉, j=1만 나오지만 i=1,2,3 다 나온다.  ==> break는 소속 문장만 제어할 수 있다.★★
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println();
		
		for(int i=1;i<=3;i++) {
			if(i==2)	 
				break;			// 이 break의 소속문장은 1차 for문임. 즉,  i=1만 나오고 j=1,2,3 다 나온다. ==> break는 소속 문장만 제어할 수 있다. ★★
			for(int j=1;j<=3;j++) {
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println();		
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(j==2)
					continue;		// j=2가 빠진다. //j==2일땐 continue아래 식 실행X. 위의 증가식으로 올라감. ==> j=2일떄 출력X //===>소속문장인 2차 for문을 제외함   
				System.out.println("i="+i+", j="+j);
			}
		}
		System.out.println();
		
		for(int i=1;i<=3;i++) {
			if(i==2) 
				continue;			//i=2가 빠진다.  //i==2일땐 continue아래 식 실행X. 위의 증가식으로 올라감. ==> i=2일때 출력X //===>소속문장인 1차 for문을 제외함  
				for(int j=1;j<=3;j++) 
					System.out.println("i="+i+", j="+j);
		}
		System.out.println();
		
		
	}

}





