package com.sist.exception1;
import java.sql.*; //오라클 연결 => CheckException

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null; // 오라클 연결 (Socket)
		PreparedStatement ps=null; // SQL 문장 전송 => 수신 
		try
		{
			// 1. 오라클 드라이버 설정 : thin, oci 
			//  - 우리는 thin 드라이브 사용함(무료^_^!!)
			//  - thin드라이브 : 다른 애랑 연결만 해줌 (ex. Oracle과 연결)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 연결
			String url="jdbc:oracle:thin:@localhost:1521:XE"; // XE: 데이터 저장된 위치의 이름.
			conn=DriverManager.getConnection(url,"hr","PASSWORD");  //XML 
		
			// 3. SQL 문장
			String sql="SELECT ename,job,sal FROM emp"; // "" 안에 ; 찍지 마라. 오라클 커맨드 창에는 ; 찍어도 여기엔 찍지X...
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery(); //rs가 이제 실행된 SQL 쿼리문의 결과값을 갖고 있다.
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)); 
				// SQL 커맨드에서 확인하면 ename은 String, job은 String, sal은 int니까
			}
			rs.close();
			
		}catch(Exception ex) {
			//System.out.println(ex.getMessage());
			ex.printStackTrace();
			// getMessage : 에러메시지 출력 (상세X) 
			// printStackTrace : 몇번째 줄에서 에러났는지 출력		
			}
		finally
		{
			try
			{
				// finally에서 종료시킴 
				// finally에도 예외처리해줘야함 
				// 순서 : ps 먼저 닫고 conn 닫아야...
				if(ps!=null) ps.close();
				if(conn!=null) conn.close();
			}catch(Exception ex) {}
		}
		
	}

}
