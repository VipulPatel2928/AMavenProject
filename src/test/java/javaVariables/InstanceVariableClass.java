package javaVariables;

import java.net.SocketOptions;

public class InstanceVariableClass {
	// Instance Variable
	public String bankNameString;
	public String branchNameString;
	public int branchCode;
	public float interestRate;
	public boolean primiumAccout;

	public InstanceVariableClass(String bankNameString, String branchNameString, int branchCode, float interestRate,
			boolean primiumAccout) {
		this.bankNameString = bankNameString;
		this.branchNameString = branchNameString;
		this.branchCode = branchCode;
		this.interestRate = interestRate;
		this.primiumAccout = primiumAccout;
	}

	public InstanceVariableClass() {
		System.out.println("Default Constructor");
	}

	public void display() {
    System.out.println("bankNameString : "+bankNameString);
    System.out.println("branchNameString :"+branchNameString);
    System.out.println("branchCode :"+branchCode);
    System.out.println("interestRate :"+interestRate);
    System.out.println("primiumAccout :"+primiumAccout);
	}

	
	public static void main(String[] args) {
		InstanceVariableClass obj1 = new InstanceVariableClass("AXIS", "SURAt", 12345, 8.5f, true);
		obj1.display();
		System.out.println("<-------------------------------------------------------------------------------->");
		InstanceVariableClass obj2 = new InstanceVariableClass();
		obj2.display();
		System.out.println("<-------------------------------------------------------------------------------->");
		InstanceVariableClass obj3 = new InstanceVariableClass("HDFC", "MUMBAI", 54321, 5.8f, false);
		obj3.display();
		System.out.println("<-------------------------------------------------------------------------------->");
		
		System.out.println(obj1.bankNameString);
	}

}
