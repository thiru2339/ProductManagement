package edu.batch.oop.clone;

public class Account implements Cloneable{
	
	private String name;
	private Long accNumber;
	private String accType;
	
	
	public Account(String name, Long accNumber, String accType) {
		super();
		this.name = name;
		this.accNumber = accNumber;
		this.accType = accType;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


	@Override
	public String toString() {
		return "Account [name=" + name + ", accNumber=" + 
	accNumber + ", accType=" + accType + "]";
	}
	
	

}
