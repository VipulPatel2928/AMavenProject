package privateConstructorpackage.com;

public class PrivateConstructorClass1 {
    public int age;
    public String nameString;
	private static PrivateConstructorClass1 objClass2 = null;
	
	private PrivateConstructorClass1() {
		System.out.println("PrivateConstructorClass1 Default constrctor");
	}
	
	public static PrivateConstructorClass1 objectMethod(int age,String nameString ) {
		
		if(objClass2==null) {
		objClass2 = new PrivateConstructorClass1();
		objClass2.age = age;
		objClass2.nameString = nameString;}
		else {
			System.out.println("Object is already created");
		}
		
		return objClass2;
	}
	
	public void display() {
		System.out.println("Age :"+age);
		System.out.println("Name :"+nameString);
	}
	
	public static void main(String[] args) {
		
		PrivateConstructorClass1 objClass1 = new PrivateConstructorClass1();
		
	}

}
