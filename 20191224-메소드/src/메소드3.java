// year 입력 받아서 윤년여부 확인
public class 메소드3 {
	//방법1
	static void isLeapYear(int year) {
		if((year%4==0 && year%100!=0)||year%400==0)
			System.out.println(year+"년도는 윤년입니다.");
		else 
			System.out.println(year+"년도는 윤년이 아닙니다.");
	}
	//방법2 - boolean 사용 
	static boolean isLeapYear2(int year) {
		if((year%4==0 && year%100!=0)||year%400==0)
			return true; // return이 이렇게 중간에 나올 수도 있다. 
		else 
			return false; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=2019;  //변수를 꼭 똑같이 year로 쓸 필요 없다. 다만, 메소드의 변수명과 일치시키는게 편하므로 똑같이 쓸 뿐이다. 
		isLeapYear(y);
		boolean bCheck=isLeapYear2(y);
		if(bCheck)
			System.out.println("윤년입니다.");
		else
			System.out.println("윤년이 아닙니다.");
	}

}
