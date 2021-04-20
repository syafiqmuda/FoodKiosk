/**
 * Connection to database
 * this is my global .java file (able to use to other)
 * @author syafiqmuda
 *
 */

package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	// Object
	Connection conn;
	
	public Connection connection() {
 
    	try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/kioskappdb_dev","root", "");
			System.out.println("Database is connected !");
		}
		
		catch(Exception e)
		{
			System.out.print("Unable to connect with DB - Error:" + e);
		} 
    	
    	return conn;
	}
	
	public void close() {
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/kioskappdb_dev","root", "");
			conn.close();
			System.out.println("Database are close !");
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
