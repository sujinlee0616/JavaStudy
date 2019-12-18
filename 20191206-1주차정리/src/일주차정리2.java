/*
 * <자바에서 제공하는 특수문자> 
 * 1) \n : new line : 한 줄 띄움. 
 * 		ex) System.out.println("안녕\n하세요"); 
 * 2) \t : tab : 일정간격 띄움.
 * 		ex) System.out.println("아이유 \t LovePoem \t 2019년 12월 발매"); 
 * 3) \" : " : 쌍따옴표 출력
 *	 	ex) System.out.println("\"Hello Java\""); //"Helo Java"
 * 
 * <출력 서식> ★★★★
 * 1) println: 출력 후 한 줄 띄움
 * 2) print : 출력 후 줄 띄우지 X 한 줄로 쭉 출력. 
 * 3) 서식이 있는 출력 --> JDK 1.5 (printf에서만 가능. println에서는 불가.)
 * 	(1) %d : 정수
 * 		ex) System.out.printf("국어점수:%d",10); %d안에 10을 집어넣는다.
 * 		ex) System.out.printf("%d%d%d",100,90,60); //정수를 세 개 입력하겠다는 뜻. 1009060 : 세 개가 붙어서 나옴
 * 		ex) System.out.printf("%5d%5d%5d",100,90,60); 
 * 			//--100/---90/---60  이렇게 나옴. d앞에 숫자는 넓이를 의미함. 5칸 주겠다는 뜻. 디폴트는 오른쪽부터 칸을 채움. 
 * 			//참고 : -는 빈칸을 이렇게 표시했음./은 글자구분을 그냥 이렇게 표시했음. 
 * 		ex) System.out.printf("%-5d%-5d%-5d",100,90,60);  //-주면 왼쪽부터 칸을 채우겠다는 뜻. 
 * 			//100--/90---/60--- 이렇게 나옴.  *  
 * 	(2) %f : 실수
 * 		ex) System.out.printf("%-5f%-5f%-5f",100,90,60); //error. 실수형에 정수 데이터를 넣었기 때문.
 *  	ex) System.out.printf("%-5f%-5f%-5f",99.9999,80.88,60.6666666); //5칸씩 줬는데 칸이 안 맞게 데이터를 줬음. 
 *  	ex) System.out.printf("%-10.2f%-10.2f%-10.2f",99.9999,80.88,60.6666666); 
 *  		//10칸씩 주고 소수점은 두자리까지만 나오게. --> 남는 공간은 빈칸으로 나옴. 
 * 	(3) %c : 문자
 * 		ex) System.out.printf("%c",'A');
 * 	(4) %s : 문자열
 * 		ex) System.out.printf("%s","String입니다아아"); 
 * 	 
 * 
*/
public class 일주차정리2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕\n하세요");
		System.out.println("\"Hello Java\"");
		System.out.println("아이유 \t LovePoem \t 2019년 12월 발매"); 
		System.out.println();
		System.out.printf("%d%d%d",100,90,60);  
		System.out.println();
		System.out.printf("%5d%5d%5d",100,90,60);
		System.out.println();
		System.out.printf("%-5d%-5d%-5d",100,90,60);
		System.out.println();
		System.out.printf("%-5f%-5f%-5f",99.9999,80.88,60.6666666);
		System.out.println();
		System.out.printf("%-10.2f%-10.2f%-10.2f",99.9999,80.88,60.6666666);
		System.out.println();
		System.out.printf("%2c%2c%2c\n",'A','B','C');		
		System.out.printf("%10s%10s%10s\n","Hello","Java","!!");
		
		System.out.printf("%7s%5d%5d%5d%7.2f%c\n","String",1,2,3,93.123456,'a');
		
		
	}

}





