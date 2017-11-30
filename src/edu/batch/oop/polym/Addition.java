package edu.batch.oop.polym;

public class Addition {
	
	public int add (int a, int b) {
		return a + b;
		
	}
	public float add (float a, float b) {
		return a + b;
		
	}
	public float add (int a, float b) {
		return a + b;
		
	}
	public int add (int a, int b, int c) {
		return a + b + c;
		
	}
	
	public static void main (String [] args){
		Addition a =new Addition();
	System.out.println(a.add(10, 20));
	System.out.println(a.add(10f, 20f));
	System.out.println(a.add(10, 20, 30));
	System.out.println(a.add(10, 20f));
	}
	
		
	}

