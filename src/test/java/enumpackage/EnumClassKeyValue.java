package enumpackage;

public class EnumClassKeyValue {
  
	public enum KeyValue{
		
		ACTIVE("Active",1), IN_ACTIVE("In Active", 2), Test("T", 200);
		
		private final String key;
		
		private final Integer value;
		
		//Constructor
		private KeyValue(String key,Integer value ) {
		 this.key = key;
		 this.value = value;
		}
		
		// Get Methods
		public String getKey() {
			return key;
		}
		
		public Integer getValue() {
			return value;
		}
	}
	

	public static void main(String[] args) {
		System.out.println(KeyValue.ACTIVE.getKey());
		System.out.println(KeyValue.ACTIVE.getValue());
		System.out.println("<--------------------------------------------------------------->");
		System.out.println(KeyValue.Test.getKey());
		System.out.println(KeyValue.Test.getValue());
		System.out.println("<--------------------------------------------------------------->");
		
	}
}
