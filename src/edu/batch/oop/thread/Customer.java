package edu.batch.oop.thread;

public class Customer extends Thread {
	
	private Account acc;
	public Customer ( Account acc){
		this.acc = acc;
		
	}
	public void run(){
		try {
			acc.withdraw(1000.00);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
