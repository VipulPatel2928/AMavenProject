package abstractPachakge.com;

import superpackage.com.SuperClass;

public class AbstractClass2 extends AbstractClass1 {
 
	@Override
	public void display() {
    System.out.println("Display");
	}

	public void display1() {
		System.out.println("Display 1");
	}

	public void display2() {
		System.out.println("Display 2");
	}
	
	public AbstractClass2() {
		super(10);
		System.out.println(super.i);
		super.i = 500;
		System.out.println(super.i);
		System.out.println("Default AbstractClass2 Constructor");
	}

	public static void main(String[] args) {
		AbstractClass2 objAbstractClass2 = new AbstractClass2();
		objAbstractClass2.display();
		objAbstractClass2.display1();
		objAbstractClass2.display2();
		objAbstractClass2.display3();

	}

}
