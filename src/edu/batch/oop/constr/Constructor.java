package edu.batch.oop.constr;

public class Constructor {
	public Constructor(){//Simple constructor
		System.out.println("Intialized");
	}
	
	public Constructor(int param1, String param2){
		//Parameterized constructor
		
	}
	
	public Constructor( Constructor c1){
		//Copy constructor
	}
	
	public void sayHello(){
		System.out.println("Hello");
	}

}
