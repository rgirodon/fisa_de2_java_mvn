package fisa_de2.firstmvn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHelper {
	
	public static String findStudentNameById(int id) {
		
		String result = null;
		
		Connection con = null;
		
		PreparedStatement st = null;
		
		try {
			// String driverClassName = "org.h2.Driver";
		    String url = "jdbc:h2:tcp://localhost/./test";
		    String username = "sa";
		    String password = "password";
		    String query = "SELECT NAME FROM STUDENTS WHERE ID = ?";
		
		    // Load driver class
		    // Class.forName(driverClassName);
		
		    // Obtain a connection
		    con = DriverManager.getConnection(url, username, password);
		
		    // Obtain a statement
		    st = con.prepareStatement(query);		    
		    
		    st.setInt(1, id);
		
		    // Execute the query
		    ResultSet rs = st.executeQuery();
		    
		    if (rs.next()) {
		    	
		    	result = rs.getString("NAME");
		    }
		}
		catch(Exception e) {
			e.printStackTrace();
			
			result = null;
		}
		finally {
			if (st != null) {
				try {
					st.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} 
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return result;
	}

}
