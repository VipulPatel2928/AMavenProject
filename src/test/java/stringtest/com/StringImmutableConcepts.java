package stringtest.com;

public class StringImmutableConcepts {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "Java";
		
		if(str1==str2) {
			System.out.println("Both String are equal");
		}
		else {
			System.out.println("Both String are not equal");
		}
		
		System.out.println(str1.concat(" Programming"));
		
		if(str1==str2) {
			System.out.println("Both String are equal");
		}
		else {
			System.out.println("Both String are not equal");
		}
		
		long startTime = System.currentTimeMillis();
		String str3 = "Java";
		for (int i = 1; i <=100000 ; i++) {
			str3 = str3 + " Java";
			//System.out.println(str3);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total Execution time : "+(endTime - startTime));
	}
}
