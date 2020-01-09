import java.io.IOException;
import java.sql.SQLException;

class MyException{
	// 구현된 내용 중에 예상되는 에러가 있다 => 시스템에 알려준다 => throws
	public void display() throws NumberFormatException,NullPointerException,ArithmeticException 
	{
		System.out.println("MyException:display Call...");
	}
	public void display1() throws IOException,SQLException
	{
		System.out.println("MyException:display1 Call..."); 
	}
}


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메모리 할당 
		// NumberFormatException,NullPointerException,ArithmetivExpcentio
		// 위의 셋은 다 RuntimeException => 생략 가능 
		MyException m=new MyException(); //m 주소에 display()가 저장
		m.display();
		//방법1
		/*
		 * try 
		 * { 
		 * 		m.display1(); 
		 * }
		 * catch(IOException e) 
		 * {
		 * } 
		 * catch(SQLException ee) 
		 * {
		 * }
		 */
		// 방법2
		/*
		 * try { m.display(); } catch(Throwable e) {}
		 */
	}

}
