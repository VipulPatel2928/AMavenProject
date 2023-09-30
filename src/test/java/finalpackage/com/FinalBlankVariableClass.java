package finalpackage.com;

public class FinalBlankVariableClass {
	
	public final int age;

	public void getAge() {
		System.out.println("Age :"+age);
		}

	public FinalBlankVariableClass(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		FinalBlankVariableClass objeFinalVariableClass = new FinalBlankVariableClass(50);
		objeFinalVariableClass.getAge();
		
		FinalBlankVariableClass objeFinalVariableClass1 = new FinalBlankVariableClass(100);
		objeFinalVariableClass1.getAge();
	}
}
