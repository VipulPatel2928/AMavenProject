package AggregationCompositionpackage.com;

public class AggregationCompositionClass {

	// instance fields
	public int age;
	public String nameString;
	//HAS - A Relationship
	Address address;
	
	public AggregationCompositionClass(int age, String nameString, Address address) {
		this.age = age;
		this.nameString = nameString;
		this.address = address;
	}
	
	public void displayData() {
		System.out.println(age);
		System.out.println(nameString);
		System.out.println(address.city);
		System.out.println(address.state);
		System.out.println(address.country);
	}
	public static void main(String[] args) {
		Address address1 = new Address("Surat", "Guj", "Inida");
		
		AggregationCompositionClass obj = new AggregationCompositionClass(100, "VP",address1);
		AggregationCompositionClass obj1 = new AggregationCompositionClass(58, "Vipul",address1);
		
		obj.displayData();
		
		obj1.displayData();
	}

}
