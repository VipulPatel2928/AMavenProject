package collection.packag;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {

		Set<String> hasSet = new TreeSet<String>();
		System.out.println("<---------------------------------------------------->");

		System.out.println("Is Set empty :" + hasSet.isEmpty());

		System.out.println("Element in the set :" + hasSet.size());
		
		System.out.println("<---------------------------------------------------->");

		hasSet.add("Red");
		hasSet.add("Red");
		hasSet.add("Black");
		hasSet.add("black");
		//Null is not allowed in TreeSet
		//hasSet.add(null);
		//hasSet.add(null);

		System.out.println("Is Set empty :" + hasSet.isEmpty());

		System.out.println("Element in the set :" + hasSet.size());
		
		System.out.println("<---------------------------------------------------->");
		
		for (String hashSetData : hasSet) {
			System.out.println(hashSetData);
		}
		
		System.out.println("<---------------------------------------------------->");
		
		Iterator<String> hashSetIterator=hasSet.iterator();
		
		while(hashSetIterator.hasNext()) {
			System.out.println(hashSetIterator.next());
		}

		System.out.println("<---------------------------------------------------->");
		
		Iterator<String> hashSetIterator1=hasSet.iterator();
		
		while(hashSetIterator1.hasNext()) {
			hashSetIterator1.next();
			hashSetIterator1.remove();
		}
		
		System.out.println("Is Set empty :" + hasSet.isEmpty());

		System.out.println("Element in the set :" + hasSet.size());
		
	}

}
