// equals => return : boolean 
// 저장된 문자열이 같은지 확인  
// ex) 내가 쓴 글이면 수정/삭제 가능, 아니면 불가능 (ID 일치여부로 판단) 
import java.util.Scanner;
public class 문자열클래스2 {
	static boolean isLogin(String id, String pwd) { //boolean이면 보통 is로 이름짓는 경우 많음. 
		boolean bCheck=false;
		final String ID="admin";
		final String PWD="1234";
		//static이나 final은 무조건 클래스 영역 안에 선언할 때만 쓴다.
		//지역변수는 유일하게 관련된게 final 하나 뿐. 
		/*
		 * 	★★equals★★: 대소문자 구분
		 * 	equalsIgnoreCase: 대소문자 구분 없이 비교
		 * 	startsWith: 시작 문자열이 같은 경우 true, 다르면 false 
		 * 	endsWith: 끝나는 문자열이 같은 경우 true, 다르면 false
		 * 	★contains★: 문장에 문자열이 포함된 경우 true, 아니면 false
		*/
		//if(id.equals(ID) && pwd.equals(PWD))  //대소문자 구분
		if(id.equalsIgnoreCase(ID) && pwd.equals(PWD)) //대소문자 구분X
		{
			bCheck=true;
		}
		return bCheck;
	}
	static void process() {
		Scanner scan=new Scanner(System.in);
		while(true) {
			 System.out.println("ID 입력:");
			 String id=scan.next();
			 System.out.println("비밀번호 입력");
			 String pwd=scan.next();
			 
			 boolean bCheck=isLogin(id,pwd);
			 
			 if(bCheck==true) {
				 System.out.println(id+"님 로그인 되었습니다!!");
				 break;
			 }
			 else{
				 System.out.println("ID나 비밀번호가 틀렸습니다.");
			 }
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
