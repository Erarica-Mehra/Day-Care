/**
 * 
 */
package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pnakave
 *
 */



public class Group {

	private Teacher teacher;
	private List<Student> students = new ArrayList<>();
	private int groupSize;
	private int studentsEnrolled;


	public Group(int groupSize, int studentsEnrolled) {
		this.groupSize = groupSize;
		this.studentsEnrolled = studentsEnrolled;
	}
	
	public Group(Teacher teacher, List<Student> students, int groupSize) {
		super();
		this.teacher = teacher;
		this.students = students;
		this.groupSize = groupSize;
		this.studentsEnrolled = students.size();
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public int getGroupSize() {
		return groupSize;
	}
	public void setGroupSize(int groupSize) {
		this.groupSize = groupSize;
	}
	
	
	public int getStudentsEnrolled() {
		return studentsEnrolled;
	}

	public void setStudentsEnrolled(int studentsEnrolled) {
		this.studentsEnrolled = studentsEnrolled;
	}
	//Added later
	public void addStudents(Student s) {
		students.add(s);
	}
	
	public void assignTeacher(Teacher t) {
		teacher = t;
	}
	
}
