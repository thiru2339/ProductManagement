package edu.batch.oop.coll;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionClass {
	public static void main(String[] args) {
		
		List<String> brands = new LinkedList<String>();
		
		brands.add("Apple");
		brands.add("Samsung");
		brands.add("Nokia");
		brands.add("Micromax");
		brands.add("Karbonn");
		
		System.out.println(Collections.max(brands));
		System.out.println(Collections.min(brands));
		
		System.out.println(brands);
		Collections.sort(brands);
		System.out.println(brands);
		
		Collections.sort(brands, Collections.reverseOrder());
		System.out.println(brands);
	}

}
