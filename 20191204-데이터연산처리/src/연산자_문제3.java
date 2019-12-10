import java.util.Scanner;

public class 연산자_문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제3
		String name,department,position;
		int sal;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("이름을 입력하세요.");
		name=scan.next();
		System.out.print("부서를 입력하세요.");
		department=scan.next();
		System.out.print("직위를 입력하세요.");
		position=scan.next();
		System.out.print("급여를 입력하세요.");
		sal=scan.nextInt();
		
		System.out.println("이름:"+name);
		System.out.printf("부서:"+department);
		System.out.print("\n직위:"+position+"\r급여:"+sal+"원\r");
		

	}

}
