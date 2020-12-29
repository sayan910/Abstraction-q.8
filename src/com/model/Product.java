package com.model;

public class Product {
	protected int productId;
	protected String productName;
	protected float price;
	public Product(int productId, String productName, float price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float calculateDiscount() {
		float discount=(12*price)/100;
		return discount;
	}
	
	

}
