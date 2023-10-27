package overLoadingPackage.com;

public class OverLoadingClass {

	// Overloading is also know as Early binding or Compile time polymorphism
	
	// Overloading can be achive in three ways
	
	// Type Promotion
	
	// byte , short, int , long , double, float
	// 10.00

	// 1. No of Arguments
	public void area() {
		System.out.println("No argument");
	}

	public void area(int i) {
		System.out.println("int argument :" + i);
	}

	// 2. No of arguments are same but data type is different
	public void calculateInterest(float f) {
		System.out.println("Float as parameter : " + f);
	}

	public void calculateInterest(String str) {
		System.out.println("String as Parameter :" + str);
	}

	
	//3. No of arguments are same and data type also same but order is different 
	public void fun1(int i, String str) {
		System.out.println("Int and String parameter "+i  +" "+str);
	}
	
	public void fun1(String str,int i) {
		System.out.println("String and Int parameter "+str+" "+i);
	}
	
	public void typePromotion(int i) {
		System.out.println("int :"+i);
	}
	
	public void typePromotion(long i) {
		System.out.println("long :"+i);
	}
	
	public void typePromotion(byte i) {
		System.out.println("byte :"+i);
	}
	
	
	public static void main(String[] args) {

		byte b = 10;
		OverLoadingClass objClass = new OverLoadingClass();
		objClass.area();
		objClass.area(10);
		objClass.calculateInterest(4.5f);
		objClass.calculateInterest("6.5");
		objClass.fun1(100, "Java");
		objClass.fun1("Programming", 500);
		objClass.typePromotion(b);
		
	}

}
