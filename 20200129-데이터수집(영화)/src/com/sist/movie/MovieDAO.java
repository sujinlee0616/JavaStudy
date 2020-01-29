// DAO : 데이터 베이스 연결하는 프로그램 
// DAO (Data Access Object) : DB를 사용해서 데이터를 조회/조작
package com.sist.movie;
import java.util.*;
import java.sql.*;
/*
 * 1. 드라이버 등록 => Class.forName("oracle.jdbc.driver.OracleDriver"); ==> 오라클에서 다운로드 (ojdbc6.jar)
 * 2. 오라클 연결 => Connection
 * 				=> getConnection(URL, username, password)
 * 				=> conn hr/happy 
 * 3. 기능처리 => SQL
 * 			 => Statement : SQL 문장을 오라클에 전송
 * 				1) executeQuery() : 검색 시 사용 (SELECT). 데이터를 가지고 올 때 사용. 
 * 									==> 리턴형은 ResultSet (결과값 받아서 메모리에 저장)    
 * 				2) executeUpdate() : 데이터가 변경될 때 사용. 데이터 갱신 (INSERT, UPDATE, DELETE) 
 * 									 ==> commit() 존재. 리턴형은 void. (데이터 받아오지 않으니까)     
 * 4. 오라클 해제 => close()
 * 
*/
/*
 * private int mno;
 * private String title;
 * private double score;
 * private String genre;
 * private String regdate;
 * private String time;
 * private String grade;
 * private String director;
 * private String actor;
 * private String story;
 * private int type;
 * 
 * <값 주는 방법 2가지>
 * 1. Statement 
 *  : 복잡하고 길다...ㅠ_ㅠ
 *  ex) String sql = "INSERT INTO movie VALUES("+mno+",'"+title+"',
 *  	"+score+",'"+genre+"','"+regdate+"','"+time+"','"+grade+"',
 * 		'"+director+"','"+actor+"','"+story+"',"+type+")";
 * 2. PreparedStatement 
 *  : - ? 주고 나중에 값 채움. Prepared : SQL문장을 ?를 사용해서 '미리 만들어놓는다'는 뜻.
 *  ex) String sql="INSERT INTO movie VALUES(?,?,?,?,?,?,?,?,?,?)"
 *  
*/

public class MovieDAO {
	private Connection conn; //Socket
	private PreparedStatement ps; // OutputStream, BufferedReader. 주고받고 하는 함수가 만들어져 있다. 
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";

	// 1. 드라이버 등록 => 한번만 수행
	public MovieDAO() 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception ex) 
		{
			ex.printStackTrace();
		}
	}
	// 2. 오라클 연결
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {}
	}
	// 3. 오라클 해제 
	public void disConection()
	{
		try 
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		} catch (Exception ex) {}
	}
	// ============================= 여기까지는 대부분의 프로그램이 다 똑같음 =============================
	
	
	// 4. 기능처리 => 추가  ==> CRUD
	public void movieInsert(MovieVO vo)
	{
		try 
		{
			getConnection();
			String sql="INSERT INTO movie VALUES("
					+"(SELECT NVL(MAX(mno)+1,1) FROM movie)," ;
			// 자동으로 mno 번호 증가하게.
			// 맨 처음에 Null이니까 NVL 사용해서 null일 때 1 넣어줌.
			// 그 다음부터는 1씩 증가하므로 1,2,3,.... 과 같이 번호가 계속 증가함 
			ps=conn.prepareStatement(sql);
			ps.executeUpdate();
		} catch (Exception ex) 
		{
			 ex.printStackTrace();
		}
		finally
		{
			disConection();
		}
	}
}





