package edu.neu.csye6200;

/**
 * 
 */

import java.util.ArrayList;
import java.util.List;

import edu.neu.csye6200.scheduler.GroupHelper;


/**
 * @author pratiknakave
 *
 */
public class DayCare {

	private static List<Classroom> classList = new ArrayList<>();

	public static void addClassroom(Classroom c) {
		classList.add(c);
	}

	public static void show() {
		classList.forEach(c -> {
			System.out.println();
			System.out.println(c);
		});
	}

	public static List<Classroom> getClassroom() {
		return classList;
	}

	public static void demo() {

		GroupHelper.groupMe();
		// Schedular goes here
	}
}

