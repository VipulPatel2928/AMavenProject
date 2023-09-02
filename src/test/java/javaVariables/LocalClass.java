package javaVariables;

public class LocalClass {

	public void display() {
		//Local Variable
		int i = 10;
		System.out.println("Display Method :"+i);
	}
	
	public LocalClass() {
		int i = 100;
		System.out.println("Default Constructor : "+i);
	}
	public static void main(String[] args) {
		//Local Variable
		// No Access modifier
		int i = 1;
        System.out.println("Main Method : "+i);
        
        LocalClass objClass = new LocalClass();
        objClass.display();
        int k = 10;
        if(k==10) {
        for(i= 5; i<=9;i++) {
        	System.out.println("For Loop :"+i);
        }}
        
        System.out.println("i value outside of For loop :"+i);
        
        //Local Variable , Local Variable must be initialization is must
        int p;
        // Remove the comment to see the compilation error
        //int sum = p + p;
        //System.out.println(p);
        
	}

}
