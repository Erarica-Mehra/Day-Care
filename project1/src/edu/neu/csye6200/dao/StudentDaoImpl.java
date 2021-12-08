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
import edu.neu.csye6200.Vaccine;

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
		
		List<Vaccine> vaccines = student.getImmunizationRecord();
		vaccines.stream().forEach(vaccine -> {
			try {
				addStudentVaccinationRecord(vaccine);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Student getStudentById(int studentId) throws Exception {
		connection = getConnection();
		preparedStatement = connection.prepareStatement("select * from daycare.student where student_id= ?");
		preparedStatement.setInt(1, studentId);
		resultSet = preparedStatement.executeQuery();
		return writeStudentResultSet(resultSet).get(0);
	}
	
	public List<Student> getAllStudents() throws Exception {
		connection = getConnection();
		preparedStatement = connection.prepareStatement("select * from daycare.student");
		resultSet = preparedStatement.executeQuery();
		return writeStudentResultSet(resultSet);
	}

	public void addStudentVaccinationRecord(Vaccine vaccine) throws Exception {
		connection = getConnection();
		preparedStatement = connection.prepareStatement(
				" insert into daycare.Vaccine (vaccine_id, name, doses_taken, total_doses,  doses_taken_dates, last_shot_date, upcoming_shot_date, student_id, is_vaccinated) "
						+ "    values (default, ?, ?,?,?,?,?,?,?)");
		preparedStatement.setString(1, vaccine.getName());
		preparedStatement.setInt(2, vaccine.getDosestaken());
		preparedStatement.setInt(3, vaccine.getTotalDoses());
		preparedStatement.setString(4, vaccine.getVaccinationRecord().toString());
		preparedStatement.setDate(5, Date.valueOf(vaccine.getLastShotDate()));
		preparedStatement.setDate(6, Date.valueOf(vaccine.getNextShotDate()));
		preparedStatement.setInt(7, vaccine.getStudentId());
		preparedStatement.setBoolean(8, vaccine.isVaccinated());

		int updated = preparedStatement.executeUpdate();
		System.out.println("Vaccine : " + updated);
	}
	
	

	public List<Vaccine> getVaccinesByStudentId(int studentId) throws Exception {
		connection = getConnection();
		preparedStatement = connection.prepareStatement("select * from daycare.vaccine where student_id=?");
		preparedStatement.setInt(1, studentId);
		resultSet = preparedStatement.executeQuery();
		return writeVaccineResultSet(resultSet);
	}
	
	private List<Student> writeStudentResultSet(ResultSet resultSet) throws SQLException {
		Student student = null;
		List<Student> students = new ArrayList<>();
		while (resultSet.next()) {
			Date regDate = resultSet.getDate("registration_date");
			Date dob = resultSet.getDate("dob");
			student = new Student(resultSet.getInt("student_id"), resultSet.getString("first_name"),
					resultSet.getString("last_name"), regDate.toLocalDate(), dob.toLocalDate(), resultSet.getInt("age"),
					resultSet.getString("address"), resultSet.getInt("parent_id"));
			students.add(student);
		}
		return students;
	}
	
	private List<Vaccine> writeVaccineResultSet(ResultSet resultSet) throws SQLException {
		Vaccine vaccine = null;
		List<Vaccine> vaccines = new ArrayList<>();
		while (resultSet.next()) {
			Date lastShotDate = resultSet.getDate("last_shot_date");
			Date upcomingShotDate = resultSet.getDate("upcoming_shot_date");
			// TODO change this to List<LocalDate>
			String dates = resultSet.getString("doses_taken_dates");
			vaccine = new Vaccine(resultSet.getInt("vaccine_id"), resultSet.getString("name"), resultSet.getInt("doses_taken"),
					resultSet.getInt("total_doses"), lastShotDate.toLocalDate(), upcomingShotDate.toLocalDate(),
					resultSet.getInt("student_id"), resultSet.getBoolean("is_vaccinated"), null);
			vaccines.add(vaccine);
		}
		return vaccines;

	}


}
