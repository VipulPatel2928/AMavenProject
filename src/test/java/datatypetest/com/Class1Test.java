package datatypetest.com;

public class Class1Test {

	public static void main(String[] args) {

		System.out.println("Hello, This is test class ");

		byte byteVar = 10;

		System.out.println("Byte Data Type :" + byteVar);

		short shortVar = 100;

		System.out.println("Short Data Type :" + shortVar);

		// Stores whole numbers from -2,147,483,648 to 2,147,483,647

		System.out.println(byteVar + shortVar);

		int intVar = 1000;

		System.out.println("Int Data Type :" + intVar);

		System.out.println(byteVar + shortVar + intVar);

		// Stores whole numbers from -9,223,372,036,854,775,808 to
		// 9,223,372,036,854,775,807

		long longVar = 10000;

		System.out.println("Long Data Type :" + longVar);

		System.out.println(byteVar + shortVar + intVar + longVar);

		// Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits

		float floatVar = 12.45678f;

		System.out.println("Float Data Type :" + floatVar);

		floatVar = 12.456789958f;

		System.out.println("Float Data Type :" + floatVar);

		double doubleVar = 12.456789958;

		System.out.println("Double Data Type :" + doubleVar);

		float f1 = 1.23456f;
		float f2 = 56.78965f;

		System.out.println("f1 :" + f1);
		System.out.println("f2 :" + f2);

		float multiF1F2 = f1 * f2;

		double dmultiF1F2 = f1 * f2;

		System.out.println("multiF1F2 :" + multiF1F2);
		System.out.println("dmultiF1F2 :" + dmultiF1F2);

		boolean booleanVar1 = true;

		boolean booleanVar2 = false;

		int age = 50;

		if (age >= 18) {
			System.out.println("Can Vote");
		} else
			System.out.println("Cann't Vote");
		
		char charVar = 'B';
		
		if(charVar=='A') {
			System.out.println("Character is A ");
		}
		else {
			System.out.println("Character is not A ");
		}
		
		
	}

}
