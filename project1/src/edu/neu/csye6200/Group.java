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
	
	public Group() {
		
	}
	
	public Group(Teacher teacher, List<Student> students, int groupSize) {
		super();
		this.teacher = teacher;
		this.students = students;
		this.groupSize = groupSize;
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
	
	
	//Added later
	public void addStudents(Student s) {
		students.add(s);
	}
	
	public void assignTeacher(Teacher t) {
		teacher = t;
	}
	
}
