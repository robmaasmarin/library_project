package my_package;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;

public class connectionCLass {
	//connect to database
	//source: https://www.youtube.com/watch?v=Bx966GqHgzg
	
	
	public static void main(String[] args) {
		
		Connection micon = null;
		
		
		try {
			micon = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/library?allowPublicKeyRetrieval=true&useSSL=false", "root", "1234");
			
			if (micon!=null) {
				System.out.println("CONNECTED");
				
				
			}
		} catch(Exception e) {System.out.println("NOT CONNECTED");}
		
		;
		
		
		
	}
	
}