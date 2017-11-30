package edu.batch.oop.polym;

public class Test {
	
	public static void main (String [] args){
		Addition a =new Addition();
	System.out.println(a.add(30, 40));
	a= new AdditionChild();
	System.out.println(a.add(30, 40));
	}

}
