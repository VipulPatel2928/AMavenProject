package abstractPachakge.com;

public abstract class AbstractClass1 {
	
	int i = 100;
     //Abstract Class can achive 0 to 100 % abstraction
	 // Interface 100%
	 // Abstract class can have abstract method, but not necessarly Abstract class can have the abstract mwethod
	  // If one method is abstract then class is automatically abstract
	public abstract void display();
	
	//Default
	void display3() {
		System.out.println("This is deafult method 3");
	}
	
	public AbstractClass1(int i) {
		System.out.println("Default AbstractClass1 Constructor");
	}
	
	//static
	public static void staticMethod1() {
		System.out.println("This is staticMethod1");
	}
	
	//static final Method
	public static final void staticFinalMethod1() {
		System.out.println("This is staticFinalMethod1");
	}
	
	
	public void display1() {
		System.out.println("Display 1");
	}
	
	public static void main(String[] args) {
		// Abstract class cannot instantiated
		// Remove the comment to see the compile error
		//
		//AbstractClass1 objAbstractClass1 = new AbstractClass1(10);
		//Anonymous
		AbstractClass1 objAbstractClass1 = new AbstractClass1(10) {
			
			@Override
			public void display() {
				// TODO Auto-generated method stub
				
			}
		};
		staticMethod1();
		AbstractClass1.staticMethod1();
		AbstractClass1.staticFinalMethod1();
		
		objAbstractClass1.display3();
	}
}
