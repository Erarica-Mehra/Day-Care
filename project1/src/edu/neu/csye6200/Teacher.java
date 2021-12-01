/**
 * 
 */
package edu.neu.csye6200;

import java.util.Calendar;
import java.util.Date;

import edu.neu.csye6200.util.ConversionUtil;

/**
 * @author pnakave
 *
 */
public class Teacher extends Person {

	private int employeeId;
	private Date joiningDate;
	private Date annualReviewDate;
	private String emailID;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int employeeId, Date joiningDate) {
		super();
		this.employeeId = employeeId;
		this.joiningDate = joiningDate;
		Calendar c = Calendar.getInstance();
		c.setTime(this.joiningDate);
		c.add(c.WEEK_OF_YEAR, 51);
		this.annualReviewDate = c.getTime();
	}

	public Teacher(String csvData) {
		super();
		String[] field = csvData.split(",");
		this.firstName = field[0];
		this.lastName = field[1];
		this.dob = ConversionUtil.StringToDate(field[2]);
		this.employeeId = ConversionUtil.StringToInt(field[3]);
		this.joiningDate = ConversionUtil.StringToDate(field[4]);
		this.emailID = field[5];
		Calendar c = Calendar.getInstance();
		c.setTime(this.joiningDate);
		c.add(c.YEAR, 1);
		this.annualReviewDate = c.getTime();
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public Date getAnnualReviewDate() {
		return annualReviewDate;
	}

	public void setAnnualReviewDate(Date annualReviewDate) {
		this.annualReviewDate = annualReviewDate;
	}

	@Override
	public String toString() {
		return this.firstName + " " + this.lastName;
	}
}
