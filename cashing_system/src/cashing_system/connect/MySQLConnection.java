package cashing_system.connect;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class MySQLConnection {
	
		public static Connection getConnection() {
			
			
			Connection con = null;
			try {
				String driver = "com.mysql.cj.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/cashing_system?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
				String user = "bouslama_amir";
				String password = "!Raed@bouslama1995";
				
				Class.forName(driver);
				con = DriverManager.getConnection(url , user , password);
				
				
				
			}
			catch(ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			return con;
		}
	}


