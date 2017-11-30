package edu.batch.oop.ser;

public class Test2 {
public static void main(String[] args) {
		
		UserDetails ud = new UserDetails( null, null);
		ud.serialize();
		ud = ud.deserialize();
		
		System.out.println(ud);

}
}
