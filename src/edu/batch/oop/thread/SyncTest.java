package edu.batch.oop.thread;

public class SyncTest {
	public static void main(String[] args) {
		Account acc = new Account();
		Customer c1 = new Customer(acc);
		Customer c2 = new Customer(acc);
		c1.start();
		c2.start();
	}

}
