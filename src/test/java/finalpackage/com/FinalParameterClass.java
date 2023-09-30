package finalpackage.com;

public class FinalParameterClass {
	
	public void setAge(final int age) {
		System.out.println(age);
		// age is final variable and can't re initialization.
		// Remove the comment ot see the compiler error
		//age = 50;
		int age1 = age + 10;
		System.out.println(age1);
	}

	public static void main(String[] args) {
		FinalParameterClass objeFinalVariableClass = new FinalParameterClass();
		objeFinalVariableClass.setAge(10);
	}
}
