package Overridingpackage.com;

public class OverriddingClass2 extends OverriddingClass1{
  public String nameString;
	@Override
	public void display() {
		System.out.println("Display method of OverriddingClass2");
	}
	
	// Covariant Type
	@Override
	public OverriddingClass2 display1() {
		System.out.println("Display1 method of OverriddingClass2");
		return this;
	}
	
	public static void main(String[] args) {
		// child - child
		OverriddingClass2 obClass2 = new OverriddingClass2();
		obClass2.display();
		
		// parent -parent
		OverriddingClass1 objClass1 = new OverriddingClass1();
		objClass1.display();
		
		
		// parent - child
		// Object Reference Variable of Base Class, Instance creation of Derived class
		OverriddingClass1 obClass3 = new OverriddingClass2();
		obClass3.display();

	}
	
	public static void main() {
		// child - child
		OverriddingClass2 obClass2 = new OverriddingClass2();
		obClass2.display();
		
		// parent -parent
		OverriddingClass1 objClass1 = new OverriddingClass1();
		objClass1.display();
		
		
		// parent - child
		// Object Reference Variable of Base Class, Instance creation of Derived class
		OverriddingClass1 obClass3 = new OverriddingClass2();
		obClass3.display();

	}

	
	public static void main(String args) {
		// child - child
		OverriddingClass2 obClass2 = new OverriddingClass2();
		obClass2.display();
		
		// parent -parent
		OverriddingClass1 objClass1 = new OverriddingClass1();
		objClass1.display();
		
		
		// parent - child
		// Object Reference Variable of Base Class, Instance creation of Derived class
		OverriddingClass1 obClass3 = new OverriddingClass2();
		obClass3.display();

	}


}
