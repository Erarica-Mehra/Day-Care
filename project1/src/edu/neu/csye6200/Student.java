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
	private int parentId;

	

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	private Teacher teacher_assigned;
	// private Immunization immunization;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, LocalDate registrationDate, String address, int age, LocalDate dob, Parent parent,
			Teacher teacher_assigned) {
		super();
		this.studentId = studentId;
		this.registrationDate = registrationDate;
		this.address = address;
		this.age = age;
		this.dob = dob;
		this.parent = parent;
		this.teacher_assigned = teacher_assigned;
	}

	public Student(int studentId, String firstName, String lastName, LocalDate registrationDate, LocalDate dob, int age,
			String address, int parentId) {
		super(firstName, lastName);
		this.studentId = studentId;
		this.registrationDate = registrationDate;
		this.address = address;
		this.age = ConversionUtil.getAgeFromDOB(this.dob);
		this.parentId = parentId;
		this.dob = dob;
		this.age = age;
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
		this.parent = new Parent(Integer.parseInt(field[6]), field[7], field[8], field[9], new BigInteger(field[10]));
		this.age = ConversionUtil.getAgeFromDOB(this.dob);

		List<String> vaccinesString = new ArrayList<>();
		vaccinesString.add(field[10]);
		vaccinesString.add(field[11]);
		// TODO add remaining vaccines
		// TODO get immunization object
		// this.immunization = getVaccinationList(vaccinesString);

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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Teacher getTeacher_assigned() {
		return teacher_assigned;
	}

	public void setTeacher_assigned(Teacher teacher_assigned) {
		this.teacher_assigned = teacher_assigned;
	}

	@Override
	public String toString() {
		return this.firstName + " " + this.lastName;
	}

}
