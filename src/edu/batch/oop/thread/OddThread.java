package edu.batch.oop.thread;

public class OddThread implements Runnable{
	public OddThread() {
		new Thread(this).start();
	}

	@Override
	public void run() {

		for ( int i = 1; i <= 1000; i++){
			if( i % 2 == 1){
				System.out.println("Odd-" + i);
				
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
		}
		
	
	}

}
