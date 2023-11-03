package downcastingpackage.com;

public class VP {

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

	}

}
