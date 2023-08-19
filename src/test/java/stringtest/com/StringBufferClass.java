package stringtest.com;

public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Java"); // Mutable length = 4, indexing value 0,1,2,3
		System.out.println(str1);
	    str1.append(" Java");
		System.out.println(str1);
		str1.insert(1, "null");
		System.out.println(str1);
		str1.replace(1, 3, "replace");
		System.out.println(str1);
		str1.delete(1, 3);
		System.out.println(str1);
		System.out.println(str1.reverse());
		
		int number = 1234;
		
		StringBuilder nbr1 = new StringBuilder(String.valueOf(number));
		
		System.out.println(nbr1.reverse());
		
		System.out.println("Hello");
		
		long startTime = System.currentTimeMillis();

		for (int i = 1; i <=100000 ; i++) {
			str1.append(" Java");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total Execution time : "+(endTime - startTime));
		
	}
}
