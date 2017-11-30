package edu.batch.oop.clone;

public class Test {
   
	public static void main(String[] args) throws CloneNotSupportedException{
		
		Account a1= new Account("Thirupathi", 123456789L, "C");
		
		Account a2 = (Account) a1.clone();
		
		System.out.println(a1);
		System.out.println(a2);
	
}
}
