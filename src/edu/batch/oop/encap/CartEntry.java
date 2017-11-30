package edu.batch.oop.encap;

public class CartEntry {
	
	Product product;
	Integer quantity;
	Integer discount;
	
	public cartEntry ( Product product){
		this.product = prodcuct;
		this.quantity=1;
		this.discount=0;
		
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	

}
