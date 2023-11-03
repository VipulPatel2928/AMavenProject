package downcastingpackage.com;

public class DownCastingClassSubClass extends DownCastingClassBase1{
	
    public static void downCastingMethod(DownCastingClassBase1 b) {
    	if(b instanceof DownCastingClassSubClass) {
    		DownCastingClassSubClass d1 = (DownCastingClassSubClass) b;
    		d1.display();
    	}
    }

	public static void main(String[] args) {
		
		//1. child -child
		DownCastingClassSubClass a = new DownCastingClassSubClass();
		//2. parent -child
		DownCastingClassBase1 b = new DownCastingClassSubClass();
		//3. parent - parent 
		DownCastingClassBase1 c = new DownCastingClassBase1();
		
		//4. child - parent
		// downcasting is required
		//DownCastingClassSubClass d = (DownCastingClassSubClass) new DownCastingClassBase1();
		
		downCastingMethod(b);
	}
}
