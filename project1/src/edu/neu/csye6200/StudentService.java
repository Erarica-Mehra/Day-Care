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
			impl.addParent(new Parent(parent.getParentId(), parent.getFirstName(), parent.getLastName(), parent.getEmail(),
					parent.getPhone()));
			student.setParentId(parent.getParentId());
			impl.addStudent(student);
			
		}

		return student;
	}

	public void registerTeacherFromCSV() throws Exception {
		List<String> teacherCSVData = FileUtil.readTextFile("resources/teachers.txt");
		Teacher teacher = null;
		TeacherDaoImpl impl = new TeacherDaoImpl();
		for (String csvString : teacherCSVData) {
			teacher = new Teacher(csvString);
			DayCare.getTeachersList().add(teacher);
			impl.addTeacher(teacher);
		}
	}

	public Teacher registerTeacher(Teacher teacher) throws Exception {
		TeacherDaoImpl impl = new TeacherDaoImpl();
		DayCare.getTeachersList().add(teacher);
		impl.addTeacher(teacher);
		return teacher;
	}

	// enroll Student

	// update Immunization Record

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
	
	//TODO
	public List<Vaccine> updateStudentImmunizationRecord(int studentId) throws Exception {
		return null;
	}
	

}
