package com.bit2016.bookmall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bit2016.bookmall.vo.BookVo;

public class BookDao {
	private Connection getConnetion() throws SQLException{
		
	Connection conn =null;
	
	try {
		Class.forName( "oracle.jdbc.driver.OracleDriver" );
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		conn = DriverManager.getConnection( url, "bitdb", "bitdb" );

	} catch (ClassNotFoundException e) {
		System.out.println("드라이버 로딩 실패 : "+ e);
	}
	return conn;
	}
	
	public boolean insert( BookVo vo ) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			//1. JDBC 드라이버 ( Oracle ) 로딩
			conn = getConnetion();
			
			//3. Statement 준비
			String sql = 
				"insert into book values( book_seq.nextval,?,?,?)";	
			pstmt = conn.prepareStatement(sql);

			//4. 바인딩
			pstmt.setString(1, vo.getTitle());
			pstmt.setLong(2, vo.getPrice() );
			pstmt.setLong(3, vo.getCategory_no() );
			
			//5. SQL 실행
			result  = pstmt.executeUpdate();
	
		}catch ( SQLException e ) {
			System.out.println( "error:" + e );
		} finally {
			try {
				//3. 자원정리
				if( pstmt != null ) {
					pstmt.close();
				}
				if( conn != null ) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result == 1;
	}
}
