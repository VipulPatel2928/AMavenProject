package collection.packag;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {
	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	
	hashMap.put(1, "BMW");
	hashMap.put(2, "Audi");
	hashMap.put(null, "Maruti");
	hashMap.put(3, "Tata");
	hashMap.put(4, null);
	hashMap.put(5, null);
	
	System.out.println(hashMap.size());
	
    hashMap.remove(2);
    
    String string = "Vipul";
    System.out.println(string+10);
    
    System.out.println(hashMap.size());
    
    for(Map.Entry hashMapDataKeyandVlaue:hashMap.entrySet()) {
    	System.out.println("Key :"+String.valueOf(hashMapDataKeyandVlaue.getKey()) +" "+"Value :"+String.valueOf(hashMapDataKeyandVlaue.getValue()));
    }

	}

}
