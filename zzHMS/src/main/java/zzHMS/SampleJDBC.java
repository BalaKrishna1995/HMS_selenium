package zzHMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SampleJDBC 
{
	public static void main(String[] args) throws SQLException 
	{
		String url = "jdbc:mysql://localhost:3306/CarDekho";
		String un = "root";
		String psw = "Vicky@1234";
		
		Connection conn = DriverManager.getConnection(url, un, psw);
		Statement state = conn.createStatement();
		ResultSet result = state.executeQuery("select* from facebook1;");
		
		while (result.next()) 
		{
			String username = result.getString("UN");
			String pw = result.getString("PSW");
			
			System.out.println(username+" "+pw);
			System.out.println("Enough");
			
			System.out.println("Testing");
			
			
			
			System.out.println("LOOOOO");
		}		
		
	}
}
