package edu.neu.csye6200.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import edu.neu.csye6200.Parent;
import edu.neu.csye6200.Student;
import edu.neu.csye6200.Teacher;

public class StudentDaoImpl {

	private Connection connection = null;
	// private Statement statement = null;
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

	public void addParent(Parent parent) throws Exception {
		connection = getConnection();
		preparedStatement = connection.prepareStatement(
				"insert into daycare.Parent(parent_id, first_name, last_name, email, phone ) values (?, ?, ?, ?, ?)");
		preparedStatement.setInt(1, parent.getParentId());
		preparedStatement.setString(2, parent.getFirstName());
		preparedStatement.setString(3, parent.getLastName());
		preparedStatement.setString(4, parent.getEmail());
		preparedStatement.setInt(5, (parent.getPhone().intValue()));

		int updated = preparedStatement.executeUpdate();
		System.out.println("Parent : " + updated);
	}

	public void addStudent(Student student) throws Exception {
		connection = getConnection();
//		Parent parent = student.getParent();
//		addParent(new Parent(parent.getParentId(), parent.getFirstName(), parent.getLastName(), parent.getEmail(),
//				parent.getPhone()));
		preparedStatement = connection.prepareStatement(
				" insert into daycare.Student(student_id, first_name, last_name, address, dob, age, registration_date,teacher_assigned, parent_id) values (?,?,?,?,?,?,?,?,?)");
		preparedStatement.setInt(1, student.getStudentId());
		preparedStatement.setString(2, student.getFirstName());
		preparedStatement.setString(3, student.getLastName());
		preparedStatement.setString(4, student.getAddress());
		preparedStatement.setDate(5, Date.valueOf(student.getDob()));
		preparedStatement.setInt(6, student.getAge());
		preparedStatement.setDate(7, Date.valueOf(student.getRegistrationDate()));
		preparedStatement.setInt(8, 0);
		preparedStatement.setInt(9, student.getParentId());

		int updated = preparedStatement.executeUpdate();
		System.out.println("Student : " + updated);
	}

	public Student getStudentById(int studentId) throws Exception {
		connection = getConnection();
		preparedStatement = connection.prepareStatement("select * from daycare.student where studentId= ?");
		preparedStatement.setInt(1, studentId);
		resultSet = preparedStatement.executeQuery();
		return writeResultSet(resultSet).get(0);
	}

	private List<Student> writeResultSet(ResultSet resultSet) throws SQLException {
		Student student = null;
		List<Student> students = new ArrayList<>();
		while (resultSet.next()) {
			Date regDate = resultSet.getDate("registration_date");
			Date dob = resultSet.getDate("dob");

			student = new Student(resultSet.getInt("student_id"), resultSet.getString("first_name"),
					resultSet.getString("last_name"), regDate.toLocalDate(), dob.toLocalDate(), resultSet.getInt("age"),
					resultSet.getString("address"), resultSet.getInt("parent_id"));
//			System.out.println("FName: " + resultSet.getString("first_name"));
//			System.out.println("LName: " + resultSet.getString("last_name"));
//			System.out.println("Email: " + resultSet.getString("email"));
//			System.out.println("Date: " + resultSet.getDate("joining_date"));

			students.add(student);

		}
		return students;

	}

}
