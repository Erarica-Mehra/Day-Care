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
public class Classroom {

	private List<Group> groups = new ArrayList<>();
	static int id = 0;
	private int idC = 0;
	
	public Classroom() {
		id++;
		idC = id;
	}
	
	public Classroom(List<Group> groups, int idC) {
		super();
		this.groups = groups;
		this.idC = idC;
	}
	
	public int getId() {
		return idC;
	}
	public void setGroups(Group g) {
		groups.add(g);
	}
	public List<Group> getGroups() {
		return this.groups;
	}
	
	@Override
	public String toString() {
		String temp="";
		for(int i=0;i<groups.size();i++) {
			temp = temp + " " +  groups.get(i).getTeacher().getFirstName();
		}	
		return temp;
	}
}
