package fisa_de2.firstmvn;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.apache.commons.io.FileUtils;


/**
 * Hello world!
 *
 */
public class App 
{
	/*
    private static final String FILENAME = "demo_file.txt";
	*/
	
	public static void main( String[] args ) {
				
		/*
        System.out.println( "Creating file with commons io..." );
        
        try {
			FileUtils.touch(new File(FILENAME));
		} 
        catch (IOException e) {
			
			System.err.println("Error while creating file");
		}
        
        System.out.println( "File created with commons io !" );
        */
		
		/*
		String name = DBHelper.findStudentNameById(1);
		
		if (name != null) {
			
			System.out.println("Student found for id 1 : " + name);
		}
		else {
			System.out.println("No student found for id 1");
		}
		
		name = DBHelper.findStudentNameById(3);
		
		if (name != null) {
			
			System.out.println("Student found for id 3 : " + name);
		}
		else {
			System.out.println("No student found for id 3");
		}
		*/
		
		/*
		Collection<String> authors = AnotherDBHelper.findAuthorsByFNameLike("P");
		
		for (String author : authors) {
			System.out.println("Author found : " + author);
		}
		*/
		
		
		Collection<String> cities = MysqlDBHelper.findOfficeCities();
		
		for (String city : cities) {
			System.out.println("City found : " + city);
		}
		
		String city = MysqlDBHelper.findOfficeCityById(2);
		System.out.println("City 2 : " + city);
		
		/*
		Collection<String> usernames = PGDBHelper.findUsernames();
		
		for (String username : usernames) {
			System.out.println("User found : " + username);
		}
		*/
    }
}
