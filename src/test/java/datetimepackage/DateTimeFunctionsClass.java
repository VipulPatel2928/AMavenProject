package datetimepackage;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFunctionsClass {

	// MM/dd/yyyy
	// dd/MM/yyyy
	// MM-dd-yyyy
	// dd-MM-yyyy

	public static String todayDate(String formatStr) {
		Date date = new Date();
		if (formatStr.equals("MM/dd/yyyy") || formatStr.equals("dd/MM/yyyy") || formatStr.equals("MM-dd-yyyy")
				|| formatStr.equals("dd-MM-yyyy")) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatStr);
			return simpleDateFormat.format(date);
		} else
			return "Date format not matched";
	}

	public static String futureDate(String formatStr, String dayMonthYear, int futurePlus) {
		LocalDate date = LocalDate.now();
		String todayDateString = "";
		if (formatStr.equals("MM/dd/yyyy") || formatStr.equals("dd/MM/yyyy") || formatStr.equals("MM-dd-yyyy") || formatStr.equals("dd-MM-yyyy")) {
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formatStr);
			if(dayMonthYear.equals("Days")) {
				todayDateString = dateTimeFormatter.format(date.plusDays(futurePlus));
			}
			else if(dayMonthYear.equals("Months")) {
				todayDateString = dateTimeFormatter.format(date.plusMonths(futurePlus));
			}
			else if(dayMonthYear.equals("Years")) {
				todayDateString = dateTimeFormatter.format(date.plusYears(futurePlus));
			}
			else
			{
				todayDateString = "Days Months and Years doesn't mathced";
				System.out.println("Days Months and Years doesn't mathced");
			}
			
			return todayDateString;
		} else
			return "Date format not matched";
	}

	
	public static String pastDate(String formatStr, String dayMonthYear, int futurePlus) {
		LocalDate date = LocalDate.now();
		String todayDateString = "";
		if (formatStr.equals("MM/dd/yyyy") || formatStr.equals("dd/MM/yyyy") || formatStr.equals("MM-dd-yyyy") || formatStr.equals("dd-MM-yyyy")) {
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formatStr);
			if(dayMonthYear.equals("Days")) {
				todayDateString = dateTimeFormatter.format(date.minusDays(futurePlus));
			}
			else if(dayMonthYear.equals("Months")) {
				todayDateString = dateTimeFormatter.format(date.minusMonths(futurePlus));
			}
			else if(dayMonthYear.equals("Years")) {
				todayDateString = dateTimeFormatter.format(date.minusYears(futurePlus));
			}
			else
			{
				todayDateString = "Days Months and Years doesn't mathced";
				System.out.println("Days Months and Years doesn't mathced");
			}
			
			return todayDateString;
		} else
			return "Date format not matched";
	}
	

	public static void main(String[] args) {
		// Date Picker need to enter today date, future date, past date
		Date date = new Date();
		System.out.println("date vlaue :" + date);

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println(simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("dd-MMMMMMMMM-yyyy");
		System.out.println(simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("dd/MMM/yyyy");
		System.out.println(simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
		System.out.println(simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("dd MM yyyy");
		System.out.println(simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("E, dd MM yyyy");
		System.out.println(simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(simpleDateFormat.format(date));

		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh mm ss");
		System.out.println(simpleDateFormat.format(date));

		System.out.println("<--------------------------------------------------------------------------->");
		String todayDateString = todayDate("MM/dd/yy");

		System.out.println(todayDateString);

		System.out.println("<--------------------------------------------------------------------------->");
		LocalDate date2 = LocalDate.now();
		System.out.println("Today date without format :" + date2);

		System.out.println(date2.getYear());
		System.out.println(date2.getMonthValue());
		System.out.println(date2.getDayOfMonth());

		System.out.println(date2.plusDays(15));
		System.out.println(date2.plusMonths(15));
		System.out.println(date2.plusYears(15));
		System.out.println("<--------------------------------------------------------------------------->");
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println(dateTimeFormatter.format(date2.plusDays(15)));
		System.out.println(dateTimeFormatter.format(date2.plusMonths(15)));
		System.out.println(dateTimeFormatter.format(date2.plusYears(15)));
		System.out.println("<--------------------------------------------------------------------------->");
		System.out.println(dateTimeFormatter.format(date2.minusDays(15)));
		System.out.println(dateTimeFormatter.format(date2.minusMonths(15)));
		System.out.println(dateTimeFormatter.format(date2.minusYears(15)));
		System.out.println("<--------------------------------------------------------------------------->");
		System.out.println(futureDate("dd-MM-yyyy", "Days" , 2));
		System.out.println(futureDate("dd/MM/yyyy", "Months" , 2));
		System.out.println(futureDate("dd/MM/yyyy", "Years" , 2));
		System.out.println("<--------------------------------------------------------------------------->");
		System.out.println(pastDate("dd-MM-yyyy", "Days" , 2));
		System.out.println(pastDate("dd/MM/yyyy", "Months" , 2));
		System.out.println(pastDate("dd/MM/yyyy", "Years" , 2));
	}
}
