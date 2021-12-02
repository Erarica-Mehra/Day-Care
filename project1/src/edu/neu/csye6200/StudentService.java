package edu.neu.csye6200;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

import edu.neu.csye6200.util.FileUtil;

public class StudentService {

//	gives number of days for the next renewal ex: 40 days for the next renewal
	// call this method to check how many days left for annual registration renewal
	public long trackAnnualRegistrationRenewal(Student student) {
		LocalDate currentDate = LocalDate.now();
		long difference = ChronoUnit.DAYS.between(student.getRegistrationDate(), currentDate);
		return difference;
	}

	//register using csv
	public Student registerStudentFromCSV() {
		List<String> studentCSVData = FileUtil.readTextFile("resources/students.txt");
		//String[] s1 = {"erarica,mehra,01/02/2018,1001,10/10/2021,Boston,8572654722"};
		Student student = null;
		for (String csvString : studentCSVData) {
			student = new Student(csvString);
			DayCare.getStudentsList().add(student);
		}
		// TODO save
		return student;
	}


	public Teacher registerTeacherFromCSV() {
		List<String> teacherCSVData = FileUtil.readTextFile("resources/teachers.txt");
		//String[] s1 = {"erarica,mehra,01/02/2018,1001,10/10/2021,Boston,8572654722"};
		Teacher teacher = null;
		for (String csvString : teacherCSVData) {
			teacher = new Teacher(csvString);
			DayCare.getTeachersList().add(teacher);
		}
		// TODO save
		return teacher;

	}

}
