package fisa_de2.firstmvn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class PGDBHelper {
	
	public static Collection<String> findUsernames() {
		
		Collection<String> result = new ArrayList<>();
		
	    String url = "jdbc:postgresql://localhost:5432/social_network_db";
	    String username = "postgres";
	    String password = "password";
	    String query = "SELECT username FROM accounts";		
		
		
		try(Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(query);) {		
		
		    // Execute the query
		    ResultSet rs = st.executeQuery();
		    
		    while (rs.next()) {
		    	
		    	result.add(rs.getString("username"));
		    }
		}
		catch(Exception e) {
			e.printStackTrace();
			
			result.clear();
		}
		
		return result;
	}
	
	public static String findUsernameById(int id) {
		
		String result = null;
		
	    String url = "jdbc:postgresql://localhost:5432/social_network_db";
	    String username = "postgres";
	    String password = "password";
	    String query = "SELECT username FROM accounts WHERE id = ?";		
		
		
		try(Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(query);) {	
			
			st.setInt(1, id);
		
		    // Execute the query
		    ResultSet rs = st.executeQuery();
		    
		    if (rs.next()) {
		    	
		    	result = rs.getString("username");
		    }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
