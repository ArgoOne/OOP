package obi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
	
	public static void main (String[] args){
		
		Calendar c = new GregorianCalendar ();
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY");
		
	System.out.println(sdf.format(c.getTime()));
	
}
}
