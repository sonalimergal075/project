import java.sql.*;
import java.io.*;
public class Abc
{
	public static void main(String args[])
	{
		Connection con;
		Statement stmt;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/hospitaldb";
		String userName="root";
		String password="";

   		con=DriverManager.getConnection(url,userName,password);
		System.out.println("connected");
		String sql1="INSERT INTO logindb(username,password) VALUES(1,'sona')";
		stmt=con.createStatement();
		int r=stmt.executeUpdate(sql1);
		System.out.println("no.of rows affected"+r);

   		//rs=stmt.executeQuery("SELECT * FROM logindb");

		}catch(ClassNotFoundException e)
		{
		e.printStackTrace();
		}catch(SQLException e){e.printStackTrace();}
	}
}
		
	                  
 




     