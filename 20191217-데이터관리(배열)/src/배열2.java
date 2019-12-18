/*
 * 중복이 없는 난수 만들기  ★★★
 * => 배열 
 * ===========
 * =====
 * 난수발생 ==> 이 배열 안에 없는 숫자가 나오면 저장  
 * =====
*/
public class 배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] com=new int[9];
		int su=0; //난수발생 시 저장
		boolean bCheck=false; //중복여부를 확인 
		
		for(int i=0;i<com.length;i++) {
			bCheck=true;
			//========
			while(bCheck) { //bCheck=true면 while문이 계속 수행됨 
				//난수발생
				su=(int)(Math.random()*9)+1;
				bCheck=false;
				//중복여부 확인
				for(int j=0;j<i;j++) { 
					if(com[j]==su) { 
						bCheck=true; 
						break;
					}
				}
			}
			//========
			com[i]=su;
		}
		
		//i=0일때 1) su에 난수 저장됨, 2) bCheck는 false가 됨, 3) for문 수행X. --> 4) while문 빠져나옴 --> 5) com[0]에 su(난수)를 저장함. 
		//i=1일때 1) su에 난수발생됨, 2) bCheck는 false가 됨, 
		//		3-1) com[0]이 내가 이번에 만든 su와 값이 같다면 --> bCheck를 true로 만들고 for문 빠져나감 --> while문 다시 돌아서 su에 난수를 다시 만듦. 
		//		3-2) com[0]이 내가 이번에 만든 su와 값이 같지 않으면 --> for문 증가식으로 올라감 --> 수행X --> bCheck=false니까 while문 벗어남 --> com[1]에 su(난수)를 저장함. 
		
		for(int i:com) {
			System.out.println(i);
		}
		
				
		
	}

}
