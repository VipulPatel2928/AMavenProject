package enumpackage;

public class EnumClass {

	public enum Day {
		SUN, MON, TUE, WED, THU, FRI, SAT
	};

	public enum Season {
		WINTER, SPRING, SUMMER, FALL
	};

	public static void main(String[] args) {

		System.out.println(Day.THU);

		System.out.println(Season.SUMMER);

		System.out.println("<--------------------------------------------------------------->");

		for (Season season : Season.values()) {
			System.out.println(season);
		}

		System.out.println("<--------------------------------------------------------------->");

		for (Day day : Day.values()) {
			System.out.println(day);
		}

		System.out.println("<--------------------------------------------------------------->");
		System.out.println(Day.valueOf("MON"));

		System.out.println(Season.valueOf("SUMMER"));

		System.out.println("<--------------------------------------------------------------->");
		System.out.println(Day.valueOf("MON").ordinal());

		System.out.println(Season.valueOf("SUMMER").ordinal());
	}

}
