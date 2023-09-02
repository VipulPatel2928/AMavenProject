package javaVariables;

public class StaticVariable {
	// Instance Variable
	public static String bankNameString = "AXIS";
	public String branchNameString;
	public int branchCode;
	public float interestRate;
	public boolean primiumAccout;

	public StaticVariable(String bankNameString, String branchNameString, int branchCode, float interestRate,
			boolean primiumAccout) {
		this.bankNameString = bankNameString;
		this.branchNameString = branchNameString;
		this.branchCode = branchCode;
		this.interestRate = interestRate;
		this.primiumAccout = primiumAccout;
	}

	public StaticVariable() {
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
		StaticVariable obj1 = new StaticVariable("AXIS", "SURAT", 12345, 8.5f, true);
		obj1.display();
		System.out.println("<-------------------------------------------------------------------------------->");
		StaticVariable obj2 = new StaticVariable();
		obj2.display();
		System.out.println("<-------------------------------------------------------------------------------->");
		StaticVariable obj3 = new StaticVariable("HDFC", "MUMBAI", 54321, 5.8f, false);
		obj3.display();
		System.out.println("<-------------------------------------------------------------------------------->");
		
		System.out.println(obj1.bankNameString);
		System.out.println(obj2.bankNameString);
		System.out.println(obj3.bankNameString);
		
		System.out.println("<-------------------------------------------------------------------------------->");
		StaticVariable.bankNameString = "PNB";
		
		System.out.println(obj1.bankNameString);
		System.out.println(obj2.bankNameString);
		System.out.println(obj3.bankNameString);
	}
}
