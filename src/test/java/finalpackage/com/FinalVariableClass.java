package finalpackage.com;

public class FinalVariableClass {
	// Final variable value can't get change
	public final int age = 20;

	public void getAge() {
		System.out.println("Age :"+age);
	}

	public void setAge(int age) {
		// Remove the comment to see the coimpiler error
		//this.age = age;
	}

	public static void main(String[] args) {
		FinalVariableClass objeFinalVariableClass = new FinalVariableClass();
		objeFinalVariableClass.setAge(10);
		objeFinalVariableClass.getAge();
		
		
	}

}
