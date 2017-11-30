package edu.batch.oop.encap;

public class Product {
	
	Integer productId;
	String name;
	Float price;
	
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer productId, String name, Float price) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	public Product(Integer productId, String name, Float price) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	public Integer getProductId() {
		return productId;
	}
	private void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
	

}
