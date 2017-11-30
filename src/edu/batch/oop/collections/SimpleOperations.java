package edu.batch.oop.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SimpleOperations {
	public static void main(String[] args) {
		
		Collection<String> names = new ArrayList<String>();
		names.add("Thirupathi");
		names.add("Srinath");
		names.add("Manisha");
		
		System.out.println(names.size()); // 3
		System.out.println(names.isEmpty());// false
		System.out.println(names.contains("chandu"));// false
		System.out.println(names.contains("Manisha"));// true
		
		names.remove("Srinath");
		
		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);
			
		}
		
	}

}
