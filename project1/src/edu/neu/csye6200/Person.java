/**
 * 
 */
package edu.neu.csye6200;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author pnakave
 *
 */
public abstract class Person {
	public static int id;
	public String firstName;
	public String lastName;
	public Date dob;
	
	public Person() {
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
}
