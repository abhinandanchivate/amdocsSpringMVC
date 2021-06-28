package com.amdocs.springmvcex.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class DBUtils {

	static final String DBURL="jdbc://mysql://localhost/empms";
	static final String userName="root";
	static final String password ="root";

	
	public Connection getConnection() {
		// 
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		try {
			connection = DriverManager.getConnection(DBURL);
//			// to establish the physical connection with DB.
//			preparedStatement = connection.prepareStatement(	);
//			preparedStatement.setString(1, x);
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) { // checked exception
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
