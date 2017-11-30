package edu.batch.oop.encap;

import java.awt.List;
import java.util.ArrayList;

public class ShoppingCart {
	
	List<CartEntry> entries= new ArrayList<product>();
	int totalCount= 0;
	float subtotal= 0f;
	
	void refresh(){
		totalCount= 0;
		subtotal= 0f;
		for (CartEntry ce : entries ){
			totalCount += ce.getQuantity();
			subtotal += ce.getProduct().getPrice()*ce.getQuantity();
		}
		
	}
	
	void addToCart (Product product){
		CartEntry ce = new CartEntry(product);
		ce.setProduct(product);
		ce.setQuantity(1);
		ce.setDiscount(0);
		entries.add(ce);
		totalCount++; 
		subtotal+=product.getPrice();
		
	}
	

	
	

}
