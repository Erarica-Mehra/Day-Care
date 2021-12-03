/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StudentService service = new StudentService();
		service.registerStudentFromCSV();
		service.registerTeacherFromCSV();
	}

}
