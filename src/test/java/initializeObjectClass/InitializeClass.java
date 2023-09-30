package initializeObjectClass;

public class InitializeClass {
	// Instance variables
    int id;
    String nameString;
    String addressString;
    
    public void initializeValuesMethod(int id, String nameString , String addressString) {
    	this.id = id;
    	this.nameString = nameString;
    	this.addressString = addressString;
    }
   
    public InitializeClass(int id, String nameString , String addressString) {
    	this.id = id;
    	this.nameString = nameString;
    	this.addressString = addressString;
	}
    
    public InitializeClass() {
		System.out.println("Default constructor");
	}
    
	public static void main(String[] args) {
		InitializeClass initializeClass = new InitializeClass();
		System.out.println(initializeClass.id);
		System.out.println(initializeClass.nameString);
		System.out.println(initializeClass.addressString);
		
		System.out.println("<--------------------------------------------------------------------------->");
		// 1. By Reference Variable
		initializeClass.id = 15;
		initializeClass.nameString = "Vipul";
		initializeClass.addressString = "Althan";
		System.out.println(initializeClass.id);
		System.out.println(initializeClass.nameString);
		System.out.println(initializeClass.addressString);
		
		System.out.println("<--------------------------------------------------------------------------->");
		
		// 2. By Method, know as setters
		initializeClass.initializeValuesMethod(150, "Java", "Surat");
		System.out.println(initializeClass.id);
		System.out.println(initializeClass.nameString);
		System.out.println(initializeClass.addressString);
		
		System.out.println("<--------------------------------------------------------------------------->");
		// 3. By Constructor
		initializeClass = new InitializeClass(1000,"Initialize","PC");
		System.out.println(initializeClass.id);
		System.out.println(initializeClass.nameString);
		System.out.println(initializeClass.addressString);
		
	}

}
