package datetimepackage;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeClass {

	public static String todayDate1() {
		Date date = new Date();
		System.out.println("Date and Time : " + date);
		SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dFormat.format(date);
	}

	public static String todayDate2() {
		Date date = new Date();
		System.out.println("Date and Time : " + date);
		SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
		return dFormat.format(date);
	}

	public static String todayDate(String formatorString) {
		Date date = new Date();
		System.out.println("Date and Time : " + date);
		SimpleDateFormat dFormat = new SimpleDateFormat("dd" + formatorString + "MM" + formatorString + "yyyy");
		return dFormat.format(date);
	}

	public static String futureDate(String formatorString, int plusValue, String dayMonthYear) {
		String expectedDateString = "";
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter
				.ofPattern(("dd" + formatorString + "MM" + formatorString + "yyyy"));
		System.out.println("Today's Date :" + dateTimeFormatter.format(localDate));

		if (dayMonthYear.equals("Days")) {
			expectedDateString = dateTimeFormatter.format(localDate.plusDays(plusValue));
		}
		else if (dayMonthYear.equals("Months")) {
			expectedDateString = dateTimeFormatter.format(localDate.plusMonths(plusValue));
		}
		else if (dayMonthYear.equals("Years")) {
			expectedDateString= dateTimeFormatter.format(localDate.plusYears(plusValue));
		}
		else {
			System.out.println("Your inoout doesn't match, Please check the parameters");
		}
		return expectedDateString;
	}
	
	public static String pastDate(String formatorString, int plusValue, String dayMonthYear) {
		String expectedDateString = "";
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter
				.ofPattern(("dd" + formatorString + "MM" + formatorString + "yyyy"));
		System.out.println("Today's Date :" + dateTimeFormatter.format(localDate));

		if (dayMonthYear.equals("Days")) {
			expectedDateString = dateTimeFormatter.format(localDate.minusDays(plusValue));
		}
		else if (dayMonthYear.equals("Months")) {
			expectedDateString = dateTimeFormatter.format(localDate.minusMonths(plusValue));
		}
		else if (dayMonthYear.equals("Years")) {
			expectedDateString= dateTimeFormatter.format(localDate.minusYears(plusValue));
		}
		else {
			System.out.println("Your inoout doesn't match, Please check the parameters");
		}
		return expectedDateString;
	}

	public static void main(String[] args) {
		
		int i = 46;
		int age = 46;
		int y = 46;
		int years = 46;
		float PI = 3.14f;

		Date date = new Date();

		System.out.println("Date and Time : " + date);

		SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Date and Time : " + date);

		System.out.println(dFormat.format(date));

		dFormat = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Date and Time : " + date);

		System.out.println(dFormat.format(date));

		dFormat = new SimpleDateFormat("MM/dd/yyyy");

		System.out.println("Date and Time : " + date);

		System.out.println(dFormat.format(date));

		dFormat = new SimpleDateFormat("MM-dd-yyyy");

		System.out.println("Date and Time : " + date);

		System.out.println(dFormat.format(date));

		dFormat = new SimpleDateFormat("MM-dd-yy");

		System.out.println("Date and Time : " + date);

		System.out.println(dFormat.format(date));

		dFormat = new SimpleDateFormat("MMM-dd-yyyy");

		System.out.println("Date and Time : " + date);

		System.out.println(dFormat.format(date));

		System.out.println("Function Call :" + todayDate1());

		System.out.println("Function Call with Formator :" + todayDate("-"));

		System.out.println("Function Call with Formator :" + todayDate("/"));

		dFormat = new SimpleDateFormat("MMM-dd-yyyy hh:mm:ss");

		System.out.println("Date and Time : " + date);

		System.out.println(dFormat.format(date));

		dFormat = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss");

		System.out.println("Date and Time : " + date);

		System.out.println(dFormat.format(date));

		System.out.println("<--------------------- Use of Loacl Date Class ----------------------------->");

		LocalDate localDate = LocalDate.now();

		System.out.println(localDate);

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Today's Date :" + dateTimeFormatter.format(localDate));

		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getMonthValue());
		System.out.println(localDate.getYear());

		System.out.println("Today's Date :" + dateTimeFormatter.format(localDate.plusDays(15)));
		System.out.println("Today's Date :" + dateTimeFormatter.format(localDate.plusMonths(1)));
		System.out.println("Today's Date :" + dateTimeFormatter.format(localDate.plusYears(1)));
		
		System.out.println("<--------------------- Future Date Function call ----------------------------->");
		System.out.println(futureDate("/", 12, "Months"));
		System.out.println(futureDate("-", 12, "Days"));
		System.out.println(futureDate("/", 12, "Years"));
		
		System.out.println("<--------------------- Past Date Function call ----------------------------->");
		System.out.println(pastDate("/", 12, "Months"));
		System.out.println(pastDate("-", 12, "Days"));
		System.out.println(pastDate("/", 12, "Years"));
	}
}
