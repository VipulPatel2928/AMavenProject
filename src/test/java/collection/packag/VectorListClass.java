package collection.packag;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorListClass {

	public static void main(String[] args) {
		List<String> arrayList = new Vector<String>();

		System.out.println("<------------------------------------------------------------------>");
		// Find out that Array Listr is Empty or Not
		if (arrayList.isEmpty()) {
			System.out.println("Array List is Empty");
		} else {
			System.out.println("Array List is not Empty");
		}

		// Find out the size of the Array List

		System.out.println("Size of the Array List :" + arrayList.size());

		System.out.println("<------------------------------------------------------------------>");
		arrayList.add("Blue");
		arrayList.add("Blue");
		arrayList.add("Black");
		arrayList.add("Pink");

		// Find out that Array Listr is Empty or Not
		if (arrayList.isEmpty()) {
			System.out.println("Array List is Empty");
		} else {
			System.out.println("Array List is not Empty");
		}

		// Find out the size of the Array List

		System.out.println("Size of the Array List :" + arrayList.size());

		System.out.println("<------------------------------------------------------------------>");
		// It will clear the Array List, No element will be available in the Array List
		arrayList.clear();

		// Find out that Array List is Empty or Not
		if (arrayList.isEmpty()) {
			System.out.println("Array List is Empty");
		} else {
			System.out.println("Array List is not Empty");
		}

		// Find out the size of the Array List

		System.out.println("Size of the Array List :" + arrayList.size());
		System.out.println("<------------------------------------------------------------------>");
		
		arrayList.add("Red");
		arrayList.add("Blue");
		arrayList.add("Black");
		arrayList.add("Black");
		arrayList.add("Yellow");
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		
		System.out.println("<------------------------------------------------------------------>");
		// It will update the value on the given index
		arrayList.set(2, "Green");
		arrayList.set(3, "Green");
		
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}

		System.out.println("<------------------------------------------------------------------>");
		arrayList.remove(2);
		for(int i=0;i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		
		System.out.println("<------------------------------------------------------------------>");
		arrayList.set(2, "Green1");
		for (String listData : arrayList) {
			System.out.println(listData);
		}	
		
		System.out.println("<------------------------------------------------------------------>");
		Iterator<String> accessingData=arrayList.iterator();
		
		while(accessingData.hasNext()) {
			System.out.println(accessingData.next());
		}
	}

}
