package edu.batch.oop.coll;

import java.util.Date;

public class Product implements Comparable<Product> {
	
	private String barnd;
	private String name;
	private Float price;
	private Date expiry;
	private Boolean availability;
	
	 
	public Product(String barnd, String name, Float price, Date expiry, Boolean availability) {
		super();
		this.barnd = barnd;
		this.name = name;
		this.price = price;
		this.expiry = expiry;
		this.availability = availability;
	}


	public String getBarnd() {
		return barnd;
	}


	public String getName() {
		return name;
	}


	public Float getPrice() {
		return price;
	}


	public Date getExpiry() {
		return expiry;
	}


	public Boolean getAvailability() {
		return availability;
	}


	@Override
	public int compareTo(Product o) {
		
		return this.price.compareTo(o.price);
	}
	

	
}
