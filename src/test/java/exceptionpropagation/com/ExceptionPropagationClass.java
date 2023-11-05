package exceptionpropagation.com;

public class ExceptionPropagationClass {

	public void fun1() {
		System.out.println("Fun1");
		int a = 10/0;
		
	}
	
	public void fun2() {
		System.out.println("Fun2");
		fun1();
	}
	
	public void fun3() {
		try {
		System.out.println("Fun3");
		fun2();}
		catch(Exception e) {
			System.out.println("Exception Fun 3");
		}
		System.out.println("Fun3 after the exception");
	}
	
	public static void main(String[] args) {
		
		ExceptionPropagationClass objClass  = new ExceptionPropagationClass();
		objClass.fun3();
	}

}
