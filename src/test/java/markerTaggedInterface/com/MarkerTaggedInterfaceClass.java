package markerTaggedInterface.com;

public class MarkerTaggedInterfaceClass implements Cloneable{
    public int age;
    public String nameString;
    public String addressString;
    
    public MarkerTaggedInterfaceClass(int age,String nameString, String addString) {
		this.age = age;
		this.nameString = nameString;
		this.addressString = addString;
	}
    
    public void displayData() {
    	System.out.println(age);
    	System.out.println(nameString);
    	System.out.println(addressString);
    }
    
	public static void main(String[] args) {
		MarkerTaggedInterfaceClass objClass = new MarkerTaggedInterfaceClass(58, "Vipul", "ALthan");
		
		objClass.displayData();
		
		MarkerTaggedInterfaceClass objClass1 = null;
		
		try {
			objClass1 = (MarkerTaggedInterfaceClass) objClass.clone();
			objClass1.displayData();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		objClass1.age = 88;
		
		objClass.displayData();
		
		objClass1.displayData();

	}

}
