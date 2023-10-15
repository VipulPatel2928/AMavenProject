package superpackage.com;

public class SubClass extends SuperClass{

	public SubClass() {
		// super keyword is used to call superclass constructor
		super();
		// super keyword is used to call superclass method
		super.display();
		// super keyword is used to get super class instance variable
		System.out.println("Super class variable :"+super.age);
		}
	public static void main(String[] args) {
	
		SubClass objClass = new SubClass();

	}

}
