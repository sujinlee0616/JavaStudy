// 1~45 중복 없는 난수 발생 (로또)
/*
 * 배열 ==> 6개
 * 	for(6번){
 * 		while문(중복확인){
 * 			난수발생
 * 			배열에 저장된 데이터와 난수가 같은지 (같다)
 * 		} 
 * 		배열에 저장
 * 	}
*/
public class 메소드4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//난수 저장 공간
		int[] lotto=new int[6];
		//난수
		int su=0;
		//중복되는지 비교
		boolean bCheck=false;
		
		for(int i=0;i<6;i++) {
			bCheck=true;

			while(bCheck) {
				su=(int)(Math.random()*45)+1;
				bCheck=false;
				for(int j=0;j<i;j++) {
					if(lotto[i]==su) {
						bCheck=true;
						break;
					}
				}
			}
			//배열에 저장
			lotto[i]=su;
		}
		
		
		//출력
		for(int i:lotto) {
			System.out.print(i+" ");
		}

	}

}
