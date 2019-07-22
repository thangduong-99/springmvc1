package com.congthang.model;

public class Product {
	private int productId;
	private String name;
	private int price;
	private String url;
	public Product(int productId, String name, int price, String url) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.url = url;
	}
	public Product() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
