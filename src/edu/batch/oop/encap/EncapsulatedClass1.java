package edu.batch.oop.encap;

public class EncapsulatedClass1 {
	
	private String message= " This is a private message";
	Double score= 0.0;
	private Integer id= 123456;
	
	protected void incrementScore ( int byNo) {
		score= score+ byNo;
		}
	public String getMessage(){
		return this.message;
		
	}
	

}
