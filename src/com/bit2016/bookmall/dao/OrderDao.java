package com.bit2016.bookmall.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OrderDao {
	
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
}
