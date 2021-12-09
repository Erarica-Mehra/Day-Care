package edu.neu.csye6200.scheduler;

/**
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import edu.neu.csye6200.Classroom;
import edu.neu.csye6200.ClassroomFactory;
import edu.neu.csye6200.DayCare;
import edu.neu.csye6200.Group;
import edu.neu.csye6200.GroupFactory;
import edu.neu.csye6200.Student;
import edu.neu.csye6200.Teacher;
import edu.neu.csye6200.dao.ClassGroupDaoImpl;
import edu.neu.csye6200.util.FileUtil;

/**
 * @author pratiknakave
 *
 */
public class GroupHelper {

	static int currentTeacherIndexFlag = 0;
	static String studentfile = "students.csv";
	static String teachersfile = "teachers.csv";
	static List<Student> students = new ArrayList<>();
	static List<Teacher> teachers = new ArrayList<>();

	public static void groupMe() {

		students.clear();
		teachers.clear();
		List<String> tempStudents = FileUtil.readTextFile(studentfile);
		tempStudents.forEach(student -> students.add(new Student(student)));

		List<String> tempTeachers = FileUtil.readTextFile(teachersfile);
		tempTeachers.forEach(teacher -> teachers.add(new Teacher(teacher)));

		List<Student> sixToTwelve = students.stream().filter(student -> student.getAge() >= 6 && student.getAge() <= 12)
				.collect(Collectors.toList());

		List<Student> thirteenToTwentyfour = students.stream()
				.filter(student -> student.getAge() >= 13 && student.getAge() <= 24).collect(Collectors.toList());

		List<Student> twentyfiveToThirtyFive = students.stream()
				.filter(student -> student.getAge() >= 25 && student.getAge() <= 35).collect(Collectors.toList());

		List<Student> thirtySixToFortySeven = students.stream()
				.filter(student -> student.getAge() >= 36 && student.getAge() <= 47).collect(Collectors.toList());

		List<Student> fortyEightToFiftyNine = students.stream()
				.filter(student -> student.getAge() >= 48 && student.getAge() <= 59).collect(Collectors.toList());
		List<Student> sixtyAndUp = students.stream().filter(student -> student.getAge() >= 60)
				.collect(Collectors.toList());
		
		List<List<Student>> studentAgeGroups = new ArrayList<>();

		studentAgeGroups.add(sixToTwelve);
		studentAgeGroups.add(thirteenToTwentyfour);
		studentAgeGroups.add(twentyfiveToThirtyFive);
		studentAgeGroups.add(thirtySixToFortySeven);
		studentAgeGroups.add(fortyEightToFiftyNine);
		studentAgeGroups.add(sixtyAndUp);

		ListIterator<List<Student>> li = studentAgeGroups.listIterator();
		while (li.hasNext()) {
			List<Student> s = li.next();
			if (s.size() == 0) {
				li.remove();
			}
		}

		for (List<Student> s : studentAgeGroups) {
			System.out.println(s);
		}

		int flag = 0;
		while (flag < studentAgeGroups.size()) {
			//Hardcoding size and class size parameters from rules-ratio.
			if (flag == 0) {
				System.out.println("calling 6-12");
				parseAndAdd(studentAgeGroups.get(flag), 4, 3);
			} else if (flag == 1) {
				System.out.println("calling 13-24");
				parseAndAdd(studentAgeGroups.get(flag), 5, 3);
			} else if (flag == 2) {
				System.out.println("calling 25-35");
				studentAgeGroups.get(flag);
				parseAndAdd(studentAgeGroups.get(flag), 6, 3);
			} else if (flag == 3) {
				System.out.println("calling 36-47");
				parseAndAdd(studentAgeGroups.get(flag), 8, 3);
			} else if (flag == 4) {
				System.out.println("calling 48-59");
				parseAndAdd(studentAgeGroups.get(flag), 12, 2);
			} else if (flag == 5) {
				System.out.println("calling 60+");
				parseAndAdd(studentAgeGroups.get(flag), 15, 2);
			}
			flag = flag + 1;
		}
		parseAddTeacher(teachers, DayCare.getClassroom());

	}

	public static void parseAndAdd(List<Student> studs, int size, int classSize) {
		System.out.println("i am  in parseaddstud");
		System.out.println(studs);
		System.out.println("Class Size: "+size);
		int numGroups = 0;
		if (studs.size() % size == 0) {
			numGroups = studs.size() / size;

		} else {
			numGroups = studs.size() / size + 1;
		}
		List<Group> groups = new ArrayList<>();
		int temp = 0;
		for (int i = 0; i < numGroups; i++) {
			groups.add(GroupFactory.getInstance().getObject());
			for (int j = 0; j < size; j++) {
				if ((temp + j) < studs.size()) {
					groups.get(i).addStudents(studs.get(temp + j));
				}
			}
			temp = temp + size;
		}

		
		List<Classroom> classes = new ArrayList<>();
		int tempC = 0;
		int numClassrooms = 0;
		if (groups.size() % classSize == 0) {
			numClassrooms = groups.size() / classSize;
		} else {
			numClassrooms = groups.size() / classSize + 1;
		}

		System.out.println("Number of Classrooms: "+ numClassrooms);
		System.out.println("Group SIze: "+groups.size());
		for (int i = 0; i < numClassrooms; i++) {
			classes.add(ClassroomFactory.getInstance().getObject());
			for (int j = 0; j < classSize; j++) {
				if ((tempC + j) < groups.size()) {
					classes.get(i).setGroups(groups.get(tempC + j));
				}
			}
			tempC = tempC + classSize;
		}

		classes.forEach(c -> DayCare.addClassroom(c));
	}

	public static void parseAddTeacher(List<Teacher> t, List<Classroom> c) {
		int currTF = 0;
		for (Classroom cl : c) {
			for (Group g : cl.getGroups()) {
				g.assignTeacher(t.get(currTF));
				System.out.println("In parseAddTeacher : Assigning teacher to a group");
				//System.out.println(g.toString());
				System.out.println(t.get(currTF));
				currTF = currTF + 1;
				if (currTF == t.size()) {
					currTF = 0;
				}
				//TODO call assignGroups here. (To be discussed)
			}
		}

	}
	
	public void assignGroups(Student student, Teacher teacher) throws Exception {
		ClassGroupDaoImpl dao = new ClassGroupDaoImpl();

		Group group = new Group(3,0); //TODO create group here
		dao.createGroup(group); //ex: group size is 3 and currently student enrolled is 0
		group.getStudents().add(student); // adding student to group
		List<Classroom> availableClassrooms = dao.getClassRooms().stream().filter(cls -> cls.getGroupsAllowed() < cls.getGroupsEnrolled()).collect(Collectors.toList()); // get classroom. classroom should already be created. Just get the classroom
		Classroom roomAllocated = availableClassrooms.get(0);
		roomAllocated.getGroups().add(group);// adding group to classroom
		dao.assignClassroom(student.getStudentId(), teacher.getEmployeeId(), roomAllocated.getClassId(), group.getGroupId());
	}

}
