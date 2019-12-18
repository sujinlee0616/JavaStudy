/*
 * && --> 직렬처리. 
 * || --> 병렬처리. 
 * 
 * 문법형식	
 * 	(조건) && (조건) : 범위 안에 있는 경우. ex) 0이상 1000이하
 * 		ex) score>=90 && score<=100
 * 	(조건) || (조건) : 범위 밖에 있는 경우. ex) 0미만 or 1000초과 : 주로 오류 처리 할 때. ex) "숫자가 너무 큽니다."
 * 		ex) score<0 || score>100 
 * 
 * 		ex) 로그인 시 ID/PW 체크
 * 			id=="" && pwd=1234
 * 			id!="" || pwd!=""
 * 
 * 	============================
 * 	(조건) (조건)	    &&    || 
 * 	============================
 * 	true  true	  true   true	
 * 	============================
 * 	true  false   false  true 
 * 	============================
 * 	false true    false  true
 * 	============================
 * 	false false   false  false
 *	============================
 *
 *	*** 효율적 연산
 *	&& --> 왼쪽이 false면 오른쪽은 연산하지 않는다.  ★★★
 *		   (하나가 false면 어차피 결과값 false니까 오른쪽은 굳이 계산할 필요도 없으므로 계산하지 않는다.) 
 *	|| --> 왼쪽이 true면 오른쪽은 연산하지 않는다. ★★★
 *
*/

public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ex1) 알파벳을 저장 후 소문자vs대문자 여부 구분 
		char c='A';
		String result=(c>='A' && c<='Z')?"대문자":"소문자"; 
		//			   ================= 이 부분을 65, 96 으로 안 써도 되는 이유는 char은 모든 연산자에서 int로 바뀌기 때문 ★
		System.out.println(c+"는(은) "+result);
		
		// ex2) 대문자면 소문자로 변환, 소문자면 대문자로 변환
		char a='B';
		char chg=(a>='A' && a<='Z')?(char)(a+32):(char)(a-32); //'A'=65, 'a'=97이니까. //char로 바꾸는 것 주의!!!★★★
		System.out.println(a+"를 변환하면 "+chg+"입니다.");
		
	}

}













