/**
 * 
 */
package edu.neu.csye6200;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import edu.neu.csye6200.util.ConversionUtil;

/**
 * @author pnakave
 *
 */
public class Student extends Person {

	private int studentId;
	private LocalDate registrationDate;
	private String address;
	private int age;
	private LocalDate dob;
	private Parent parent;
	//private Immunization immunization;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, LocalDate registrationDate, String address, String phoneNumber, Parent parent) {
		super();
		this.studentId = studentId;
		this.registrationDate = registrationDate;
		this.address = address;
		this.age = ConversionUtil.getAgeFromDOB(this.dob);
		this.parent = parent;
	}

	public Student(String csvData) {
		super();
		String[] field = csvData.split(",");
		this.studentId = Integer.parseInt(field[0]);
		this.firstName = field[1];
		this.lastName = field[2];
		this.dob = ConversionUtil.StringToLocalDate(field[3]);
		this.registrationDate = ConversionUtil.StringToLocalDate(field[4]);
		this.address = field[5];
		this.parent = new Parent(field[6], field[7], field[8], new BigInteger(field[9]));
		this.age = ConversionUtil.getAgeFromDOB(this.dob);
		
		List<String> vaccinesString = new ArrayList<>();
		vaccinesString.add(field[10]);
		vaccinesString.add(field[11]);
		//TODO add remaining vaccines
		//TODO get immunization object
		//this.immunization = getVaccinationList(vaccinesString);
		

	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	@Override
	public String toString() {
		return this.firstName + " " + this.lastName;
	}

}
