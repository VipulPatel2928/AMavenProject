package throwpackage.com;

public class ThrowClass {
	
	public void ageVerification(int age) throws ThrowClassCustomException, ArithmeticException, ArrayIndexOutOfBoundsException {
		if(age > 18) {
			System.out.println("No Exception");
		}
		else {
			throw new ThrowClassCustomException();
			//Remove the comment to see the compile error
			//throw new ThrowClassCustomException();
		}
	}

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, ArithmeticException, ThrowClassCustomException {
		ThrowClass objClass  = new ThrowClass();
		
		//objClass.ageVerification(17);
		
		try {
			objClass.ageVerification(17);
		} catch (ThrowClassCustomException e) {
			e.printStackTrace();
		}

		System.out.println("This is end of program!!!");
	}

}
