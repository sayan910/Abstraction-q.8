package com.model;

public class ElectronicProduct extends Product{
	private String dimension;
	private int warrenty;
	public ElectronicProduct(int productId, String productName, float price, String dimension, int warrenty) {
		super(productId, productName, price);
		this.dimension = dimension;
		this.warrenty = warrenty;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public int getWarrenty() {
		return warrenty;
	}
	public void setWarrenty(int warrenty) {
		this.warrenty = warrenty;
	}
	@Override
	public float calculateDiscount() {
		// TODO Auto-generated method stub
		float discountcorrect=(25*super.price)/100;
		return discountcorrect;
	}
	
	

}
