package finalpackage.com;

public class FinalMethodClass2 extends FinalMethodClass1{
    //final method can't be override
	// but final method can be inherited
	// Remove the comment to see the compiler error
//	public void display() {
//		System.out.println("This is display method from FinalMethodClass2");
//	}
	
	public static void main(String[] args) {
		FinalMethodClass2 finalMethodClass1 = new FinalMethodClass2();
		finalMethodClass1.display();

	}
}
