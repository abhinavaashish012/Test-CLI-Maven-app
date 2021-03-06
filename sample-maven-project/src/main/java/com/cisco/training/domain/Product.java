package com.cisco.training.domain;

public class Product {
	
	int id;
	
	String name;
	
	float price;
	
	int quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public Product() {
	}

	public Product(String name, float price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
}
