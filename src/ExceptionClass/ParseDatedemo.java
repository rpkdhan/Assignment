package ExceptionClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseDatedemo {

	public static void main(String[] args) {
		Date d = new Date();
		parseDateToString(d);
		String date = "2020-02-12";
		System.out.println(date);
		parseStringToDate(date);
		
	}// changing date to string
	public static void parseDateToString (Date date) {
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:ss a MM/dd/yyy");
		String d = sdf.format(date);
		System.out.println(d);
		
	}// changing string into date
	public static void parseStringToDate(String d) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = sdf.parse(d);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		}
		//example of throws
		public static void parseStringToDate1 (String d) throws ParseException{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date;
			
				date = sdf.parse(d);
				System.out.println(date);
			
		
	}

}
