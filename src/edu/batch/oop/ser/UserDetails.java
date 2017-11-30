package edu.batch.oop.ser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UserDetails implements Serializable {
	
	private String username;
	private String password;
	
	
	
	public UserDetails(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	

	public void serialize(){
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos = new FileOutputStream("c:\\Thiru\\user.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(this);
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch ( IOException e){
			e.printStackTrace();
			
		}
		 
		
	}

	public UserDetails deserialize(){
		
		FileInputStream fis;
		ObjectInputStream ois;
		try{
			fis = new FileInputStream("c:\\Thiru\\user.txt");
			ois = new ObjectInputStream(fis);
			UserDetails ud = (UserDetails) ois.readObject();
			ois.close();
			fis.close();
			return ud;
			
					
		}catch ( Exception e) {
			e.printStackTrace();
		}
		return null;
		
		
	}



	@Override
	public String toString() {
		return "UserDetails [username=" + username + ", password=" + password + "]";
	}
	
	
}
