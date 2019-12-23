package com.product;

public class Product {
	private int id;
	private String title;
	private double price;
	private int discount;
	private int quantity;
	
	public Product(int id, String title, double price, int discount, int quantity) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", price=" + price + ", discount=" + discount + ", quantity="
				+ quantity + "]";
	}
	

}
