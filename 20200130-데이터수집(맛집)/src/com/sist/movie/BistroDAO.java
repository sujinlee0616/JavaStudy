package com.sist.movie;
import java.util.*;
import java.sql.*;

/*
 * private int mno;
 * private String title;
 * private double score;  
*/

public class BistroDAO {
	private Connection conn; //Socket
	private PreparedStatement ps; // OutputStream, BufferedReader. 주고받고 하는 함수가 만들어져 있다. 
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";

	// 1. 드라이버 등록 => 한번만 수행
	public BistroDAO() 
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
	public void bistroInsert(BistroVO vo)
	{
		try 
		{
			getConnection();
			String sql="INSERT INTO bistro VALUES("
					+"(SELECT NVL(MAX(mno)+1,1) FROM bistro),?,?)";
			// 1 : 현재상영(Movie 테이블 1-37번) / 2 : 개봉예정(38-92번) 
			// 3 : 박스오피스 주간(93-102번) / 4 : 박스오피스 월간 (103-122번) / 5 : 박스오피스 연간 (123-167번)
			// 자동으로 mno 번호 증가하게.
			// 맨 처음에 null이니까 NVL 사용해서 null일 때 1 넣어줌.
			// 그 다음부터는 1씩 증가하므로 1,2,3,.... 과 같이 번호가 계속 증가함 
			/*
			 * private String title;
			 * private double score;
			 * private String genre;
			 * private String regdate;
			 * private String time;
			 * private String grade;
			 * private String director;
			 * private String actor;
			 * private String story;
			*/
			ps=conn.prepareStatement(sql);
			ps.setString(1, vo.getTitle());
			ps.setDouble(2, vo.getScore());
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





