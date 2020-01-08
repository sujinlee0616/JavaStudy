package com.sist.exception;
import java.util.Scanner;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			//int[] arr=new int[2];
			int a=10;
			int b=0;
			System.out.println("a="+a+", b="+b);
			int c=a/b;
			System.out.println("c="+c);
		}
		/*
		 * catch(RuntimeException ex) 
		 * { 
		 * //만약 이게 있으면, 아래의5개는 오류뜸.
		 * //RuntimeException이 다른 애들보다 상위라서 다른 애들을 포함하고 있기 때문.   
		 * //그러므로, 상위의 애들은 마지막에 써야. 
		 * }
		 */
		catch(NumberFormatException ex) 
		{
			System.out.println("NumberFormatException");
		}
		catch(ArrayIndexOutOfBoundsException ex) 
		{
			System.out.println("ArrayIndexOutOfBoundsException");	
		}
		/*
		 * catch(ArithmeticException ex) { System.out.println("ArithmeticException"); }
		 */
		catch(NullPointerException ex) 
		{
			System.out.println("NullPointerException");	
		}
		catch(ClassCastException ex) 
		{
			System.out.println("ClassCastException");	
		}
		catch(RuntimeException ex) {
			System.out.println("RuntimeException"); 
			//예상하지 못한 예외가 발생할 수 있으므로 마지막에 큰 애 놓는다. 
		}
		System.out.println("프로그램 종료");

	}

}
