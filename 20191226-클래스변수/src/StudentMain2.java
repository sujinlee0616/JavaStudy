import java.util.Scanner;

class StudentVO2{
	String name;
	int kor;
	int eng;
	int math;
	
}
public class StudentMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentVO2[] std=new StudentVO2[3];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			StudentVO2 vo=new StudentVO2();
			System.out.println(vo);
			System.out.println("이름:");
			vo.name=scan.next();
			
			System.out.println("국어:");
			vo.kor=scan.nextInt();
			
			System.out.println("영어:");
			vo.eng=scan.nextInt();
			
			System.out.println("수학:");
			vo.math=scan.nextInt();
			
			std[i]=vo; // 변수명 하나로도 여러개 돌릴 수 있다. 저장공간 주소를 따로 해주면 됨. 
			// 저장할 때 배열에 저장하던가, 메모리에 저장하던가... 하면 됨...
			
		}
		 for(StudentVO2 s:std) {
			 System.out.println(s.name+" "+s.kor+" "+s.eng+" "+s.math);
		 }
	}

}
