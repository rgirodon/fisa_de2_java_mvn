package fisa_de2.firstmvn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class AnotherDBHelper {
	
	public static Collection<String> findAuthorsByFNameLike(String fname) {
		
		Collection<String> result = new ArrayList<>();
		
	    String url = "jdbc:postgresql://localhost:5432/spark_labs";
	    String username = "postgres";
	    String password = "XXX";
	    String query = "SELECT NAME FROM CH02 WHERE UPPER(FNAME) LIKE ?";		
		
		
		try(Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(query);) {		
			
		    st.setString(1, fname.toUpperCase() + "%");
		
		    // Execute the query
		    ResultSet rs = st.executeQuery();
		    
		    while (rs.next()) {
		    	
		    	result.add(rs.getString("NAME"));
		    }
		}
		catch(Exception e) {
			e.printStackTrace();
			
			result.clear();
		}
		
		return result;
	}

}
