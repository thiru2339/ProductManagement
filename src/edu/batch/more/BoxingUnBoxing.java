package edu.batch.more;

public class BoxingUnBoxing {
	public static void main(String[] args){
		
		int x = 50;
		Integer xobj= x;// boxing or auto boxing
		
		Long lobj= new Long(x);
		
		int y= xobj.intValue(); //Unboxing
		
		long z=y;//implicit casting 
		y= (int )z;// explicit casting
		
		
	}

}
