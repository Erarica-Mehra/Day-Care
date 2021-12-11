package edu.neu.csye6200;

import java.util.List;

import edu.neu.csye6200.dao.TeacherDaoImpl;
import edu.neu.csye6200.util.FileUtil;

public class TeacherService {
	
	public Teacher registerTeacher(Teacher teacher) throws Exception {
		TeacherDaoImpl impl = new TeacherDaoImpl();
		DayCare.getTeachersList().add(teacher);
		impl.addTeacher(teacher);
		return teacher;
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

}
