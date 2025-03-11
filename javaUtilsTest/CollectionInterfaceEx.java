package javaUtilsTest;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceEx {
	public static void main(String[] args) {
		 
		Collection<String> collection = new ArrayList<String>();
		collection.add("Apple");
		collection.add("Papaya");
		collection.add("Mango");
 
		System.out.println("Collection is " + collection);
 
		if (collection.contains("Papayaa")) {
			System.out.println("Fruit found");
		} else {
			System.out.println("Not found");
		}
 
		collection.remove("Apple");
		System.out.println("Collection is " + collection);
 
		boolean isEmpty = collection.isEmpty();
		System.out.println("Is Collection empty? " + isEmpty);
		System.out.println("Collection size is " + collection.size());
		collection.clear();
		boolean isEmptyReal = collection.isEmpty();
		System.out.println("Is Collection empty? " + isEmptyReal + " after clear");
	}
 
}
