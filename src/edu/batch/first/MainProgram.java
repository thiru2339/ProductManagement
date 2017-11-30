package edu.batch.first;

public class MainProgram {
	public static void main(String[] args){
		
		//<Classname> <ObjectName>= <ContructorCall>
		Calculator calc= new Calculator();
		System.out.println(calc.getLastUsed());
		Integer result= calc.add(20, 60);
		System.out.println("The result is:" +result);
		System.out.println(calc.getLastUsed());
		//ctrl+space for content assist/help
		// ctrl+shift+L for all the shortcuts in eclipse
		//ctrl+shift+o  for import the all necessary classes in program
	}

}
