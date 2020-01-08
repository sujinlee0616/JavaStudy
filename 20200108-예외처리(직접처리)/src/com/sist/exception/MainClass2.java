package com.sist.exception;
/*  예외처리
 * 	=====
 * 	 예외처리 종류 
 * 	 예외복구 : try ~ catch (직접처리) ===============> 70%
 * 	 예외회피 : throws (간접처리 => 시스템에 의해 처리) =====> 29%
 * 	 예외발생 : throw (사용자 정의 예외처리) =============> 1%
 * 
 * 	======================================================
 *  try ~ catch ~ finally(finally는 생략해도 무방)
 *  
 *  형식) 
 *  
 *  - catch절은 여러개가 올 수 있다.  
 *  - finally는 생략해도 무방하다.  
 *  
 *  
 *  ex1) 
 *  try
 *  {
 *  	정상수행을 할 수 있는 문장
 *  	1번 문장
 *  	2번 문장
 *  	3번 문장
 *  	4번 문장
 *  	5번 문장
 *  }catch(예상되는 예외1)   
 *  { 
 *  	복구문장
 *  	6번문장
 *  }catch(예상되는 예외2)
 *  {	
 *  	복구문장
 *  	7번문장
 *  }catch(예상되는 예외3)
 *  {	
 *  	복구문장
 *  	8번문장
 *  }finally
 *  {	
 *  	정상수행 OR 복구문장을 수행하던 말던 관계없이 무조건 수행하는 문장
 *  	9번 문장 
 *  }
 *  10번 문장
 *  
 *  ==> 수행순서 : 1번문장 → 2번 → 3번 → 4번 → 5번 → 9번 → 10번
 *  
 *  
 *  ex2) 
 *  try
 *  {
 *  	정상수행을 할 수 있는 문장
 *  	1번 문장
 *  	2번 문장
 *  	3번 문장 ==> 예상되는 예외1 발생  ==> catch를 수행
 *  	4번 문장
 *  	5번 문장
 *  }catch(예상되는 예외1)   
 *  { 
 *  	복구문장
 *  	6번문장
 *  }catch(예상되는 예외2)
 *  {	
 *  	복구문장
 *  	7번문장
 *  }catch(예상되는 예외3)
 *  {	
 *  	복구문장
 *  	8번문장
 *  }finally
 *  {	
 *  	정상수행 OR 복구문장을 수행하던 말던 관계없이 무조건 수행하는 문장
 *  	9번 문장 
 *  }
 *  10번 문장
 *  
 *  ==> 수행순서 : 1번 문장 → 2번 → 6번 → 9번 → 10번 
 *  ==> 4,5번 문장은 수행불가. (에러난 문장 바로 밑의 문장들은 실행 불가)
 *  
 *  ex3) 
 *  try
 *  {
 *  	for(int i=0;i<10;i++)
 *  	{
 *  		실행문장 ==> i==5에서 예외발생 
 *  	}
 *  }catch(Exception ex)
 *  ==> 반복문 5번 실행
 *  즉, i==5일때 for문이 종료되고 try catch 실행 
 *  즉, i=0,1,2,3,4 수행 ==> 총 5번 수행 
 *  
 *  ex4) 
 *  for(int i=0;i<10;i++)
 *  {
 *  	try
 *  	{
 *  		실행문장 ==> i==5에서 예외발생 
 *  	}catch(Exception ex)
 *  }
 *  ==> 반복문 9번 실행 ★★★
 *  i==5일때 수행x 하고 for문으로 돌아가서 i==6인 반복문을 수행 ==> i=9까지 수행.
 *  즉, i=0,1,2,3,4,6,7,8,9 수행 ==> 총 9번 수행.  
 *  
 *  
*/
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 예외처리방식1 - try/catch를 바깥에, for문을 안쪽에 
		try {
			for(int i=1;i<=10;i++) 
			{
				if(i==5) 
				{
					int a=10/0;
				}
				System.out.println("i="+i);
			}
		}catch(Exception ex) 
		{
			System.out.println("오류 발생");
		}
		System.out.println();
		
		// 예외처리방식2 - for문을 바깥에, try/catch를 안쪽에 
		for(int i=1;i<=10;i++) {
			try {
				if(i==5) 
				{
					int a=10/0;
				}
				System.out.println("i="+i);
			}catch(Exception ex) {
				System.out.println("오류 발생");
			}
		}
		
		
	}

}
