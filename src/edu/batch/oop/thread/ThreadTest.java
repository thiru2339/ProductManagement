package edu.batch.oop.thread;

public class ThreadTest {

	public static void main(String[] args) {
		EvenThread et = new EvenThread();
		et.start();
		OddThread ot = new OddThread();
	}
}
