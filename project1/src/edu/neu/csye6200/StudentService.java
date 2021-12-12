package edu.neu.csye6200;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import edu.neu.csye6200.dao.StudentDaoImpl;
import edu.neu.csye6200.dao.TeacherDaoImpl;
import edu.neu.csye6200.util.FileUtil;

public class StudentService {

	// gives number of days for the next renewal ex: 40 days for the next renewal
	// call this method to check how many days left for annual registration renewal
	public long trackAnnualRegistrationRenewal(Student student) {
		LocalDate currentDate = LocalDate.now();
		long difference = ChronoUnit.DAYS.between(student.getRegistrationDate(), currentDate);
		return difference;
	}

	// register using csv
	public Student enrollStudentsFromCSV() throws Exception {
		List<String> studentCSVData = FileUtil.readTextFile("resources/students.txt");
		StudentDaoImpl impl = new StudentDaoImpl();
		Student student = null;
		for (String csvString : studentCSVData) {
			student = new Student(csvString);
			DayCare.getStudentsList().add(student);
			Parent parent = student.getParent();
			int parentId = impl.addParent(new Parent(parent.getParentId(), parent.getFirstName(), parent.getLastName(),
					parent.getEmail(), parent.getPhone()));
			student.setParentId(parentId);
			impl.addStudent(student);
		}
		return student;
	}

	// enroll Student
	public Student registerStudent(Student newStudent) throws Exception {
		StudentDaoImpl impl = new StudentDaoImpl();
		Parent parent = newStudent.getParent();
		int parentId = impl.addParent(new Parent(parent.getParentId(), parent.getFirstName(), parent.getLastName(), parent.getEmail(),
				parent.getPhone()));
		newStudent.setParentId(parentId);
		impl.addStudent(newStudent);
		return newStudent;
	}

	// update Immunization Record
	// get these value from UI
	// update dosesTaken by dosesTaken + 1, lastShotDate, nextShotDate, set
	// IsVaccinated to true if all doses given
	public void updateStudentImmunizationRecord(Vaccine vaccine) throws Exception {
		StudentDaoImpl impl = new StudentDaoImpl();
		impl.updateVaccineByStudentIdAndVaccineId(vaccine);
	}

	// get Student Record

	// add ratio rules from csv

	// get ratio rules

	public List<Vaccine> getStudentImmunizationRecord(int studentId) throws Exception {
		StudentDaoImpl impl = new StudentDaoImpl();
		List<Vaccine> vaccines = impl.getVaccinesByStudentId(studentId);
		return vaccines;
	}

	public List<Student> getAllStudents() throws Exception {
		StudentDaoImpl impl = new StudentDaoImpl();
		List<Student> students = impl.getAllStudents();
		return students;
	}

	public Student getStudentById(int studentId) throws Exception {
		StudentDaoImpl impl = new StudentDaoImpl();
		Student student = impl.getStudentById(studentId);
		return student;
	}

	public void deleteStudent(int studentId) throws Exception {
		StudentDaoImpl impl = new StudentDaoImpl();
		impl.deleteStudent(studentId);
	}

	public void updateStudent(Student student) throws Exception {
		StudentDaoImpl impl = new StudentDaoImpl();
		impl.updateStudent(student);
	}

}
