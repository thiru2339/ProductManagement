package edu.batch.oop.strbufbui;

public class Immutable {
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().freeMemory());
		
		String s = "Hello";
		s = "Hi";
		s = "GoodBye";
		
		System.out.println(Runtime.getRuntime().freeMemory());
	}

}
