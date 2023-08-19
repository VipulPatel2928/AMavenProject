package stringtest.com;

public class StringAsObjectAndinDoubleQuote {

	public static void main(String[] args) {
		
		// String is immutable
		
		String pString = "//button[text()=\" Add \"]";
		
		String proggramingLanguageName1 = "Java";
		String proggramingLanguageName2 = "Java";
		
		if(proggramingLanguageName1==proggramingLanguageName2) {
			System.out.println("Both string are equal");
		}
		else {
			System.out.println("Both string are not equal");
		}
		
		if(proggramingLanguageName1.equals(proggramingLanguageName2)) {
			System.out.println("Both string are equal");
		}
		else {
			System.out.println("Both string are not equal");
		}
		
		String proggramingLanguageName3 = new String("JavaProgramming");
		String proggramingLanguageName4 = new String("JavaProgramming");
		
		if(proggramingLanguageName3==proggramingLanguageName4) {
			System.out.println("Both string are equal");
		}
		else {
			System.out.println("Both string are not equal");
		}
		
		if(proggramingLanguageName3.equals(proggramingLanguageName4)) {
			System.out.println("Both string are equal");
		}
		else {
			System.out.println("Both string are not equal");
		}
		
		System.out.println(proggramingLanguageName1.concat("Session"));
		System.out.println(proggramingLanguageName1);

	}

}
