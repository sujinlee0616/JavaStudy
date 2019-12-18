/*
 * <2차 for문> 
 * 형식 및 순서)
 *        1   2 ↑: 조건식이 false일 경우 빠짐 
 * 	for(초기값;조건식;증감식){ ==> 1차 for문 ===> 줄 수 
 * 			  ↓: 조건식이 true일 경우 2차로 감 
 * 
 * 			  1    2 ↑: 조건식이 false일 경우 빠짐 ==> 1차 for문의 증감식으로 올라감   
 * 		for(초기값;조건식;증감식){ ==> 2차 for문 ====> 실제 출력 
 * 		 	  ↓: 조건식이 true일 경우 2차 for문 내의 문장 실행 
 *               3
 * 			실행문장 (2차 for) ==> 실행 후 2차 for문의 증감식으로 올라감  
 * 		}
 * 		실행문장 (1차 for)
 * 	}
 * 
 * ex1) 1####
 *      #2###
 *      ##3##
 *      ###4#
 *      ####5
 *      
 * ex2) *
 * 		**
 * 		***
 * 		****
 * 		***** 
 * 
 * ex3) *****
 * 		****
 * 		***
 * 		**
 * 		*
 * 
 * ex4)    *
 *        **
 *       ***
 *      ****
 *     *****
 *     
 * ex5) ***** i=1, 별 j=1~5 		공백0   
 *       **** i=2, 별 j=2~5=i~5	공백1 = 1~(i-1)
 *        *** i=3, 별 j=3~5=i~5 	공백1~2 = 1~(i-1)
 *         ** 
 *          *
 *     i	j	k   ==> i+k=6 ==> k=6-i
 *    줄수     공백    별표
 *     1	0	5
 *     2	1	4
 *     3	2	3
 *     4	3	2
 *     5	4	1
 *     		j=i-1
 *     
 *     ==> 이렇게 관계를 먼저 짜놓고 하자.
 *     
 * ex6) 모래시계모양
 * 		*****
 * 		 ***
 * 		  *
 * 		 ***
 * 		*****
 * 
 * ex7) 나비모양
 * 
 * 		*   *
 * 		** **
 * 		*****
 * 		** **
 * 		*   *
 * 
 * ex8) 마름모
 * 			*
 * 		   ***
 * 		  *****
 * 		   ***
 * 			*
 * 		
 * ===================
 * ex9) 구구단 
 * 		2*2=1 3*1=3 4*1=4 ----- 9*1=9
 * 		...
 * 		...
 * 		2*9=18 3*9=27 ....      9*9=81
 * 
 * 
 * 
*/
import java.util.Scanner;
public class 이중반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// ex1) 가로세로 5줄 출력 
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==i) {
					System.out.print(i);
				}
				else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		//ex1-1) 줄수입력받아서 출력
		/*
		 * Scanner scan = new Scanner(System.in); System.out.println("몇 줄 출력? (9줄 이내)");
		 * int rows=scan.nextInt();
		 * 
		 * for(int i=1;i<=rows;i++) { for(int j=1;j<=rows;j++) { if(j==i) {
		 * System.out.print(i); } else { System.out.print("#"); } }
		 * System.out.println(); } System.out.println();
		 */

		//ex2) 별 수가 아래줄로 가면서 1-5까지 증가
		//i와 j의 관계를 생각해보면서 짜면 쉽다. 
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//ex3) 별 수가 아래줄로 가면서 5-1까지 감소
		//i와 j의 관계를 생각해보면서 짜면 쉽다. 
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		System.out.println();
		
		//ex4) 
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//ex5) 
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=6-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//ex9) 구구단  
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%d*%d=%d\t",j,i,j*i);
			}
			System.out.println();
		}
	
		
		
		
	}

}








