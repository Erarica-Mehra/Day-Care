/**
 * 
 */
package edu.neu.csye6200;

/**
 * @author pnakave
 *
 */

public abstract class AbstractPersonFactory {

	public abstract Person getObject(String csvData);
	
	public abstract Person getObject();
}
