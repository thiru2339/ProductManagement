package edu.batch.first;
// single line comment
// import statements

import java.util.Date;
//import java.io.*;

//edu.bathc.first.Calculate- Fully qualified name of the classs=package name.classname
/*
 *Double line comment
 *Calculator example
 */

public class Calculator {
	
	Date lastUsed; // Data Member
	
	//Member Function 
	Integer add( Integer a, Integer b) {
		lastUsed= new Date();// it will set the lastused date
		return a + b; 
	}
	
	Integer substract( Integer a, Integer b) {
		lastUsed= new Date();
		return a - b; 
	}
	
	Date getLastUsed(){
		return lastUsed;
		
	}
		

}
