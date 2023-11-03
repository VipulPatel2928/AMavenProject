package privateConstructorpackage.com;

public class PrivateConstructorClass2 {

	public static void main(String[] args) {
		// remove the comment to see the compile error
		//PrivateConstructorClass1 objClass1 = new PrivateConstructorClass1();
		
		PrivateConstructorClass1 obj=PrivateConstructorClass1.objectMethod(100, "Vipul");
		obj.display();
		
		PrivateConstructorClass1 obj1=PrivateConstructorClass1.objectMethod(1000, "Vipul Patel");
		obj1.display();
		
		obj.display();
	}
}
