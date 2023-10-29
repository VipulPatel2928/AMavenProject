package Overridingpackage.com;

public class OverriddingClass1 {
   //Over riding is also know as Late binding or run time binding
	
	public void display() {
		System.out.println("Display method of OverriddingClass1");
	}
	// Covariant Type
	public OverriddingClass1 display1() {
		System.out.println("Display1 method of OverriddingClass1");
		return this;
	}
	public static void main(String[] args) {
		
	}
}
