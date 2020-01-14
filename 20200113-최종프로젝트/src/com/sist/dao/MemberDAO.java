package com.sist.dao;
import java.sql.*;

// 데이터를 연결해주는 메소드 
public class MemberDAO {
	private Connection conn; // 오라클 연결 => Socket
	private PreparedStatement ps; //BufferedReader, OutputStream 
	// 라이브러리는 원본이 감춰져있다.
	//private final String URL="jdbc:oracle:thin:@localhost:1521:XE"; 
	private final String URL="jdbc:oracle:thin:@211.238.142.192:1521:XE";  //학민씨 컴퓨터 
	// 오라클 연결주소
	// 1. 드라이버 등록 => 한 번 수행 => 생성자 
	
	public MemberDAO() 
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	// 2. 연결
	public void getConnection() 
	{
		try 
		{
			conn=DriverManager.getConnection(URL,"hr","PASSWORD");
		}catch(Exception ex) {}
	}
	
	// 3. 연결해제
	public void disConnection() 
	{
		try 
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			// exit 
		}catch(Exception ex) {}
	}
	
	// 4. 기능 처리 
	public String isLogin(String id,String pwd) 
	{
		String result="";
		try 
		{
			getConnection();
			// 오라클에 요청
			String sql="SELECT COUNT(*) FROM memberInfo WHERE id=?";
			ps=conn.prepareStatement(sql); // 오라클로 전송
			// ?에 값을 채운다
			ps.setString(1, id);
			// 실행 요청
			ResultSet rs=ps.executeQuery();
			rs.next(); // 실제 출력위치에 커서를 이동한다. next 빠지면 오류난다.  
			int count = rs.getInt(1);
			rs.close();
			
			// ID가 있는지 없는지를 체크하고, 가입한 이후의 년수 체크.
			if(count==0)
			{
				result="NOID";
			}
			else 
			{
				// 요청 시작 
				sql="SELECT * FROM memberInfo WHERE id=?";
				ps=conn.prepareStatement(sql); //전송 
				ps.setString(1,id); //실행 전에 '?'의 값을 채운다.
				rs=ps.executeQuery(); // 실행 
				rs.next();
				
				//값을 받는다
				String mid=rs.getString(1);
				String mpwd=rs.getString(2);
				String name=rs.getString(3);
				String sex=rs.getString(4);
						
				rs.close();
				
				if(mpwd.equals(pwd)) 
				{
					// 로그인
					result=mid+"|"+name+"|"+sex;
				}
				
				else 
				{
					//비밀번호가 틀리다
					result="NOPWD";
				}
				
				/*
				 * String name="";
				 * String name="";
				 * String name="";
				 * int age=10;
				 * 
				 * sql="INSERT INTO member VALUES('"+name+"','"+sex+"', '"+id+"', "+age+")";
				 * sql="INSERT INTO member VALUES (?,?,?,?)" 
				 * // 요즘 위 보다는 아래것과 같이 많이 씀★★ prepared statement 
				*/
			}
					
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
		finally 
		{
			// 연결 해제 
			disConnection(); // 
		}
		return result;
		
		
	}
}



