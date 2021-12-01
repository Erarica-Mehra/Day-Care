/**
 * 
 */
package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import edu.neu.csye6200.util.ConversionUtil;

/**
 * @author pnakave
 *
 */
public class Student extends Person {

	private int studentId;
	private Date registrationDate;
	private String address;
	private String phoneNumber;
	private int age;
	// private List<AbstractImmunization> immunisations = new ArrayList<>(); - by
	// factory impl
	private Parent parent;
//	private List<LocalDate> immunisationDates = new ArrayList<>();
//	private LocalDate annualRegistrationDate;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, Date registrationDate, String address, String phoneNumber, Parent parent) {
		super();
		this.studentId = studentId;
		this.registrationDate = registrationDate;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.age = ConversionUtil.DateToAge(this.dob);
		this.parent = parent;

//		Calendar c = Calendar.getInstance();
//		c.setTime(this.registrationDate);
//		c.add(c.WEEK_OF_YEAR, 51);
//		this.annualRegistrationDate = c.;

	}

	public Student(String csvData) {
		super();
		String[] field = csvData.split(",");
		this.firstName = field[0];
		this.lastName = field[1];
		this.dob = ConversionUtil.StringToDate(field[2]);
		this.studentId = ConversionUtil.StringToInt(field[3]);
		this.registrationDate = ConversionUtil.StringToDate(field[4]);
		this.address = field[5];
		this.phoneNumber = field[6];
//		this.parent = field[7];
		//TODO figure out parent object from csv
		this.age = ConversionUtil.DateToAge(this.dob);
		Calendar c = Calendar.getInstance();
		c.setTime(this.registrationDate);
		c.add(c.YEAR, 1);
		//this.annualRegistrationDate = c.getTime();
		//int flag = 0;
		List<Date> hepatitisB = new ArrayList<>();
		List<Date> DTaP = new ArrayList<>();
		
		for (int i = 9; i < 23; i++) {
			System.out.println(field[i]);
			if (field[i].contentEquals("0")) {

			} else {
				if (i >= 9 && i < 12) {
					hepatitisB.add(ConversionUtil.StringToDate(field[i]));
				}
				if (i >= 12 && i < 16) {
					DTaP.add(ConversionUtil.StringToDate(field[i]));
				}
			}

		}

	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}


	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

//	public List<Date> getImmunisationDates() {
//		return immunisationDates;
//	}
//
//	public void setImmunisationDates(List<Date> immunisationDates) {
//		this.immunisationDates = immunisationDates;
//	}
//
//	public Date getAnnualRegistrationDate() {
//		return annualRegistrationDate;
//	}
//
//	public void setAnnualRegistrationDate(Date annualRegistrationDate) {
//		this.annualRegistrationDate = annualRegistrationDate;
//	}
	
	@Override
	public String toString() {
		return this.firstName + " " + this.lastName;
	}

}
