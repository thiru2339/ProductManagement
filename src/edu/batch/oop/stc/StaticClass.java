package edu.batch.oop.stc;

public class StaticClass {
	
	private int x;
	private static int y;
	
	public static void main(String[] args) {
		
		StaticClass c1 = new StaticClass();
		StaticClass c2 = new StaticClass();
		StaticClass c3 = new StaticClass();
		
		c1.x= 10;
		c1.y= 20;
				
		c2.x = 30;
		c2.y = 40;
		
		c3.x = 50;
		c3.y = 60;
		
		StaticClass.y= 100;
		y= 90;
		
		System.out.println("x= " + c1.x + "  y= " + c1.y );
		System.out.println("x= " + c2.x + "  y= " + c2.y);
		System.out.println("x= " + c3.x + "  y= " + c3.y);
	}

}
