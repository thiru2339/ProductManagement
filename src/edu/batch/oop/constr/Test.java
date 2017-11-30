package edu.batch.oop.constr;

public class Test {
public static void main(String[] args) {
	
	Constructor c = new Constructor();//Default constructor
	c = new Constructor(10, "Hello");
	Constructor c2 = new Constructor(c);
	c.sayHello();
	c2.sayHello();
	
}
}
