package finalpackage.com;

public class FinalBlankStaticVariableClass {
	
	public static final int age;

	public void getAge() {
		System.out.println("Age :"+age);
		}

	static {
		age = 50;
	}

	public static void main(String[] args) {
	System.out.println(FinalBlankStaticVariableClass.age);	
	}

}
