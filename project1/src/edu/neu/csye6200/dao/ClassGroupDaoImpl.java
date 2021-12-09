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
	private ResultSet resultSet = null;

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
		preparedStatement = connection.prepareStatement(
				"insert into daycare.studentGroup(group_id, group_size, students_enrolled ) values (default, ?,? )");
		preparedStatement.setInt(1, group.getGroupSize());
		preparedStatement.setInt(2, group.getStudentsEnrolled());
		preparedStatement.executeUpdate();
		System.out.println("Group created");
	}

	public void createClassroom(Classroom classroom) throws Exception {
		connection = getConnection();
		preparedStatement = connection.prepareStatement(
				"insert into daycare.classroom(class_id, no_of_groups, groups_enrolled ) values (default, ?,? )");
		preparedStatement.setInt(1, classroom.getGroupsAllowed());
		preparedStatement.setInt(2, classroom.getGroupsEnrolled());
		preparedStatement.executeUpdate();
		System.out.println("Classroom created");
	}

	public List<Classroom> getClassRooms() throws Exception {
		connection = getConnection();
		preparedStatement = connection.prepareStatement("select * from daycare.classroom ");
		resultSet = preparedStatement.executeQuery();
		return writeClassroomResultset(resultSet);
	}
	
//	public List<Classroom> getGroupsByClassRoom(int classId) throws Exception {
//		connection = getConnection();
//		preparedStatement = connection.prepareStatement(" select distinct(sg.group_id) from ClassroomGroupMapping cm "
//				+ "    join studentgroup sg on sg.group_id = cm.group_id where class_id = ?");
//		preparedStatement.setInt(1, classId);
//		resultSet = preparedStatement.executeQuery();
//		return writeClassroomResultset(resultSet);
//	}

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
	
	private List<Classroom> writeClassroomResultset(ResultSet resultSet) throws SQLException {
		Classroom classroom = null;
		List<Classroom> rooms = new ArrayList<>();
		while (resultSet.next()) {
			classroom = new Classroom(resultSet.getInt("class_id"), resultSet.getInt("no_of_groups"),
					resultSet.getInt("groups_enrolled"));
			rooms.add(classroom);
		}
		return rooms;
	}
	
//	private List<Group> writeGroupsResultset(ResultSet resultSet) throws SQLException {
//		List<Group> groups = new ArrayList<>();
//		while (resultSet.next()) {
//			int groupId = resultSet.getInt("distinct(group_id)");
//			Group group = getGroup(groupId);
//			groups.add(group)	;	
//		}
//		return groups;
//	}


}
