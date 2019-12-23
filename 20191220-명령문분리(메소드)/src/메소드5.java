//'메소드4.java' 파일 코드를 메소드로 만들어보기 
public class 메소드5 {

	// 1. 난수 발생
	static int[] getRand() {
		int[] com=new int[6];
		int su=0;
		boolean bCheck=false;
		for(int i=0;i<6;i++) {
			bCheck=true;
			while(bCheck) {
				su=(int)(Math.random()*45)+1;
				bCheck=false;
				for(int j=0;j<i;j++) {
					if(com[i]==su) {
						bCheck=true;
						break;
					}
				}
			}
			com[i]=su;
		}
		return com;
	}
	
	// 2. 출력
	static void print(int[] com) {
		for(int i:com) {
			System.out.print(i+" ");
		}
	}
	
	static void process() {
		int[] com=getRand();
		print(com);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
