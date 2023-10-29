package Interfacepackage.com;

public class InterfaceClass1 implements Interface1, Interface2{
  //Multiple Inheritence
	
	@Override
	public void display() {
		// Cannot instantiated
		//Interface1 obInterface1 = new Interface1();
	}

	@Override
	public void Interface1() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
		InterfaceClass1 obClass1 = new InterfaceClass1();
		System.out.println("Value :"+obClass1.i);
		// remove the comment to see the compile error
		//obClass1.i = 500;
	}

	
}
