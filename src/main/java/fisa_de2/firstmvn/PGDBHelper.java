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
		
	    String url = "jdbc:postgresql://localhost:5432/postgres";
	    String username = "postgres";
	    String password = "password";
	    String query = "SELECT username FROM account";		
		
		
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

}
