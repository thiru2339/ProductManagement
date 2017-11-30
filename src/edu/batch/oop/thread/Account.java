package edu.batch.oop.thread;

public class Account {
	private Double balance = 1000.00;
	
	public synchronized void withdraw( Double withdrawlAmt) throws InterruptedException {
			if (balance >= withdrawlAmt){
				Thread.sleep(500);
			balance = balance - withdrawlAmt;
			System.out.println(" The new balance is: " + balance);
			
		}else{
			System.out.println("Insufficient funds");
		}
	}

}
