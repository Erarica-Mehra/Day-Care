package edu.neu.csye6200.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * @author pratiknakave
 *
 */
public class ValidationUtil {

	//Used to validate fName, lName, paretName
	public static boolean verifyName(String name)
	{
	    name = name.trim();					//trimming leading spaces

	    if(name == null || name.equals(""))	//not null/empty
	        return false;

	    if(!name.matches("[a-zA-Z]*"))		//all alphabets
	        return false;

	    return true;
	}
	
	public static boolean verifyEmail(String email)
	{
	    email = email.trim();

	    if(email == null || email.equals(""))
	        return false;

	    if(!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"))
	        return false;

	    return true;
	}
	
	public static boolean isValidPhoneNumber(String s) {
        String regex = "\\d{3}-\\d{3}-\\d{4}"; // XXX-XXX-XXXX
        return s.matches(regex);
    }
	
	public boolean isValid(String dateStr) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate.parse(dateStr, formatter);
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }
}
