
public class 선택문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=91;
		switch(score/10) { // score를 정수10으로 나누면 정수0~10이 나올거임--> 학점 매기기 편해짐.
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
		}
		
	}

}
