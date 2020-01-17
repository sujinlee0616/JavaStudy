package com.sist.dao;
import java.sql.*;

// 데이터를 연결해주는 메소드 
public class MemberDAO {
	private Connection conn; // 오라클 연결 => Socket
	private PreparedStatement ps; //BufferedReader, OutputStream 
	// 라이브러리는 원본이 감춰져있다.
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE"; 
	//private final String URL="jdbc:oracle:thin:@211.238.142.192:1521:XE";  //학민씨 컴퓨터 
	// 오라클 연결주소
	
	// 1. 드라이버 등록 => 한 번 수행 => 생성자 
	public MemberDAO() 
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); // JDBC 드라이버  
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
			conn=DriverManager.getConnection(URL,"hr","happy");
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
			getConnection(); // 오라클에 요청
			String sql="SELECT COUNT(*) FROM member WHERE id=?"; //실행할 쿼리 
			//preparedStatement 쓸 때는 변수값 대신 '?' 사용
			ps=conn.prepareStatement(sql); // 오라클로 전송 
			ps.setString(1, id); //실행 전에 '?'에다가 id값을 넣는다. (1:첫번째 '?'에다가 넣는다는 뜻.) 
			ResultSet rs=ps.executeQuery(); // 실행 요청
			rs.next(); // 커서이동 - 실제 출력위치에 커서를 이동한다. next 빠지면 오류난다.   
			int count = rs.getInt(1);  //숫자냐 문자냐 날짜냐에 따라 데이터 형을 맞춰줌(number,varchar,date)
			rs.close();
			// 0) 입력받은 id와 일치하는 데이터가 없음 
			if(count==0)
			{
				result="NOID";
				// result에 "NOID"라고 넣어주고 클라이언트(MainForm)에서 적절한 이벤트 발생시킴 
			}
			// 1) 입력받은 id와 일치하는 데이터가 있음 
			else 
			{
				// 요청 시작 
				sql="SELECT * FROM member WHERE id=?"; 
				ps=conn.prepareStatement(sql); //전송 
				ps.setString(1,id); // sql문의 첫번째 '?'에 id값을 넣는다
				rs=ps.executeQuery(); // 쿼리 실행 
				rs.next();
				
				//값을 받는다
				String mid=rs.getString(1); // 첫번째 칼럼값을 mid에 대입
				String mpwd=rs.getString(2); // 두번째 칼럼값을 mpwd에 대입 
				String name=rs.getString(3);
				String sex=rs.getString(4);
				int avatar=rs.getInt(5);
						
				rs.close(); // 네트워크 부담 줄이기 위해서 rs.close해준다 
				
				// 1-1) DB에서 읽어온 비번(mpwd) = 사용자가 입력한 비번(pwd)
				if(mpwd.equals(pwd)) 
				{			
					result=mid+"|"+name+"|"+sex+"|"+avatar; 
					// result에 이 값들을 넣어줌
				}
				// 1-2) 비번 불일치 
				else 
				{
					result="NOPWD";
					// result에 "NOPWD"라고 넣어주고 클라이언트(MainForm)에서 적절한 이벤트 발생시킴 
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
			disConnection(); 
		}
		return result;
	}
	
	/*
	 * [정리] 
	 * 1. MemberDAO 
	 *  - DAO : Data Access Object ==> DB를 사용해서 데이터를 조회/조작
	 *  - 오라클에 연결해서 member 테이블 데이터 조회함
	 * 2. MemberDAO > isLogin
	 *  - 클라이언트(MainForm)에서 로그인 수행할 때 쓸 'result'를 넘겨줌. 
	 *  - 1) ID 틀렸을 경우 : result="NOID";
	 *  - 2) ID 맞았지만 틀렸을 경우 : result="NOPWD";
	 *  - 3) ID&PW 맞을 경우 : result=mid+"|"+name+"|"+sex+"|"+avatar; 
	*/
}



