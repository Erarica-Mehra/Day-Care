package edu.neu.csye6200.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import edu.neu.csye6200.Feedback;

public class FeedbackDaoImpl {
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
	
	
	public void addFeedback(Feedback feedback) throws Exception {
		connection = getConnection();
		preparedStatement = connection.prepareStatement(" insert into daycare.Feedback(feedback_id, employee_id, rating, review, last_feedback_date, next_feedback_date) values "
				+ " (default, ?, ?, ?, ?, ?)");
		preparedStatement.setInt(1, feedback.getEmployeeId());
		preparedStatement.setDouble(2, feedback.getRating());
		preparedStatement.setString(3, feedback.getReview());
		preparedStatement.setDate(4, Date.valueOf(feedback.getLastFeedBackDate()));
		preparedStatement.setDate(5, Date.valueOf(feedback.getNextFeedbackDate()));
		preparedStatement.executeUpdate();
		System.out.println("Feedback Given");
		
	}

}
