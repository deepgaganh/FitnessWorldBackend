package com.niit.model;

public class Product {
	
	private int id;
	private String name;
	private String manufacturer;
	private double price;
	private int unit_stock;
		
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
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getUnit_stock() {
		return unit_stock;
	}
	public void setUnit_stock(int unit_stock) {
		this.unit_stock = unit_stock;
	}


}
