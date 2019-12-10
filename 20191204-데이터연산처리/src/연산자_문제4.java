import java.util.Scanner;

public class 연산자_문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제4
				String name;
				int kor, eng, mat;
				
				Scanner scan=new Scanner(System.in);
				
				System.out.print("이름을 입력하세요.");
				name=scan.next();
				System.out.print("kor을 입력하세요.");
				kor=scan.nextInt();
				System.out.print("eng을 입력하세요.");
				eng=scan.nextInt();
				System.out.print("mat을 입력하세요.");
				mat=scan.nextInt();
				
				int sum=kor+eng+mat;
				double avg=sum/3.0;
				
				System.out.println("이름:"+name);
				System.out.println("합계점수:"+sum);
				System.out.printf("평균점수:%.1f",avg); //%.3f 이렇게 하면 소수점 셋째자리까지 나옴. 

	}

}
