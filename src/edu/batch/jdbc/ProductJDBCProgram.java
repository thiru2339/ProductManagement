package edu.batch.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.Driver;

public class ProductJDBCProgram {
	public static void main(String[] args) {
		
		try {
			//1. Register the driver
			Class.forName("org.postgresql.Driver"); //i. -First way to register the driver
			
			/*Driver d = new Driver();//ii. - 2nd way of registering the driver
			DriverManager.registerDriver(d); */
			
			//2. Create the connection
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/one_zero_four_db", "postgres", "postgres");
			
			
			//3. Create the statement
			Statement stmt = conn.createStatement();
			
			//4. Execute the query
			ResultSet rs = stmt.executeQuery("select id, name, brand , price from shp.product");
			
			//5. Parse the results
			while( rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getDouble(4));
			}
			
			
		//6. Close all the jdbc objects
			rs.close();
			stmt.close();
			conn.close();
			
		//7. Handle exception if any
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
