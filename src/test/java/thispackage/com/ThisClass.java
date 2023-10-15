package thispackage.com;

import java.nio.channels.InterruptedByTimeoutException;

public class ThisClass {
	public int age;
	public String color;


	public ThisClass setValues(int age, String color) {
		System.out.println("<----------------------------------------------------------->");
		//this keyword is used to initialize the value
		this.age = age;
		this.color = color;
		
		//this keyword is used to call the method
		this.display();
		
		// this as a parameter
		display(this);
		
		// This as a return type
		return this;
	}
	
	public void f1() {
		System.out.println("Call f1");
	}
	
	public void display() {
		System.out.println("<----------------------------------------------------------->");
		System.out.println("Execution done");
     	System.out.println("Age : "+age);
		System.out.println("Color : "+color);
	}
	
	public void display(ThisClass obj) {
		System.out.println("<----------------------------------------------------------->");
		System.out.println("Age : "+obj.age);
		System.out.println("Color : "+obj.color);
		obj.f1();
	}
	
	public ThisClass() {
		// this can be used to call the constructor
		
		this(10);
		System.out.println("<----------------------------------------------------------->");
		System.out.println("This is default Constructor");
	}
	
	ThisClass(int p){
		System.out.println("<----------------------------------------------------------->");
		System.out.println("Value of P :"+p);
	}
	
	ThisClass(int p, String name){
		System.out.println("<----------------------------------------------------------->");
		System.out.println("Value of P :"+p);
		System.out.println("Value of name :"+name);
	}
	public static void main(String[] args) {
		// this is a keyword
		// Reference variable to current object
		
		// State and Behaviour
		ThisClass obj1 = new ThisClass();
		obj1.setValues(10, "Blue");
		//obj1.display();
		
		
		ThisClass obj2 = new ThisClass();
		obj2.setValues(100, "Red");
		//obj2.display();
		
		ThisClass obj3 = new ThisClass();
		obj3.setValues(1000, "Black");
		//obj3.display();
		
		ThisClass obj4 = new ThisClass();
		obj4 = obj3.setValues(1000, "Black");
		obj4.display();

	}

}
