package wrapperclasstest.com;

import java.sql.Driver;
import java.sql.Wrapper;
import java.util.PrimitiveIterator;

import javax.sql.rowset.WebRowSet;

public class WrpperClassPractice {
	
	public static Integer toConvertStringToInt(String str) {
		return Integer.valueOf(str);
	}
	
	public static String toConvertIntToString(int var) {
		return String.valueOf(var);
	}

	//Declare once and use many times [Function call can be many times]
	// Reusability of the code
	// Easy maintenance
	public static double areaOfACircle(double radius){
		double area;
		area = 3.15 * (radius * radius);
		return area;
	}
	public WrpperClassPractice() {
		System.out.println("Default constructor call");
	}
	public static void main(String[] args) {

		WrpperClassPractice objClassPractice = new WrpperClassPractice();
		
		// There are eight primitive data types and there are eight wrapper classes
		// byte - Byte
		// short - Short
		// int - Integer
		// long - Long
		// float - Float
		// double - Double
		// boolean - Boolean
		// char - Character

		// Primitive to Wrapper
		// Autoboxing
		int age = 60;
		Integer age1 = age; // Autoboxing implicitly
		Integer age3 = Integer.valueOf(age);
		Integer age2 = Integer.valueOf(age);
		String str1 = "4.99"; // Non - Primitive
		String str2 = "5.99";
		System.out.println(str1 + str2);
		// Not-Primitive to Wrapper
		System.out.println(Float.valueOf(str1) + Float.valueOf(str2));

		str1 = "4"; // Non - Primitive
		str2 = "5";
		System.out.println(str1 + str2);
		// Not-Primitive to Wrapper to Primitive
		int sum = Integer.valueOf(str1) + Integer.valueOf(str2);
		System.out.println(sum);
		
		//Unboxing
		// Wrapper to primitive
		Integer var1 = 20;
		Integer var2 = new Integer(20);
		System.out.println(var1);
		System.out.println(var2);
		int var3 = var1;
		System.out.println(var3);
		int var4 = var2.intValue();
		System.out.println(var4);
		
		String var5 = "20";
		int var6 = 20;
		
	    if(toConvertStringToInt(var5)==var6) {
	    	System.out.println("Both values are equal");
	    }
	    System.out.println(WrpperClassPractice.areaOfACircle(2.2));
	    
	    System.out.println(WrpperClassPractice.areaOfACircle(5.5));  
	}
}
