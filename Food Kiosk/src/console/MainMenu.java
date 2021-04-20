package console;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import controller.DatabaseConnection;

public class MainMenu {
	
	// Declaration
	
	public static void main(String[] args) throws SQLException {
		
		// Object
		DatabaseConnection conn = new DatabaseConnection();
		
		// Query (SELECT ALL)
		String query = "SELECT * FROM itemproduct";
		
		/* Query (SELECT 1)
		String query = "SELECT * FROM itemproduct WHERE ItemProduct = 1";
		*/
		
		Statement st = conn.connection().createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while (rs.next()) {
			int id = rs.getInt("ItemProduct");
			String name = rs.getString("Name");
			double price = rs.getDouble("Price");
			
			System.out.println("ID: " + id);
			System.out.println("Name: " +name);
			System.out.println("Price: RM " +price);
			System.out.println("\n");
		}
		
		// Closing Database
		st.close(); 	// statement
		rs.close();		// resultSet
		conn.close();	// connection
	}
}
