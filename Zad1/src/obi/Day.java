package obi;

	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.util.GregorianCalendar;
	import java.util.Scanner;

	public class Day {
	   
	   public static void main(String[] args) {    
		   
		   Scanner in = new Scanner (System.in);
			System.out.println("Podaj date w formacie dd.MM.YYYY");
			System.out.println("Podaj dzien: ");
			int d = (int) Double.parseDouble(in.next());
			System.out.println("Podaj miesiac: ");
			int m = (int) Double.parseDouble(in.next());
			System.out.println("Podaj rok: ");
			int r = (int) Double.parseDouble(in.next());
		   
	      Calendar calendar = GregorianCalendar.getInstance();
	      calendar.set(Calendar.YEAR, r);
	      calendar.set(Calendar.MONTH, m);
	      calendar.set(Calendar.DAY_OF_MONTH, d);
	      
	      String[] daysOfTheWeek = new String[] {"Sr", "Czw", "Pt", "Sob", "Ndz", "Pon", "Wt" };
	      
	      Calendar calendar1 = new GregorianCalendar(r, m, d);
	      System.out.println("Dzien tygodnia to: " + daysOfTheWeek[calendar1.get(Calendar.DAY_OF_WEEK)]);
	     
	      calendar.set(Calendar.YEAR, r++);
	      Calendar calendar2 = new GregorianCalendar(r, m, d);
	      System.out.println("Dzien tygodnia za rok to: " + daysOfTheWeek[calendar2.get(Calendar.DAY_OF_WEEK)]);
	      
	   } 
	}

