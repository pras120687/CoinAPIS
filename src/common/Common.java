package common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Common {
	
	public static long getapochstamp() throws ParseException{
		
		
		SimpleDateFormat df = new SimpleDateFormat("MMM dd yyyy HH:mm:ss.SSS zzz");
		Date date = new Date();
		long epoch = date.getTime();
		return epoch;
		
	}
	
	public static Date getfutureapochstamp(){
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		// get a calendar instance, which defaults to "now"
	    Calendar calendar = Calendar.getInstance();
	    
	    // get a date to represent "today"
	    Date today = calendar.getTime();
	    System.out.println("today:    " + today);
	 
	    // add one day to the date/calendar
	    calendar.add(Calendar.DAY_OF_YEAR, 1);
	    String date1 = df.format(calendar);
	    // now get "tomorrow"
	    Date epoch = calendar.getTime();
	    return epoch;
	}

}
