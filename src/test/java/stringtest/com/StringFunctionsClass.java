package stringtest.com;

public class StringFunctionsClass {

	public static void main(String[] args) {
		String str = "Java Programming";

		System.out.println(str.length());

		System.out.println(str.toLowerCase());

		System.out.println(str.toUpperCase());

		if (str.equals("java programming"))
			System.out.println("both are equal");
		else
			System.out.println("both are not equal");

		if (str.equalsIgnoreCase("java programming"))
			System.out.println("both are equal");
		else
			System.out.println("both are not equal");

		if (str.toLowerCase().equals("java programming"))
			System.out.println("both are equal");
		else
			System.out.println("both are not equal");

		// double quote and backslash

		String str2 = "I am \"Indian\"";
		System.out.println(str2);

		String str3 = "\\Surat\\ is nice city";
		System.out.println(str3);

		System.out.println(System.getProperty("user.dir"));

		float pi = 3.14f;
		String str4 = "3.14";

		System.out.println(pi + str4);

		String str5 = "Java a Programming Programming";
		System.out.println(str5.indexOf("Programming"));
		System.out.println(str5.indexOf('a'));

		System.out.println(str5.substring(6));

		System.out.println(str5.substring(6, 15));

		System.out.println(str5.substring(6, str5.length()));

		String str6 = "Java a Programming Programming";

		String[] str7 = str6.split(" ");

		for (String string : str7) {
			System.out.println(string);
		}

		String str8 = "31/12/2000";

		String[] str9 = str8.split("/");

		for (String string : str9) {
			System.out.println(string);
		}

		String str10 = "Java a Programming Programming";
		System.out.println(str10.contains("programming"));
		System.out.println(str10.contains("Programming"));
		
		
		String str11 = "Java-a-Programming-Programming";
		System.out.println(str11.replaceAll("-", "/"));
		
	}
}
