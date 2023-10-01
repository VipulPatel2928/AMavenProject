package trycatchfinallypackage.com;

public class TryCatchFinallyClass {

	public static void main(String[] args) {
		int a = 100;
		int b = 0;
		int c = 50;

		// Case 1
		System.out.println("Case 1 <---------------------------------------------------------------------->");
		// try and Catch with Exception Class
		try {
			c = a / b;
		} catch (Exception e) {
			System.out.println("Exception message for the User : " + e);
			System.out.println("Any number can't be divide by zero");
			e.printStackTrace();
		}
		System.out.println("Value of c : " + c);
		System.out.println("Value of C is calculated");

		// Case 2 try catch , using actual exception class
		System.out.println("Case 2 <---------------------------------------------------------------------->");
		String[] carStrings = { "Maruti", "Tata", "Mahindra" };
		try {
			System.out.println("Name of Car company :" + carStrings[0]);

			System.out.println("Name of Car company :" + carStrings[3]);

			System.out.println("Name of Car company :" + carStrings[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out
					.println("ArrayIndexOutOfBoundsException, Usrer is accessing array value for not available index");
		}

		System.out.println("Array element print operation is done");

		// Case 3 try with more than one catch blocks, using actual exception class
		System.out.println("Case 3 <---------------------------------------------------------------------->");
		try {
			System.out.println("Name of Car company :" + carStrings[0]);

			System.out.println("Name of Car company :" + carStrings[3]);

			c = a / b;
			System.out.println("Name of Car company :" + carStrings[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out
					.println("ArrayIndexOutOfBoundsException, Usrer is accessing array value for not available index");
		} catch (ArithmeticException e) {
			System.out.println("Exception message for the User : " + e);
			System.out.println("Any number can't be divide by zero");
		} catch (Exception e) {
			System.out.println("Exception class called");
		}

		System.out.println("Array element print operation is done");

		// Case 4 try with more than one catch blocks than need to follow the sequence,
		// using actual exception class
		System.out.println("Case 4 <---------------------------------------------------------------------->");
		try {
			System.out.println("Name of Car company :" + carStrings[0]);

			System.out.println("Name of Car company :" + carStrings[3]);

			c = a / b;
			System.out.println("Name of Car company :" + carStrings[1]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out
					.println("ArrayIndexOutOfBoundsException, Usrer is accessing array value for not available index");
		} catch (Exception e) {
			System.out.println("Exception class called");
		} 
		// Remove the comment line to see the unreachable exception
//		catch (ArithmeticException e) {
//			System.out.println("Exception message for the User : " + e);
//			System.out.println("Any number can't be divide by zero");
//		}

		System.out.println("Array element print operation is done");
		
		// Case 5 try with finally, But Excpetion is not handled so user will get the exception
		System.out.println("Case 5 <---------------------------------------------------------------------->");
		try {
			c = a / b;
		} finally {
			System.out.println("This is finally block");
		}

		System.out.println("Case 5 completion");
		
		
		// Case 6 try with catch finally
		System.out.println("Case 6 <---------------------------------------------------------------------->");
		try {
			c = a / b;
		} 
		catch(Exception e) {
			System.out.println("Exception message for the User : ");
			System.out.println("Any number can't be divide by zero");
		}
		finally {
			System.out.println("This is finally block");
		}
		
		System.out.println("Case 6 completion");
		
	}
}
