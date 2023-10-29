package Interfacepackage.com;

public interface Interface1 {
	
	// public static final
	int i = 10;
	// cannot contains Instance field
	// 100% abstraction
	// By defaullt it is public and abstract
	void display();
	
	//static Method
	public static void display1() {
		System.out.println("Display 1");
	}

	// Default Method
	default void display2() {
		System.out.println("Display 2");
	}
	
	void Interface1();
	
}
