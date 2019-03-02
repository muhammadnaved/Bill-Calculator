package com.test.bill;

import java.util.Date;

public class Item{

	private String itemId;
	
	private String itemName;
	
	private double price;
	
	private String category;
	
	private Date manufactureDate;
	
	private Date expiryDate;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", price=" + price + ", category=" + category
				+ ", manufactureDate=" + manufactureDate + ", expiryDate=" + expiryDate + "]";
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
