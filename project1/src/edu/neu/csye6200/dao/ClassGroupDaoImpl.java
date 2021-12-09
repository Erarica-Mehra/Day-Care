package edu.neu.csye6200.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.neu.csye6200.Classroom;
import edu.neu.csye6200.Group;

public class ClassGroupDaoImpl {
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;

	private Connection getConnection() throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost/daycare?" + "user=root&password=livehopper");
			return connection;

		} catch (Exception e) {
			throw e;
		}
	}
	
	public void createGroup(Group group) throws Exception {
		connection = getConnection();
		preparedStatement = connection.prepareStatement("insert into daycare.studentGroup(group_id, group_size, students_enrolled ) values (default, ?,? )");
		preparedStatement.setInt(1, group.getGroupSize());
		preparedStatement.setInt(2, group.getStudentsEnrolled());
		preparedStatement.executeUpdate();
		System.out.println("Group created");
	}
	
	
	public void createClassroom(Classroom classroom) throws Exception {
		connection = getConnection();
		preparedStatement = connection.prepareStatement("insert into daycare.classroom(class_id, no_of_groups, groups_enrolled ) values (default, ?,? )");
		preparedStatement.setInt(1, classroom.getGroupsAllowed());
		preparedStatement.setInt(2, classroom.getGroupsEnrolled());
		preparedStatement.executeUpdate();
		System.out.println("Classroom created");
	}
	
	public void assignClassroom(int studentId, int teacherId, int classId, int groupId) throws Exception {
		connection = getConnection();
		preparedStatement = connection.prepareStatement(
				"insert into daycare.ClassroomGroupMapping(class_group_id, classroom_id, group_id, student_id, teacher_id ) values"
				+ " (default, ?,?, ?,? )");
		preparedStatement.setInt(1, classId);
		preparedStatement.setInt(2, groupId);
		preparedStatement.setInt(3, studentId);
		preparedStatement.setInt(4, teacherId);
		preparedStatement.executeUpdate();
		System.out.println("Assigned Student to ClassRoom");
	}
	

}
