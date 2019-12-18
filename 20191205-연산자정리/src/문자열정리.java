/*
 * String : 문자열 저장
 * ======
 * 	기능 ★★★★★ 아래의 것들은 꼭 외워야 ★★★★★
 * 	1) 문자열을 분리 substring()
 * 	2) 문자 찾기 indexOf(), lastIndexOf() 
 * 			 (indexOF: 앞에서부터 찾음 // lastIndexOf: 뒤에서부터 찾음) 
 * 			 c:\javaDev\javaStudy
 * 	3) 문자 비교 equals() : 대소문자 구분 O
 * 			 equalsIgnoreCase : 대소문자 구분 X
 * 	4) 공백문자 제거 trim()
 * 	5) 대소문자 변경 toUpperCase, toLowerCase
 * 	6) 모든 데이터형을 문자열로 변경 valueOf()
 * 	7) 문자의 갯수 length()
 * 	8) 변경 -> replace, replaceAll 
 * 
 * <기타>
 *  - 정형화된 데이터, 비정형화 데이터, ...
 *  - String은 일반 데이터형이 아니고  class라서 1) 기능을 갖고 있다!★ 2) 형 변환이 안 된다.
 *  - String은 4byte임. 왜냐면 모든 class는 주소만 저장하며, 이는 4byte이기 때문. ★
 *  - 마찬가지로 모든 메소드도 4byte이다.
 *  
 * 
*/
public class 문자열정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello Java!!"; //공백도 문자다! 따라서 12글자.	
				//012345    H가 0, o가4, 공백이 5번임. 
		System.out.println("글자수:"+s.length()); //글자수:12
		System.out.println(s.substring(0,5)); //Hello
		//(0,5)로 주면 0~4번까지 가지고 온다. --> 항상 하나를 더 많이 가지고 와야.
		System.out.println(s.replace("l", "k")); //Hekko Java!!
		System.out.println(s.toUpperCase()); //HELLO JAVA!!
		System.out.println(s.toLowerCase()); //hello java!!
		System.out.println(s); //위의 s.~~들은 원본인 s의 값 자체를 변경시키지는 않는다. 그저 s의 값을 변형시켜서 한번만 출력시켜줄뿐.
		
		s=" Hello Java!! ";  
		System.out.println("글자수:"+s.length()); //글자수:14
		System.out.println(s.substring(0,5)); // Hell
		System.out.println(s.trim()); //trim은 좌우의 공백만 제거할 수 있다. 중간 공백은 지울 수 없음.
		
		System.out.println(s.indexOf("l")); //3
		System.out.println(s.lastIndexOf("l")); //4 
		//lastIndexOf는 !!avaJ olleH 순서로 번호를 01234.. 매기는게 아님. 번호 매기는 순서는 똑같이 Hello 01234.. 이렇게 매김. 
		// indexOf처럼 01234 부터 찾는데 맨 뒤에 있는 애를 찾는것.
		System.out.println(s.indexOf("a")); //8
		System.out.println(s.lastIndexOf("a")); //10
		
		String s1="Hello";
		String s2="Hello";
		String s3="hello";
		
		String com12=s1.equals(s2)?"같다":"다르다";
		System.out.println(com12); //같다
		String com13=s1.equals(s3)?"같다":"다르다";
		System.out.println(com13); //다르다
		String com13_ig=s1.equalsIgnoreCase(s3)?"같다":"다르다"; //equalsIgnoreCase : 대소문자 무시하고 비교
		System.out.println(com13_ig); //같다
	}

}







