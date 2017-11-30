package edu.batch.oop.except;

public class Class2 {

	private static final int DAYS_IN_MONTH = 30;

	public int calculateInterest(int amount, int days) throws Exception {
		try{
			if ( days < 0){
				throw new Exception("Days must be positive number");
				
			}
			
		int months = days / DAYS_IN_MONTH;
		int interest = amount * months / 100;
		return interest;
		}catch ( ArithmeticException ae){
			System.err.println(" DAYS IN MONTH IS ZERO");
		}finally {
			System.out.println("EXITING INTEREST CALCULATOR");
			
		}
		return 0;
		
	}

}
