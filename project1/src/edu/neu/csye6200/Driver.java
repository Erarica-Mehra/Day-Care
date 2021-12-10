/**
 * 
 */
package edu.neu.csye6200;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @author pnakave
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String home = System.getProperty("user.home");
		//File file = new File(home+"/Downloads/students.txt");
		
		Path originalPath = Paths.get("resources/students.txt");
	    Path copied = Paths.get(home+"/Downloads/students.txt");
	    try {
			Files.copy(originalPath, copied, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
