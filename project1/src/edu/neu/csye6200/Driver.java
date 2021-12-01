/**
 * 
 */
package edu.neu.csye6200;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author pnakave
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		LocalDate now = LocalDate.now();
//	    LocalDate tenSecondsLater = now.plusDays(10);
//	    
//        Date date = new Date();
//        date.compareTo(date);
//	    long diff = ChronoUnit.DAYS.between(now, tenSecondsLater);
//	    System.out.println(diff);
		
		Date currentDate =new Date(System.currentTimeMillis());

		
		DateTimeFormatter f = DateTimeFormatter.ofPattern( "dd/MM/yyyy" );
		LocalDate start = LocalDate.parse( currentDate.toGMTString(), f );
		LocalDate stop = LocalDate.parse( "25/12/2010" , f );
		long diff = ChronoUnit.DAYS.between(start, stop);
		System.out.println(diff);
	}

}
