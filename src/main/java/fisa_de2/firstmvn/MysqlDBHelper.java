package fisa_de2.firstmvn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class MysqlDBHelper {
	
	public static Collection<String> findOfficeCities() {
		
		Collection<String> result = new ArrayList<>();
		
	    String url = "jdbc:mysql://localhost:3306/test";
	    String username = "root";
	    String password = "password";
	    String query = "SELECT CITY FROM offices";		
		
		
		try(Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();) {		
		
		    // Execute the query
		    ResultSet rs = st.executeQuery(query);
		    
		    while (rs.next()) {
		    	
		    	result.add(rs.getString("CITY"));
		    }
		}
		catch(Exception e) {
			e.printStackTrace();
			
			result.clear();
		}
		
		return result;
	}

	public static String findOfficeCityById(int id) {
		
		String result = null;
		
	    String url = "jdbc:mysql://localhost:3306/test";
	    String username = "root";
	    String password = "password";
	    String query = "SELECT CITY FROM offices WHERE ID = ?";		
		
		
		try(Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(query);) {		
		
			st.setInt(1, id);
			
		    // Execute the query
		    ResultSet rs = st.executeQuery();
		    
		    while (rs.next()) {
		    	
		    	result = rs.getString("CITY");
		    }
		}
		catch(Exception e) {
			e.printStackTrace();
			
			result = null;
		}
		
		return result;
	}
}
