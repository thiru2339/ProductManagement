package edu.batch.oop.thread;

public class EvenThread extends Thread {
	
		public void run() {
			for ( int i = 1; i <= 1000; i++){
				if( i % 2 == 0){
					System.out.println("Even -" + i);
					
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				
			}
			
		}
	

}
