package JavaEssentialTraining;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class datesAndTimes {
	
	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);

		GregorianCalendar gc = new GregorianCalendar(2009, 1, 28);
		gc.add(GregorianCalendar.DATE, 1);
		Date d2 = gc.getTime();
		System.out.println(d2);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(d2));
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDate ld = LocalDate.of(2009, 1, 28);
		System.out.println(ld);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyy");
		System.out.println(dtf.format(ld));
	}
}
