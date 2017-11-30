package edu.batch.oop.except;

public class Class1 {
	
	public static void main(String[] args) {
		
		Class2 c2 = new Class2();
		try {
			System.out.println (c2.calculateInterest(100000, -30));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
	}

}
