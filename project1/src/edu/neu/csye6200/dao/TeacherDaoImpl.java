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

import edu.neu.csye6200.Teacher;

public class TeacherDaoImpl {

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

	// TODO add and update teacher reviews

	public Teacher getTeacherById(int employeeId) throws Exception {
		connection = getConnection();
		preparedStatement = connection.prepareStatement("select * from daycare.teacher where employee_id= ?");
		preparedStatement.setInt(1, employeeId);
		resultSet = preparedStatement.executeQuery();
		return writeResultSet(resultSet).get(0);
	}

	public List<Teacher> getAllTeachers() throws Exception {
		connection = getConnection();
		preparedStatement = connection.prepareStatement("select * from daycare.teacher");
		resultSet = preparedStatement.executeQuery();
		return writeResultSet(resultSet);
	}
	
	public void addTeacher(Teacher teacher) throws Exception {
		connection = getConnection();
		preparedStatement = connection
                .prepareStatement("insert into  daycare.teacher(employee_id, first_name, last_name,email, joining_date, annual_review_date, avg_rating) values (default, ?, ?, ?, ? ,?,?)");
        preparedStatement.setString(1, teacher.getFirstName());
        preparedStatement.setString(2, teacher.getLastName());
        preparedStatement.setString(3, teacher.getEmailID());
        preparedStatement.setDate(4, Date.valueOf(teacher.getJoiningDate()));
        preparedStatement.setDate(5,  Date.valueOf(teacher.getAnnualReviewDate()));
        preparedStatement.setInt(6, 0);

        int updated = preparedStatement.executeUpdate();		
        System.out.println(updated);
	}

	private List<Teacher> writeResultSet(ResultSet resultSet) throws SQLException {
		Teacher teacher = null;
		List<Teacher> teachers = new ArrayList<>();
		while (resultSet.next()) {
			Date date = resultSet.getDate("joining_date");

			teacher = new Teacher(resultSet.getInt("employee_id"), resultSet.getString("first_name"),
					resultSet.getString("last_name"), resultSet.getString("email"), date.toLocalDate());
//			System.out.println("FName: " + resultSet.getString("first_name"));
//			System.out.println("LName: " + resultSet.getString("last_name"));
//			System.out.println("Email: " + resultSet.getString("email"));
//			System.out.println("Date: " + resultSet.getDate("joining_date"));

			teachers.add(teacher);

		}
		return teachers;

	}

}
