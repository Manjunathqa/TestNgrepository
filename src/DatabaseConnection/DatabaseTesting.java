package DatabaseConnection;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DatabaseTesting {
	
	//Commands:
	//Driver - Com.mysql.jdbc.Driver
	//Connection String
	//jdbc:"mysql://hostname:port/dbname","Username","Password"
	
	@test
	public void testDB()
	{
		Class.forName("Com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		java.sql.Connection con=DriverManager.getConnection("mysql://hostname:port/dbname","root","Selenium");
		System.out.println("connected to my sql db");
		
		java.sql.Statement  smt=con.createStatement();
		ResultSet rs=smt.executeQuery("Select * from Seleniumuser");
		while(rs.next())
		{
			String firstname=rs.getString("firstname");//Database fields
			System.out.println("Database record is"+firstname);
			String emailaddress=rs.getString("email");
			System.out.println("DataBase record is"+emailaddress);
			
		}
		
	}
	

}
